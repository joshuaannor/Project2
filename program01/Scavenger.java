
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 * scavenger is a subclass of jeroo that preforms the task using a method 
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Joshua Annor (906390831)
 *  @version (2022.02.01)
 */
public class Scavenger
    extends Jeroo
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    /**
     * Initializes a newly created Scavenger object.
     */ 
    public Scavenger()
    {
       // empty constructor 
    }
    // ----------------------------------------------------------
    /**
     * Initializes a newly created Scavenger object.
     * @param direction The direction the Jeroo is facing.
     * @param flowers   The number of flowers the Jeroo is holding.
     */
    public Scavenger(CompassDirection direction, int flowers)
    {
        super(direction, flowers);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
 * this method is used to call other methods to preform my gameplan to collect
 */
    public void collectFlowers()
    {
        turn(RIGHT);
        moveThree();
        turn(LEFT);
        moveThree();
        fL1();
        fL2();
        fL3();
        turn(RIGHT);
        fL4();
        turnAround();
        fL5();
        fL6();
        turnAround();
        fL7();
        fL8();
        goToMiddle();
       // i will fill this in later
    }

    
    /**
     * these methods act like commands for a bigger method 
     */
    public void turnAround()
    {
        turn(RIGHT);
        turn(RIGHT);
    }
    /**
     * these methods act like commands for a bigger method, moves foward 3x
     */
    public void moveThree()
    {
        
        hop(3);
    }
    /**
     * these methods act like commands for a bigger method gets first flower
     */
    public void fL1()
    {
        turn(LEFT);
        hop(3);
        pick();
    }
     /**
     * these methods act like commands for a bigger method gets 2nd flower 
     */
    public void fL2()
    {
        turn(RIGHT);
        hop(3);
        pick();
    }
     /**
     * these methods act like commands for a bigger method 3rd flower
     */
    public void fL3()
    {
        
        hop(4);
        pick();
    }
     /**
     * these methods act like commands for a bigger method gets 4th flower
     */
    public void fL4()
    {
        
        hop(8);
        turn(LEFT);
        hop();
        pick();
    }
    /**
     * these methods act like commands for a bigger method, gets 5th flower
     */
    public void fL5()
    {
        hop(2);
        pick();
    }
    /**
     * these methods act like commands for a bigger method, 6th flower
     */
    public void fL6()
    {
        hop(2);
        turn(RIGHT);
        hop(4);
        pick();
    }
     /**
     * these methods act like commands for a bigger method, gets 7th flower
     */
    public void fL7()
    {
        hop(4);
        turn(RIGHT);
        hop();
        pick();
    }
    /**
     * these methods act like commands for a bigger method gets 8th flower
     */ 
    public void fL8()
    {
        turn(RIGHT);
        hop();
        turn(LEFT);
        hop(2);
        turn(LEFT);
        hop();
        pick();
        
    }
     /**
 * this method is used to call other methods to preform my gameplan to collect
 */
    public void goToMiddle()
    {
        turnAround();
        hop(6);
        turn(RIGHT);
        hop(2);
        turn(RIGHT);
        hop(3);
        turn(LEFT);
        hop();
    }
}


