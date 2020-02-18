//fnfjyjg
package pillboxarray;

public class PillBoxArray {

    /* Main method to populate an array with a word and then
     * print to the console. Example completed in class Week 1.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] pillBox1=new char[7];
        // hey bitch
        pillBox1[0]='s';
        pillBox1[1]='t';
        pillBox1[2]='u';
        pillBox1[3]='d';
        pillBox1[4]='e';
        pillBox1[5]='n';
        pillBox1[6]='t';
        
        for(int i=0;i<=pillBox1.length-1;i++)
        {
            System.out.println(pillBox1[i]);
        }
    }
    
}
