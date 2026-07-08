package InterfacesLambda;


public class Main{
    public static void main(String[] args) {
        
       Computer computer = new Computer();
        
        runMusic(computer); // ele sobe os métodos listados abaixo que foram implementados com a classe computer
        runVideo(computer);
        
        // também é possível usar assim por exemplo: 
        /*
        
        MusicPlayer musicPlayer = new Computer();
        runMusic(musicPlayer);
        runVideo((VideoPlayer) musicPlayer);
        
        
        ou também pode fazer isso aqui nesse caso, também iria funcionar:
        
        runMusic(new Computer());
        runVideo(new Computer());
        
        */
        
        
    }
    
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();   // declaração anônima de Métodos das interfaces de VídeoPlayer e MusicPlayer
    }
    
    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

}