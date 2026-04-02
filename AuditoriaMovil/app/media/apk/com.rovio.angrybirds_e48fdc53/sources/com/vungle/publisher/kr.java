package com.vungle.publisher;

import com.vungle.publisher.ki;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kr implements MembersInjector<ki> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<zl> c;
    private final Provider<ki.a> d;

    static {
        a = !kr.class.desiredAssertionStatus();
    }

    public kr(Provider<ci> provider, Provider<zl> provider2, Provider<ki.a> provider3) {
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

    public static MembersInjector<ki> a(Provider<ci> provider, Provider<zl> provider2, Provider<ki.a> provider3) {
        return new kr(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ki kiVar) {
        if (kiVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        kiVar.v = this.b.get();
        kiVar.r = this.c.get();
        kiVar.x = this.d.get();
    }
}
