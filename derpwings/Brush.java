package derpwings;

import java.awt.*;
import java.awt.image.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Brush
{
    public BufferedImage brushImage;
    public Image paintImage;
    
    public Brush() throws IOException
    {
        // default brush thingy:
        brushImage = ImageIO.read(new File("Brushes/rect.png"));
    }
    
    public void createCustomBrush()
    {
        // default brush thingy:
        brushImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = brushImage.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, 1000, 1000);
        g2d.dispose();
        String path = getClass().getResource("Brushes").getPath();
        String filename = "rect.png"; 
        File outputFile = new File(path + File.separator + filename);
        
        try
        {
            ImageIO.write(brushImage, "png", outputFile);
            System.out.println("Image saved to: " + outputFile.getAbsolutePath());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
    
    public static void main(String args[]) throws IOException
    {
        
    } 
}