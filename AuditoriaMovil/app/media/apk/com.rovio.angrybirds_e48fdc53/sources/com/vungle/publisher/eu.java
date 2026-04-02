package com.vungle.publisher;

import com.vungle.publisher.er;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class eu implements MembersInjector<er.a> {
    static final /* synthetic */ boolean a;
    private final Provider<er> b;

    static {
        a = !eu.class.desiredAssertionStatus();
    }

    public eu(Provider<er> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<er.a> a(Provider<er> provider) {
        return new eu(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(er.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
