package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class tp implements MembersInjector<tn> {
    static final /* synthetic */ boolean a;
    private final Provider<uj> b;
    private final Provider<bw> c;

    static {
        a = !tp.class.desiredAssertionStatus();
    }

    public tp(Provider<uj> provider, Provider<bw> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<tn> a(Provider<uj> provider, Provider<bw> provider2) {
        return new tp(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(tn tnVar) {
        if (tnVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        tnVar.a = this.b.get();
        tnVar.b = this.c.get();
    }
}
