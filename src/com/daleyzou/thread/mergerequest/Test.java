package daleyzou.thread.mergerequest;

/**
 * Test
 * @description TODO
 * @author zoudaifa
 * @date 2019年12月06日 17:27
 * @version 3.0.1
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Flusher<String> stringFlusher = new Flusher<>("test",5,1000,30,1,new PrintOutProcessor());

        int index = 1;
        while (true){
            stringFlusher.add(String.valueOf(index++));
            Thread.sleep(1000);
        }
    }
}
