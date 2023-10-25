
/**
 * Write a description of class fizzbuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizzbuzz
{
    public static void main (String[] args) {
        for (int i= 1; i <= 100; i++ ) {
            if ((i/15) *15 ==i ) {
                System.out.println ("FizzyBuzzy");
            }
            else if ((i/5) *5 ==i){
                System.out.println ("Buzzy");
            }
            else if ((i/3) *3 ==i) {
                System.out.println ("Fizzy");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
