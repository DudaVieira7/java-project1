package sistemaRelogio;


public non-sealed class USClock extends Clock{
    
    private String periodIndicator;
    
    public String periodIndicator(){
        return this.periodIndicator;
    }
    
    public void setAftherMiddDay(){
        this.periodIndicator = "PM";
        
    }
    
    public void setBeforeMiddDay(){
        this.periodIndicator = "AM";
    }
    
    public void setHour(int hour){
        
        setBeforeMiddDay();
        
        if((hour >= 12) && (hour <= 23)){
            this.hour = hour - 12;
            setAftherMiddDay();
        }
        else if(hour >= 24){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }
    }
    

    @Override
    public Clock convert( final Clock clock) {
          this.second = clock.getSecond();
          this.minute = clock.getMinute();
          switch (clock){
            case USClock usClock ->{
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.periodIndicator();
                
            
            }
                   
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        
                    }
        return this;
    }
    
    @Override
    public String getCurrentTime(){
        return super.getCurrentTime() +" " + this.periodIndicator();
    }
    

}
