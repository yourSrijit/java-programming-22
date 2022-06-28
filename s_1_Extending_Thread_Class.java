
                  // ******************    Extending Thread Class ****************////
package Multi_Thread;
class  A3 extends Thread{
    @Override
    public void run(){

        int i;
        for (i=0;i<10;i++)
        {
            System.out.println("Chatting with Kamalika");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

/**
public void fun(){

    int i;
    for (i=0;i<10;i++)
    {
        System.out.println("Chatting with Kamalika");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/
}
public class s_1_Extending_Thread_Class {
    public static void main(String[] args) throws InterruptedException {
        A3 t5 =new A3();
      t5.start();
//        t5.fun();
        for (int i=0;i<10;i++){
            System.out.println("I am Srijit");
            Thread.sleep(1000);
        }
    }
}
