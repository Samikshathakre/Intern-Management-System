package Dashboard;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main_class extends JFrame{
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1500,900);
        add(img);

        JLabel heading = new JLabel("WordifyMe Interns Dashboard");
        heading.setBounds(520,230,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,27));
        img.add(heading);

        JButton add = new JButton("Add Intern");
        add.setBounds(450,360,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddIntern();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Interns");
        view.setBounds(720,360,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Intern();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Intern");
        rem.setBounds(600,500,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveIntern();
            }
        });
        img.add(rem);

        setSize(1500,900);
        setLocation(200,30);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Main_class();
    }
}
