package com.vungle.publisher;

import com.vungle.publisher.fb;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ff implements MembersInjector<fb> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<fb.a> c;

    static {
        a = !ff.class.desiredAssertionStatus();
    }

    public ff(Provider<ci> provider, Provider<fb.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<fb> a(Provider<ci> provider, Provider<fb.a> provider2) {
        return new ff(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fb fbVar) {
        if (fbVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        fbVar.v = this.b.get();
        fbVar.e = this.c.get();
    }
}
