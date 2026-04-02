package f.a.h.c.a;

import f.a.c;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class a<T> extends AtomicReference<f.a.e.b> implements f.a.b<T>, f.a.e.b {
    public final c<? super T> a;

    public a(c<? super T> cVar) {
        this.a = cVar;
    }

    public boolean a(Throwable th) {
        f.a.e.b andSet;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        f.a.e.b bVar = get();
        f.a.h.a.b bVar2 = f.a.h.a.b.DISPOSED;
        if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
            return false;
        }
        try {
            this.a.b(th);
        } finally {
            if (andSet != null) {
                andSet.dispose();
            }
        }
    }

    @Override // f.a.e.b
    public void dispose() {
        f.a.h.a.b.dispose(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
    }
}
