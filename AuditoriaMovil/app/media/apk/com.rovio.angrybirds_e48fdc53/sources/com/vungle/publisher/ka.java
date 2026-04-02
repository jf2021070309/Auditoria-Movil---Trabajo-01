package com.vungle.publisher;

import com.vungle.publisher.jy;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ka implements Factory<jy.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<jy.a> b;

    static {
        a = !ka.class.desiredAssertionStatus();
    }

    public ka(MembersInjector<jy.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public jy.a get() {
        return (jy.a) MembersInjectors.injectMembers(this.b, new jy.a());
    }

    public static Factory<jy.a> a(MembersInjector<jy.a> membersInjector) {
        return new ka(membersInjector);
    }
}
