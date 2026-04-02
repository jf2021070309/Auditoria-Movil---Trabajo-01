package com.vungle.publisher;

import com.vungle.publisher.ks;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ku implements Factory<ks.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ks.a> b;

    static {
        a = !ku.class.desiredAssertionStatus();
    }

    public ku(MembersInjector<ks.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ks.a get() {
        return (ks.a) MembersInjectors.injectMembers(this.b, new ks.a());
    }

    public static Factory<ks.a> a(MembersInjector<ks.a> membersInjector) {
        return new ku(membersInjector);
    }
}
