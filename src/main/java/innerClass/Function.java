package innerClass;

import java.io.Serializable;

public interface Function<T1,R> extends Serializable {
    R call(T1 v1);
}
