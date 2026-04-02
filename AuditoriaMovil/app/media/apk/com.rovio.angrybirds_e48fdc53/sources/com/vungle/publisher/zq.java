package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class zq implements Factory<zo> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<zo> b;

    static {
        a = !zq.class.desiredAssertionStatus();
    }

    public zq(MembersInjector<zo> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public zo get() {
        return (zo) MembersInjectors.injectMembers(this.b, new zo());
    }

    public static Factory<zo> a(MembersInjector<zo> membersInjector) {
        return new zq(membersInjector);
    }
}
