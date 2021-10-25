package ClNew.pac;
import java.util.Scanner;

class Cclock implements IntOne {
    int Hour, Minute, Price;
    String Mark;

    @Override
    public void SetHour(int H) throws ExeptionOne {
        if(H>24||H<0) throw new ExeptionOne("invalid Hour",H);
        this.Hour=H;
    }

    @Override
    public int GetHour() {
        return this.Hour;
    }

    @Override
    public void SetMinute(int Min) throws ExeptionOne{
        if(Min>60 || Min<0)
            throw new ExeptionOne("your input invalid minute",Min);
        this.Minute=Min;

    }

    @Override
    public int GetMinute() {
        return this.Minute;
    }

    @Override
    public void SetPrice(int P) {
        this.Price=P;
    }

    @Override
    public int GetPrice() {
        return this.Price;
    }

    @Override
    public void SetMark(String M) {
        this.Mark=M;
    }

    @Override
    public String GetMark() {
        return this.Mark;
    }

    @Override
    public void NewTime(int upH, int upMin) {
            this.Hour+=upH;
            this.Minute+=upMin;
    }

    @Override
    public String toString() {
        return "Cclock{" +
                "Hour=" + Hour +
                ", Minute=" + Minute +
                ", Price=" + Price +
                ", Mark='" + Mark + '\'' +
                '}';
    }

    @Override
    public void ChangeTime() throws ExeptionOne {
        Scanner in = new Scanner(System.in);
        System.out.print("\nif you want set new time print 1 else 0 ");
        int fl=in.nextInt();
        if (fl==1) {
            int nH, nMin;
            System.out.print("input  plus hour: ");
            nH=in.nextInt();
            System.out.print("input plus minute: ");
            nMin=in.nextInt();
            if(nH+Hour>24 || nH<0)
                throw new ExeptionOne("your input invalid hour",nH);
            if(nMin+Minute>60 || nMin<0)
                throw new ExeptionOne("your input invalid minute",nMin);
            this.NewTime(nH,nMin);
            System.out.println(this);
        }
    }
}
