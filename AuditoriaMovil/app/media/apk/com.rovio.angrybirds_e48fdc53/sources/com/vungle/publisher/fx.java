package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.dw;
import com.vungle.publisher.ek;
import com.vungle.publisher.el;
import com.vungle.publisher.em;
import com.vungle.publisher.er;
import com.vungle.publisher.fq;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fx implements MembersInjector<el.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<qg> c;
    private final Provider<zl> d;
    private final Provider<ct.a> e;
    private final Provider<String> f;
    private final Provider<em.a> g;
    private final Provider<el> h;
    private final Provider<ek.a> i;
    private final Provider<er.a> j;
    private final Provider<dw.a> k;
    private final Provider<fq.a> l;

    static {
        a = !fx.class.desiredAssertionStatus();
    }

    public fx(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<String> provider5, Provider<em.a> provider6, Provider<el> provider7, Provider<ek.a> provider8, Provider<er.a> provider9, Provider<dw.a> provider10, Provider<fq.a> provider11) {
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
        if (!a && provider7 == null) {
            throw new AssertionError();
        }
        this.h = provider7;
        if (!a && provider8 == null) {
            throw new AssertionError();
        }
        this.i = provider8;
        if (!a && provider9 == null) {
            throw new AssertionError();
        }
        this.j = provider9;
        if (!a && provider10 == null) {
            throw new AssertionError();
        }
        this.k = provider10;
        if (!a && provider11 == null) {
            throw new AssertionError();
        }
        this.l = provider11;
    }

    public static MembersInjector<el.a> a(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<String> provider5, Provider<em.a> provider6, Provider<el> provider7, Provider<ek.a> provider8, Provider<er.a> provider9, Provider<dw.a> provider10, Provider<fq.a> provider11) {
        return new fx(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(el.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f;
        aVar.f = this.g.get();
        aVar.g = this.h;
        aVar.h = this.i.get();
        aVar.i = this.j.get();
        aVar.j = this.k.get();
        aVar.k = this.l.get();
    }
}
