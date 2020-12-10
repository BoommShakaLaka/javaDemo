package callbackFunction;

public class Ricky implements Student {
    @Override
    public void resolveQuestion(Callback callback) {
        //模拟解决问题
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.tellAnswer(3);
    }
}
