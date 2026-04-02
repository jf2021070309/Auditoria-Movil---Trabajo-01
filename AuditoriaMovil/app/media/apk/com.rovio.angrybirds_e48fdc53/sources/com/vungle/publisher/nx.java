package com.vungle.publisher;

import com.vungle.publisher.ns;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class nx implements Factory<ns.a.C0333a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ns.a.C0333a> b;

    static {
        a = !nx.class.desiredAssertionStatus();
    }

    public nx(MembersInjector<ns.a.C0333a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ns.a.C0333a get() {
        return (ns.a.C0333a) MembersInjectors.injectMembers(this.b, new ns.a.C0333a());
    }

    public static Factory<ns.a.C0333a> a(MembersInjector<ns.a.C0333a> membersInjector) {
        return new nx(membersInjector);
    }
}
