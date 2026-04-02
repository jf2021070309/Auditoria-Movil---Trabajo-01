package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: classes4.dex */
public final class DaggerCollections {
    private DaggerCollections() {
    }

    public static <T> List<T> presizedList(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    public static boolean hasDuplicates(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> HashSet<T> a(int i) {
        return new HashSet<>(c(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> LinkedHashMap<K, V> b(int i) {
        return new LinkedHashMap<>(c(i));
    }

    private static int c(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
