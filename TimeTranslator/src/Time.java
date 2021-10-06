public class Time {
    private  int second = 0;
    public   int convertToSecond(int days, int hour, int minutes){
        if(days<0)days=0;
        if(hour<0)hour=0;
        if(minutes<0)minutes=0;
        return second=days*86400+hour*3600+minutes*60;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
