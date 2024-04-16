package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ungdungquanlibaixe.JFrameQLBX;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        super("Đăng nhập");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Tên người dùng:");
        JLabel passwordLabel = new JLabel("Mật khẩu:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Đăng nhập");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

               
                if (username.equals("admin") && password.equals("1")) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Đăng nhập thành công!");

                   
                    dispose();

                    
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new JFrameQLBX().setVisible(true);
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Đăng nhập thất bại. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}