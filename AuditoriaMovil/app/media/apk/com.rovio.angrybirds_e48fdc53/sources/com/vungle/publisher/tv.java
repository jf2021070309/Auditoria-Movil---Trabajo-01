package com.vungle.publisher;

import com.vungle.publisher.ts;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class tv implements MembersInjector<ts.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ts> b;

    static {
        a = !tv.class.desiredAssertionStatus();
    }

    public tv(Provider<ts> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ts.a> a(Provider<ts> provider) {
        return new tv(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ts.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
