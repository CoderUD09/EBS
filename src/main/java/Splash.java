
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class Splash {

    public static void main(String[] args) {
        Welcome wel = new Welcome();
        wel.setVisible(true);
        int i=0;
        try {
            while(i<=100) {
                Random random = new Random();
                int rand = random.nextInt(10);
                i += rand;
                Thread.sleep(100);
                wel.jProgressBar1.setValue(i);
                wel.jLabel4.setText(Integer.toString(i) + "%");
            }
            wel.dispose();
            new login().setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
