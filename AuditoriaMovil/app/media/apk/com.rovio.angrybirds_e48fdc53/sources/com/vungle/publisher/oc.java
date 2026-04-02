package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class oc implements Factory<ob> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ob> b;

    static {
        a = !oc.class.desiredAssertionStatus();
    }

    public oc(MembersInjector<ob> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ob get() {
        return (ob) MembersInjectors.injectMembers(this.b, new ob());
    }

    public static Factory<ob> a(MembersInjector<ob> membersInjector) {
        return new oc(membersInjector);
    }
}
