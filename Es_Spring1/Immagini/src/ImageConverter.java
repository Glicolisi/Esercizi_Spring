import java.awt.Color;
import java.awt.image.BufferedImage;
import java.lang.StringBuilder;

public class ImageConverter {

    public static String convertToASCII(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        StringBuilder asciiImage = new StringBuilder();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(image.getRGB(x, y));
                int brightness = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                char asciiChar = ASCIIConverter.getASCIIChar(brightness);
                asciiImage.append(asciiChar);
            }
            asciiImage.append("\n");
        }

        return asciiImage.toString();
    }
}

                                             