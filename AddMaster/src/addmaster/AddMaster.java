/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmaster;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPopupMenu;

/**
 *
 * @author Jaspreet Singh
 */
public class AddMaster {

    /**
     * @param args the command line arguments
     */
    static SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    static Date dt = new Date();
    public static void main(String[] args) {
        // TODO code application logic here
        Masteradd f = new Masteradd();
        
        f.setVisible(true);
        f.setTitle("Channel Addition on Sheets");
        
    }
}
