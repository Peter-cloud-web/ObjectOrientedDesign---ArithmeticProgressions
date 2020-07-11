public class ArithmeticProgression extends Progression {
    protected long increment;

    /**
     * Constructs progression 0,1,2,.....
     */
    public ArithmeticProgression() {
        this(1, 0);
    }

    /*Constructs progression 0, stepsize, 2*stepsize,...*/
    public ArithmeticProgression(long stepsize) {
        this(stepsize, 0);
    }

    /*Constructs arithmetic progression with arbitrary start and increment*/
    public ArithmeticProgression(long stepsize, long start) {
        super(start);
    }

    /**
     * Adds the arithmetic increment to the current value
     */
    public void advance() {
        current += increment;
    }


}
