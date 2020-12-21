
package wifidiagtree;
import javax.swing.JOptionPane;

/**
 *
 * @author Shanell Spann
 */
public class wifiCheck 
{
    public void fixMyWifi(){
        JOptionPane.showMessageDialog(null, "Reboot the computer and try to connect", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
        int reply = JOptionPane.showConfirmDialog(null,"Did that fix the problem?", "Fix My WiFi App", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) 
        {
            JOptionPane.showMessageDialog(null, "GREAT! Have a nice day.", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Reboot the router and try to connect", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
            int reply2 = JOptionPane.showConfirmDialog(null,"Did that fix the problem?", "Fix My WiFi App", JOptionPane.YES_NO_OPTION);
            if (reply2 == JOptionPane.YES_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "GREAT! Have a nice day.", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Make sure the cables between the router & modem are plugged in firmly", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                int reply3 = JOptionPane.showConfirmDialog(null,"Did that fix the problem?", "Fix My WiFi App", JOptionPane.YES_NO_OPTION);
                if (reply3 == JOptionPane.YES_OPTION) 
                {
                    JOptionPane.showMessageDialog(null, "GREAT! Have a nice day.", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Move the router to a new location", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                    int reply4 = JOptionPane.showConfirmDialog(null,"Did that fix the problem?", "Fix My WiFi App", JOptionPane.YES_NO_OPTION);
                    if (reply4 == JOptionPane.YES_OPTION) 
                    {
                        JOptionPane.showMessageDialog(null, "GREAT! Have a nice day.", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Get a new router. GOODBYE", "Fix My Wifi App", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            }
        }    
    }
}
