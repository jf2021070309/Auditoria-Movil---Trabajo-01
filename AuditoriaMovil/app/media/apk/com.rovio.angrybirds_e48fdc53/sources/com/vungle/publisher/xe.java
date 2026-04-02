package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class xe implements Factory<xd> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<xd> b;

    static {
        a = !xe.class.desiredAssertionStatus();
    }

    public xe(MembersInjector<xd> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public xd get() {
        return (xd) MembersInjectors.injectMembers(this.b, new xd());
    }

    public static Factory<xd> a(MembersInjector<xd> membersInjector) {
        return new xe(membersInjector);
    }
}
