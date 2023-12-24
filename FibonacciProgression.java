public class FibonacciProgression extends Progression{
    protected long prev;

    public FibonacciProgression() {
        this(0,1);
    }

    public FibonacciProgression(long first , long second) {
        super(first);
        prev = second - first;
    }
    protected void advance(){
        long temp=prev;
        prev=current;
        current+=temp;
    }

    public static void main(String[] args) {

        FibonacciProgression x=new FibonacciProgression(2,2);
        x.printProgression(8);
    }
}
