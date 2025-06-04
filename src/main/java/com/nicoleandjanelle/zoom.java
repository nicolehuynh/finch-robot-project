package com.nicoleandjanelle; 
import com.birdbrain.Finch; 

public class zoom {
    public static void main(String[] args){
        Finch bird = new Finch();

        int patternArray[] = {0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0};
        bird.setTail("all",45,20,20);

        for(int i = 0; i < 5; i++){
            bird.setTail("all",87,80,100);
            bird.playNote(60,0.5);
            bird.pause(0.2);
            bird.setTail("all",75,0,100);
            bird.playNote(80,0.5);
            bird.pause(0.2);
            bird.setTail("all",0,50,100);
            bird.playNote(100,0.5);
            bird.pause(0.2);
            bird.setTail("all",87,80,100);
            bird.playNote(120,0.5);
            bird.pause(0.2);
            bird.setTail("all",75,0,100);
            bird.playNote(80,0.5);
            bird.pause(0.2);
            bird.setTail("all",0,50,100);
            bird.playNote(60,0.5);
        }


            int patternArray2[] = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
            int patternArray3[] = {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
            int patternArray4[] = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,};
            int patternArray5[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,};
            int patternArray6[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,};

    


        bird.setDisplay(patternArray);
        bird.pause(0.2);
        bird.setDisplay(patternArray2);
        bird.pause(0.2);
        bird.setDisplay(patternArray3);
        bird.pause(0.2);
        bird.setDisplay(patternArray4);
        bird.pause(0.2);
        bird.setDisplay(patternArray5);
        bird.pause(0.2);
        bird.setDisplay(patternArray6);
        bird.pause(0.2);
        bird.setDisplay(patternArray5);
        bird.pause(0.2);
        bird.setDisplay(patternArray4);
        bird.pause(0.2);
        bird.setDisplay(patternArray3);
        bird.pause(0.2);
        bird.setDisplay(patternArray2);
        bird.pause(0.2);
        bird.setDisplay(patternArray);

        bird.setBeak(45,0,5);
        bird.setMove("F",25,100);
        bird.setTurn("R",180,100);
        bird.playNote(60,0.5);

        bird.setTurn("R",45,100);
        bird.playNote(80,0.5);
        bird.setTurn("L",45,100);
        bird.playNote(100,0.5);
        bird.setTurn("R",45,100);
        bird.playNote(120,0.5);
        bird.setTurn("L",20,100);
        
        bird.playNote(80,0.5);
        bird.setMove("F",15,50);
        bird.playNote(60,0.5);
        bird.setMove("B",15,50);
        bird.setTurn("R",45,100);
        bird.setTurn("L",45,100);
        bird.setTurn("R",20,100);
        bird.playNote(60,0.5);
        bird.pause(0.2);
        bird.playNote(60,0.5);
        bird.pause(0.2);
        bird.playNote(80,0.5);
        bird.pause(0.2);
        bird.playNote(80,0.5);
        bird.pause(0.2);
        bird.playNote(90,0.5);
        bird.pause(0.2);
        bird.playNote(100,0.5);
        bird.pause(0.2);
        bird.playNote(90,0.5);
        bird.pause(0.2);
        bird.playNote(80,0.5);
        bird.pause(0.2);
        bird.playNote(80,0.5);
        bird.pause(0.2);
        bird.playNote(60,0.5);
        bird.pause(0.2);
        bird.playNote(60,0.5);
        bird.pause(0.2);
        bird.playNote(40,0.5);
        bird.pause(0.2);
        bird.playNote(60,0.5);
        bird.pause(0.2);
        bird.playNote(40,0.5);
      

        bird.setMove("F",15,50);
        bird.setMove("B",15,50);
        bird.setTurn("L",45,100);
        bird.setTurn("R",45,100);
        bird.setTurn("L",20,100);
        
        
        bird.setTurn("R",360,100);
        bird.setTurn("L",360,100);
        

        bird.stop();
        bird.disconnect();
    }
}