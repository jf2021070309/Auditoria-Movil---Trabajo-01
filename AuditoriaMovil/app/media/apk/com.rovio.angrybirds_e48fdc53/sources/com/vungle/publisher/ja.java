package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ja implements Factory<iz> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<iz> b;

    static {
        a = !ja.class.desiredAssertionStatus();
    }

    public ja(MembersInjector<iz> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public iz get() {
        return (iz) MembersInjectors.injectMembers(this.b, new iz());
    }

    public static Factory<iz> a(MembersInjector<iz> membersInjector) {
        return new ja(membersInjector);
    }
}
