package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class mw implements Factory<mv> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<mv> b;

    static {
        a = !mw.class.desiredAssertionStatus();
    }

    public mw(MembersInjector<mv> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public mv get() {
        return (mv) MembersInjectors.injectMembers(this.b, new mv());
    }

    public static Factory<mv> a(MembersInjector<mv> membersInjector) {
        return new mw(membersInjector);
    }
}
