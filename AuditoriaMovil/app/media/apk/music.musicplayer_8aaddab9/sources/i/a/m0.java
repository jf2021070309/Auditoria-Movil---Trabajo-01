package i.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class m0<T> extends i.a.i2.o<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9145d = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public m0(h.m.f fVar, h.m.d<? super T> dVar) {
        super(fVar, dVar);
        this._decision = 0;
    }

    @Override // i.a.i2.o, i.a.l1
    public void c(Object obj) {
        c0(obj);
    }

    @Override // i.a.i2.o, i.a.c
    public void c0(Object obj) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f9145d.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (z) {
            return;
        }
        i.a.i2.f.b(e.j.d.w.P(this.f9079c), e.j.d.w.i0(obj, this.f9079c), null, 2);
    }

    public final Object g0() {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f9145d.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return h.m.h.a.COROUTINE_SUSPENDED;
        }
        Object a = m1.a(A());
        if (a instanceof w) {
            throw ((w) a).f9177b;
        }
        return a;
    }
}
