package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class dg implements Factory<df> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<df> b;

    static {
        a = !dg.class.desiredAssertionStatus();
    }

    public dg(MembersInjector<df> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public df get() {
        return (df) MembersInjectors.injectMembers(this.b, new df());
    }

    public static Factory<df> a(MembersInjector<df> membersInjector) {
        return new dg(membersInjector);
    }
}
