package com.vungle.publisher;

import android.content.SharedPreferences;
import com.vungle.publisher.mj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class mo implements MembersInjector<mj.a> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<com.vungle.publisher.env.i> c;
    private final Provider<SharedPreferences> d;
    private final Provider<bz> e;

    static {
        a = !mo.class.desiredAssertionStatus();
    }

    public mo(Provider<qg> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<SharedPreferences> provider3, Provider<bz> provider4) {
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

    public static MembersInjector<mj.a> a(Provider<qg> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<SharedPreferences> provider3, Provider<bz> provider4) {
        return new mo(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(mj.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
        aVar.c = this.d.get();
        aVar.d = this.e.get();
    }
}
