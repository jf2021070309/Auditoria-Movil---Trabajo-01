package com.vungle.publisher;

import com.vungle.publisher.df;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class dh implements Factory<df.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<df.a> b;

    static {
        a = !dh.class.desiredAssertionStatus();
    }

    public dh(MembersInjector<df.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public df.a get() {
        return (df.a) MembersInjectors.injectMembers(this.b, new df.a());
    }

    public static Factory<df.a> a(MembersInjector<df.a> membersInjector) {
        return new dh(membersInjector);
    }
}
