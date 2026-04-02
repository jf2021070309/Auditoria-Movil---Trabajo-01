package e.j.d;

import android.view.View;
import com.zipoapps.ads.config.PHAdSize;
import e.j.d.c0.a0;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$loadBannerRx$1", f = "PremiumHelper.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super a0<? extends View>>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8840b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PHAdSize f8841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, PHAdSize pHAdSize, h.m.d<? super q> dVar) {
        super(2, dVar);
        this.f8840b = kVar;
        this.f8841c = pHAdSize;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new q(this.f8840b, this.f8841c, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super a0<? extends View>> dVar) {
        return new q(this.f8840b, this.f8841c, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            k kVar = this.f8840b;
            PHAdSize pHAdSize = this.f8841c;
            this.a = 1;
            obj = kVar.e() ? null : e.j.a.b.e(kVar.f8815l, pHAdSize, new p(kVar), false, this, 4);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        View view = (View) obj;
        return view != null ? new a0.c(view) : new a0.b(new IllegalStateException(""));
    }
}
