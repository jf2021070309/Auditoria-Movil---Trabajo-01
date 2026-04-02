package com.vungle.publisher;

import com.vungle.publisher.fb;
import com.vungle.publisher.fg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fp implements MembersInjector<fg> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<zl> c;
    private final Provider<fg.a> d;
    private final Provider<fb.a> e;

    static {
        a = !fp.class.desiredAssertionStatus();
    }

    public fp(Provider<ci> provider, Provider<zl> provider2, Provider<fg.a> provider3, Provider<fb.a> provider4) {
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
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
    }

    public static MembersInjector<fg> a(Provider<ci> provider, Provider<zl> provider2, Provider<fg.a> provider3, Provider<fb.a> provider4) {
        return new fp(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fg fgVar) {
        if (fgVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        fgVar.v = this.b.get();
        fgVar.r = this.c.get();
        fgVar.s = this.d.get();
        fgVar.w = this.e.get();
    }
}
