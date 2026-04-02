package com.vungle.publisher.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes4.dex */
public final class q implements Factory<String> {
    static final /* synthetic */ boolean a;
    private final a b;

    static {
        a = !q.class.desiredAssertionStatus();
    }

    public q(a aVar) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public String get() {
        return (String) Preconditions.checkNotNull(this.b.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<String> a(a aVar) {
        return new q(aVar);
    }
}
