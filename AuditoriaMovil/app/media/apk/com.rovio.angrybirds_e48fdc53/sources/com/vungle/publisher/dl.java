package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class dl implements Factory<dk> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<dk> b;

    static {
        a = !dl.class.desiredAssertionStatus();
    }

    public dl(MembersInjector<dk> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public dk get() {
        return (dk) MembersInjectors.injectMembers(this.b, new dk());
    }

    public static Factory<dk> a(MembersInjector<dk> membersInjector) {
        return new dl(membersInjector);
    }
}
