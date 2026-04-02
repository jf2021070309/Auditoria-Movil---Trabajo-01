package com.amazon.aps.iva.lj;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.ve0.j0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayheadRepository.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.zj.c {
    public static final b a = new b();

    /* compiled from: PlayheadRepository.kt */
    @e(c = "com.crunchyroll.player.data.repositories.NoOpPlayheadRepository$savePlayhead$2", f = "PlayheadRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<g<? super q>, d<? super q>, Object> {
        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g<? super q> gVar, d<? super q> dVar) {
            return new a(dVar).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.zj.c
    public final Object b(String str, String str2, long j, d<? super f<q>> dVar) {
        return new j0(new a(null));
    }
}
