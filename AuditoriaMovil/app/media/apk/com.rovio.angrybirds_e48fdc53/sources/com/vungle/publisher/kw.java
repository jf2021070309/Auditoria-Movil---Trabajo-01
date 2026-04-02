package com.vungle.publisher;

import com.vungle.publisher.ks;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kw implements MembersInjector<ks> {
    static final /* synthetic */ boolean a;
    private final Provider<ks.a> b;

    static {
        a = !kw.class.desiredAssertionStatus();
    }

    public kw(Provider<ks.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ks> a(Provider<ks.a> provider) {
        return new kw(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ks ksVar) {
        if (ksVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ksVar.a = this.b.get();
    }
}
