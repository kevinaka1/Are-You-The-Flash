import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Window{

    public static void main(String[] args){
		new Window();
	}

    public Window(){
        JFrame flash_window = new JFrame("Flash Identifier");
        flash_window.setVisible(true);
        flash_window.setLayout(new BorderLayout()); 
        flash_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Canvas flash_canvas = new Canvas();
        flash_canvas.setLayout(new FlowLayout());
		flash_canvas.setBorder(BorderFactory.createLineBorder(Color.RED));
		flash_canvas.setPreferredSize(new Dimension(450,450));
		flash_window.add(flash_canvas, BorderLayout.CENTER);
		flash_window.pack();

    }
    
    
}
