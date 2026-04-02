package com.vungle.publisher;

import com.vungle.publisher.mg;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class mh implements Factory<mg.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<mg.a> b;

    static {
        a = !mh.class.desiredAssertionStatus();
    }

    public mh(MembersInjector<mg.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public mg.a get() {
        return (mg.a) MembersInjectors.injectMembers(this.b, new mg.a());
    }

    public static Factory<mg.a> a(MembersInjector<mg.a> membersInjector) {
        return new mh(membersInjector);
    }
}
