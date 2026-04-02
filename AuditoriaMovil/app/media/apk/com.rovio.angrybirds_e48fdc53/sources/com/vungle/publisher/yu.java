package com.vungle.publisher;

import com.vungle.publisher.ys;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class yu implements Factory<ys.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ys.a> b;

    static {
        a = !yu.class.desiredAssertionStatus();
    }

    public yu(MembersInjector<ys.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ys.a get() {
        return (ys.a) MembersInjectors.injectMembers(this.b, new ys.a());
    }

    public static Factory<ys.a> a(MembersInjector<ys.a> membersInjector) {
        return new yu(membersInjector);
    }
}
