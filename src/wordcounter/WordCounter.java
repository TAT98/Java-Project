package wordcounter;

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  

public class WordCounter extends JFrame implements ActionListener{    
    JLabel lb1,lb2;  
    JTextArea ta;  
    JButton b;  
    JButton pad,text;  
    WordCounter(){  
        super("Word Counter Tool - WCT");  
        lb1=new JLabel("Characters: ");  
        lb1.setBounds(50,50,100,20);
        lb1.setOpaque(true);
        lb1.setBackground(Color.green);
        lb2=new JLabel("Words: ");  
        lb2.setBounds(50,80,100,20);
        lb2.setOpaque(true);
        lb2.setBackground(Color.green);
          
        ta=new JTextArea();  
        ta.setBounds(50,110,300,200);  
          
        b=new JButton("click");  
        b.setBounds(50,320, 80,30); 
        b.addActionListener(this);  
      
        pad=new JButton("Pad Color");  
        pad.setBounds(140,320, 110,31);  
        pad.addActionListener(this);  
  
        text=new JButton("Text Color");  
        text.setBounds(260,320, 110,31); 
        text.addActionListener(this);  
  
        add(lb1);add(lb2);add(ta);add(b);add(pad);add(text);  
          
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){  
        String text=ta.getText();  
        lb1.setText("Characters: "+text.length());  
        String words[]=text.split(" ");  
        lb2.setText("Words: "+words.length);  
        }else if(e.getSource()==pad){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.WHITE);  
            ta.setBackground(c);  
        }else if(e.getSource()==text){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.black);  
            ta.setForeground(c);  
        }  
    }  
public static void main(String[] args) {  
    new WordCounter();  
}}  
    
