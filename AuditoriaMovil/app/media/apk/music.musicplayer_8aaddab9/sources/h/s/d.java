package h.s;

import h.o.b.l;
import h.o.c.j;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class d<T, R> implements b<R> {
    public final b<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f8957b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R> {
        public final Iterator<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d<T, R> f8958b;

        public a(d<T, R> dVar) {
            this.f8958b = dVar;
            this.a = dVar.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return this.f8958b.f8957b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        j.e(bVar, "sequence");
        j.e(lVar, "transformer");
        this.a = bVar;
        this.f8957b = lVar;
    }

    @Override // h.s.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
