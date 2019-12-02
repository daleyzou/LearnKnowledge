package daleyzou.cache;

import com.daleyzou.threadlocal.ThreadLocalDemo;

import java.util.concurrent.CountDownLatch;

/**
 * Test
 * @description TODO
 * @author daleyzou
 * @date 2019年12月02日 21:37
 * @version 3.0.0
 */
public class Test {

    public static void main(String[] args){
        int threads = 10;
        for (int i = 1; i <= threads; i++){
            new Thread(()->{
                for (int j = 1; j <= threads; j++){
                    System.out.println(CustomizeCache.getMap(j).getId());
                }
            }, "thread - " + i).start();
        }
    }
}
