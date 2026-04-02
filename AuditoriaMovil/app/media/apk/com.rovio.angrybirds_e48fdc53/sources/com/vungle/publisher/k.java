package com.vungle.publisher;

import com.vungle.publisher.c;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class k implements Factory<c.b> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<c.b> b;

    static {
        a = !k.class.desiredAssertionStatus();
    }

    public k(MembersInjector<c.b> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public c.b get() {
        return (c.b) MembersInjectors.injectMembers(this.b, new c.b());
    }

    public static Factory<c.b> a(MembersInjector<c.b> membersInjector) {
        return new k(membersInjector);
    }
}
