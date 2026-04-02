package e.d.b.b.j.f0;

import android.util.SparseArray;
import e.d.b.b.d;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a {
    public static SparseArray<d> a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f6249b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f6249b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f6249b.put(d.VERY_LOW, 1);
        f6249b.put(d.HIGHEST, 2);
        for (d dVar : f6249b.keySet()) {
            a.append(f6249b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f6249b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(e.a.d.a.a.e("Unknown Priority for value ", i2));
    }
}
