/**
 * Write a description of class ImageFileManager here.
 *
 * @author winda
 * @version 1.0
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageFileManager {
  private static final String IMAGE_FORMAT = "jpg";

  public static OFImage loadImage(File imageFile) {
    try {
      BufferedImage image = ImageIO.read(imageFile);
      if (image == null || image.getWidth(null) < 0) {
        return null;
      }
      return new OFImage(image);
    } catch (Exception e) {
      return null;
    }
  }

  public static void saveImage(OFImage image, File file) {
    try {
      ImageIO.write(image, IMAGE_FORMAT, file);
    } catch (IOException exception) {
      return;
    }
  }
}