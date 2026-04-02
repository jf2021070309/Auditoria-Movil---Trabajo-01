package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class qb implements Factory<py> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<py> b;

    static {
        a = !qb.class.desiredAssertionStatus();
    }

    public qb(MembersInjector<py> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public py get() {
        return (py) MembersInjectors.injectMembers(this.b, new py());
    }

    public static Factory<py> a(MembersInjector<py> membersInjector) {
        return new qb(membersInjector);
    }
}
