package com.vungle.publisher;

import com.vungle.publisher.oy;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class pc implements Factory<oy.a.C0334a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<oy.a.C0334a> b;

    static {
        a = !pc.class.desiredAssertionStatus();
    }

    public pc(MembersInjector<oy.a.C0334a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public oy.a.C0334a get() {
        return (oy.a.C0334a) MembersInjectors.injectMembers(this.b, new oy.a.C0334a());
    }

    public static Factory<oy.a.C0334a> a(MembersInjector<oy.a.C0334a> membersInjector) {
        return new pc(membersInjector);
    }
}
