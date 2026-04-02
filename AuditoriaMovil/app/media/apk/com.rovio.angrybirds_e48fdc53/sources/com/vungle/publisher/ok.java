package com.vungle.publisher;

import com.vungle.publisher.oj;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ok implements Factory<oj.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<oj.a> b;

    static {
        a = !ok.class.desiredAssertionStatus();
    }

    public ok(MembersInjector<oj.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public oj.a get() {
        return (oj.a) MembersInjectors.injectMembers(this.b, new oj.a());
    }

    public static Factory<oj.a> a(MembersInjector<oj.a> membersInjector) {
        return new ok(membersInjector);
    }
}
