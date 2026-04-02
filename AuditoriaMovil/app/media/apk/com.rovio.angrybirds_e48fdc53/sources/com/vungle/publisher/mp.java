package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.mj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class mp<W extends mj> implements MembersInjector<mj.b<W>> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<qg> c;

    static {
        a = !mp.class.desiredAssertionStatus();
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(mj.b<W> bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.a = this.b.get();
        bVar.b = this.c.get();
    }

    public static <W extends mj> void a(mj.b<W> bVar, Provider<Context> provider) {
        bVar.a = provider.get();
    }

    public static <W extends mj> void b(mj.b<W> bVar, Provider<qg> provider) {
        bVar.b = provider.get();
    }
}
