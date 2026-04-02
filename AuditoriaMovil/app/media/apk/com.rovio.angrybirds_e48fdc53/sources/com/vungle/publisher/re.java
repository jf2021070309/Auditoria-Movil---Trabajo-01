package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class re implements Factory<rd> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<rd> b;

    static {
        a = !re.class.desiredAssertionStatus();
    }

    public re(MembersInjector<rd> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rd get() {
        return (rd) MembersInjectors.injectMembers(this.b, new rd());
    }

    public static Factory<rd> a(MembersInjector<rd> membersInjector) {
        return new re(membersInjector);
    }
}
