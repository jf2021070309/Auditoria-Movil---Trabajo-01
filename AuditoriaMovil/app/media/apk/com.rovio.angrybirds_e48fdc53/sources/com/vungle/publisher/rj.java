package com.vungle.publisher;

import com.vungle.publisher.rg;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class rj implements Factory<rg.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<rg.a> b;

    static {
        a = !rj.class.desiredAssertionStatus();
    }

    public rj(MembersInjector<rg.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rg.a get() {
        return (rg.a) MembersInjectors.injectMembers(this.b, new rg.a());
    }

    public static Factory<rg.a> a(MembersInjector<rg.a> membersInjector) {
        return new rj(membersInjector);
    }
}
