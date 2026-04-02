package com.vungle.publisher;

import com.vungle.publisher.ek;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ga implements Factory<ek.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ek.a> b;

    static {
        a = !ga.class.desiredAssertionStatus();
    }

    public ga(MembersInjector<ek.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ek.a get() {
        return (ek.a) MembersInjectors.injectMembers(this.b, new ek.a());
    }

    public static Factory<ek.a> a(MembersInjector<ek.a> membersInjector) {
        return new ga(membersInjector);
    }
}
