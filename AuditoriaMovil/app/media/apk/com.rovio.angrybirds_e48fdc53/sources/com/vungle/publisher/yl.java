package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class yl implements Factory<yk> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<yk> b;

    static {
        a = !yl.class.desiredAssertionStatus();
    }

    public yl(MembersInjector<yk> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public yk get() {
        return (yk) MembersInjectors.injectMembers(this.b, new yk());
    }

    public static Factory<yk> a(MembersInjector<yk> membersInjector) {
        return new yl(membersInjector);
    }
}
