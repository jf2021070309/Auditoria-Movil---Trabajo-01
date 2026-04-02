package com.vungle.publisher.env;

import android.content.SharedPreferences;
import com.vungle.publisher.qg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class m implements MembersInjector<k> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<SharedPreferences> c;

    static {
        a = !m.class.desiredAssertionStatus();
    }

    public m(Provider<qg> provider, Provider<SharedPreferences> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<k> a(Provider<qg> provider, Provider<SharedPreferences> provider2) {
        return new m(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(k kVar) {
        if (kVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        kVar.eventBus = this.b.get();
        kVar.a = this.c.get();
    }
}
