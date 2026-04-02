package com.vungle.publisher.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes4.dex */
public final class n implements Factory<Class> {
    static final /* synthetic */ boolean a;
    private final a b;

    static {
        a = !n.class.desiredAssertionStatus();
    }

    public n(a aVar) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public Class get() {
        return (Class) Preconditions.checkNotNull(this.b.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<Class> a(a aVar) {
        return new n(aVar);
    }
}
