package com.vungle.publisher;

import com.vungle.publisher.m;
import com.vungle.publisher.vu;
import com.vungle.publisher.wr;
import com.vungle.publisher.wz;
import com.vungle.publisher.xb;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class wt implements MembersInjector<wr.a> {
    static final /* synthetic */ boolean a;
    private final Provider<m.a> b;
    private final Provider<xb.a> c;
    private final Provider<wz.a> d;
    private final Provider<vu.a> e;

    static {
        a = !wt.class.desiredAssertionStatus();
    }

    public wt(Provider<m.a> provider, Provider<xb.a> provider2, Provider<wz.a> provider3, Provider<vu.a> provider4) {
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

    public static MembersInjector<wr.a> a(Provider<m.a> provider, Provider<xb.a> provider2, Provider<wz.a> provider3, Provider<vu.a> provider4) {
        return new wt(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(wr.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
        aVar.c = this.d.get();
        aVar.d = this.e.get();
    }
}
