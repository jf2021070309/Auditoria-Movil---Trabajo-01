package com.vungle.publisher;

import com.vungle.publisher.el;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class fw implements Factory<el.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<el.a> b;

    static {
        a = !fw.class.desiredAssertionStatus();
    }

    public fw(MembersInjector<el.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public el.a get() {
        return (el.a) MembersInjectors.injectMembers(this.b, new el.a());
    }

    public static Factory<el.a> a(MembersInjector<el.a> membersInjector) {
        return new fw(membersInjector);
    }
}
