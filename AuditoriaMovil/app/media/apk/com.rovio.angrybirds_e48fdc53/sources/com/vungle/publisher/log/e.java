package com.vungle.publisher.log;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class e implements Factory<d> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<d> b;

    static {
        a = !e.class.desiredAssertionStatus();
    }

    public e(MembersInjector<d> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public d get() {
        return (d) MembersInjectors.injectMembers(this.b, new d());
    }

    public static Factory<d> a(MembersInjector<d> membersInjector) {
        return new e(membersInjector);
    }
}
