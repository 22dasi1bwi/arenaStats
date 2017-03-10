package data;
import java.awt.*;
import java.awt.image.BufferedImage;

public class AsciiArtPrinter {

	 int width = 100;
     int height = 30;

     public static void draw(){ 
    	 int width = 100;
         int height = 30;

         //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
         BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         Graphics g = image.getGraphics();
         g.setFont(new Font("SansSerif", Font.BOLD, 24));

         Graphics2D graphics = (Graphics2D) g;
         graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                 RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         graphics.drawString("STATS", 10, 20);

         //save this image
         //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

         for (int y = 0; y < height; y++) {
             StringBuilder sb = new StringBuilder();
             for (int x = 0; x < width; x++) {

                 sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

             }

             if (sb.toString().trim().isEmpty()) {
                 continue;
             }

             System.out.println(sb);
         }
         System.out.println("\n\n\n");
     }
}
