package advanced.networking;

public interface ICallBack2 {
    default void callBack(int param){
        System.out.println("Inside basics.networking.ICallBack2");
    }
}
