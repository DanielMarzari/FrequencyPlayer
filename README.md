# FrequencyPlayer

Rudimentary approach to playing multiple frequencies

Limitations:
  can't play more than 3,000 frequencies
  no UI interface (all inputs are set on the audioSettings.java file)

Files: 
  Main.java //spins off threads for each frequency so each can be heard
  audioSettings.java //contains variables pertaining to user inputs
  soundThread.java //creates an array that contains the data points for playing the frequency
  stdAudio.java //opensource file that writes to the sound card
