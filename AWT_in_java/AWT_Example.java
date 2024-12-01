import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener{
    public void mouseClicked(MouseEvent e){
        System.out.println("The event has occured.");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }
}

class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Action has been performed.");
    }
}

public class AWT_Example{
    public static void main(String[] args){
        Frame frame = new Frame("Basic program");
        Button button = new Button("Click me");
        button.setBounds(50,50,50,50);
        Label label = new Label("I'm a label, not a button");
        label.setAlignment(Label.CENTER);
        frame.add(button);
        frame.add(label);
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        // button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.out.println("Button clicked...");}});
        MyMouseListener listener = new MyMouseListener(); 
        button.addMouseListener(listener); //added mouse event listener
        MyActionListener listener2 = new MyActionListener();
        button.addActionListener(listener2);//added action listener (will trigger only on button click)
    }
    
}
