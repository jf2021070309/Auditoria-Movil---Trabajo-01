package com.google.android.datatransport.runtime.dagger.internal;

import com.amazon.aps.iva.jb0.a;
/* loaded from: classes2.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private a<T> delegate;

    public static <T> void setDelegate(a<T> aVar, a<T> aVar2) {
        Preconditions.checkNotNull(aVar2);
        DelegateFactory delegateFactory = (DelegateFactory) aVar;
        if (delegateFactory.delegate == null) {
            delegateFactory.delegate = aVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public T get() {
        a<T> aVar = this.delegate;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }

    public a<T> getDelegate() {
        return (a) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(a<T> aVar) {
        setDelegate(this, aVar);
    }
}
