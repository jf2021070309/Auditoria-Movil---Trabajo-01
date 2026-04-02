package com.vungle.publisher;

import com.vungle.publisher.wg;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class wh implements Factory<wg.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wg.a> b;

    static {
        a = !wh.class.desiredAssertionStatus();
    }

    public wh(MembersInjector<wg.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wg.a get() {
        return (wg.a) MembersInjectors.injectMembers(this.b, new wg.a());
    }

    public static Factory<wg.a> a(MembersInjector<wg.a> membersInjector) {
        return new wh(membersInjector);
    }
}
