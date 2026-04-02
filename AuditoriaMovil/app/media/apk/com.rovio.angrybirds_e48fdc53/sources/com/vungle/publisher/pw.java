package com.vungle.publisher;

import com.vungle.publisher.pj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class pw implements MembersInjector<pj.a> {
    static final /* synthetic */ boolean a;
    private final Provider<pj> b;

    static {
        a = !pw.class.desiredAssertionStatus();
    }

    public pw(Provider<pj> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<pj.a> a(Provider<pj> provider) {
        return new pw(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(pj.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
