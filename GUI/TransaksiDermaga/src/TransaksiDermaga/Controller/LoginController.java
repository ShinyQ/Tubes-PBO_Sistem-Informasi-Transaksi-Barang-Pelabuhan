/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiDermaga.Controller;

import TransaksiDermaga.Model.Database;
import TransaksiDermaga.View.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanvito Michael Lee
 */
public class LoginController extends MouseAdapter implements ActionListener, BaseController {

    private final LoginFrame frame;

    public LoginController() {
        frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(frame.btnLogin())) {
            btnLoginActionPerformed();
        } else if (source.equals(frame.btnRegis())) {
            new RegisterController();
            frame.dispose();
        } else if(source.equals(frame.showPassword())){
            frame.show(frame.showPassword());
        }
        
    }

    public void btnLoginActionPerformed() {
        String username = frame.getUsername();
        String password = frame.getPassword();
        if (username.isEmpty() || password.isEmpty()) {
            msg.showMessage("Email atau Password Kosong", "Validasi error", 2);
        } else {
            System.out.println(username + password);
            if (username.equalsIgnoreCase("test") && password.equalsIgnoreCase("12345")) {
                msg.showMessage("Login Successful", "Login", 2);
                new DashboardUserController();
                frame.dispose();
            } else {
                msg.showMessage("Invalid Username or Password", "Validasi Error", 2);
            }
        }
    }
}
