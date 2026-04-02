package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ur implements Factory<uq> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<uq> b;

    static {
        a = !ur.class.desiredAssertionStatus();
    }

    public ur(MembersInjector<uq> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uq get() {
        return (uq) MembersInjectors.injectMembers(this.b, new uq());
    }

    public static Factory<uq> a(MembersInjector<uq> membersInjector) {
        return new ur(membersInjector);
    }
}
