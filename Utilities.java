/**
 * A collection of useful functions that can be used when developing java applications.
 * For more info check the README.md file.
 * 
 * @author Rhys Walker
 * @version 0.1
 * @since 2023-12-21
 */
// used for the clipboard functions

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class Utilities {

    /**
     * Gets the contents of the users current clipboard
     * 
     * @return A string containing the contents of the clipboard
     */
    public String getClipboard() {
        try {
            // get the clipboard contents
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            return (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception exception) {
            // if the clipboard is empty return null
            exception.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the contents of the users clipboard based on the input
     * 
     * @param location What to set the clipboard to
     */
    public void setClipboard(String setting) {
        try {
            //  set the clipboard contents
            StringSelection stringSelection = new StringSelection(setting);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        } catch (Exception exception) {
            // if the location is empty return null
            exception.printStackTrace();
        }
    }
}
