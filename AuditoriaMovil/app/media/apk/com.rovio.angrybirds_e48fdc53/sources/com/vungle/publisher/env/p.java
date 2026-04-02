package com.vungle.publisher.env;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class p implements Factory<o> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<o> b;

    static {
        a = !p.class.desiredAssertionStatus();
    }

    public p(MembersInjector<o> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public o get() {
        return (o) MembersInjectors.injectMembers(this.b, new o());
    }

    public static Factory<o> a(MembersInjector<o> membersInjector) {
        return new p(membersInjector);
    }
}
