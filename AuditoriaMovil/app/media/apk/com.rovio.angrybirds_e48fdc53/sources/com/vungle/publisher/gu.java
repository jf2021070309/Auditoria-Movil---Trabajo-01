package com.vungle.publisher;

import com.vungle.publisher.gq;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gu implements MembersInjector<gq> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<gq.a> c;

    static {
        a = !gu.class.desiredAssertionStatus();
    }

    public gu(Provider<ci> provider, Provider<gq.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<gq> a(Provider<ci> provider, Provider<gq.a> provider2) {
        return new gu(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gq gqVar) {
        if (gqVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        gqVar.v = this.b.get();
        gqVar.e = this.c.get();
    }
}
