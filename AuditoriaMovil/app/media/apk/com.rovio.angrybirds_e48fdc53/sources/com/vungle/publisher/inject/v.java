package com.vungle.publisher.inject;

import android.content.Context;
import android.net.wifi.WifiManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class v implements Factory<WifiManager> {
    static final /* synthetic */ boolean a;
    private final t b;
    private final Provider<Context> c;

    static {
        a = !v.class.desiredAssertionStatus();
    }

    public v(t tVar, Provider<Context> provider) {
        if (!a && tVar == null) {
            throw new AssertionError();
        }
        this.b = tVar;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public WifiManager get() {
        return (WifiManager) Preconditions.checkNotNull(this.b.a(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<WifiManager> a(t tVar, Provider<Context> provider) {
        return new v(tVar, provider);
    }
}
