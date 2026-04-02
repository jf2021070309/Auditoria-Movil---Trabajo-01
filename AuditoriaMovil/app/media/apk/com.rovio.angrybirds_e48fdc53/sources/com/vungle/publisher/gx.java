package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class gx implements Factory<gw> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gw> b;

    static {
        a = !gx.class.desiredAssertionStatus();
    }

    public gx(MembersInjector<gw> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gw get() {
        return (gw) MembersInjectors.injectMembers(this.b, new gw());
    }

    public static Factory<gw> a(MembersInjector<gw> membersInjector) {
        return new gx(membersInjector);
    }
}
