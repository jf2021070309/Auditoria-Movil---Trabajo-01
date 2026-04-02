package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.ct;
import com.vungle.publisher.eb;
import com.vungle.publisher.er;
import com.vungle.publisher.jt;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ed implements MembersInjector<eb.b> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<ct.a> d;
    private final Provider<cn.b> e;
    private final Provider<jt.a> f;
    private final Provider<er.a> g;
    private final Provider<eb.c> h;

    static {
        a = !ed.class.desiredAssertionStatus();
    }

    public ed(Provider<ci> provider, Provider<m.a> provider2, Provider<ct.a> provider3, Provider<cn.b> provider4, Provider<jt.a> provider5, Provider<er.a> provider6, Provider<eb.c> provider7) {
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
    }

    public static MembersInjector<eb.b> a(Provider<ci> provider, Provider<m.a> provider2, Provider<ct.a> provider3, Provider<cn.b> provider4, Provider<jt.a> provider5, Provider<er.a> provider6, Provider<eb.c> provider7) {
        return new ed(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(eb.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.a = this.b.get();
        bVar.b = this.c.get();
        bVar.c = this.d.get();
        bVar.d = this.e.get();
        bVar.e = this.f.get();
        bVar.f = this.g.get();
        bVar.g = this.h.get();
    }
}
