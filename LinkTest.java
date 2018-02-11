package linktest;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: SHF
 * @Assignment Name: linktest
 * @Date: Feb 11, 2018
 * @Description: 
 */
//Imports

import java.awt.Desktop;
import java.net.URI;

//Begin Class LinkTest
public class LinkTest {

    //Begin Main Method
    public static void main(String[] args) throws Exception
    {
        
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://herpsofnc.org/snakes/"));
        
    } //End Main Method

} //End Class LinkTest
