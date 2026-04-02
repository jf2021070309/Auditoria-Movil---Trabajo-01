package e.j.d;

import e.j.d.b0.a.a;
import i.a.e0;
import java.util.Objects;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$onHappyMoment$1", f = "PremiumHelper.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8842b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f8843c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.b.c.l f8844d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8845e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i2, k kVar, c.b.c.l lVar, int i3, h.o.b.a<h.k> aVar, h.m.d<? super r> dVar) {
        super(2, dVar);
        this.f8842b = i2;
        this.f8843c = kVar;
        this.f8844d = lVar;
        this.f8845e = i3;
        this.f8846f = aVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new r(this.f8842b, this.f8843c, this.f8844d, this.f8845e, this.f8846f, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new r(this.f8842b, this.f8843c, this.f8844d, this.f8845e, this.f8846f, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            this.a = 1;
            if (w.z(this.f8842b, this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        e.j.d.b0.a.a aVar2 = this.f8843c.o;
        c.b.c.l lVar = this.f8844d;
        int i3 = this.f8845e;
        h.o.b.a<h.k> aVar3 = this.f8846f;
        Objects.requireNonNull(aVar2);
        h.o.c.j.e(lVar, "activity");
        a.EnumC0186a enumC0186a = (a.EnumC0186a) aVar2.f8541b.e(e.j.d.y.b.p);
        int ordinal = enumC0186a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aVar2.a().a(new e.j.d.b0.a.c(enumC0186a, aVar2, lVar, i3, aVar3), new e.j.d.b0.a.d(lVar, aVar3));
            } else if (ordinal == 2) {
                aVar2.a().a(new e.j.d.b0.a.e(enumC0186a, aVar2, lVar, aVar3), new e.j.d.b0.a.f(aVar3));
            } else if (ordinal == 3) {
                aVar2.a().a(new e.j.d.b0.a.g(enumC0186a, aVar2, lVar, i3, aVar3), new e.j.d.b0.a.h(aVar3));
            } else if (ordinal == 4) {
                aVar2.a().a(new e.j.d.b0.a.j(enumC0186a, aVar2, lVar, aVar3), new e.j.d.b0.a.k(lVar, aVar3));
            } else if (ordinal == 5) {
                aVar2.a().a(new e.j.d.b0.a.n(enumC0186a, aVar2, lVar, i3, aVar3), new e.j.d.b0.a.b(lVar, aVar3));
            }
        } else if (aVar3 != null) {
            aVar3.invoke();
        }
        return h.k.a;
    }
}
