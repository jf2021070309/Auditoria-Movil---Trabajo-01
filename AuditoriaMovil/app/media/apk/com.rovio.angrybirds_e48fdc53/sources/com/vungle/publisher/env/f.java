package com.vungle.publisher.env;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class f implements Factory<AndroidDevice> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<AndroidDevice> b;

    static {
        a = !f.class.desiredAssertionStatus();
    }

    public f(MembersInjector<AndroidDevice> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public AndroidDevice get() {
        return (AndroidDevice) MembersInjectors.injectMembers(this.b, new AndroidDevice());
    }

    public static Factory<AndroidDevice> a(MembersInjector<AndroidDevice> membersInjector) {
        return new f(membersInjector);
    }
}
