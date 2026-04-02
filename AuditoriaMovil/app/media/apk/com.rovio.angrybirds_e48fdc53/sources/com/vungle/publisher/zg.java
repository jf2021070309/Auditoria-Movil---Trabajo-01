package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class zg implements Factory<zf> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<zf> b;

    static {
        a = !zg.class.desiredAssertionStatus();
    }

    public zg(MembersInjector<zf> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public zf get() {
        return (zf) MembersInjectors.injectMembers(this.b, new zf());
    }

    public static Factory<zf> a(MembersInjector<zf> membersInjector) {
        return new zg(membersInjector);
    }
}
