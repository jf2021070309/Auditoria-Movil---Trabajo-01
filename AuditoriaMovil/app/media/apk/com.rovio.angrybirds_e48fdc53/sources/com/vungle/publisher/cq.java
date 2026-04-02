package com.vungle.publisher;

import com.vungle.publisher.co;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class cq implements Factory<co.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<co.a> b;

    static {
        a = !cq.class.desiredAssertionStatus();
    }

    public cq(MembersInjector<co.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public co.a get() {
        return (co.a) MembersInjectors.injectMembers(this.b, new co.a());
    }

    public static Factory<co.a> a(MembersInjector<co.a> membersInjector) {
        return new cq(membersInjector);
    }
}
