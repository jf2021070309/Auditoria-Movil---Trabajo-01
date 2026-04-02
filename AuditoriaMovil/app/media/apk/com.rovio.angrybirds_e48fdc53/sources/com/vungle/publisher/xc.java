package com.vungle.publisher;

import com.vungle.publisher.xb;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class xc implements Factory<xb.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<xb.a> b;

    static {
        a = !xc.class.desiredAssertionStatus();
    }

    public xc(MembersInjector<xb.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public xb.a get() {
        return (xb.a) MembersInjectors.injectMembers(this.b, new xb.a());
    }

    public static Factory<xb.a> a(MembersInjector<xb.a> membersInjector) {
        return new xc(membersInjector);
    }
}
