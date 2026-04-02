package com.vungle.publisher;

import com.vungle.publisher.fb;
import com.vungle.publisher.fh;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fe implements MembersInjector<fb.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<fb> c;
    private final Provider<fh.a> d;

    static {
        a = !fe.class.desiredAssertionStatus();
    }

    public fe(Provider<ci> provider, Provider<fb> provider2, Provider<fh.a> provider3) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
    }

    public static MembersInjector<fb.a> a(Provider<ci> provider, Provider<fb> provider2, Provider<fh.a> provider3) {
        return new fe(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fb.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
        aVar.b = this.d.get();
    }
}
