package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.gk;
import com.vungle.publisher.gl;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class hi implements MembersInjector<gk.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<qg> c;
    private final Provider<zl> d;
    private final Provider<ct.a> e;
    private final Provider<gk> f;
    private final Provider<gl.a> g;

    static {
        a = !hi.class.desiredAssertionStatus();
    }

    public hi(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<gk> provider5, Provider<gl.a> provider6) {
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

    public static MembersInjector<gk.a> a(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<gk> provider5, Provider<gl.a> provider6) {
        return new hi(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gk.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f;
        aVar.f = this.g.get();
    }
}
