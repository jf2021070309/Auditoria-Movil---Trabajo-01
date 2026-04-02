package com.vungle.publisher;

import com.vungle.publisher.nk;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nq implements MembersInjector<nk.a.C0332a> {
    static final /* synthetic */ boolean a;
    private final Provider<nk.a> b;

    static {
        a = !nq.class.desiredAssertionStatus();
    }

    public nq(Provider<nk.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<nk.a.C0332a> a(Provider<nk.a> provider) {
        return new nq(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(nk.a.C0332a c0332a) {
        if (c0332a == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        c0332a.a = this.b.get();
    }
}
