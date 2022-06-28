package Multi_Thread;
class F extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
public class s_13_isAlive_Method {
    public static void main(String[] args) {
            F t=new F();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
    }
}
