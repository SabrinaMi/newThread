public class NewThread implements Runnable
{
    private int Id; //Aufgabe 2
    NewThread(int Id) // eine ID braucht man damit man die Veränderungbzw. den Unterschied bei Aufgabe 1 sieht
    { this.Id = Id;
    }

    @Override
    public void run()
    {
        System.out.println(Id + "Hello Thread");
        try
        {
            Thread.sleep(5000); //Aufgabe 2
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {

        for (int i = 0; i < 5; i++)
        {
            NewThread newThread = new NewThread(i);
            Thread thread = new Thread(newThread);

            //immer nur eines hernehmen!
            thread.start();//gibt ohne Sortierung aus, führt es gleichzeitig aus, dauert nicht lange
            //thread.run();//gibt mit Sortierung aus, WEIL er es nicht gleichzeitig ausführt, führt es nicht gleichzeitig aus
        }

    }
}
