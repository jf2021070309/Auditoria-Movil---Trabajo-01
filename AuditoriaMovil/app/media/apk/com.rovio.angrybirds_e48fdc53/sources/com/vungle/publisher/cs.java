package com.vungle.publisher;

import com.vungle.publisher.co;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class cs implements MembersInjector<co> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<co.a> c;

    static {
        a = !cs.class.desiredAssertionStatus();
    }

    public cs(Provider<ci> provider, Provider<co.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<co> a(Provider<ci> provider, Provider<co.a> provider2) {
        return new cs(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(co coVar) {
        if (coVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        coVar.v = this.b.get();
        coVar.a = this.c.get();
    }
}
