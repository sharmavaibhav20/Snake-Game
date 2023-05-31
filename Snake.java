import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {
public Snake() {
    initUI();
}

private void initUI() {
    add(new Board());
           
    setResizable(false);
    setTitle("Snake");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
}


public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        new Snake().setVisible(true);
    });
}

}
