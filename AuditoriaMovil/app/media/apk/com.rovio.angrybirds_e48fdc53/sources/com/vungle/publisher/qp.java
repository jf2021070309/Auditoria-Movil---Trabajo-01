package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class qp implements Factory<qo> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<qo> b;

    static {
        a = !qp.class.desiredAssertionStatus();
    }

    public qp(MembersInjector<qo> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public qo get() {
        return (qo) MembersInjectors.injectMembers(this.b, new qo());
    }

    public static Factory<qo> a(MembersInjector<qo> membersInjector) {
        return new qp(membersInjector);
    }
}
