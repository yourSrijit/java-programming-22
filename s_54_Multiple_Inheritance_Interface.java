                    //***        Multiple Inheritance using Interface        *****//

package com.company;
interface Camera{
    void capture();
    void videoRec();
}

interface Musicapp{
    void music();
    void  volumeup();
}
class Smartphone implements Camera,Musicapp{

    @Override
    public void capture() {
        System.out.println("Photo is captured");
    }

    @Override
    public void videoRec() {
        System.out.println("Video record is on");
    }

    @Override
    public void music() {
        System.out.println("Play the music");
    }

    @Override
    public void volumeup() {
        System.out.println("Volume is increasing");
    }
}
public class s_54_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Smartphone ob5 =new Smartphone();
        ob5.capture();
        ob5.music();
        ob5.videoRec();
        ob5.volumeup();
    }
}
