package com.vungle.publisher;

import com.vungle.publisher.fh;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fj implements Factory<fh.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<fh.a> b;

    static {
        a = !fj.class.desiredAssertionStatus();
    }

    public fj(MembersInjector<fh.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public fh.a get() {
        return (fh.a) MembersInjectors.injectMembers(this.b, new fh.a());
    }

    public static Factory<fh.a> a(MembersInjector<fh.a> membersInjector) {
        return new fj(membersInjector);
    }
}
