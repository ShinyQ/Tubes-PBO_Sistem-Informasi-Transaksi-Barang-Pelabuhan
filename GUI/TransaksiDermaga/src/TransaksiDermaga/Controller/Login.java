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

/**
 *
 * @author Hanvito Michael Lee
 */
public class Login extends MouseAdapter implements ActionListener{
    public static void main(String[] args) {
       LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); 
    }
//        frame.setTitle("Login Form");
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
    
    
//    public void mousePressed(MouseEvent me) {
//        Object source = me.getSource();
//        if (source.equals(this.frame.namaList())){
//            int selectedIndex = this.frame.namaList().getSelectedIndex();
//            if (selectedIndex != -1){
//                this.frame.getButton2().setEnabled(true);
//                this.frame.getButton3().setEnabled(true);
//                ModelPegawai selectedItem = this.modelPegawai.get(selectedIndex);
//                this.frame.setLabel(selectedItem.getNama(), selectedItem.getPosisi(), selectedItem.getTgl_lahir());
//            };
//        }
//    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
