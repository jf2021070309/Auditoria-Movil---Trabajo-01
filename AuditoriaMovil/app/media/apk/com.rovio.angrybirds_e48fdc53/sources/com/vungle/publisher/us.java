package com.vungle.publisher;

import com.vungle.publisher.uo;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class us implements MembersInjector<uq> {
    static final /* synthetic */ boolean a;
    private final Provider<ub> b;
    private final Provider<uo.a> c;
    private final Provider<te> d;
    private final Provider<tn> e;

    static {
        a = !us.class.desiredAssertionStatus();
    }

    public us(Provider<ub> provider, Provider<uo.a> provider2, Provider<te> provider3, Provider<tn> provider4) {
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

    public static MembersInjector<uq> a(Provider<ub> provider, Provider<uo.a> provider2, Provider<te> provider3, Provider<tn> provider4) {
        return new us(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(uq uqVar) {
        if (uqVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        uqVar.a = this.b;
        uqVar.b = this.c.get();
        uqVar.c = DoubleCheck.lazy(this.d);
        uqVar.d = DoubleCheck.lazy(this.e);
    }
}
