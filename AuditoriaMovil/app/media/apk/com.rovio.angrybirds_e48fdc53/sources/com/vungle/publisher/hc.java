package com.vungle.publisher;

import com.vungle.publisher.gv;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hc implements Factory<gv.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gv.a> b;

    static {
        a = !hc.class.desiredAssertionStatus();
    }

    public hc(MembersInjector<gv.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gv.a get() {
        return (gv.a) MembersInjectors.injectMembers(this.b, new gv.a());
    }

    public static Factory<gv.a> a(MembersInjector<gv.a> membersInjector) {
        return new hc(membersInjector);
    }
}
