package com.vungle.publisher;

import com.vungle.publisher.ic;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ij implements Factory<ic.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ic.a> b;

    static {
        a = !ij.class.desiredAssertionStatus();
    }

    public ij(MembersInjector<ic.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ic.a get() {
        return (ic.a) MembersInjectors.injectMembers(this.b, new ic.a());
    }

    public static Factory<ic.a> a(MembersInjector<ic.a> membersInjector) {
        return new ij(membersInjector);
    }
}
