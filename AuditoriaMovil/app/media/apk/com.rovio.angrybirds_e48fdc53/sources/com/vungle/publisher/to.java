package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class to implements Factory<tn> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<tn> b;

    static {
        a = !to.class.desiredAssertionStatus();
    }

    public to(MembersInjector<tn> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public tn get() {
        return (tn) MembersInjectors.injectMembers(this.b, new tn());
    }

    public static Factory<tn> a(MembersInjector<tn> membersInjector) {
        return new to(membersInjector);
    }
}
