package com.vungle.publisher;

import com.vungle.publisher.hq;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ix implements MembersInjector<hq.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<hq> d;

    static {
        a = !ix.class.desiredAssertionStatus();
    }

    public ix(Provider<ci> provider, Provider<m.a> provider2, Provider<hq> provider3) {
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

    public static MembersInjector<hq.a> a(Provider<ci> provider, Provider<m.a> provider2, Provider<hq> provider3) {
        return new ix(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hq.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.e = this.c.get();
        aVar.a = this.d;
    }
}
