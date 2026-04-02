package com.vungle.publisher.inject;

import com.vungle.publisher.env.AndroidDevice;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class u implements Factory<AndroidDevice.DeviceIdStrategy> {
    static final /* synthetic */ boolean a;
    private final t b;
    private final Provider<com.vungle.publisher.env.a> c;

    static {
        a = !u.class.desiredAssertionStatus();
    }

    public u(t tVar, Provider<com.vungle.publisher.env.a> provider) {
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
    public AndroidDevice.DeviceIdStrategy get() {
        return (AndroidDevice.DeviceIdStrategy) Preconditions.checkNotNull(this.b.a(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<AndroidDevice.DeviceIdStrategy> a(t tVar, Provider<com.vungle.publisher.env.a> provider) {
        return new u(tVar, provider);
    }
}
