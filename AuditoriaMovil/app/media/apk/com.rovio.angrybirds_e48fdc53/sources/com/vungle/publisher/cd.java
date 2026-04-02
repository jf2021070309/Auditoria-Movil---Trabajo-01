package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.bd;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class cd implements MembersInjector<cb> {
    static final /* synthetic */ boolean a;
    private final Provider<lm> b;
    private final Provider<bd.a> c;
    private final Provider<qg> d;
    private final Provider<Context> e;

    static {
        a = !cd.class.desiredAssertionStatus();
    }

    public cd(Provider<lm> provider, Provider<bd.a> provider2, Provider<qg> provider3, Provider<Context> provider4) {
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

    public static MembersInjector<cb> a(Provider<lm> provider, Provider<bd.a> provider2, Provider<qg> provider3, Provider<Context> provider4) {
        return new cd(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(cb cbVar) {
        if (cbVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        cbVar.a = this.b.get();
        cbVar.b = this.c.get();
        cbVar.c = this.d.get();
        cbVar.d = this.e.get();
    }
}
