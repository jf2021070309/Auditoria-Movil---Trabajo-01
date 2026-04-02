package com.vungle.publisher;

import com.vungle.publisher.hs;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hu implements Factory<hs.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hs.a> b;

    static {
        a = !hu.class.desiredAssertionStatus();
    }

    public hu(MembersInjector<hs.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hs.a get() {
        return (hs.a) MembersInjectors.injectMembers(this.b, new hs.a());
    }

    public static Factory<hs.a> a(MembersInjector<hs.a> membersInjector) {
        return new hu(membersInjector);
    }
}
