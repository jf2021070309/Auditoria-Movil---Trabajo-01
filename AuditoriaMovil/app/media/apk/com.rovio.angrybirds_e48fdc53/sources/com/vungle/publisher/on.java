package com.vungle.publisher;

import com.vungle.publisher.om;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class on implements Factory<om.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<om.a> b;

    static {
        a = !on.class.desiredAssertionStatus();
    }

    public on(MembersInjector<om.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public om.a get() {
        return (om.a) MembersInjectors.injectMembers(this.b, new om.a());
    }

    public static Factory<om.a> a(MembersInjector<om.a> membersInjector) {
        return new on(membersInjector);
    }
}
