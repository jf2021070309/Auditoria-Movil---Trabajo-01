package com.vungle.publisher;

import com.vungle.publisher.my;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class nf implements Factory<my.b.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<my.b.a> b;

    static {
        a = !nf.class.desiredAssertionStatus();
    }

    public nf(MembersInjector<my.b.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public my.b.a get() {
        return (my.b.a) MembersInjectors.injectMembers(this.b, new my.b.a());
    }

    public static Factory<my.b.a> a(MembersInjector<my.b.a> membersInjector) {
        return new nf(membersInjector);
    }
}
