package com.vungle.publisher;

import com.vungle.publisher.hq;
import com.vungle.publisher.hr;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class iy implements MembersInjector<hq> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hr.a> c;
    private final Provider<hq.a> d;

    static {
        a = !iy.class.desiredAssertionStatus();
    }

    public iy(Provider<ci> provider, Provider<hr.a> provider2, Provider<hq.a> provider3) {
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

    public static MembersInjector<hq> a(Provider<ci> provider, Provider<hr.a> provider2, Provider<hq.a> provider3) {
        return new iy(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hq hqVar) {
        if (hqVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        hqVar.v = this.b.get();
        hqVar.a = this.c.get();
        hqVar.b = this.d.get();
    }
}
