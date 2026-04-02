package com.vungle.publisher;

import com.vungle.publisher.hr;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class is implements Factory<hr.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hr.a> b;

    static {
        a = !is.class.desiredAssertionStatus();
    }

    public is(MembersInjector<hr.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hr.a get() {
        return (hr.a) MembersInjectors.injectMembers(this.b, new hr.a());
    }

    public static Factory<hr.a> a(MembersInjector<hr.a> membersInjector) {
        return new is(membersInjector);
    }
}
