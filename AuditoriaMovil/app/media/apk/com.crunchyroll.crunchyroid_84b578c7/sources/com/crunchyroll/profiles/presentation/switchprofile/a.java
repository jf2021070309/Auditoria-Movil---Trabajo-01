package com.crunchyroll.profiles.presentation.switchprofile;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ui.c;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WhoIsWatchingActivity.kt */
@e(c = "com.crunchyroll.profiles.presentation.switchprofile.WhoIsWatchingActivity$onCreate$1$1$1", f = "WhoIsWatchingActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<g0, d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ m0 i;
    public final /* synthetic */ WhoIsWatchingActivity j;

    /* compiled from: WhoIsWatchingActivity.kt */
    /* renamed from: com.crunchyroll.profiles.presentation.switchprofile.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0957a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ WhoIsWatchingActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0957a(WhoIsWatchingActivity whoIsWatchingActivity) {
            super(0);
            this.h = whoIsWatchingActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.finish();
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m0 m0Var, WhoIsWatchingActivity whoIsWatchingActivity, d<? super a> dVar) {
        super(2, dVar);
        this.i = m0Var;
        this.j = whoIsWatchingActivity;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        a aVar = new a(this.i, this.j, dVar);
        aVar.h = obj;
        return aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = WhoIsWatchingActivity.c;
        WhoIsWatchingActivity whoIsWatchingActivity = this.j;
        whoIsWatchingActivity.getClass();
        com.amazon.aps.iva.fc0.l<?> lVar = WhoIsWatchingActivity.c[0];
        C0957a c0957a = new C0957a(whoIsWatchingActivity);
        new com.amazon.aps.iva.nm.i(this.i, (c) whoIsWatchingActivity.b.getValue(whoIsWatchingActivity, lVar), c0957a).a((g0) this.h);
        return q.a;
    }
}
