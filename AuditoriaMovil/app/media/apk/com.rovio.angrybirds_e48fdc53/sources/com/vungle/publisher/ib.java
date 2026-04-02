package com.vungle.publisher;

import com.vungle.publisher.hx;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ib implements MembersInjector<hx> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hx.a> c;

    static {
        a = !ib.class.desiredAssertionStatus();
    }

    public ib(Provider<ci> provider, Provider<hx.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<hx> a(Provider<ci> provider, Provider<hx.a> provider2) {
        return new ib(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hx hxVar) {
        if (hxVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        hxVar.v = this.b.get();
        hxVar.e = this.c.get();
    }
}
