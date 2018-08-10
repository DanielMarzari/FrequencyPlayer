package pitchplayer;

public class soundThread implements Runnable{
    double[] outputSignal = new double[44100];
    int noteDuration;
    stdAudio sp = new stdAudio();
    public soundThread(double Hz, double amp, int duration) {
        noteDuration = duration;
        for (int i = 0; i < 44100; i++){
            outputSignal[i] = amp * Math.sin(Hz * i * 2 * Math.PI / 44100); 
        }
    }

    public void run() {
        while(noteDuration-- > 0){
            sp.play(outputSignal);
        }
        sp.close();
    }

}