package com.vungle.publisher;

import com.vungle.publisher.cz;
import com.vungle.publisher.eb;
import com.vungle.publisher.el;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class xx implements MembersInjector<xq> {
    static final /* synthetic */ boolean a;
    private final Provider<cz.b> b;
    private final Provider<xy> c;
    private final Provider<eb.b> d;
    private final Provider<el.a> e;

    static {
        a = !xx.class.desiredAssertionStatus();
    }

    public xx(Provider<cz.b> provider, Provider<xy> provider2, Provider<eb.b> provider3, Provider<el.a> provider4) {
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

    public static MembersInjector<xq> a(Provider<cz.b> provider, Provider<xy> provider2, Provider<eb.b> provider3, Provider<el.a> provider4) {
        return new xx(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(xq xqVar) {
        if (xqVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        xqVar.a = this.b.get();
        xqVar.b = this.c.get();
        xqVar.c = this.d.get();
        xqVar.d = this.e.get();
    }
}
