package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService namingService;

    public InputOutputGui() {
        namingService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        lastName = namingService.extractLastName(fullName);
  
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
         public String doSomethingAwesome() {
        return null;
         }
}
