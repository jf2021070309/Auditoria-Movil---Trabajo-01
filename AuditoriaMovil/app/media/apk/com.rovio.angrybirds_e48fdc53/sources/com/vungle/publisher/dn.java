package com.vungle.publisher;

import com.vungle.publisher.dk;
import com.vungle.publisher.ge;
import com.vungle.publisher.iz;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class dn implements MembersInjector<dk.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<dk> d;
    private final Provider<ge.a> e;
    private final Provider<iz.a> f;

    static {
        a = !dn.class.desiredAssertionStatus();
    }

    public dn(Provider<ci> provider, Provider<m.a> provider2, Provider<dk> provider3, Provider<ge.a> provider4, Provider<iz.a> provider5) {
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

    public static MembersInjector<dk.a> a(Provider<ci> provider, Provider<m.a> provider2, Provider<dk> provider3, Provider<ge.a> provider4, Provider<iz.a> provider5) {
        return new dn(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(dk.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.e = this.c.get();
        aVar.a = this.d;
        aVar.b = this.e.get();
        aVar.c = this.f.get();
    }
}
