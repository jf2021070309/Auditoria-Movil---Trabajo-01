package i.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class e1 extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8977e = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f  reason: collision with root package name */
    public final h.o.b.l<Throwable, h.k> f8978f;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(h.o.b.l<? super Throwable, h.k> lVar) {
        this.f8978f = lVar;
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ h.k invoke(Throwable th) {
        o(th);
        return h.k.a;
    }

    @Override // i.a.y
    public void o(Throwable th) {
        if (f8977e.compareAndSet(this, 0, 1)) {
            this.f8978f.invoke(th);
        }
    }
}
