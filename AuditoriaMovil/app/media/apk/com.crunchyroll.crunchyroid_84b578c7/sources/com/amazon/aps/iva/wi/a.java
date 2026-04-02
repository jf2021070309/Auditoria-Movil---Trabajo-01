package com.amazon.aps.iva.wi;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fj.f;
import com.amazon.aps.iva.fj.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: OctopusSubtitlesComponent.kt */
/* loaded from: classes.dex */
public final class a extends f<C0826a> implements com.amazon.aps.iva.wi.b {
    public final g0 c;
    public final List<d<e.a>> d = f1.J(e0.a(e.a.class));
    public final v0 e = x.e(null);
    public final v0 f = x.e(0L);

    /* compiled from: OctopusSubtitlesComponent.kt */
    /* renamed from: com.amazon.aps.iva.wi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0826a implements g {
    }

    /* compiled from: OctopusSubtitlesComponent.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.octopussubtitlescomponent.OctopusSubtitlesComponent$process$2", f = "OctopusSubtitlesComponent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.pj.a h;
        public final /* synthetic */ a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.pj.a aVar, a aVar2, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.h = aVar;
            this.i = aVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.h, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            com.amazon.aps.iva.pj.a aVar2 = this.h;
            boolean z = aVar2 instanceof e.a.C0622e;
            a aVar3 = this.i;
            if (z) {
                aVar3.e.setValue(null);
            } else if (aVar2 instanceof e.a.f) {
                aVar3.e.setValue(((e.a.f) aVar2).a);
            } else if (aVar2 instanceof e.a.c) {
                aVar3.f.setValue(new Long(((e.a.c) aVar2).a));
            }
            return q.a;
        }
    }

    public a(g0 g0Var) {
        this.c = g0Var;
    }

    @Override // com.amazon.aps.iva.wi.b
    public final v0 a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.wi.b
    public final void b() {
        i().b(j(), e.a.d.a);
    }

    @Override // com.amazon.aps.iva.wi.b
    public final void c(String str) {
        i().b(j(), new e.a.C0621a(str));
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(l<? super C0826a, q> lVar) {
        j.f(lVar, "block");
        lVar.invoke(new C0826a());
    }

    @Override // com.amazon.aps.iva.wi.b
    public final void e() {
        i().b(j(), e.a.b.a);
        this.e.setValue(null);
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<d<e.a>> f() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        com.amazon.aps.iva.se0.i.d(this.c, null, null, new b(aVar, this, null), 3);
        return q.a;
    }

    @Override // com.amazon.aps.iva.wi.b
    public final v0 getUri() {
        return this.e;
    }

    public final String j() {
        return a.class.getSimpleName();
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
    }
}
