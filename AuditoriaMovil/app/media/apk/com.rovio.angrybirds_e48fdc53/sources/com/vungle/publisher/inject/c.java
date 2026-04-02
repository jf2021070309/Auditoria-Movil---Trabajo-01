package com.vungle.publisher.inject;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes4.dex */
public final class c implements Factory<Context> {
    static final /* synthetic */ boolean a;
    private final a b;

    static {
        a = !c.class.desiredAssertionStatus();
    }

    public c(a aVar) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public Context get() {
        return (Context) Preconditions.checkNotNull(this.b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<Context> a(a aVar) {
        return new c(aVar);
    }
}
