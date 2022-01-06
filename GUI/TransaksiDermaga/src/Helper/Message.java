package helper;

import javax.swing.JOptionPane;


public class Message {

    public Message() {
    }

    public void showMessage(String message, String title, int type) {
        // 0 error
        // 1 info
        // 2 warning
        JOptionPane.showMessageDialog(null, message, title, type);
        // jika error maka program akan berhenti
        if(type == 0){
            System.exit(0);
        }
    }
}