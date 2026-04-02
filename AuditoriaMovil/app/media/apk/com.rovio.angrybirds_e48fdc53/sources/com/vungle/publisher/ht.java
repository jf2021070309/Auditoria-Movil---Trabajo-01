package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ht implements Factory<hs> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hs> b;

    static {
        a = !ht.class.desiredAssertionStatus();
    }

    public ht(MembersInjector<hs> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hs get() {
        return (hs) MembersInjectors.injectMembers(this.b, new hs());
    }

    public static Factory<hs> a(MembersInjector<hs> membersInjector) {
        return new ht(membersInjector);
    }
}
