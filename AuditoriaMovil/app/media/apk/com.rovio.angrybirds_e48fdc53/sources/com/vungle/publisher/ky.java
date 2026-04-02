package com.vungle.publisher;

import com.vungle.publisher.jn;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ky implements Factory<jn.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<jn.a> b;

    static {
        a = !ky.class.desiredAssertionStatus();
    }

    public ky(MembersInjector<jn.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public jn.a get() {
        return (jn.a) MembersInjectors.injectMembers(this.b, new jn.a());
    }

    public static Factory<jn.a> a(MembersInjector<jn.a> membersInjector) {
        return new ky(membersInjector);
    }
}
