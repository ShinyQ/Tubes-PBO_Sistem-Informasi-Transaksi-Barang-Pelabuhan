/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiDermaga.Controller;

import TransaksiDermaga.View.RegisterFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Hanvito Michael Lee
 */
public class RegisterController implements ActionListener, BaseController {

    private final RegisterFrame frame;

    public RegisterController() {
        frame = new RegisterFrame();
        frame.setTitle("Register Form");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(frame.btnRegis())) {
            btnRegisActionPerformed();
        } else if (source.equals(frame.btnReset())) {
            btnResetActionPerformed();
        } else if(source.equals(frame.showPassword())){
            frame.show(frame.showPassword());
        }
    }

    public void btnRegisActionPerformed() {
        String name = frame.getName();
        String username = frame.getUsername();
        String phone = frame.getPhone();
        String password = frame.getPassword();
        String address = frame.getAddress();
        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || phone.isEmpty() || address.isEmpty()) {
            msg.showMessage("Semua field harus diisi", "Validasi error", 2);
        } else {
            msg.showMessage("Pendaftaran berhasil", "Success", 1);
            new LoginController();
        }
        
    }
    
    public void btnResetActionPerformed() {
        frame.ResetForm();
    }
    
}
