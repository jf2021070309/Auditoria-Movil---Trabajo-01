package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fm implements Factory<fg> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<fg> b;

    static {
        a = !fm.class.desiredAssertionStatus();
    }

    public fm(MembersInjector<fg> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public fg get() {
        return (fg) MembersInjectors.injectMembers(this.b, new fg());
    }

    public static Factory<fg> a(MembersInjector<fg> membersInjector) {
        return new fm(membersInjector);
    }
}
