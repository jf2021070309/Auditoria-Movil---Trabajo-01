package com.vungle.publisher;

import com.vungle.publisher.rf;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class rm implements Factory<rf.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<rf.a> b;

    static {
        a = !rm.class.desiredAssertionStatus();
    }

    public rm(MembersInjector<rf.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rf.a get() {
        return (rf.a) MembersInjectors.injectMembers(this.b, new rf.a());
    }

    public static Factory<rf.a> a(MembersInjector<rf.a> membersInjector) {
        return new rm(membersInjector);
    }
}
