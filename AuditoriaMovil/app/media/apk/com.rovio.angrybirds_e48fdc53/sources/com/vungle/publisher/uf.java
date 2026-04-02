package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class uf implements Factory<ue> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ue> b;

    static {
        a = !uf.class.desiredAssertionStatus();
    }

    public uf(MembersInjector<ue> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ue get() {
        return (ue) MembersInjectors.injectMembers(this.b, new ue());
    }

    public static Factory<ue> a(MembersInjector<ue> membersInjector) {
        return new uf(membersInjector);
    }
}
