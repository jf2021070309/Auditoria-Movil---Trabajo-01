package com.vungle.publisher;

import com.vungle.publisher.lb;
import com.vungle.publisher.lf;
import com.vungle.publisher.li;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class lh implements MembersInjector<lf.b> {
    static final /* synthetic */ boolean a;
    private final Provider<lb.a> b;
    private final Provider<li.a> c;

    static {
        a = !lh.class.desiredAssertionStatus();
    }

    public lh(Provider<lb.a> provider, Provider<li.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<lf.b> a(Provider<lb.a> provider, Provider<li.a> provider2) {
        return new lh(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(lf.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.a = this.b.get();
        bVar.b = this.c.get();
    }
}
