package com.vungle.publisher.log;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class h implements Factory<g> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<g> b;

    static {
        a = !h.class.desiredAssertionStatus();
    }

    public h(MembersInjector<g> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public g get() {
        return (g) MembersInjectors.injectMembers(this.b, new g());
    }

    public static Factory<g> a(MembersInjector<g> membersInjector) {
        return new h(membersInjector);
    }
}
