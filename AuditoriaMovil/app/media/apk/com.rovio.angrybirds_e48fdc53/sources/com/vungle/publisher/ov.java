package com.vungle.publisher;

import com.vungle.publisher.op;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class ov implements Factory<op.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<op.a> b;

    static {
        a = !ov.class.desiredAssertionStatus();
    }

    public ov(MembersInjector<op.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public op.a get() {
        return (op.a) MembersInjectors.injectMembers(this.b, new op.a());
    }

    public static Factory<op.a> a(MembersInjector<op.a> membersInjector) {
        return new ov(membersInjector);
    }
}
