package com.vungle.publisher;

import com.vungle.publisher.wz;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class xa implements Factory<wz.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wz.a> b;

    static {
        a = !xa.class.desiredAssertionStatus();
    }

    public xa(MembersInjector<wz.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wz.a get() {
        return (wz.a) MembersInjectors.injectMembers(this.b, new wz.a());
    }

    public static Factory<wz.a> a(MembersInjector<wz.a> membersInjector) {
        return new xa(membersInjector);
    }
}
