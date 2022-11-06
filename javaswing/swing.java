import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;  
public class swing {  
public static void main(String[] args) {  

        JPanel panel = new JPanel();
        JFrame frame=new JFrame();
        frame.setSize(300,300);
        frame.setTitle("Sign In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10,50,80,25);
        panel.add(passwordlabel);

        JPasswordField passwordtext = new JPasswordField();
        passwordtext.setBounds(100,50,165,25);
        panel.add(passwordtext);

        JButton button = new JButton("Login");
        button.setBounds(10,80,80,25);
        panel.add(button);

        JLabel succes = new JLabel("");
        succes.setBounds(10,110,300,25);
        panel.add(succes);
  
        

        frame.setVisible(true);

    }
}  
