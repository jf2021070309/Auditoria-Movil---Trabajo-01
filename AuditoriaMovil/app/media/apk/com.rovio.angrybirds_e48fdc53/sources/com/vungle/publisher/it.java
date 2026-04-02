package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.hq;
import com.vungle.publisher.hr;
import com.vungle.publisher.im;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class it implements MembersInjector<hr.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<qg> c;
    private final Provider<zl> d;
    private final Provider<ct.a> e;
    private final Provider<hr> f;
    private final Provider<hq.a> g;
    private final Provider<im.a> h;

    static {
        a = !it.class.desiredAssertionStatus();
    }

    public it(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<hr> provider5, Provider<hq.a> provider6, Provider<im.a> provider7) {
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

    public static MembersInjector<hr.a> a(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<hr> provider5, Provider<hq.a> provider6, Provider<im.a> provider7) {
        return new it(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hr.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f;
        aVar.f = this.g.get();
        aVar.g = this.h.get();
    }
}
