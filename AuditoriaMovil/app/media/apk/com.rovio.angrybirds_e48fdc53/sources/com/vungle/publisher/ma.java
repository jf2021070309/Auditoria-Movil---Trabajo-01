package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ma implements Factory<lz> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<lz> b;

    static {
        a = !ma.class.desiredAssertionStatus();
    }

    public ma(MembersInjector<lz> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public lz get() {
        return (lz) MembersInjectors.injectMembers(this.b, new lz());
    }

    public static Factory<lz> a(MembersInjector<lz> membersInjector) {
        return new ma(membersInjector);
    }
}
