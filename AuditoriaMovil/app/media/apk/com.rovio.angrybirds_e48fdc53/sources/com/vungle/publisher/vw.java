package com.vungle.publisher;

import com.vungle.publisher.vu;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class vw implements Factory<vu.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<vu.a> b;

    static {
        a = !vw.class.desiredAssertionStatus();
    }

    public vw(MembersInjector<vu.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public vu.a get() {
        return (vu.a) MembersInjectors.injectMembers(this.b, new vu.a());
    }

    public static Factory<vu.a> a(MembersInjector<vu.a> membersInjector) {
        return new vw(membersInjector);
    }
}
