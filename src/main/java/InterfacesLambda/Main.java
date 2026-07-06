package InterfacesLambda;


public class Main{
    public static void main(String[] args) {
        
        var musicPlayer = new MusicPlayer(){
        
            @Override
            public void playMusic(){
                System.out.println("Tocando a música!");
            
            }

            @Override
            public void pauseMusic(){
            
            }

            @Override
            public void stopMusic(){
            
            }
        };
        
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getClass());
        System.out.println("1".getClass());
        
    }

}