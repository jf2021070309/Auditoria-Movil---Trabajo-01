package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class es implements Factory<er> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<er> b;

    static {
        a = !es.class.desiredAssertionStatus();
    }

    public es(MembersInjector<er> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public er get() {
        return (er) MembersInjectors.injectMembers(this.b, new er());
    }

    public static Factory<er> a(MembersInjector<er> membersInjector) {
        return new es(membersInjector);
    }
}
