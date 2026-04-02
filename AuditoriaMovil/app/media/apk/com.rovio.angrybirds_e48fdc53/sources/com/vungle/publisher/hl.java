package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class hl implements Factory<hk> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hk> b;

    static {
        a = !hl.class.desiredAssertionStatus();
    }

    public hl(MembersInjector<hk> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hk get() {
        return (hk) MembersInjectors.injectMembers(this.b, new hk());
    }

    public static Factory<hk> a(MembersInjector<hk> membersInjector) {
        return new hl(membersInjector);
    }
}
