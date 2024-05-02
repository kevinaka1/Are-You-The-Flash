import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.io.File;

public class Canvas extends JPanel implements MouseListener{
    The_Flash_Button the_flash = new The_Flash_Button();
    The_Flash_Button give_up_button = new The_Flash_Button();
    The_Flash_Button save_day_button = new The_Flash_Button();

    Color lightning_color = Color.lightGray;
    boolean flash_button_clicked = false;
    boolean clicked_bottom = false;

    public Canvas(){
        the_flash.setText("Welcome, Flash. Click to put on your suit.");
        the_flash.setVisible(false);
        add(the_flash);

        give_up_button.setText("I give up. I'm not The Flash");
        add(give_up_button);

        save_day_button.setText("Time to save the day");
        save_day_button.setVisible(false);
        add(save_day_button);


        The_Flash_Listener TFListener = new The_Flash_Listener();
		the_flash.addActionListener (TFListener);

        addMouseListener(this);

        Give_Up_Listener GUListener = new Give_Up_Listener();
        give_up_button.addActionListener(GUListener);

        Save_Day_Listener SDListener = new Save_Day_Listener();
        save_day_button.addActionListener(SDListener);


        

    }

    public class The_Flash_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == the_flash){
                flash_button_clicked = true;
                save_day_button.setVisible(true);
                repaint();
            }
        }
    }

    public class Give_Up_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == give_up_button){
                System.out.println("Haha. You'll never be The Flash.");
                System.exit(0);
            }
        }
    }

    public class Save_Day_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == save_day_button){
                System.out.println("Good luck!");
                    System.exit(0);
                
            }
        }
    }

    

    public void draw_lightning(Graphics g){
        int [] x = {380, 275, 325, 295, 385, 340};
        int [] y = {101, 251, 251, 351, 231, 231};
        g.fillPolygon(x, y, 6);

        if(lightning_color == Color.yellow){
            the_flash.setVisible(true);
            give_up_button.setVisible(false);
        }
        else{
            the_flash.setVisible( false);
            give_up_button.setVisible(true);
            save_day_button.setVisible(false);

        }

        g.setColor(Color.black);
        g.fillOval(332, 241, 5, 5);
    }

    public void draw_flash_suit(Graphics g){
        Image flash_suit_image_scaled;
        if(lightning_color == Color.yellow){
            try{
                BufferedImage flash_suit_image = ImageIO.read(new File("/Users/kevinaka/Graphics/flash_suit.jpeg"));
                flash_suit_image_scaled = flash_suit_image.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
                g.drawImage( flash_suit_image_scaled, 20, 100, this);
            }
            catch(IOException ie) {
                ie.printStackTrace();
            }
        }
        

}

    public void paintComponent (Graphics g){
        if(clicked_bottom){
            g.setColor(lightning_color);
            draw_lightning(g);

            if(flash_button_clicked){
                draw_flash_suit(g);
            }
            }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
    


        if(y >= 350 && y <= 450){
            clicked_bottom = true;
            repaint();
        }

        if(!flash_button_clicked){
            if((x >= 333 && x <= 338) && (y >= 241 && y <= 246)){
                if(lightning_color == Color.yellow){
                    System.out.println("Missed it! You aren't getting access again!");
                    System.exit(0);
                }
                Random rand = new Random();
                int rand_int1 = rand.nextInt(9);
                if(rand_int1 == 0){
                    lightning_color = Color.blue;
                }
                else if(rand_int1 == 1){
                    lightning_color = Color.cyan;
                }
                else if(rand_int1 == 2){
                    lightning_color = Color.gray;
                }
                else if(rand_int1 == 3){
                    lightning_color = Color.green;
                }
                else if(rand_int1 == 4){
                    lightning_color = Color.magenta;
                }
                else if(rand_int1 == 5){
                    lightning_color = Color.orange;
                }
                else if(rand_int1 == 6){
                    lightning_color = Color.pink;
                }
                else if(rand_int1 == 7){
                    lightning_color = Color.yellow;
                }
                else if(rand_int1 == 8){
                    lightning_color = Color.red;
                }
                else if(rand_int1 == 9){
                    lightning_color = Color.darkGray;
                }
                repaint();

            }
            if((x < 333 || x > 338) || (y < 241 || y > 246)){
                if(lightning_color == Color.yellow){
                    System.out.println("Missed it! You aren't getting access again!");
                    System.exit(0);
                }
            }
                
            }
        }
        

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}