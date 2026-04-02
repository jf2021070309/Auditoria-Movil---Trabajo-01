package com.vungle.publisher;

import com.vungle.publisher.my;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class nb implements Factory<my.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<my.a> b;

    static {
        a = !nb.class.desiredAssertionStatus();
    }

    public nb(MembersInjector<my.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public my.a get() {
        return (my.a) MembersInjectors.injectMembers(this.b, new my.a());
    }

    public static Factory<my.a> a(MembersInjector<my.a> membersInjector) {
        return new nb(membersInjector);
    }
}
