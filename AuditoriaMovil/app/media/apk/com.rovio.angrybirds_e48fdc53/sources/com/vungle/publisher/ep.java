package com.vungle.publisher;

import com.vungle.publisher.em;
import com.vungle.publisher.ge;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ep implements MembersInjector<em.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<ge.a> d;
    private final Provider<em> e;

    static {
        a = !ep.class.desiredAssertionStatus();
    }

    public ep(Provider<ci> provider, Provider<m.a> provider2, Provider<ge.a> provider3, Provider<em> provider4) {
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

    public static MembersInjector<em.a> a(Provider<ci> provider, Provider<m.a> provider2, Provider<ge.a> provider3, Provider<em> provider4) {
        return new ep(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(em.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.e = this.c.get();
        aVar.a = this.d.get();
        aVar.b = this.e;
    }
}
