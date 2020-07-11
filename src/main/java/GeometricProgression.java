public class GeometricProgression extends Progression {
    protected long base;

    /**Constructs Progression*/
    public GeometricProgression(){this(2,1);}

    /**Constructs progression 1,b,b^2,b^3,b^4...for base b*/
    public GeometricProgression(long b){this (b,1);}

    /**Constructs geometric progression with arbitrary base and start*/
    public GeometricProgression(long b,long start){
        super(start);
        base = b;
    }
    public void advance(){
        current*=base;
    }
}
