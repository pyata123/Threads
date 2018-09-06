package th;

public class MultiEx 
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

mythread1.setName("m1");
mythread2.setName("m2");
mythread3.setName("m3");

//set priority
mythread3.setPriority(10);
mythread2.setPriority(Thread.MIN_PRIORITY);
mythread1.setPriority(Thread.NORM_PRIORITY);

//mythread1.setPriority(12); Illegal Argument Exception
mythread1.start();
mythread2.start();
mythread3.start();



//default priority is 5
//priority ranges from 1 10

System.out.println(mythread1.getPriority());
System.out.println(mythread2.getPriority());
System.out.println(mythread3.getPriority());



    }

}


class MultiExecute extends Thread
{
public void run()
{
    
    System.out.println(Thread.currentThread().getName());
}
    
}
