package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ir implements Factory<hr> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<hr> b;

    static {
        a = !ir.class.desiredAssertionStatus();
    }

    public ir(MembersInjector<hr> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public hr get() {
        return (hr) MembersInjectors.injectMembers(this.b, new hr());
    }

    public static Factory<hr> a(MembersInjector<hr> membersInjector) {
        return new ir(membersInjector);
    }
}
