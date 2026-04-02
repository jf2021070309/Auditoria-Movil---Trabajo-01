package com.vungle.publisher;

import com.vungle.publisher.jn;
import com.vungle.publisher.lb;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class la implements MembersInjector<jn> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<jn.a> c;
    private final Provider<lb.a> d;

    static {
        a = !la.class.desiredAssertionStatus();
    }

    public la(Provider<ci> provider, Provider<jn.a> provider2, Provider<lb.a> provider3) {
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
    }

    public static MembersInjector<jn> a(Provider<ci> provider, Provider<jn.a> provider2, Provider<lb.a> provider3) {
        return new la(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jn jnVar) {
        if (jnVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        jnVar.v = this.b.get();
        jnVar.E = this.c.get();
        jnVar.F = this.d.get();
    }
}
