package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class md implements Factory<mc> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<mc> b;

    static {
        a = !md.class.desiredAssertionStatus();
    }

    public md(MembersInjector<mc> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public mc get() {
        return (mc) MembersInjectors.injectMembers(this.b, new mc());
    }

    public static Factory<mc> a(MembersInjector<mc> membersInjector) {
        return new md(membersInjector);
    }
}
