package com.vungle.publisher;

import com.vungle.publisher.gk;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hh implements Factory<gk.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gk.a> b;

    static {
        a = !hh.class.desiredAssertionStatus();
    }

    public hh(MembersInjector<gk.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gk.a get() {
        return (gk.a) MembersInjectors.injectMembers(this.b, new gk.a());
    }

    public static Factory<gk.a> a(MembersInjector<gk.a> membersInjector) {
        return new hh(membersInjector);
    }
}
