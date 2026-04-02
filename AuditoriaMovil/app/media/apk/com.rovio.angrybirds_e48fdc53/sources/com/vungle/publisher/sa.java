package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class sa implements Factory<rz> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<rz> b;

    static {
        a = !sa.class.desiredAssertionStatus();
    }

    public sa(MembersInjector<rz> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rz get() {
        return (rz) MembersInjectors.injectMembers(this.b, new rz());
    }

    public static Factory<rz> a(MembersInjector<rz> membersInjector) {
        return new sa(membersInjector);
    }
}
