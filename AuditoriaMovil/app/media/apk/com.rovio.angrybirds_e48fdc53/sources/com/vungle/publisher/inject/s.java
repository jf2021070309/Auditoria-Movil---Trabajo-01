package com.vungle.publisher.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes4.dex */
public final class s implements Factory<String> {
    static final /* synthetic */ boolean a;
    private final EndpointModule b;

    static {
        a = !s.class.desiredAssertionStatus();
    }

    public s(EndpointModule endpointModule) {
        if (!a && endpointModule == null) {
            throw new AssertionError();
        }
        this.b = endpointModule;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public String get() {
        return (String) Preconditions.checkNotNull(this.b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<String> a(EndpointModule endpointModule) {
        return new s(endpointModule);
    }
}
