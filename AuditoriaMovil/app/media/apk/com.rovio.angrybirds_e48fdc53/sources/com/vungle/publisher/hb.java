package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hb implements Factory<gv> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gv> b;

    static {
        a = !hb.class.desiredAssertionStatus();
    }

    public hb(MembersInjector<gv> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gv get() {
        return (gv) MembersInjectors.injectMembers(this.b, new gv());
    }

    public static Factory<gv> a(MembersInjector<gv> membersInjector) {
        return new hb(membersInjector);
    }
}
