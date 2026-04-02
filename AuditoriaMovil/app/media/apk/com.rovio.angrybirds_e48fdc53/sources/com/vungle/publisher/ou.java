package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ou implements Factory<op> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<op> b;

    static {
        a = !ou.class.desiredAssertionStatus();
    }

    public ou(MembersInjector<op> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public op get() {
        return (op) MembersInjectors.injectMembers(this.b, new op());
    }

    public static Factory<op> a(MembersInjector<op> membersInjector) {
        return new ou(membersInjector);
    }
}
