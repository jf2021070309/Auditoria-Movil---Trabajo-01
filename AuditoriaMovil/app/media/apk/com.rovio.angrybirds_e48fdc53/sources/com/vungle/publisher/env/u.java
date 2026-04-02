package com.vungle.publisher.env;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class u implements Factory<r> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<r> b;

    static {
        a = !u.class.desiredAssertionStatus();
    }

    public u(MembersInjector<r> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public r get() {
        return (r) MembersInjectors.injectMembers(this.b, new r());
    }

    public static Factory<r> a(MembersInjector<r> membersInjector) {
        return new u(membersInjector);
    }
}
