package com.vungle.publisher;

import com.vungle.publisher.bd;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class bf implements MembersInjector<bd.a> {
    static final /* synthetic */ boolean a;
    private final Provider<lm> b;

    static {
        a = !bf.class.desiredAssertionStatus();
    }

    public bf(Provider<lm> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<bd.a> a(Provider<lm> provider) {
        return new bf(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(bd.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
