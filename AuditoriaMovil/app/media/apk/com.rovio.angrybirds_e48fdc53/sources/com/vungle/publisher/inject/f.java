package com.vungle.publisher.inject;

import com.vungle.publisher.env.AndroidDevice;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class f implements Factory<com.vungle.publisher.env.i> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<AndroidDevice> c;

    static {
        a = !f.class.desiredAssertionStatus();
    }

    public f(a aVar, Provider<AndroidDevice> provider) {
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
    public com.vungle.publisher.env.i get() {
        return (com.vungle.publisher.env.i) Preconditions.checkNotNull(this.b.a(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<com.vungle.publisher.env.i> a(a aVar, Provider<AndroidDevice> provider) {
        return new f(aVar, provider);
    }
}
