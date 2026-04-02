package com.vungle.publisher;

import com.vungle.publisher.li;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class lk implements Factory<li.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<li.a> b;

    static {
        a = !lk.class.desiredAssertionStatus();
    }

    public lk(MembersInjector<li.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public li.a get() {
        return (li.a) MembersInjectors.injectMembers(this.b, new li.a());
    }

    public static Factory<li.a> a(MembersInjector<li.a> membersInjector) {
        return new lk(membersInjector);
    }
}
