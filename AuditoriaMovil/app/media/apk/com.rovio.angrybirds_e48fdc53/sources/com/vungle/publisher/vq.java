package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class vq implements Factory<vc> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<vc> b;

    static {
        a = !vq.class.desiredAssertionStatus();
    }

    public vq(MembersInjector<vc> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public vc get() {
        return (vc) MembersInjectors.injectMembers(this.b, new vc());
    }

    public static Factory<vc> a(MembersInjector<vc> membersInjector) {
        return new vq(membersInjector);
    }
}
