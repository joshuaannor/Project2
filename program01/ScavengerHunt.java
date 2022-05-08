// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Joshua Annor (906390831)
//-------------------------------------------------------------------------
/**
 *  scavengerhunt is a subclass of longisalnd that I use to add a object
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Joshua Annor (906390831)
 *  @version (2022.02.01)
 */
public class ScavengerHunt extends LongIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
/**
 * myProgram method adds the scavenger to thte map with coordinates
 */
    public void myProgram()
    {
        Scavenger jeroo = new Scavenger(EAST, 0);
        this.addObject(jeroo, 2, 1);
        jeroo.collectFlowers();
    
    }
}
