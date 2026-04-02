package com.vungle.publisher.inject;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class e implements Factory<ConnectivityManager> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;

    static {
        a = !e.class.desiredAssertionStatus();
    }

    public e(a aVar, Provider<Context> provider) {
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
    public ConnectivityManager get() {
        return (ConnectivityManager) Preconditions.checkNotNull(this.b.d(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<ConnectivityManager> a(a aVar, Provider<Context> provider) {
        return new e(aVar, provider);
    }
}
