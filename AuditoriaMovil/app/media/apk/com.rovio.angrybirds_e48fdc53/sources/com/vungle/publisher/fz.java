package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fz implements Factory<ek> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ek> b;

    static {
        a = !fz.class.desiredAssertionStatus();
    }

    public fz(MembersInjector<ek> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ek get() {
        return (ek) MembersInjectors.injectMembers(this.b, new ek());
    }

    public static Factory<ek> a(MembersInjector<ek> membersInjector) {
        return new fz(membersInjector);
    }
}
