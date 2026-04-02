package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class va implements Factory<uz> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<uz> b;

    static {
        a = !va.class.desiredAssertionStatus();
    }

    public va(MembersInjector<uz> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uz get() {
        return (uz) MembersInjectors.injectMembers(this.b, new uz());
    }

    public static Factory<uz> a(MembersInjector<uz> membersInjector) {
        return new va(membersInjector);
    }
}
