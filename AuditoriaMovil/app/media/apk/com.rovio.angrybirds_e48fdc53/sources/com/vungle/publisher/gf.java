package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class gf implements Factory<ge> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ge> b;

    static {
        a = !gf.class.desiredAssertionStatus();
    }

    public gf(MembersInjector<ge> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ge get() {
        return (ge) MembersInjectors.injectMembers(this.b, new ge());
    }

    public static Factory<ge> a(MembersInjector<ge> membersInjector) {
        return new gf(membersInjector);
    }
}
