package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SingleCheck<T> implements Lazy<T>, Provider<T> {
    static final /* synthetic */ boolean a;
    private static final Object b;
    private volatile Provider<T> c;
    private volatile Object d = b;

    static {
        a = !SingleCheck.class.desiredAssertionStatus();
        b = new Object();
    }

    private SingleCheck(Provider<T> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // dagger.Lazy, javax.inject.Provider
    public T get() {
        Provider<T> provider = this.c;
        if (this.d == b) {
            this.d = provider.get();
            this.c = null;
        }
        return (T) this.d;
    }

    public static <T> Provider<T> provider(Provider<T> provider) {
        return ((provider instanceof SingleCheck) || (provider instanceof DoubleCheck)) ? provider : new SingleCheck((Provider) Preconditions.checkNotNull(provider));
    }
}
