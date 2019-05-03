package cod;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class tocaMusica{
    
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;    
    
    public void Play(String path){
     
        try{
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            player = new Player(BIS);

        }catch(FileNotFoundException | JavaLayerException ex){}
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();                   
                } catch (JavaLayerException ex) {}
            }
        }.start();
        
    }
    
    public void Stop(){
        if(player != null){
            player.close();
        }
    }
    
}
