package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class yb implements Factory<xy> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<xy> b;

    static {
        a = !yb.class.desiredAssertionStatus();
    }

    public yb(MembersInjector<xy> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public xy get() {
        return (xy) MembersInjectors.injectMembers(this.b, new xy());
    }

    public static Factory<xy> a(MembersInjector<xy> membersInjector) {
        return new yb(membersInjector);
    }
}
