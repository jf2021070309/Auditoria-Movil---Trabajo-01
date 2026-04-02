package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.eb;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ef implements MembersInjector<eb.c> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<ct.a> d;
    private final Provider<zl> e;

    static {
        a = !ef.class.desiredAssertionStatus();
    }

    public ef(Provider<ci> provider, Provider<m.a> provider2, Provider<ct.a> provider3, Provider<zl> provider4) {
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

    public static MembersInjector<eb.c> a(Provider<ci> provider, Provider<m.a> provider2, Provider<ct.a> provider3, Provider<zl> provider4) {
        return new ef(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(eb.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        cVar.a = this.b.get();
        cVar.b = this.c.get();
        cVar.c = this.d.get();
        cVar.d = this.e.get();
    }
}
