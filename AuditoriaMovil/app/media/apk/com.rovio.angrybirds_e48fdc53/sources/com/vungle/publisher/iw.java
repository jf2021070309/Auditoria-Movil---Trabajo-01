package com.vungle.publisher;

import com.vungle.publisher.hq;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class iw implements Factory<hq.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hq.a> b;

    static {
        a = !iw.class.desiredAssertionStatus();
    }

    public iw(MembersInjector<hq.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hq.a get() {
        return (hq.a) MembersInjectors.injectMembers(this.b, new hq.a());
    }

    public static Factory<hq.a> a(MembersInjector<hq.a> membersInjector) {
        return new iw(membersInjector);
    }
}
