import javax.swing.JOptionPane;
public class JOption {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
       JOptionPane.showMessageDialog(null,"Your name is "+name+" ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" year old ");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall ");

        JOptionPane.showMessageDialog(null,"Thank you " +name);


    }

}
