package i.a.i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class j<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public j(boolean z) {
        this._cur = new k(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            k kVar = (k) this._cur;
            int a2 = kVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, kVar, kVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            k kVar = (k) this._cur;
            if (kVar.b()) {
                return;
            }
            a.compareAndSet(this, kVar, kVar.e());
        }
    }

    public final int c() {
        return ((k) this._cur).c();
    }

    public final E d() {
        while (true) {
            k kVar = (k) this._cur;
            E e2 = (E) kVar.f();
            if (e2 != k.f9072d) {
                return e2;
            }
            a.compareAndSet(this, kVar, kVar.e());
        }
    }
}
