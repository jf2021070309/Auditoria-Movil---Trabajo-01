package com.vungle.publisher;

import com.vungle.publisher.ge;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gh implements MembersInjector<ge.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ge> b;

    static {
        a = !gh.class.desiredAssertionStatus();
    }

    public gh(Provider<ge> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ge.a> a(Provider<ge> provider) {
        return new gh(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ge.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
