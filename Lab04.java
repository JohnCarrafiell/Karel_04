/**
*
* Description of the program goes here  // provide a brief description
*
* @author <John Carrafiell>  // replace <...> with your name
* @version <5/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

     public static void takeTheField(Athlete arg) {
     
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
      }

     public static void main(String[] args) {
     
         Display.openWorld("maps/arena.map");
   Display.setSize(10, 10);
   Display.setSpeed(8);
   
   Athlete maria = new Athlete();
   Athlete gary = new Athlete();
   Athlete sam = new Athlete();
   Athlete will = new Athlete();
   Athlete alex = new Athlete();
   Athlete jordon = new Athlete();
   Athlete john = new Athlete();
   takeTheField(maria);	
   takeTheField(gary);
   takeTheField(sam);	
   takeTheField(will);
   takeTheField(alex);	
   takeTheField(jordon);
   john.move();
   john.move();
   john.move();
   john.move();
   john.move();
   john.move();
   john.turnRight();
   john.move();
   maria.move();
   maria.move();
   maria.move();
   maria.turnLeft();
   maria.move();
   maria.move();
   maria.turnAround();
   gary.move();
   gary.turnLeft();
   gary.move();
   gary.turnAround();
   sam.move();
   sam.move();
   sam.move();
   sam.move();
   sam.move();
   sam.turnLeft();
   sam.move();
   sam.turnAround();
   will.move();
   will.move();
   will.move();
   will.move();
   will.turnRight();
   alex.move();
   alex.move();
   alex.move();
   alex.turnRight();
   jordon.move();
   jordon.move();
   jordon.turnRight();
   
   
          // TODO Your code goes here
     }
}
