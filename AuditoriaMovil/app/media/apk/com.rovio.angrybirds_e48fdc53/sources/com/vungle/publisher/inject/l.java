package com.vungle.publisher.inject;

import android.content.Context;
import com.vungle.publisher.env.WrapperFramework;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class l implements Factory<com.vungle.publisher.env.n> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;
    private final Provider<WrapperFramework> d;

    static {
        a = !l.class.desiredAssertionStatus();
    }

    public l(a aVar, Provider<Context> provider, Provider<WrapperFramework> provider2) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.d = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public com.vungle.publisher.env.n get() {
        return (com.vungle.publisher.env.n) Preconditions.checkNotNull(this.b.a(this.c.get(), this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<com.vungle.publisher.env.n> a(a aVar, Provider<Context> provider, Provider<WrapperFramework> provider2) {
        return new l(aVar, provider, provider2);
    }
}
