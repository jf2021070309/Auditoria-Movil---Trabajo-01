package com.vungle.publisher;

import com.vungle.publisher.pj;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class pv implements Factory<pj.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<pj.a> b;

    static {
        a = !pv.class.desiredAssertionStatus();
    }

    public pv(MembersInjector<pj.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public pj.a get() {
        return (pj.a) MembersInjectors.injectMembers(this.b, new pj.a());
    }

    public static Factory<pj.a> a(MembersInjector<pj.a> membersInjector) {
        return new pv(membersInjector);
    }
}
