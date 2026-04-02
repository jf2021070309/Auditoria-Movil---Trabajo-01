package com.vungle.publisher;

import com.vungle.publisher.th;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ti implements Factory<th.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<th.a> b;

    static {
        a = !ti.class.desiredAssertionStatus();
    }

    public ti(MembersInjector<th.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public th.a get() {
        return (th.a) MembersInjectors.injectMembers(this.b, new th.a());
    }

    public static Factory<th.a> a(MembersInjector<th.a> membersInjector) {
        return new ti(membersInjector);
    }
}
