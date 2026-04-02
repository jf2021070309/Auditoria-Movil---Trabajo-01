package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class yt implements Factory<ys> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ys> b;

    static {
        a = !yt.class.desiredAssertionStatus();
    }

    public yt(MembersInjector<ys> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ys get() {
        return (ys) MembersInjectors.injectMembers(this.b, new ys());
    }

    public static Factory<ys> a(MembersInjector<ys> membersInjector) {
        return new yt(membersInjector);
    }
}
