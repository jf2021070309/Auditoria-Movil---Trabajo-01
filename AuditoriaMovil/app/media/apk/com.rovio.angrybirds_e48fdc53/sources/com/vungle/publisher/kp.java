package com.vungle.publisher;

import com.vungle.publisher.ki;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class kp implements Factory<ki.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ki.a> b;

    static {
        a = !kp.class.desiredAssertionStatus();
    }

    public kp(MembersInjector<ki.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ki.a get() {
        return (ki.a) MembersInjectors.injectMembers(this.b, new ki.a());
    }

    public static Factory<ki.a> a(MembersInjector<ki.a> membersInjector) {
        return new kp(membersInjector);
    }
}
