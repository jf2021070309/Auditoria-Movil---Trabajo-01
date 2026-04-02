package com.vungle.publisher;

import com.vungle.publisher.nk;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class no implements Factory<nk.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<nk.a> b;

    static {
        a = !no.class.desiredAssertionStatus();
    }

    public no(MembersInjector<nk.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public nk.a get() {
        return (nk.a) MembersInjectors.injectMembers(this.b, new nk.a());
    }

    public static Factory<nk.a> a(MembersInjector<nk.a> membersInjector) {
        return new no(membersInjector);
    }
}
