package com.vungle.publisher.env;

import android.content.SharedPreferences;
import com.vungle.publisher.pj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class q implements MembersInjector<o> {
    static final /* synthetic */ boolean a;
    private final Provider<pj.a> b;
    private final Provider<SharedPreferences> c;

    static {
        a = !q.class.desiredAssertionStatus();
    }

    public q(Provider<pj.a> provider, Provider<SharedPreferences> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<o> a(Provider<pj.a> provider, Provider<SharedPreferences> provider2) {
        return new q(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(o oVar) {
        if (oVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        oVar.b = this.b.get();
        oVar.c = this.c.get();
    }
}
