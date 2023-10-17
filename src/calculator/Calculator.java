package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public class Calculator implements ActionListener{
    
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JTextArea ta=new JTextArea(3,17);
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,be,ba,bs,bm,bd,bp,bc,bdel,bdev;
    
    
    
static double n1=0,n2=0,result=0;
static int operator=0;
    
    Calculator(){
        frame.setBounds(500,70,320,510);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rajib's Calculator");
        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        Border bord=BorderFactory.createLineBorder(Color.BLUE,3);
        panel.setBorder(bord);
        

        panel.add(ta);
        ta.setBackground(Color.CYAN);
        ta.setBorder(bord);
        ta.setLineWrap(true);
        ta.setPreferredSize(new Dimension(3,20));
        

        Font font=new Font("aerial",Font.BOLD,20);
        
        
        
        ta.setFont(font);
        
        
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bp=new JButton(".");
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("x");
        bd=new JButton("\\");
        be=new JButton("=");
        bc=new JButton("AC");
        bdel=new JButton("Del");
        bdev=new JButton("Devloper Details");
        
        b1.setPreferredSize(new Dimension(80,50));
        b2.setPreferredSize(new Dimension(80,50));
        b3.setPreferredSize(new Dimension(80,50));
        b4.setPreferredSize(new Dimension(80,50));
        b5.setPreferredSize(new Dimension(80,50));
        b6.setPreferredSize(new Dimension(80,50));
        b7.setPreferredSize(new Dimension(80,50));
        b8.setPreferredSize(new Dimension(80,50));
        b9.setPreferredSize(new Dimension(80,50));
        b0.setPreferredSize(new Dimension(80,50));
        ba.setPreferredSize(new Dimension(80,50));
        bs.setPreferredSize(new Dimension(80,50));
        bm.setPreferredSize(new Dimension(80,50));
        bd.setPreferredSize(new Dimension(80,50));
        be.setPreferredSize(new Dimension(80,50));
        bc.setPreferredSize(new Dimension(80,50));
        bp.setPreferredSize(new Dimension(80,50));
        bdel.setPreferredSize(new Dimension(80,50));
        bdev.setPreferredSize(new Dimension(200,40));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);
        bp.addActionListener(this);
        bdel.addActionListener(this);
        bdev.addActionListener(this);
        
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.yellow);
        b5.setBackground(Color.yellow);
        b6.setBackground(Color.yellow);
        b7.setBackground(Color.yellow);
        b8.setBackground(Color.yellow);
        b9.setBackground(Color.yellow);
        b0.setBackground(Color.yellow);
        bp.setBackground(Color.pink);
        bdev.setBackground(Color.RED);
        bdev.setForeground(Color.GREEN);
        
        Color color=new Color(0,177,167);
        Color clr=new Color(255,177,71);
        
        
        bp.setForeground(Color.red);
        bp.setFont(new Font("Tahoma",Font.BOLD,18));
        
        ba.setBackground(Color.GREEN);
        ba.setFont(new Font("Tahoma",Font.PLAIN,20));
        bs.setBackground(Color.GREEN);
        bs.setFont(new Font("Tahoma",Font.LAYOUT_NO_LIMIT_CONTEXT,35));
        bm.setBackground(Color.GREEN);
        bm.setFont(new Font("arial",Font.CENTER_BASELINE,30));
        bd.setBackground(Color.GREEN);
        bd.setFont(new Font("arial",Font.CENTER_BASELINE,20));
        
        bc.setBackground(color);
        bc.setFont(new Font("arial",Font.CENTER_BASELINE,20));
        
        be.setBackground(Color.magenta);
        be.setForeground(Color.yellow);
        be.setFont(new Font("arial",Font.CENTER_BASELINE,20));
        
        bdel.setBackground(clr);
        bdel.setFont(new Font("arial",Font.CENTER_BASELINE,16));
        
        
        
        panel.add(b9); 
        panel.add(b8);
        panel.add(b7);
        panel.add(b6);
        panel.add(b5);
        panel.add(b4);
        panel.add(b3);
        panel.add(b2);
        panel.add(b1);
        panel.add(b0);
        panel.add(bp);
        panel.add(ba);
        panel.add(bs);
        panel.add(bm);
        panel.add(bd);
        panel.add(bc);
        panel.add(be);
        panel.add(bdel);
        panel.add(bdev);
      
        
 
        
        
        panel.setBackground(Color.yellow);

     
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()==b1){
           ta.append("1");
           //Also
//           ta.setText(ta.getText().concat("1"));
       }
        
       if(e.getSource()==b2){
           ta.append("2");
       }
        
       if(e.getSource()==b3){
           ta.append("3");
       }
        
       if(e.getSource()==b4){
           ta.append("4");
       }
        
       if(e.getSource()==b5){
           ta.append("5");
       }
        
       if(e.getSource()==b6){
           ta.append("6");
       }
        
       if(e.getSource()==b7){
           ta.append("7");
       }
       
       if(e.getSource()==b8){
           ta.append("8");
       }
        
       if(e.getSource()==b9){
           ta.append("9");
       }
        
       if(e.getSource()==b0){
           ta.append("0");
       }
        
       if(e.getSource()==bp){
           ta.append(".");
       }
        if(e.getSource()==bc){
            
       
            ta.setText("");
            n1=0.0;
            n2=0.0;
             
            
            
        }
    
        
       if(e.getSource()==ba){
           
           n1=Double.parseDouble(ta.getText());
          operator=1;
           ta.setText("");
       }
        
       if(e.getSource()==bs){
           n1=Double.parseDouble(ta.getText());
           operator=2;
           ta.setText("");
       }
        
       if(e.getSource()==bm){
           n1=Double.parseDouble(ta.getText());
          operator=3;
           ta.setText(""); 
       }
        
       if(e.getSource()==bd){
           n1=Double.parseDouble(ta.getText());
           operator=4;
           ta.setText("");
       }
       if(e.getSource()==be){
           n2=Double.parseDouble(ta.getText());
           
           switch(operator)
       {
           case 1: result=n1+n2;
           break;
           case 2: result=n1-n2;
           break;
           case 3: result=n1*n2;
           break;
           case 4: result=n1/n2;
           break;
           default: result=0;
               
        }
           ta.setText(""+result);

       }
       if(e.getSource()==bdel){
           String s=ta.getText();
           ta.setText("");
           for(int i=0;i<s.length()-1;i++){
               ta.setText(ta.getText()+s.charAt(i));
           }
       }
       if(e.getSource()==bdev){
           new Details().setVisible(true);
           frame.setVisible(false);
       }
    }
    public static void main(String[] args) {
        new Calculator();
    }
   
  
}