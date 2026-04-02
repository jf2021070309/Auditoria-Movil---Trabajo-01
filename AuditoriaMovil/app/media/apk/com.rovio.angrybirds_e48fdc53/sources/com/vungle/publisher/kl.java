package com.vungle.publisher;

import com.vungle.publisher.kj;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class kl implements Factory<kj.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<kj.a> b;

    static {
        a = !kl.class.desiredAssertionStatus();
    }

    public kl(MembersInjector<kj.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public kj.a get() {
        return (kj.a) MembersInjectors.injectMembers(this.b, new kj.a());
    }

    public static Factory<kj.a> a(MembersInjector<kj.a> membersInjector) {
        return new kl(membersInjector);
    }
}
