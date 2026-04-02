package com.vungle.publisher;

import com.vungle.publisher.wa;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class wb implements Factory<wa.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wa.a> b;

    static {
        a = !wb.class.desiredAssertionStatus();
    }

    public wb(MembersInjector<wa.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wa.a get() {
        return (wa.a) MembersInjectors.injectMembers(this.b, new wa.a());
    }

    public static Factory<wa.a> a(MembersInjector<wa.a> membersInjector) {
        return new wb(membersInjector);
    }
}
