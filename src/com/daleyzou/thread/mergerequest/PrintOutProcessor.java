package daleyzou.thread.mergerequest;

import java.util.List;

/**
 * PrintOutProcessor
 * @description TODO
 * @author zoudaifa
 * @date 2019年12月06日 17:26
 * @version 3.0.1
 */
public class PrintOutProcessor implements Processor<String>{

    @Override
    public void process(List<String> list) {

        System.out.println("start flush");

        list.forEach(System.out::println);

        System.out.println("end flush");
    }
}
