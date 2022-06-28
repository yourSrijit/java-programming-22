package Multi_Thread;
class  D extends  Thread {
    public void run()

    {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }
}
public class s_10_Suspend_Resume_Method {
    public static void main(String[] args) {
        D t1=new D();
        D t2=new D();
        D t3=new D();
        t1.setName("Thread      1");
        t2.setName("Thread   2");
        t3.setName("thread 3");
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        t2.resume();

    }

    }

