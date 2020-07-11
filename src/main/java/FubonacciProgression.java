public class FubonacciProgression extends Progression {
    protected long prev;

    public FubonacciProgression(){this(0,1);}

    public FubonacciProgression(long first,long second){
        super(first);
        prev = second - first;
    }
    public void advance(){
        long temp = prev;
        prev = current;
        current += temp;
    }
}
