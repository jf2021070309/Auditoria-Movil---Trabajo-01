package com.vungle.publisher;

import com.vungle.publisher.ns;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class nw implements Factory<ns.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ns.a> b;

    static {
        a = !nw.class.desiredAssertionStatus();
    }

    public nw(MembersInjector<ns.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ns.a get() {
        return (ns.a) MembersInjectors.injectMembers(this.b, new ns.a());
    }

    public static Factory<ns.a> a(MembersInjector<ns.a> membersInjector) {
        return new nw(membersInjector);
    }
}
