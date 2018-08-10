
package healthdata;
import javax.swing.JOptionPane;
public class Java {

  public static void main(String[] args) {

      int userYears = Integer.parseInt(JOptionPane.showInputDialog("Enter your age using only years:"));    
int userAgeDays = userYears * 365;
int sneezesDay = 4;
int sneezesLife = userAgeDays * sneezesDay; 
   
JOptionPane.showMessageDialog(null, "You have sneezed " + sneezesLife + " times in your life.");

    
}} 
