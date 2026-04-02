package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class pu implements Factory<pj> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<pj> b;

    static {
        a = !pu.class.desiredAssertionStatus();
    }

    public pu(MembersInjector<pj> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public pj get() {
        return (pj) MembersInjectors.injectMembers(this.b, new pj());
    }

    public static Factory<pj> a(MembersInjector<pj> membersInjector) {
        return new pu(membersInjector);
    }
}
