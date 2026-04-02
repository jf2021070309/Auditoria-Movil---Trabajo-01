package com.vungle.publisher;

import com.vungle.publisher.rz;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class sb implements Factory<rz.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<rz.a> b;

    static {
        a = !sb.class.desiredAssertionStatus();
    }

    public sb(MembersInjector<rz.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rz.a get() {
        return (rz.a) MembersInjectors.injectMembers(this.b, new rz.a());
    }

    public static Factory<rz.a> a(MembersInjector<rz.a> membersInjector) {
        return new sb(membersInjector);
    }
}
