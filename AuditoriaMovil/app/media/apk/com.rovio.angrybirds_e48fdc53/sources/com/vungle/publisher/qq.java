package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class qq implements MembersInjector<qo> {
    static final /* synthetic */ boolean a;
    private final Provider<String> b;
    private final Provider<String> c;

    static {
        a = !qq.class.desiredAssertionStatus();
    }

    public qq(Provider<String> provider, Provider<String> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<qo> a(Provider<String> provider, Provider<String> provider2) {
        return new qq(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(qo qoVar) {
        if (qoVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        qoVar.a = this.b;
        qoVar.b = this.c;
    }
}
