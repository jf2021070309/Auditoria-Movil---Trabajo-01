package i.a.j2;

import e.j.d.w;
import h.m.f;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class c<T> extends i.a.c<T> {

    /* renamed from: c  reason: collision with root package name */
    public final f.a.b<T> f9090c;

    public c(f fVar, f.a.b<T> bVar) {
        super(fVar, false, true);
        this.f9090c = bVar;
    }

    @Override // i.a.c
    public void e0(Throwable th, boolean z) {
        try {
            if (((f.a.h.c.a.a) this.f9090c).a(th)) {
                return;
            }
        } catch (Throwable th2) {
            w.f(th, th2);
        }
        f fVar = this.f8970b;
        if (th instanceof CancellationException) {
            return;
        }
        try {
            w.e0(th);
        } catch (Throwable th3) {
            w.f(th, th3);
            w.O(fVar, th);
        }
    }

    @Override // i.a.c
    public void f0(T t) {
        f.a.e.b andSet;
        try {
            f.a.h.c.a.a aVar = (f.a.h.c.a.a) this.f9090c;
            f.a.e.b bVar = aVar.get();
            f.a.h.a.b bVar2 = f.a.h.a.b.DISPOSED;
            if (bVar == bVar2 || (andSet = aVar.getAndSet(bVar2)) == bVar2) {
                return;
            }
            if (t == null) {
                aVar.a.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                aVar.a.onSuccess(t);
            }
            if (andSet != null) {
                andSet.dispose();
            }
        } catch (Throwable th) {
            f fVar = this.f8970b;
            if (th instanceof CancellationException) {
                return;
            }
            try {
                w.e0(th);
            } catch (Throwable th2) {
                w.f(th, th2);
                w.O(fVar, th);
            }
        }
    }
}
