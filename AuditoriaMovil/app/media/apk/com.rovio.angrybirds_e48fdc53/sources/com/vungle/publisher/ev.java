package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.eb;
import com.vungle.publisher.hk;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ev implements MembersInjector<er> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<eb.c> c;
    private final Provider<zl> d;
    private final Provider<hk.a> e;
    private final Provider<ct.a> f;

    static {
        a = !ev.class.desiredAssertionStatus();
    }

    public ev(Provider<ci> provider, Provider<eb.c> provider2, Provider<zl> provider3, Provider<hk.a> provider4, Provider<ct.a> provider5) {
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
    }

    public static MembersInjector<er> a(Provider<ci> provider, Provider<eb.c> provider2, Provider<zl> provider3, Provider<hk.a> provider4, Provider<ct.a> provider5) {
        return new ev(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(er erVar) {
        if (erVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        erVar.a = this.b.get();
        erVar.b = this.c.get();
        erVar.c = this.d.get();
        erVar.d = this.e.get();
        erVar.e = this.f.get();
    }
}
