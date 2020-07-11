public class TestProgression {
    public  static void  main(String[] args){
        Progression prog;
        //Test ArithmeticProgression
        System.out.println("Arithmetic progression with default increment");
        prog = new ArithmeticProgression();
        prog.printProgression(10);

        System.out.println("Arithmetic progression with increment 5");
        prog = new ArithmeticProgression(5);
        prog.printProgression(10);

        System.out.println("Arithmetic progression with start 2");
        prog = new ArithmeticProgression(5,2);
        prog.printProgression(10);

        //Test GeometricProgression
        System.out.println("Geometric progression with default base");
        prog = new GeometricProgression();
        prog.printProgression(10);

        System.out.println("Geometric progression with base 3");
        prog = new GeometricProgression(3);
        prog.printProgression(10);

        System.out.println("Geometric progression with base 5 and start of 5");
        prog = new GeometricProgression(5,5);
        prog.printProgression(10);

        //Test FubonacciProgression
        System.out.println("Fubonacci progression with default start value");
        prog = new FubonacciProgression();
        prog.printProgression(10);

        System.out.println("Fubonacci progression with  start value of 10 and 30");
        prog = new FubonacciProgression(60,30);
        prog.printProgression(10);

        System.out.println("Fubonacci progression with  start value of 4 and 6");
        prog = new FubonacciProgression(4,6);
        prog.printProgression(10);






    }
}
