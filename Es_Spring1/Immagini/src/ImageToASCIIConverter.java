import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageToASCIIConverter {

    public static void main(String[] args) {
        String imagePath = "C:\\Users\\utente\\IdeaProjects\\Develhope\\Esercizi_Spring\\Immagini\\src\\img.png";
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            String asciiImage = ImageConverter.convertToASCII(image);
            System.out.println(asciiImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
