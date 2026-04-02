package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.el;
import com.vungle.publisher.gk;
import com.vungle.publisher.hr;
import com.vungle.publisher.jn;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class de implements MembersInjector<cn.b> {
    static final /* synthetic */ boolean a;
    private final Provider<el.a> b;
    private final Provider<hr.a> c;
    private final Provider<jn.a> d;
    private final Provider<gk.a> e;

    static {
        a = !de.class.desiredAssertionStatus();
    }

    public de(Provider<el.a> provider, Provider<hr.a> provider2, Provider<jn.a> provider3, Provider<gk.a> provider4) {
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

    public static MembersInjector<cn.b> a(Provider<el.a> provider, Provider<hr.a> provider2, Provider<jn.a> provider3, Provider<gk.a> provider4) {
        return new de(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(cn.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.a = this.b.get();
        bVar.b = this.c.get();
        bVar.c = this.d.get();
        bVar.d = this.e.get();
    }
}
