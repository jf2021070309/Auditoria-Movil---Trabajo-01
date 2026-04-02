package com.vungle.publisher;

import com.vungle.publisher.wv;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ww implements Factory<wv.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wv.a> b;

    static {
        a = !ww.class.desiredAssertionStatus();
    }

    public ww(MembersInjector<wv.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wv.a get() {
        return (wv.a) MembersInjectors.injectMembers(this.b, new wv.a());
    }

    public static Factory<wv.a> a(MembersInjector<wv.a> membersInjector) {
        return new ww(membersInjector);
    }
}
