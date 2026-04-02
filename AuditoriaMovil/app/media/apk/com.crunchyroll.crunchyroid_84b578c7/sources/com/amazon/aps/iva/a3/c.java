package com.amazon.aps.iva.a3;

import com.amazon.aps.iva.o3.e;
import com.amazon.aps.iva.x.h;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class c<T> {
    public final e a = new e(10);
    public final h<T, ArrayList<T>> b = new h<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public final void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> orDefault = this.b.getOrDefault(t, null);
            if (orDefault != null) {
                int size = orDefault.size();
                for (int i = 0; i < size; i++) {
                    a(orDefault.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
