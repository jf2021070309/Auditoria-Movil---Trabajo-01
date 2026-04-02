package e.j.d.c0;

import com.android.billingclient.api.Purchase;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$handlePurchaseUpdate$2$activePurchases$1$1", f = "Billing.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends h.m.i.a.h implements h.o.b.l<h.m.d<? super e.a.a.a.j>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f8734b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.a.a.a.c f8735c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Purchase f8736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, e.a.a.a.c cVar, Purchase purchase, h.m.d<? super k> dVar) {
        super(1, dVar);
        this.f8734b = iVar;
        this.f8735c = cVar;
        this.f8736d = purchase;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(h.m.d<?> dVar) {
        return new k(this.f8734b, this.f8735c, this.f8736d, dVar);
    }

    @Override // h.o.b.l
    public Object invoke(h.m.d<? super e.a.a.a.j> dVar) {
        return new k(this.f8734b, this.f8735c, this.f8736d, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            e.j.d.w.E0(obj);
            i iVar = this.f8734b;
            e.a.a.a.c cVar = this.f8735c;
            String a = this.f8736d.a();
            h.o.c.j.d(a, "it.purchaseToken");
            this.a = 1;
            h.r.f<Object>[] fVarArr = i.a;
            obj = iVar.i(cVar, a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e.j.d.w.E0(obj);
        }
        return obj;
    }
}
