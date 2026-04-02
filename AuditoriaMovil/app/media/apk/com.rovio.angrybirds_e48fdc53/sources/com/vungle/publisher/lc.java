package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class lc implements Factory<lb> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<lb> b;

    static {
        a = !lc.class.desiredAssertionStatus();
    }

    public lc(MembersInjector<lb> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public lb get() {
        return (lb) MembersInjectors.injectMembers(this.b, new lb());
    }

    public static Factory<lb> a(MembersInjector<lb> membersInjector) {
        return new lc(membersInjector);
    }
}
