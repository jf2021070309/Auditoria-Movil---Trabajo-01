package dagger.internal;
/* loaded from: classes4.dex */
public final class InstanceFactory<T> implements Factory<T> {
    private final T a;

    public static <T> Factory<T> create(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return new InstanceFactory(t);
    }

    private InstanceFactory(T t) {
        this.a = t;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.a;
    }
}
