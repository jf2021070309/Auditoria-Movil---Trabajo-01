package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ii implements Factory<ic> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ic> b;

    static {
        a = !ii.class.desiredAssertionStatus();
    }

    public ii(MembersInjector<ic> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ic get() {
        return (ic) MembersInjectors.injectMembers(this.b, new ic());
    }

    public static Factory<ic> a(MembersInjector<ic> membersInjector) {
        return new ii(membersInjector);
    }
}
