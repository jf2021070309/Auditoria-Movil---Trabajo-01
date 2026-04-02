package d.a.a.a.c;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends LinkedHashMap<String, Integer> {
    public final int a;

    public a(int i2) {
        super((int) (i2 * 1.3333334f), 0.75f, true);
        if (i2 < 1) {
            throw new IllegalArgumentException("Cache size cannot be smaller than 1");
        }
        this.a = i2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        return size() > this.a;
    }
}
