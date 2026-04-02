package com.vungle.publisher;

import com.vungle.publisher.fb;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fd implements Factory<fb.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<fb.a> b;

    static {
        a = !fd.class.desiredAssertionStatus();
    }

    public fd(MembersInjector<fb.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public fb.a get() {
        return (fb.a) MembersInjectors.injectMembers(this.b, new fb.a());
    }

    public static Factory<fb.a> a(MembersInjector<fb.a> membersInjector) {
        return new fd(membersInjector);
    }
}
