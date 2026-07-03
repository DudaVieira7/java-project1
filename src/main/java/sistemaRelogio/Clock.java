package sistemaRelogio;


public sealed abstract class Clock permits BRLClock, USClock{
    protected int hour;
    protected int minute;
    protected int second;
    
    
    public int getHour(){
        return this.hour;
    }
    public void setHour(int hour){
        if(hour >= 24){
            return;
        }
        this.hour = hour;
    }
    
    
    
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        if(minute >= 60){
         this.minute = 60;
         return;
        }
        this.minute = minute;
    }
    
    
    
    
    public String getCurrentTime(){
       
        return hour + ":" + minute + ":" + second;
    }
    
    
    
    public int getSecond(){
        return this.second;
    }
    public void setSecond(int second){
        if(minute >= 60){
         this.second = 60;
         return;
        }
        this.second = second;
    }
    
    
    
   abstract Clock convert(Clock clock);
}