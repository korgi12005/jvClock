package ClNew.pac;

public class ExeptionOne extends Exception{
    private int i=0;

    public ExeptionOne(String message, int i) {
        super(message);
        this.i = i;
    }

    @Override
    public String toString() {
        return "ExeptionOne{" +
                "i=" + i +"\n"+getMessage()+
                '}';
    }
}
