package com.google.android.datatransport.runtime.dagger.internal;

import com.amazon.aps.iva.jb0.a;
import com.google.android.datatransport.runtime.dagger.Lazy;
/* loaded from: classes2.dex */
public final class ProviderOfLazy<T> implements a<Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final a<T> provider;

    private ProviderOfLazy(a<T> aVar) {
        this.provider = aVar;
    }

    public static <T> a<Lazy<T>> create(a<T> aVar) {
        return new ProviderOfLazy((a) Preconditions.checkNotNull(aVar));
    }

    @Override // com.amazon.aps.iva.jb0.a
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
