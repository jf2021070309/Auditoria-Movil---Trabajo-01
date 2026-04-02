package com.vungle.publisher;

import com.vungle.publisher.ct;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class cx implements MembersInjector<ct> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<ct.a> c;

    static {
        a = !cx.class.desiredAssertionStatus();
    }

    public cx(Provider<ci> provider, Provider<ct.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<ct> a(Provider<ci> provider, Provider<ct.a> provider2) {
        return new cx(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ct ctVar) {
        if (ctVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ctVar.v = this.b.get();
        ctVar.c = this.c.get();
    }
}
