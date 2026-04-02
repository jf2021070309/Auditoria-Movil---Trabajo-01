package com.vungle.publisher;

import com.vungle.publisher.ob;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class od implements Factory<ob.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ob.a> b;

    static {
        a = !od.class.desiredAssertionStatus();
    }

    public od(MembersInjector<ob.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ob.a get() {
        return (ob.a) MembersInjectors.injectMembers(this.b, new ob.a());
    }

    public static Factory<ob.a> a(MembersInjector<ob.a> membersInjector) {
        return new od(membersInjector);
    }
}
