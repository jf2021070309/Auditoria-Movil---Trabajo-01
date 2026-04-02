package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class xw implements Factory<xq> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<xq> b;

    static {
        a = !xw.class.desiredAssertionStatus();
    }

    public xw(MembersInjector<xq> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public xq get() {
        return (xq) MembersInjectors.injectMembers(this.b, new xq());
    }

    public static Factory<xq> a(MembersInjector<xq> membersInjector) {
        return new xw(membersInjector);
    }
}
