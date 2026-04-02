package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hg implements Factory<gk> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gk> b;

    static {
        a = !hg.class.desiredAssertionStatus();
    }

    public hg(MembersInjector<gk> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gk get() {
        return (gk) MembersInjectors.injectMembers(this.b, new gk());
    }

    public static Factory<gk> a(MembersInjector<gk> membersInjector) {
        return new hg(membersInjector);
    }
}
