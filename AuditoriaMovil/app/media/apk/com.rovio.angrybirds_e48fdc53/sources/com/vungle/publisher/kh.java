package com.vungle.publisher;

import com.vungle.publisher.kd;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kh implements MembersInjector<kd> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<kd.a> c;

    static {
        a = !kh.class.desiredAssertionStatus();
    }

    public kh(Provider<ci> provider, Provider<kd.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<kd> a(Provider<ci> provider, Provider<kd.a> provider2) {
        return new kh(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(kd kdVar) {
        if (kdVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        kdVar.v = this.b.get();
        kdVar.e = this.c.get();
    }
}
