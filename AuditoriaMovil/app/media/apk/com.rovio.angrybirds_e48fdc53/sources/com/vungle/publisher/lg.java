package com.vungle.publisher;

import com.vungle.publisher.lf;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class lg implements Factory<lf.b> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<lf.b> b;

    static {
        a = !lg.class.desiredAssertionStatus();
    }

    public lg(MembersInjector<lf.b> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public lf.b get() {
        return (lf.b) MembersInjectors.injectMembers(this.b, new lf.b());
    }

    public static Factory<lf.b> a(MembersInjector<lf.b> membersInjector) {
        return new lg(membersInjector);
    }
}
