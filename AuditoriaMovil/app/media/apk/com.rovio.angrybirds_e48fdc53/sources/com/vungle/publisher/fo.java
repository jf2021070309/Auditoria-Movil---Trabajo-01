package com.vungle.publisher;

import com.vungle.publisher.co;
import com.vungle.publisher.ct;
import com.vungle.publisher.ds;
import com.vungle.publisher.el;
import com.vungle.publisher.fb;
import com.vungle.publisher.fg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fo implements MembersInjector<fg.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<co.a> c;
    private final Provider<ct.a> d;
    private final Provider<el.a> e;
    private final Provider<fb.a> f;
    private final Provider<fg> g;
    private final Provider<ds.a> h;

    static {
        a = !fo.class.desiredAssertionStatus();
    }

    public fo(Provider<ci> provider, Provider<co.a> provider2, Provider<ct.a> provider3, Provider<el.a> provider4, Provider<fb.a> provider5, Provider<fg> provider6, Provider<ds.a> provider7) {
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

    public static MembersInjector<fg.a> a(Provider<ci> provider, Provider<co.a> provider2, Provider<ct.a> provider3, Provider<el.a> provider4, Provider<fb.a> provider5, Provider<fg> provider6, Provider<ds.a> provider7) {
        return new fo(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fg.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f.get();
        aVar.f = this.g;
        aVar.g = this.h.get();
    }
}
