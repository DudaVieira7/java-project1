/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesLambda;

/**
 *
 * @author Maria Eduarda
 */
public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
         System.out.println("A caixa de música está reproduzindo a música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está pausando a música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está deixando de reproduzir a música.");
    }
    
}
