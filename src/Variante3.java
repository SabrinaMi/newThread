public class Variante3 extends Thread
{
    public void start() //egal ob run oder start es wird beides ausgeworfen
    {
        System.out.println("Hello Thread");
    }

    public static void main(String[] args)
    {
        NewThreadSubclass newThread = new NewThreadSubclass();

        newThread.start();
        newThread.run();
    }
}

