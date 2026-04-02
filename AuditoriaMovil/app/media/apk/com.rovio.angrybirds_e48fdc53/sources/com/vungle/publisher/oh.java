package com.vungle.publisher;

import com.vungle.publisher.og;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class oh implements Factory<og.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<og.a> b;

    static {
        a = !oh.class.desiredAssertionStatus();
    }

    public oh(MembersInjector<og.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public og.a get() {
        return (og.a) MembersInjectors.injectMembers(this.b, new og.a());
    }

    public static Factory<og.a> a(MembersInjector<og.a> membersInjector) {
        return new oh(membersInjector);
    }
}
