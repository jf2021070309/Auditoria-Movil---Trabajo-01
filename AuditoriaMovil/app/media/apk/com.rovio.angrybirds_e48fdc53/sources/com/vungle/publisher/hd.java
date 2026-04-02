package com.vungle.publisher;

import com.vungle.publisher.co;
import com.vungle.publisher.ct;
import com.vungle.publisher.gk;
import com.vungle.publisher.gq;
import com.vungle.publisher.gv;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class hd implements MembersInjector<gv.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<co.a> c;
    private final Provider<ct.a> d;
    private final Provider<gk.a> e;
    private final Provider<gq.a> f;
    private final Provider<gv> g;

    static {
        a = !hd.class.desiredAssertionStatus();
    }

    public hd(Provider<ci> provider, Provider<co.a> provider2, Provider<ct.a> provider3, Provider<gk.a> provider4, Provider<gq.a> provider5, Provider<gv> provider6) {
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

    public static MembersInjector<gv.a> a(Provider<ci> provider, Provider<co.a> provider2, Provider<ct.a> provider3, Provider<gk.a> provider4, Provider<gq.a> provider5, Provider<gv> provider6) {
        return new hd(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gv.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f.get();
        aVar.f = this.g;
    }
}
