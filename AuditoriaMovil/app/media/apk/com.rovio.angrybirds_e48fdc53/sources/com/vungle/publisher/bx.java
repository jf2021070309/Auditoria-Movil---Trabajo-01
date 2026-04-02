package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class bx implements Factory<bw> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<bw> b;

    static {
        a = !bx.class.desiredAssertionStatus();
    }

    public bx(MembersInjector<bw> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public bw get() {
        return (bw) MembersInjectors.injectMembers(this.b, new bw());
    }

    public static Factory<bw> a(MembersInjector<bw> membersInjector) {
        return new bx(membersInjector);
    }
}
