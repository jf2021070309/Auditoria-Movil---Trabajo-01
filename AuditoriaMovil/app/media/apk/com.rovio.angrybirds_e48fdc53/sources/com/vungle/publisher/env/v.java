package com.vungle.publisher.env;

import android.content.SharedPreferences;
import com.vungle.publisher.bw;
import com.vungle.publisher.cf;
import com.vungle.publisher.ct;
import com.vungle.publisher.lp;
import com.vungle.publisher.qg;
import com.vungle.publisher.ta;
import com.vungle.publisher.zl;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class v implements MembersInjector<r> {
    static final /* synthetic */ boolean a;
    private final Provider<zl> b;
    private final Provider<cf> c;
    private final Provider<i> d;
    private final Provider<qg> e;
    private final Provider<lp> f;
    private final Provider<ta> g;
    private final Provider<bw> h;
    private final Provider<k> i;
    private final Provider<o> j;
    private final Provider<SharedPreferences> k;
    private final Provider<ct.a> l;
    private final Provider<n> m;
    private final Provider<WrapperFramework> n;
    private final Provider<String> o;

    static {
        a = !v.class.desiredAssertionStatus();
    }

    public v(Provider<zl> provider, Provider<cf> provider2, Provider<i> provider3, Provider<qg> provider4, Provider<lp> provider5, Provider<ta> provider6, Provider<bw> provider7, Provider<k> provider8, Provider<o> provider9, Provider<SharedPreferences> provider10, Provider<ct.a> provider11, Provider<n> provider12, Provider<WrapperFramework> provider13, Provider<String> provider14) {
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
        if (!a && provider12 == null) {
            throw new AssertionError();
        }
        this.m = provider12;
        if (!a && provider13 == null) {
            throw new AssertionError();
        }
        this.n = provider13;
        if (!a && provider14 == null) {
            throw new AssertionError();
        }
        this.o = provider14;
    }

    public static MembersInjector<r> a(Provider<zl> provider, Provider<cf> provider2, Provider<i> provider3, Provider<qg> provider4, Provider<lp> provider5, Provider<ta> provider6, Provider<bw> provider7, Provider<k> provider8, Provider<o> provider9, Provider<SharedPreferences> provider10, Provider<ct.a> provider11, Provider<n> provider12, Provider<WrapperFramework> provider13, Provider<String> provider14) {
        return new v(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        rVar.c = this.b.get();
        rVar.d = this.c.get();
        rVar.e = this.d.get();
        rVar.f = this.e.get();
        rVar.g = this.f.get();
        rVar.h = this.g.get();
        rVar.i = this.h.get();
        rVar.j = this.i.get();
        rVar.k = this.j.get();
        rVar.l = this.k.get();
        rVar.m = this.l.get();
        rVar.n = this.m.get();
        rVar.o = this.n.get();
        rVar.p = this.o.get();
    }
}
