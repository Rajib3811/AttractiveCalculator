
package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Details extends JFrame implements ActionListener  {
   JTextArea jt=new JTextArea("Name : Rajibl Islam .\nProfession : BTECH IN COMPUTER SCIENCE.\nFather's Name : RUHAL AMIN.\nMother's Name : RENUFA BIBI.\nVillage : TILCHHARA.\nP.O : JANCHI.\nP.S : GANGARAMPUR.\nDistrict : SOUTH DINAJPUR.\nSate : WEST BENGAL.\nPIN : 733140");
   JButton jb,back;
Details(){
    setBounds(500,70,420,300);
    setLayout(null);
    setVisible(true);
    setTitle("Devloper Details : ");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jt.setEditable(false);
    jt.setBounds(0,30,420,300);
    jt.setBackground(Color.CYAN);
    jt.setFont(new Font("Tahoma",Font.BOLD,18));
    jt.setVisible(false);
    add(jt);
    JLabel jl=new JLabel("Click on SHOW button");
    jl.setBounds(10,0,150,25);
    jl.setForeground(Color.GREEN);
    add(jl);
    jb=new JButton("SHOW");
    jb.setBounds(150,0,100,25);
    jb.setBackground(Color.ORANGE);
    jb.addActionListener(this);
    add(jb);
    back=new JButton("BACK");
    back.setBounds(280,0,100,25);
    back.setBackground(Color.ORANGE);
    back.addActionListener(this);
    add(back);
    
    getContentPane().setBackground(Color.WHITE);
}
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==jb){
          jt.setVisible(true);
      }
      if(ae.getSource()==back){
          new Calculator();
          this.setVisible(false);
      }
    }
}