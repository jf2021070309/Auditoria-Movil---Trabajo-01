package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.rf;
import com.vungle.publisher.rg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class rn implements MembersInjector<rf.a> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<qg> c;
    private final Provider<rg.a> d;
    private final Provider<rd> e;
    private final Provider<rr> f;

    static {
        a = !rn.class.desiredAssertionStatus();
    }

    public rn(Provider<Context> provider, Provider<qg> provider2, Provider<rg.a> provider3, Provider<rd> provider4, Provider<rr> provider5) {
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
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
    }

    public static MembersInjector<rf.a> a(Provider<Context> provider, Provider<qg> provider2, Provider<rg.a> provider3, Provider<rd> provider4, Provider<rr> provider5) {
        return new rn(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(rf.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        mp.a(aVar, this.b);
        mp.b(aVar, this.c);
        aVar.c = this.d.get();
        aVar.d = this.e;
        aVar.e = this.f.get();
    }
}
