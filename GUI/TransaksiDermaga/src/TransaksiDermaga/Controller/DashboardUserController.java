/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiDermaga.Controller;

import TransaksiDermaga.View.DashboardUserFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Hanvito Michael Lee
 */
public class DashboardUserController implements ActionListener, BaseController {
    
    private final DashboardUserFrame frame;
    
    public DashboardUserController(){
        frame = new DashboardUserFrame();
        frame.setTitle("Dashboard");
        frame.setLabel("","","","","","","");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(frame.btnEdit())) {
            new EditProfileController();
            frame.dispose();
        } else if (source.equals(frame.btnLogout())) {
            new LoginController();
            frame.dispose();
        }
    }
}
