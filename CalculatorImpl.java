import java.rmi.*;

public class CalculatorImpl implements Calculator{
    public int addNum(int x, int y) throws RemoteException{
        System.out.println("Client request to calculate");
        return (x+y);
    }
 public int tru(int x, int y) throws RemoteException{
        System.out.println("Client request to calculate");
        return (x-y);
    }
 public int nhan(int x, int y) throws RemoteException{
        System.out.println("Client request to calculate");
        return (x*y);
    }
 public float chia(int x, int y) throws RemoteException{
        System.out.println("Client request to calculate");
        return (x/y);
    }
}
