import javax.swing.*;
import java.awt.event.*;
class Gui implements ActionListener{
    JFrame f;
    JTextField first,second;
    JButton b;
    public Gui(){
        f=new JFrame("form");
        f.setSize(400,500);
        first=new JTextField("enter something1");
        second=new JTextField("enter something2");
        b=new JButton("submit");
        first.setBounds(50,50,100,40);
        second.setBounds(150,50,100,40);
        b.setBounds(100,200,50,50);
        f.add(first);
        f.add(second);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            first.setText("done");
            second.setText("submitted");
        }
    }
    public static void main(String[] args){
        new Gui();
    }
}