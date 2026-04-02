package com.vungle.publisher;

import com.vungle.publisher.hx;
import com.vungle.publisher.id;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ia implements MembersInjector<hx.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hx> c;
    private final Provider<id.a> d;

    static {
        a = !ia.class.desiredAssertionStatus();
    }

    public ia(Provider<ci> provider, Provider<hx> provider2, Provider<id.a> provider3) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
    }

    public static MembersInjector<hx.a> a(Provider<ci> provider, Provider<hx> provider2, Provider<id.a> provider3) {
        return new ia(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hx.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
        aVar.b = this.d.get();
    }
}
