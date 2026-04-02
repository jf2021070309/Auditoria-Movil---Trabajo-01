package com.vungle.publisher;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ck implements Factory<ci> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<ci> b;
    private final Provider<Context> c;

    static {
        a = !ck.class.desiredAssertionStatus();
    }

    public ck(MembersInjector<ci> membersInjector, Provider<Context> provider) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ci get() {
        return (ci) MembersInjectors.injectMembers(this.b, new ci(this.c.get()));
    }

    public static Factory<ci> a(MembersInjector<ci> membersInjector, Provider<Context> provider) {
        return new ck(membersInjector, provider);
    }
}
