package com.vungle.publisher;

import com.vungle.publisher.kj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kn implements MembersInjector<kj> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<kj.a> c;

    static {
        a = !kn.class.desiredAssertionStatus();
    }

    public kn(Provider<ci> provider, Provider<kj.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<kj> a(Provider<ci> provider, Provider<kj.a> provider2) {
        return new kn(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(kj kjVar) {
        if (kjVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        kjVar.v = this.b.get();
        kjVar.e = this.c.get();
    }
}
