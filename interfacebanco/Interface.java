package interfacebanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private JFrame frame;
    private JTextField usuarioField;
    private JPasswordField senhaField;

    public Interface() {
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel painel = new JPanel();
        frame.add(painel);
        placeComponents(painel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel painel) {
        painel.setLayout(null);

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        painel.add(userLabel);

        usuarioField = new JTextField(20);
        usuarioField.setBounds(100, 20, 165, 25);
        painel.add(usuarioField);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        painel.add(passwordLabel);

        senhaField = new JPasswordField(20);
        senhaField.setBounds(100, 50, 165, 25);
        painel.add(senhaField);

        JButton loginBttn = new JButton("Login");
        loginBttn.setBounds(10, 80, 80, 25);
        painel.add(loginBttn);

        loginBttn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String username = usuarioField.getText();
                String password = new String(senhaField.getPassword());

            }
        });
    }

}
