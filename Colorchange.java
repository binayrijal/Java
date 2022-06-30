import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
class Colorchange implements ActionListener{
    JButton black,blue,green;
    JFrame f;
    public Colorchange(){
        f=new JFrame("colorchange");
        f.setSize(400,500);
        black=new JButton("Black");
        blue=new JButton("Blue");
        green=new JButton("Green");
        black.setBounds(100,50,100,100);
        blue.setBounds(100,200,100,100);
        green.setBounds(100,350,100,100);
        f.add(black);
        f.add(blue);
        f.add(green);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        black.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==black){
            f.getContentPane().setBackground(Color.black);
        
        }else if(e.getSource()==blue){
            f.getContentPane().setBackground(Color.blue);

        }else{
            f.getContentPane().setBackground(Color.green);
            
        }

    }
    public static void main(String[] args){
        new Colorchange();
    }
}