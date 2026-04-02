package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class v implements Factory<u> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<u> b;

    static {
        a = !v.class.desiredAssertionStatus();
    }

    public v(MembersInjector<u> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public u get() {
        return (u) MembersInjectors.injectMembers(this.b, new u());
    }

    public static Factory<u> a(MembersInjector<u> membersInjector) {
        return new v(membersInjector);
    }
}
