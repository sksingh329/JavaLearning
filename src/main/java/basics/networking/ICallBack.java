package basics.networking;

public interface ICallBack {
    default void callBack(int param){
        System.out.println("Inside basics.networking.ICallBack");
    }
}
