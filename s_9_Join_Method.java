package Multi_Thread;
    class  C extends Thread{

        public  void run(){
        String name = Thread.currentThread().getName();

            for (int i = 0; i < 20; i++) {
                System.out.println(name);
            }
        }
    }
public class s_9_Join_Method {
    public static void main(String[] args) {
        C t1= new C();
        C t2= new C();
        C t3= new C();
        t1.setName("Thread one 1");
        t2.setName("Thread   2");
        t3.setName("Thread 3");


        t1.start();
        t3.start();

        t2.start();
        try{
            t2.join();
        }
        catch (InterruptedException c){
            c.getMessage();
        }


    }
}
