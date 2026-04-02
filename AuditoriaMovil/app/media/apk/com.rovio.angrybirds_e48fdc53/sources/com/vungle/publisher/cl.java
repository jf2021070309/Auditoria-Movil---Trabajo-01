package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class cl implements MembersInjector<ci> {
    static final /* synthetic */ boolean a;
    private final Provider<qo> b;
    private final Provider<qg> c;
    private final Provider<com.vungle.publisher.env.n> d;
    private final Provider<bw> e;

    static {
        a = !cl.class.desiredAssertionStatus();
    }

    public cl(Provider<qo> provider, Provider<qg> provider2, Provider<com.vungle.publisher.env.n> provider3, Provider<bw> provider4) {
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
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
    }

    public static MembersInjector<ci> a(Provider<qo> provider, Provider<qg> provider2, Provider<com.vungle.publisher.env.n> provider3, Provider<bw> provider4) {
        return new cl(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ci ciVar) {
        if (ciVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ciVar.a = this.b.get();
        ciVar.b = this.c.get();
        ciVar.c = this.d.get();
        ciVar.d = this.e.get();
    }
}
