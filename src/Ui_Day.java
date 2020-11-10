import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui_Day extends JFrame {
    private JPanel headPanel;
    private JPanel MainPanel;
    private JRadioButton luneRb;
    private JRadioButton croissantRb;
    private JRadioButton soleilRb;
    private JLabel Lbl_image;
    private JPanel colorPanel;

    public Ui_Day()
{
    ButtonGroup gr = new ButtonGroup();
    gr.add(luneRb);
    gr.add(croissantRb);
    gr.add(soleilRb);

    setTitle("Day time");
    setContentPane(MainPanel);
    setSize(new Dimension(800,700));
    setVisible(true);

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(soleilRb.isSelected())
            {
                Lbl_image.setIcon(new ImageIcon("C:\\Users\\abdel\\IdeaProjects\\Tp2_SWING_app\\src\\sal.png"));
                colorPanel.setBackground(Color.cyan);
            }else if(luneRb.isSelected())
            {
                Lbl_image.setIcon(new ImageIcon("C:\\Users\\abdel\\IdeaProjects\\Tp2_SWING_app\\src\\lu.png"));
                colorPanel.setBackground(Color.BLACK);
            }else if(croissantRb.isSelected())
            {
                Lbl_image.setIcon(new ImageIcon("C:\\Users\\abdel\\IdeaProjects\\Tp2_SWING_app\\src\\curs.png"));
                colorPanel.setBackground(Color.BLACK);
            }

        }
    };
    soleilRb.addActionListener(listener);
    croissantRb.addActionListener(listener);
    luneRb.addActionListener(listener);
}
    public static void main(String[] args) {
        Ui_Day ui = new Ui_Day();
    }
}
