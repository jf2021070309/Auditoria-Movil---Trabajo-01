package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class iv implements Factory<hq> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hq> b;

    static {
        a = !iv.class.desiredAssertionStatus();
    }

    public iv(MembersInjector<hq> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hq get() {
        return (hq) MembersInjectors.injectMembers(this.b, new hq());
    }

    public static Factory<hq> a(MembersInjector<hq> membersInjector) {
        return new iv(membersInjector);
    }
}
