package daleyzou.thread.mergerequest;

import java.util.List;

/**
 * Processor
 * @description TODO
 * @author daleyzou
 * @date 2019年12月06日 17:26
 * @version 3.0.1
 */
public interface Processor<T> {
    void process(List<T> list);
}
