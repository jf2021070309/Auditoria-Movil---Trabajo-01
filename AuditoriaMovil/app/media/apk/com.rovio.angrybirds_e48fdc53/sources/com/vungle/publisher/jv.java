package com.vungle.publisher;

import com.vungle.publisher.jt;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class jv implements Factory<jt.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<jt.a> b;

    static {
        a = !jv.class.desiredAssertionStatus();
    }

    public jv(MembersInjector<jt.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public jt.a get() {
        return (jt.a) MembersInjectors.injectMembers(this.b, new jt.a());
    }

    public static Factory<jt.a> a(MembersInjector<jt.a> membersInjector) {
        return new jv(membersInjector);
    }
}
