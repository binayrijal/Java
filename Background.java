import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
class Background extends JFrame implements ActionListener{
JButton click;
JTextField t;

public Background(){
	setSize(400,500);
	click=new JButton("click");
	click.setBounds(180,350,30,25);
	t=new JTextField("enter text");
	t.setBounds(100,80,30,25);
	add(click);add(t);
	setVisible(true);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        click.addActionListener(this);
	}
public void actionPerformed(ActionEvent e){
String text=t.getText();
t.setText(text.toUpperCase());
t.setBackgroud(Color.blue);
Font f=new Font("Aerial",Font.ITALIC,21);
t.setFont(f);

}
public static void main(String [] args){
new Background();
}

}