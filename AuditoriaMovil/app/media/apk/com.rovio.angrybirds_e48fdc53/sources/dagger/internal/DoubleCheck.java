package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class DoubleCheck<T> implements Lazy<T>, Provider<T> {
    static final /* synthetic */ boolean a;
    private static final Object b;
    private volatile Provider<T> c;
    private volatile Object d = b;

    static {
        a = !DoubleCheck.class.desiredAssertionStatus();
        b = new Object();
    }

    private DoubleCheck(Provider<T> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // dagger.Lazy, javax.inject.Provider
    public T get() {
        T t = (T) this.d;
        if (t == b) {
            synchronized (this) {
                t = this.d;
                if (t == b) {
                    t = this.c.get();
                    Object obj = this.d;
                    if (obj != b && obj != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + t);
                    }
                    this.d = t;
                    this.c = null;
                }
            }
        }
        return t;
    }

    public static <T> Provider<T> provider(Provider<T> provider) {
        Preconditions.checkNotNull(provider);
        return provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
    }

    public static <T> Lazy<T> lazy(Provider<T> provider) {
        return provider instanceof Lazy ? (Lazy) provider : new DoubleCheck((Provider) Preconditions.checkNotNull(provider));
    }
}
