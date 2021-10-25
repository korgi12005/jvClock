package ClNew.pac;

import java.util.Scanner;

public class CclockTwo extends Cclock{
    int Sec;

    public void SetSec(int S)throws ExeptionOne{
        if(S>60 || S<0)
            throw new ExeptionOne("your input invalid sec",S);
        this.Sec=S;
    }

    public int getSec() {
        return Sec;
    }

    @Override
    public void SetHour(int H) throws ExeptionOne {
        super.SetHour(H);
    }

    @Override
    public int GetHour() {
        return super.GetHour();
    }

    @Override
    public void SetMinute(int Min) throws ExeptionOne {
        super.SetMinute(Min);
    }

    @Override
    public int GetMinute() {
        return super.GetMinute();
    }

    @Override
    public void SetPrice(int P) {
        super.SetPrice(P);
    }

    @Override
    public int GetPrice() {
        return super.GetPrice();
    }

    @Override
    public void SetMark(String M) {
        super.SetMark(M);
    }

    @Override
    public String GetMark() {
        return super.GetMark();
    }

    @Override
    public void NewTime(int upH, int upMin) {
        super.NewTime(upH, upMin);
    }
    public void NewSec(int upSec) {
        this.Sec += upSec;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void ChangeTime() throws ExeptionOne {
        Scanner in = new Scanner(System.in);
        System.out.print("\nif you want set new time print 1 else 0 ");
        int fl=in.nextInt();
        if (fl==1) {
            int nH, nMin, nS;
            System.out.print("input  plus hour: ");
            nH = in.nextInt();
            System.out.print("input plus minute: ");
            nMin = in.nextInt();
            System.out.print("input plus Sec: ");
            nS = in.nextInt();
            if(nH+Hour>24 || nH<0)
                throw new ExeptionOne("your input invalid hour",nH);
            if(nMin+Minute>60 || nMin<0)
                throw new ExeptionOne("your input invalid minute",nMin);
            if(nS+Sec>60 || nS<0)
                throw new ExeptionOne("your input invalid minute",nMin);

            this.NewSec(nS);
            this.NewTime(nH,nMin);
            System.out.println(this);
        }
    }
}
