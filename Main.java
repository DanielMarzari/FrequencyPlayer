/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitchplayer;

/**
 *
 * @author Daniel
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    static audioSettings as = new audioSettings();
    
    public static void main(String[] args) {
        Thread[] threads = new Thread[as.frequencies.length];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new soundThread(as.frequencies[i], as.amplitudes[i], as.durations[i]));
            threads[i].start();
        }
    }
    
}
