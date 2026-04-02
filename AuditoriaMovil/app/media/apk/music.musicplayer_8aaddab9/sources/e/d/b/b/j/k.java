package e.d.b.b.j;

import android.content.Context;
import e.d.b.b.j.c0.h.y;
import e.d.b.b.j.c0.i.c0;
import e.d.b.b.j.c0.i.d0;
import e.d.b.b.j.c0.i.e0;
import e.d.b.b.j.c0.i.f0;
import e.d.b.b.j.c0.i.h0;
import e.d.b.b.j.c0.i.i0;
import e.d.b.b.j.c0.i.k0;
import e.d.b.b.j.e0.b;
import e.d.b.b.j.e0.c;
import e.d.b.b.j.o;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k extends w {
    public g.a.a<Executor> a;

    /* renamed from: b  reason: collision with root package name */
    public g.a.a<Context> f6268b;

    /* renamed from: c  reason: collision with root package name */
    public g.a.a f6269c;

    /* renamed from: d  reason: collision with root package name */
    public g.a.a f6270d;

    /* renamed from: e  reason: collision with root package name */
    public g.a.a f6271e;

    /* renamed from: f  reason: collision with root package name */
    public g.a.a<String> f6272f;

    /* renamed from: g  reason: collision with root package name */
    public g.a.a<h0> f6273g;

    /* renamed from: h  reason: collision with root package name */
    public g.a.a<e.d.b.b.j.c0.h.t> f6274h;

    /* renamed from: i  reason: collision with root package name */
    public g.a.a<y> f6275i;

    /* renamed from: j  reason: collision with root package name */
    public g.a.a<e.d.b.b.j.c0.c> f6276j;

    /* renamed from: k  reason: collision with root package name */
    public g.a.a<e.d.b.b.j.c0.h.u> f6277k;

    /* renamed from: l  reason: collision with root package name */
    public g.a.a<e.d.b.b.j.c0.h.w> f6278l;

    /* renamed from: m  reason: collision with root package name */
    public g.a.a<v> f6279m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [e.d.b.b.j.z.b.a] */
    public k(Context context, a aVar) {
        g.a.a aVar2 = o.a.a;
        Object obj = e.d.b.b.j.z.b.a.a;
        this.a = aVar2 instanceof e.d.b.b.j.z.b.a ? aVar2 : new e.d.b.b.j.z.b.a(aVar2);
        Objects.requireNonNull(context, "instance cannot be null");
        e.d.b.b.j.z.b.b bVar = new e.d.b.b.j.z.b.b(context);
        this.f6268b = bVar;
        e.d.b.b.j.e0.b bVar2 = b.a.a;
        e.d.b.b.j.e0.c cVar = c.a.a;
        e.d.b.b.j.y.j jVar = new e.d.b.b.j.y.j(bVar, bVar2, cVar);
        this.f6269c = jVar;
        g.a.a lVar = new e.d.b.b.j.y.l(bVar, jVar);
        this.f6270d = lVar instanceof e.d.b.b.j.z.b.a ? lVar : new e.d.b.b.j.z.b.a(lVar);
        g.a.a<Context> aVar3 = this.f6268b;
        k0 k0Var = new k0(aVar3, c0.a.a, e0.a.a);
        this.f6271e = k0Var;
        d0 d0Var = new d0(aVar3);
        this.f6272f = d0Var;
        i0 i0Var = new i0(bVar2, cVar, f0.a.a, k0Var, d0Var);
        i0Var = i0Var instanceof e.d.b.b.j.z.b.a ? i0Var : new e.d.b.b.j.z.b.a(i0Var);
        this.f6273g = i0Var;
        e.d.b.b.j.c0.f fVar = new e.d.b.b.j.c0.f(bVar2);
        this.f6274h = fVar;
        g.a.a<Context> aVar4 = this.f6268b;
        e.d.b.b.j.c0.g gVar = new e.d.b.b.j.c0.g(aVar4, i0Var, fVar, cVar);
        this.f6275i = gVar;
        g.a.a<Executor> aVar5 = this.a;
        g.a.a aVar6 = this.f6270d;
        e.d.b.b.j.c0.d dVar = new e.d.b.b.j.c0.d(aVar5, aVar6, gVar, i0Var, i0Var);
        this.f6276j = dVar;
        e.d.b.b.j.c0.h.v vVar = new e.d.b.b.j.c0.h.v(aVar4, aVar6, i0Var, gVar, aVar5, i0Var, bVar2, cVar, i0Var);
        this.f6277k = vVar;
        e.d.b.b.j.c0.h.x xVar = new e.d.b.b.j.c0.h.x(aVar5, i0Var, gVar, i0Var);
        this.f6278l = xVar;
        g.a.a xVar2 = new x(bVar2, cVar, dVar, vVar, xVar);
        this.f6279m = xVar2 instanceof e.d.b.b.j.z.b.a ? xVar2 : new e.d.b.b.j.z.b.a(xVar2);
    }
}
