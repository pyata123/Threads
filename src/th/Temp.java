package th;

public class Temp
{

    public static void main(String[] args)
    {
        //cuurentThread return Thread object
        //which running at present
Thread t1=Thread.currentThread();
//get name
String name=t1.getName();
System.out.println(name); //main
/*
 above lines can be combined as
Thread.currentThread().getName();
*/

MyThread mythread1=new MyThread();
MyThread mythread2=new MyThread();
MyThread mythread3=new MyThread();

mythread1.start();
mythread2.start();
mythread3.start();


    }

}


class MyThread extends Thread
{
public void run()
{
    
    System.out.println(Thread.currentThread().getName());
}
    
    
}
