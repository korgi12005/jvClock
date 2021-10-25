package ClNew.pac;

public interface IntOne {
    public void SetHour(int H) throws ExeptionOne;
    public int GetHour();
    public void SetMinute(int Min) throws ExeptionOne;
    public int GetMinute();
    public void SetPrice(int P);
    public int GetPrice();
    public void SetMark(String M);
    public String GetMark();
    public void NewTime(int upH, int upMin);
    public String toString();
    public void ChangeTime() throws ExeptionOne;
}
