package com.google.firebase.components;

import com.google.firebase.inject.Provider;
/* loaded from: classes2.dex */
final class i<T> implements Provider<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile Provider<T> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ComponentFactory<T> componentFactory, ComponentContainer componentContainer) {
        this.c = j.a(componentFactory, componentContainer);
    }

    @Override // com.google.firebase.inject.Provider
    public final T get() {
        T t = (T) this.b;
        if (t == a) {
            synchronized (this) {
                t = this.b;
                if (t == a) {
                    t = this.c.get();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
