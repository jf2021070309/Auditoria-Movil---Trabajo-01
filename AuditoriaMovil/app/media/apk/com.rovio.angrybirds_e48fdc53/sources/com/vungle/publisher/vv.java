package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class vv implements Factory<vu> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<vu> b;

    static {
        a = !vv.class.desiredAssertionStatus();
    }

    public vv(MembersInjector<vu> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public vu get() {
        return (vu) MembersInjectors.injectMembers(this.b, new vu());
    }

    public static Factory<vu> a(MembersInjector<vu> membersInjector) {
        return new vv(membersInjector);
    }
}
