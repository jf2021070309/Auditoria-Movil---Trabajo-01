package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class sw implements Factory<sv> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<sv> b;

    static {
        a = !sw.class.desiredAssertionStatus();
    }

    public sw(MembersInjector<sv> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public sv get() {
        return (sv) MembersInjectors.injectMembers(this.b, new sv());
    }

    public static Factory<sv> a(MembersInjector<sv> membersInjector) {
        return new sw(membersInjector);
    }
}
