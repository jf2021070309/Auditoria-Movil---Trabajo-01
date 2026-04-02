package f.a.h.a;

import e.j.d.w;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public enum b implements f.a.e.b {
    DISPOSED;

    public static boolean dispose(AtomicReference<f.a.e.b> atomicReference) {
        f.a.e.b andSet;
        f.a.e.b bVar = atomicReference.get();
        b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }

    public static boolean isDisposed(f.a.e.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<f.a.e.b> atomicReference, f.a.e.b bVar) {
        f.a.e.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static void reportDisposableSet() {
        w.e0(new f.a.f.b("Disposable already set!"));
    }

    public static boolean set(AtomicReference<f.a.e.b> atomicReference, f.a.e.b bVar) {
        f.a.e.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<f.a.e.b> atomicReference, f.a.e.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
            return false;
        }
        return false;
    }

    public static boolean trySet(AtomicReference<f.a.e.b> atomicReference, f.a.e.b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            bVar.dispose();
            return false;
        }
        return false;
    }

    public static boolean validate(f.a.e.b bVar, f.a.e.b bVar2) {
        if (bVar2 == null) {
            w.e0(new NullPointerException("next is null"));
            return false;
        } else if (bVar != null) {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        } else {
            return true;
        }
    }

    @Override // f.a.e.b
    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
