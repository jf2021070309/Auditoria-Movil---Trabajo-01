package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class l0 {
    public static <T extends Comparable<? super T>> void a(List<T> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        try {
            Collections.sort(list);
        } catch (Throwable th) {
            List asList = Arrays.asList(list.toArray());
            Collections.sort(asList);
            list.clear();
            list.addAll(asList);
        }
    }

    public static <T> void a(List<T> list, Comparator<T> comparator) {
        if (list == null || list.size() <= 1) {
            return;
        }
        try {
            Collections.sort(list, comparator);
        } catch (Throwable th) {
            List asList = Arrays.asList(list.toArray());
            Collections.sort(asList, comparator);
            list.clear();
            list.addAll(asList);
        }
    }
}
