package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class g implements Factory<c> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<c> b;

    static {
        a = !g.class.desiredAssertionStatus();
    }

    public g(MembersInjector<c> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public c get() {
        return (c) MembersInjectors.injectMembers(this.b, new c());
    }

    public static Factory<c> a(MembersInjector<c> membersInjector) {
        return new g(membersInjector);
    }
}
