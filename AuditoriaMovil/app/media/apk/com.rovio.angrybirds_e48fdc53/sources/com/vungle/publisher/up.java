package com.vungle.publisher;

import com.vungle.publisher.uo;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class up implements Factory<uo.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<uo.a> b;

    static {
        a = !up.class.desiredAssertionStatus();
    }

    public up(MembersInjector<uo.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uo.a get() {
        return (uo.a) MembersInjectors.injectMembers(this.b, new uo.a());
    }

    public static Factory<uo.a> a(MembersInjector<uo.a> membersInjector) {
        return new up(membersInjector);
    }
}
