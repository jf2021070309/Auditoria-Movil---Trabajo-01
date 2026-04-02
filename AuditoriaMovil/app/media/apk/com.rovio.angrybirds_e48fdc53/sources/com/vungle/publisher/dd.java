package com.vungle.publisher;

import com.vungle.publisher.cn;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class dd implements Factory<cn.b> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<cn.b> b;

    static {
        a = !dd.class.desiredAssertionStatus();
    }

    public dd(MembersInjector<cn.b> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public cn.b get() {
        return (cn.b) MembersInjectors.injectMembers(this.b, new cn.b());
    }

    public static Factory<cn.b> a(MembersInjector<cn.b> membersInjector) {
        return new dd(membersInjector);
    }
}
