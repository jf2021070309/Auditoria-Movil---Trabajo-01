package com.vungle.publisher;

import com.vungle.publisher.ds;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class du implements Factory<ds.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ds.a> b;

    static {
        a = !du.class.desiredAssertionStatus();
    }

    public du(MembersInjector<ds.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ds.a get() {
        return (ds.a) MembersInjectors.injectMembers(this.b, new ds.a());
    }

    public static Factory<ds.a> a(MembersInjector<ds.a> membersInjector) {
        return new du(membersInjector);
    }
}
