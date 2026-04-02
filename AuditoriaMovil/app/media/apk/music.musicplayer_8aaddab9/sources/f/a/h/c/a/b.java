package f.a.h.c.a;

import f.a.c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class b<T> extends AtomicReference<f.a.e.b> implements c<T>, f.a.e.b, Runnable {
    public final c<? super T> a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.a f8915b;

    /* renamed from: c  reason: collision with root package name */
    public T f8916c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f8917d;

    public b(c<? super T> cVar, f.a.a aVar) {
        this.a = cVar;
        this.f8915b = aVar;
    }

    @Override // f.a.c
    public void a(f.a.e.b bVar) {
        if (f.a.h.a.b.setOnce(this, bVar)) {
            this.a.a(this);
        }
    }

    @Override // f.a.c
    public void b(Throwable th) {
        this.f8917d = th;
        f.a.a aVar = this.f8915b;
        Objects.requireNonNull(aVar);
        f.a.h.a.b.replace(this, aVar.a(this, 0L, TimeUnit.NANOSECONDS));
    }

    @Override // f.a.e.b
    public void dispose() {
        f.a.h.a.b.dispose(this);
    }

    @Override // f.a.c
    public void onSuccess(T t) {
        this.f8916c = t;
        f.a.a aVar = this.f8915b;
        Objects.requireNonNull(aVar);
        f.a.h.a.b.replace(this, aVar.a(this, 0L, TimeUnit.NANOSECONDS));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.f8917d;
        if (th != null) {
            this.a.b(th);
        } else {
            this.a.onSuccess((T) this.f8916c);
        }
    }
}
