public class ASCIIConverter {

    public static char getASCIIChar(int brightness) {
        // Map brightness value to ASCII character
        // You can customize the mapping based on your preference
        char[] asciiChars = {'@', '#', '8', '&', 'o', ':', '*', '.', ' '};
        int charIndex = (brightness * (asciiChars.length - 1)) / 255;
        return asciiChars[charIndex];
    }
}