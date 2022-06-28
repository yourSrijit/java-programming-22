//                    By Extending Thread Class
package Multi_Thread;
class  A1 extends Thread{
    @Override
    public void run(){
        int i;
        for (i=0;i<100;i++)
        {
            System.out.println("Chatting with Kamalika");
        }
    }
}
class  A2 extends Thread{
    @Override
    public void run(){
        int i;
        for (i=0;i<10;i++)
        {
            System.out.println("Doing ALP in 8085 Microprocessor");
        }
    }
}
public class s_70_Thread_Class {
    public static void main(String[] args) {
            A1 t1 =new A1();
            A2 t2 =new A2 ();
            t1.start();
            t2.start();
    }
}
