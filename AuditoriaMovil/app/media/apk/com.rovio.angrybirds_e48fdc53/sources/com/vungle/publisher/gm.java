package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class gm implements Factory<gl> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gl> b;

    static {
        a = !gm.class.desiredAssertionStatus();
    }

    public gm(MembersInjector<gl> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gl get() {
        return (gl) MembersInjectors.injectMembers(this.b, new gl());
    }

    public static Factory<gl> a(MembersInjector<gl> membersInjector) {
        return new gm(membersInjector);
    }
}
