package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fi implements Factory<fh> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<fh> b;

    static {
        a = !fi.class.desiredAssertionStatus();
    }

    public fi(MembersInjector<fh> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public fh get() {
        return (fh) MembersInjectors.injectMembers(this.b, new fh());
    }

    public static Factory<fh> a(MembersInjector<fh> membersInjector) {
        return new fi(membersInjector);
    }
}
