package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ln implements Factory<lm> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<lm> b;

    static {
        a = !ln.class.desiredAssertionStatus();
    }

    public ln(MembersInjector<lm> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public lm get() {
        return (lm) MembersInjectors.injectMembers(this.b, new lm());
    }

    public static Factory<lm> a(MembersInjector<lm> membersInjector) {
        return new ln(membersInjector);
    }
}
