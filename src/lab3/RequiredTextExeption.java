/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author justinpotts
 */
public class RequiredTextExeption extends IllegalArgumentException {
    private static String msg = "Text entery required";

    public RequiredTextExeption() {
        super(msg);
    }

    public RequiredTextExeption(String s) {
        super(s);
    }

    public RequiredTextExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public RequiredTextExeption(Throwable cause) {
        super(cause);
    }
    
    
}
