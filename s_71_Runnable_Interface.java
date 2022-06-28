//                By Implementing Runnable interface
package Multi_Thread;
class A implements Runnable{
    public void run() {
        for (int i = 0; i < 170; i++) {
            System.out.println("Chatting with Kamalika");
        }
    }
}
class A4 implements Runnable{
    public void run(){
        for (int i=0;i<150;i++){
            System.out.println("Coding.........");
        }
    }
}

public class s_71_Runnable_Interface {
    public static void main(String[] args) {

        A k =new A();
        A4 k2 =new A4();
        Thread t=new Thread(k);
        Thread t1=new Thread(k2);
        t.start();
        t1.start();


    }
}
