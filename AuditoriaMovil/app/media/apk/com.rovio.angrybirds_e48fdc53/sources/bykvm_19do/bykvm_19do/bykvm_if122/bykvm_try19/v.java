package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class v {
    private static Map<Integer, Integer> a = new ConcurrentHashMap();

    public static Integer a(int i) {
        Integer num = a.get(Integer.valueOf(i));
        if (num == null) {
            Integer valueOf = Integer.valueOf(i);
            a.put(Integer.valueOf(i), valueOf);
            return valueOf;
        }
        return num;
    }
}
