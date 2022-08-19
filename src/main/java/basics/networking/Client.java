package basics.networking;

public class Client implements ICallBack, ICallBack2 {
    @Override
    public void callBack(int param) {
        ICallBack.super.callBack(param);
    }
}
