package f.a.h.b;

import e.j.d.w;
import f.a.c;
import f.a.e.b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class a<T> extends AtomicReference<b> implements c<T>, b {
    public final f.a.g.b<? super T> a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.g.b<? super Throwable> f8914b;

    public a(f.a.g.b<? super T> bVar, f.a.g.b<? super Throwable> bVar2) {
        this.a = bVar;
        this.f8914b = bVar2;
    }

    @Override // f.a.c
    public void a(b bVar) {
        f.a.h.a.b.setOnce(this, bVar);
    }

    @Override // f.a.c
    public void b(Throwable th) {
        lazySet(f.a.h.a.b.DISPOSED);
        try {
            this.f8914b.a(th);
        } catch (Throwable th2) {
            w.D0(th2);
            w.e0(new f.a.f.a(Arrays.asList(th, th2)));
        }
    }

    @Override // f.a.e.b
    public void dispose() {
        f.a.h.a.b.dispose(this);
    }

    @Override // f.a.c
    public void onSuccess(T t) {
        lazySet(f.a.h.a.b.DISPOSED);
        try {
            this.a.a(t);
        } catch (Throwable th) {
            w.D0(th);
            w.e0(th);
        }
    }
}
