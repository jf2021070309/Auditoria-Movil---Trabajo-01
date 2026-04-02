package e.d.b.e.a.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class v extends WeakReference<Throwable> {
    public final int a;

    public v(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == v.class) {
            if (this == obj) {
                return true;
            }
            v vVar = (v) obj;
            if (this.a == vVar.a && get() == vVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
