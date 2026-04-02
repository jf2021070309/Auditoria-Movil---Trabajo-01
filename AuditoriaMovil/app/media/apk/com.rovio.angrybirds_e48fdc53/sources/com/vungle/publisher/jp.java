package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class jp implements Factory<jo> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<jo> b;

    static {
        a = !jp.class.desiredAssertionStatus();
    }

    public jp(MembersInjector<jo> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public jo get() {
        return (jo) MembersInjectors.injectMembers(this.b, new jo());
    }

    public static Factory<jo> a(MembersInjector<jo> membersInjector) {
        return new jp(membersInjector);
    }
}
