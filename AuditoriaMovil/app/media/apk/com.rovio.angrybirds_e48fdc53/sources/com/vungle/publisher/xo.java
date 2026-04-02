package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class xo implements Factory<xg> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<xg> b;

    static {
        a = !xo.class.desiredAssertionStatus();
    }

    public xo(MembersInjector<xg> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public xg get() {
        return (xg) MembersInjectors.injectMembers(this.b, new xg());
    }

    public static Factory<xg> a(MembersInjector<xg> membersInjector) {
        return new xo(membersInjector);
    }
}
