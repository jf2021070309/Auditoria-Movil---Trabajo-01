package dagger.internal;

import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private Provider<T> a;

    @Override // javax.inject.Provider
    public T get() {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        return this.a.get();
    }

    public void setDelegatedProvider(Provider<T> provider) {
        if (provider == null) {
            throw new IllegalArgumentException();
        }
        if (this.a != null) {
            throw new IllegalStateException();
        }
        this.a = provider;
    }
}
