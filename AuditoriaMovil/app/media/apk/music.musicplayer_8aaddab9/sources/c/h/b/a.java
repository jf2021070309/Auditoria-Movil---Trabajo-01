package c.h.b;

import c.f.h;
import c.i.j.c;
import c.i.j.d;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class a<T> {
    public final c<ArrayList<T>> a = new d(10);

    /* renamed from: b  reason: collision with root package name */
    public final h<T, ArrayList<T>> f1923b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f1924c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f1925d = new HashSet<>();

    public void a(T t) {
        if (this.f1923b.e(t) >= 0) {
            return;
        }
        this.f1923b.put(t, null);
    }

    public final void b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f1923b.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(orDefault.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
