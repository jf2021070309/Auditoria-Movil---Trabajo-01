package com.vungle.publisher;

import com.vungle.publisher.jn;
import com.vungle.publisher.rv;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class rl implements MembersInjector<rg> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<rr> c;
    private final Provider<rv.a> d;
    private final Provider<bz> e;
    private final Provider<com.vungle.publisher.env.i> f;
    private final Provider<jn.a> g;

    static {
        a = !rl.class.desiredAssertionStatus();
    }

    public rl(Provider<qg> provider, Provider<rr> provider2, Provider<rv.a> provider3, Provider<bz> provider4, Provider<com.vungle.publisher.env.i> provider5, Provider<jn.a> provider6) {
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
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
        if (!a && provider6 == null) {
            throw new AssertionError();
        }
        this.g = provider6;
    }

    public static MembersInjector<rg> a(Provider<qg> provider, Provider<rr> provider2, Provider<rv.a> provider3, Provider<bz> provider4, Provider<com.vungle.publisher.env.i> provider5, Provider<jn.a> provider6) {
        return new rl(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(rg rgVar) {
        if (rgVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        rgVar.b = this.b.get();
        rgVar.c = this.c.get();
        rgVar.d = this.d.get();
        rgVar.e = this.e.get();
        rgVar.f = this.f.get();
        rgVar.g = this.g.get();
    }
}
