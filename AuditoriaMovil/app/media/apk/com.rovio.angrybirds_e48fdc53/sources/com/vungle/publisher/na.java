package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class na implements Factory<my> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<my> b;

    static {
        a = !na.class.desiredAssertionStatus();
    }

    public na(MembersInjector<my> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public my get() {
        return (my) MembersInjectors.injectMembers(this.b, new my());
    }

    public static Factory<my> a(MembersInjector<my> membersInjector) {
        return new na(membersInjector);
    }
}
