import javax.swing.*;

public class IntroSessionForSwing {
   JFrame myframe;
    IntroSessionForSwing()
    {
        myframe=new JFrame("Todays Frame");
        JTextArea area=new JTextArea("Welcome to javatpoint");
        area.setBounds(10,30, 200,200);
        myframe.add(area);
        myframe.setSize(800,800);
        myframe.setLayout(null);
        myframe.setVisible(true);
    }
    public static void main(String arg[]){
        IntroSessionForSwing xy=new IntroSessionForSwing();
    }
}
