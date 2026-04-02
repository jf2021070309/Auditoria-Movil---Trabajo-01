package com.vungle.publisher;

import com.vungle.publisher.kd;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class kf implements Factory<kd.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<kd.a> b;

    static {
        a = !kf.class.desiredAssertionStatus();
    }

    public kf(MembersInjector<kd.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public kd.a get() {
        return (kd.a) MembersInjectors.injectMembers(this.b, new kd.a());
    }

    public static Factory<kd.a> a(MembersInjector<kd.a> membersInjector) {
        return new kf(membersInjector);
    }
}
