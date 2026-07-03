package sistemaRelogio;


public class Main{
    
    public static void main(String[] args) {
        
        Clock brlclock = new BRLClock();
        brlclock.setMinute(0);
        brlclock.setMinute(20);
        brlclock.setHour(14);
        
        System.out.println(brlclock.getCurrentTime());
        System.out.println(new USClock().convert(brlclock).getCurrentTime());
        
    }

}
