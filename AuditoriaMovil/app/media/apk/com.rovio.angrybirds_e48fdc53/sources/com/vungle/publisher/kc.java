package com.vungle.publisher;

import com.vungle.publisher.jy;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kc implements MembersInjector<jy> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<jy.a> c;

    static {
        a = !kc.class.desiredAssertionStatus();
    }

    public kc(Provider<ci> provider, Provider<jy.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<jy> a(Provider<ci> provider, Provider<jy.a> provider2) {
        return new kc(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jy jyVar) {
        if (jyVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        jyVar.v = this.b.get();
        jyVar.d = this.c.get();
    }
}
