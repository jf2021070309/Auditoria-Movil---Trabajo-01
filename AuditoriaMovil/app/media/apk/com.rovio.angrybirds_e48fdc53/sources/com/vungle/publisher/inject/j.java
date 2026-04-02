package com.vungle.publisher.inject;

import com.vungle.publisher.sv;
import com.vungle.publisher.sz;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class j implements Factory<sz> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<sv> c;

    static {
        a = !j.class.desiredAssertionStatus();
    }

    public j(a aVar, Provider<sv> provider) {
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
    public sz get() {
        return (sz) Preconditions.checkNotNull(this.b.a(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<sz> a(a aVar, Provider<sv> provider) {
        return new j(aVar, provider);
    }
}
