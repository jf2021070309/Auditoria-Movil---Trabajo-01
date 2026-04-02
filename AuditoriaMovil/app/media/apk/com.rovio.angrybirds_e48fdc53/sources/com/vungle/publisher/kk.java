package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class kk implements Factory<kj> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<kj> b;

    static {
        a = !kk.class.desiredAssertionStatus();
    }

    public kk(MembersInjector<kj> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public kj get() {
        return (kj) MembersInjectors.injectMembers(this.b, new kj());
    }

    public static Factory<kj> a(MembersInjector<kj> membersInjector) {
        return new kk(membersInjector);
    }
}
