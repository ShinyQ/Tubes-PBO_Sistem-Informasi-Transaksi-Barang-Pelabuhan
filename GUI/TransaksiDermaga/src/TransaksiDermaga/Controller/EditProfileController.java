/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiDermaga.Controller;

import static TransaksiDermaga.Controller.BaseController.msg;
import TransaksiDermaga.View.EditProfileFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Hanvito Michael Lee
 */
public class EditProfileController implements ActionListener{
    private final EditProfileFrame frame;
    public EditProfileController(){
        frame = new EditProfileFrame();
        frame.setTitle("Edit Profile");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(frame.btnSave())) {
            msg.showMessage("Data saved", "Data", 2);
            frame.dispose();
            new DashboardUserController();
        } else if (source.equals(frame.btnBack())) {
            frame.setVisible(false);
            new DashboardUserController();
        }
    }
}
