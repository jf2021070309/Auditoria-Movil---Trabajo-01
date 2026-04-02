package com.vungle.publisher;

import com.vungle.publisher.wp;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class wq implements Factory<wp.a.C0335a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<wp.a.C0335a> b;

    static {
        a = !wq.class.desiredAssertionStatus();
    }

    public wq(MembersInjector<wp.a.C0335a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public wp.a.C0335a get() {
        return (wp.a.C0335a) MembersInjectors.injectMembers(this.b, new wp.a.C0335a());
    }

    public static Factory<wp.a.C0335a> a(MembersInjector<wp.a.C0335a> membersInjector) {
        return new wq(membersInjector);
    }
}
