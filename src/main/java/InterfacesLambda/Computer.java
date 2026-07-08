/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesLambda;

/**
 *
 * @author Maria Eduarda
 */
public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("O Computador está reproduzindo o vídeo.");
    }

    @Override
    public void pauseVideo() {
         System.out.println("O Computador está pausando o vídeo.");
    }

    @Override
    public void stopVideo() {

         System.out.println("O Computador está  parando de reproduzir o vídeo.");
    }

    @Override
    public void playMusic() {
         System.out.println("O Computador está reproduzindo a música.");
    }

    @Override
    public void pauseMusic() {
         System.out.println("O Computador está pausando a música.");

    }

    @Override
    public void stopMusic() {
         System.out.println("O Computador está  parando de reproduzir a música.");
    }
    
}
