package com.vungle.publisher;

import com.vungle.publisher.nk;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class np implements Factory<nk.a.C0332a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<nk.a.C0332a> b;

    static {
        a = !np.class.desiredAssertionStatus();
    }

    public np(MembersInjector<nk.a.C0332a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public nk.a.C0332a get() {
        return (nk.a.C0332a) MembersInjectors.injectMembers(this.b, new nk.a.C0332a());
    }

    public static Factory<nk.a.C0332a> a(MembersInjector<nk.a.C0332a> membersInjector) {
        return new np(membersInjector);
    }
}
