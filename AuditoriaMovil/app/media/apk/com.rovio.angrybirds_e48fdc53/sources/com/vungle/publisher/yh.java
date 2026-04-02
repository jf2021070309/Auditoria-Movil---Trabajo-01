package com.vungle.publisher;

import com.vungle.publisher.yg;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class yh implements Factory<yg.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<yg.a> b;

    static {
        a = !yh.class.desiredAssertionStatus();
    }

    public yh(MembersInjector<yg.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public yg.a get() {
        return (yg.a) MembersInjectors.injectMembers(this.b, new yg.a());
    }

    public static Factory<yg.a> a(MembersInjector<yg.a> membersInjector) {
        return new yh(membersInjector);
    }
}
