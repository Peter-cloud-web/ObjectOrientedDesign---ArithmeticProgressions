public class Progression {
    //instance or member variable
    protected long current;

    /** Constructs progression starting from 0 */
    public Progression(){this(0);}

    /** Constructs progression with given start value */
    public Progression(long start){current = start;}

    /**Returns next value of progression*/
    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
    /**Advances current value to the next value*/
    public void advance(){
        current++;
    }
    /**Prints the next n values of a progression, separated by spaces*/
    public void printProgression(int n){
        System.out.println(nextValue());//prints first value without space
        for(int j = 1;j<n;j++){
            System.out.println(" " + nextValue());//prints leading space before others
            System.out.println();//end the line
        }
    }


}
