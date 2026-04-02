package com.vungle.publisher;

import com.vungle.publisher.wd;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class we implements Factory<wd.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wd.a> b;

    static {
        a = !we.class.desiredAssertionStatus();
    }

    public we(MembersInjector<wd.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wd.a get() {
        return (wd.a) MembersInjectors.injectMembers(this.b, new wd.a());
    }

    public static Factory<wd.a> a(MembersInjector<wd.a> membersInjector) {
        return new we(membersInjector);
    }
}
