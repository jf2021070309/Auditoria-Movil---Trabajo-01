package com.google.android.datatransport.runtime.dagger.internal;

import com.amazon.aps.iva.jb0.a;
import com.google.android.datatransport.runtime.dagger.Lazy;
/* loaded from: classes2.dex */
public final class DoubleCheck<T> implements a<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a<T> provider;

    private DoubleCheck(a<T> aVar) {
        this.provider = aVar;
    }

    public static <P extends a<T>, T> Lazy<T> lazy(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((a) Preconditions.checkNotNull(p));
    }

    public static <P extends a<T>, T> a<T> provider(P p) {
        Preconditions.checkNotNull(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        boolean z;
        if (obj != UNINITIALIZED && !(obj instanceof MemoizedSentinel)) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // com.amazon.aps.iva.jb0.a
    public T get() {
        T t = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                t = this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            }
        }
        return t;
    }
}
