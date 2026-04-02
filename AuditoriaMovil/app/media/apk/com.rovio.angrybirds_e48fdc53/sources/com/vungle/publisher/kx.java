package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class kx implements Factory<jn> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<jn> b;

    static {
        a = !kx.class.desiredAssertionStatus();
    }

    public kx(MembersInjector<jn> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public jn get() {
        return (jn) MembersInjectors.injectMembers(this.b, new jn());
    }

    public static Factory<jn> a(MembersInjector<jn> membersInjector) {
        return new kx(membersInjector);
    }
}
