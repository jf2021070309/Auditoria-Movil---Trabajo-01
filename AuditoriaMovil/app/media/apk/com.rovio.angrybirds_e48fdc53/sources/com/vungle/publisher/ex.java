package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ex implements Factory<ew> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ew> b;

    static {
        a = !ex.class.desiredAssertionStatus();
    }

    public ex(MembersInjector<ew> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ew get() {
        return (ew) MembersInjectors.injectMembers(this.b, new ew());
    }

    public static Factory<ew> a(MembersInjector<ew> membersInjector) {
        return new ex(membersInjector);
    }
}
