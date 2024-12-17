
/**
 * Write a description of class ImageViewer here.
 *
 * @author winda
 * @version 1.0
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.File;

public class ImageViewer {
  private static final String VERSION = "Version 1.0";
  private static JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));

  private JFrame frame;
  private ImagePanel imagePanel;
  private JLabel filenameLabel;
  private JLabel statusLabel;
  private OFImage currentImage;

  public ImageViewer() {
    currentImage = null;
    setupFrame();
  }

  public void actionPerformed(ActionEvent event) {
    System.out.println("Menu item" + event.getActionCommand());
  }

  private void openFile() {
    int res = fileChooser.showOpenDialog(frame);

    if (res != JFileChooser.APPROVE_OPTION) {
      return;
    }

    File selectedFile = fileChooser.getSelectedFile();
    currentImage = ImageFileManager.loadImage(selectedFile);

    if (currentImage == null) {
      JOptionPane.showMessageDialog(frame, "The file was not in a recognisable image file format.", "Image Load Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    imagePanel.setImage(currentImage);
    showFilename(selectedFile.getPath());
    showStatus("File loaded successfully.");
    frame.pack();
  }

  private void close() {
    currentImage = null;
    imagePanel.clearImage();
    showFilename(null);
  }

  private void quit() {
    System.exit(0);
  }

  private void makeDarker() {
    if (currentImage != null) {
      currentImage.darker();
      frame.repaint();
      showStatus("Image darkened.");
    } else {
      showStatus("No image loaded.");
    }
  }

  private void makeLighter() {
    if (currentImage != null) {
      currentImage.lighter();
      frame.repaint();
      showStatus("Image lightened.");
    } else {
      showStatus("No image loaded.");
    }
  }

  private void threshold() {
    if (currentImage != null) {
      currentImage.threshold();
      frame.repaint();
      showStatus("Image thresholded.");
    } else {
      showStatus("No image loaded.");
    }
  }

  private void showAbout() {
    JOptionPane.showMessageDialog(frame, "Image Viewer\n" + VERSION, "About ImageViewer",
        JOptionPane.INFORMATION_MESSAGE);
  }

  private void showFilename(String filename) {
    if (filename == null) {
      filenameLabel.setText("No file displayed.");
    } else {
      filenameLabel.setText("File: " + filename);
    }
  }

  private void showStatus(String messsage) {
    statusLabel.setText(messsage);
  }

  private void setupFrame() {
    frame = new JFrame("ImageViewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setupMenuBar(frame);

    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new BorderLayout(6, 6));

    filenameLabel = new JLabel();
    contentPane.add(filenameLabel, BorderLayout.NORTH);

    imagePanel = new ImagePanel();
    contentPane.add(imagePanel, BorderLayout.CENTER);

    statusLabel = new JLabel(VERSION);
    contentPane.add(statusLabel, BorderLayout.SOUTH);

    showFilename(null);
    frame.pack();

    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(d.width / 2 - frame.getWidth() / 2, d.height / 2 - frame.getHeight() / 2);

    frame.setVisible(true);
  }

  private void setupMenuBar(JFrame frame) {
    final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx();

    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);

    JMenu menu;
    JMenuItem item;

    menu = new JMenu("File");
    menuBar.add(menu);

    item = new JMenuItem("Open");
    item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        openFile();
      }
    });
    menu.add(item);

    item = new JMenuItem("Close");
    item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, SHORTCUT_MASK));
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        close();
      }
    });
    menu.add(item);

    item = new JMenuItem("Quit");
    item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        quit();
      }
    });
    menu.add(item);

    menu = new JMenu("Filter");
    menuBar.add(menu);

    item = new JMenuItem("Darker");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        makeDarker();
      }
    });
    menu.add(item);

    item = new JMenuItem("Lighter");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        makeLighter();
      }
    });
    menu.add(item);

    item = new JMenuItem("Threshold");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        threshold();
      }
    });
    menu.add(item);

    menu = new JMenu("Help");
    menuBar.add(menu);
    item = new JMenuItem("About");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        showAbout();
      }
    });
    menu.add(item);
  }

  public static void main(String[] args) {
    new ImageViewer();
  }
}