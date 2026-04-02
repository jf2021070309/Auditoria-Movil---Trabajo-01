package com.vungle.publisher;

import com.vungle.publisher.mj;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class mn implements Factory<mj.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<mj.a> b;

    static {
        a = !mn.class.desiredAssertionStatus();
    }

    public mn(MembersInjector<mj.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public mj.a get() {
        return (mj.a) MembersInjectors.injectMembers(this.b, new mj.a());
    }

    public static Factory<mj.a> a(MembersInjector<mj.a> membersInjector) {
        return new mn(membersInjector);
    }
}
