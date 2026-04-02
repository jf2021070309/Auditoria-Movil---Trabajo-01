package h.s;

import java.util.Iterator;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class c<T> implements Iterable<T> {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.a.iterator();
    }
}
