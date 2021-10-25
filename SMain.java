package ClNew;
import ClNew.pac.CclockTwo;
import ClNew.pac.ExeptionOne;
import ClNew.pac.IntOne;
import ClNew.pac.fabric;

import java.util.Scanner;

public class SMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H,Min,P,S;
        String M;
        IntOne T= fabric.build();
        System.out.print("first clock: hour, minute, price mark \n input hour: ");
        H=in.nextInt();
        System.out.print("input minute: ");
        Min=in.nextInt();
        System.out.print("input price: ");
        P=in.nextInt();
        System.out.print("input mark: ");
        M=in.next();
        try {
            T.SetHour(H);
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
        T.SetMark(M);
        try {
            T.SetMinute(Min);
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
        T.SetPrice(P);
        System.out.print(T);
        try {
            T.ChangeTime();
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }


        CclockTwo T2=new CclockTwo();
        System.out.print("Second clock: hour, minute,sec, price, mark \n input hour: ");
        H=in.nextInt();
        System.out.print("input minute: ");
        Min=in.nextInt();
        System.out.print("input sec: ");
        S=in.nextInt();
        System.out.print("input price: ");
        P=in.nextInt();
        System.out.print("input mark: ");
        M=in.next();
        try {
            T2.SetHour(H);
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
        T2.SetMark(M);
        try {
            T2.SetMinute(Min);
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
        try {
            T2.SetSec(S);
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
        T2.SetPrice(P);
        System.out.print(T2);
        try {
            T2.ChangeTime();
        } catch (ExeptionOne e) {
            e.printStackTrace();
        }
    }
}
