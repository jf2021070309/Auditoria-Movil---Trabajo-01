package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class tg implements MembersInjector<te> {
    static final /* synthetic */ boolean a;
    private final Provider<uj> b;
    private final Provider<bw> c;

    static {
        a = !tg.class.desiredAssertionStatus();
    }

    public tg(Provider<uj> provider, Provider<bw> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<te> a(Provider<uj> provider, Provider<bw> provider2) {
        return new tg(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(te teVar) {
        if (teVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        teVar.a = this.b.get();
        teVar.b = this.c.get();
    }
}
