package com.vungle.publisher.inject;

import android.content.Context;
import android.telephony.TelephonyManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class m implements Factory<TelephonyManager> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;

    static {
        a = !m.class.desiredAssertionStatus();
    }

    public m(a aVar, Provider<Context> provider) {
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
    public TelephonyManager get() {
        return (TelephonyManager) Preconditions.checkNotNull(this.b.f(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<TelephonyManager> a(a aVar, Provider<Context> provider) {
        return new m(aVar, provider);
    }
}
