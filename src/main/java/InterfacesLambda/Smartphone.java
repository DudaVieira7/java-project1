/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesLambda;

/**
 *
 * @author Maria Eduarda
 */
public class Smartphone  implements VideoPlayer, MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("O SmartPhone está reproduzindo o vídeo.");    
        
    
    }

    @Override
    public void pauseVideo() {
        System.out.println("O SmartPhone está pausando o vídeo.");
    }

    @Override
    public void stopVideo() {
        System.out.println("O SmartPhone parou de reproduzir o vídeo.");
    }

    @Override
    public void playMusic() {
        System.out.println("O SmartPhone está tocando a música.");

    }

    @Override
    public void pauseMusic() {
        System.out.println("A música foi pausada no SmartPhone.");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Smatphone parou de reproduzir a música.");
    }
    
}
