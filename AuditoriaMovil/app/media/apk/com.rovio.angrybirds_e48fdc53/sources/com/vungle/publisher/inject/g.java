package com.vungle.publisher.inject;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class g implements Factory<SharedPreferences> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;

    static {
        a = !g.class.desiredAssertionStatus();
    }

    public g(a aVar, Provider<Context> provider) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public SharedPreferences get() {
        return (SharedPreferences) Preconditions.checkNotNull(this.b.e(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<SharedPreferences> a(a aVar, Provider<Context> provider) {
        return new g(aVar, provider);
    }
}
