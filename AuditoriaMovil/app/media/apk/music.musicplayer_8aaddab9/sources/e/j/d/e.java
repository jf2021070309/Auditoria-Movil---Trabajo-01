package e.j.d;

import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.Analytics$onOnboarding$1", f = "Analytics.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, h.m.d<? super e> dVar) {
        super(2, dVar);
        this.f8795b = bVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new e(this.f8795b, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new e(this.f8795b, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            this.a = 1;
            if (w.z(1000L, this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        TotoFeature.ResponseStats getConfigResponseStats = k.a.a().q.getGetConfigResponseStats();
        b bVar = this.f8795b;
        Bundle[] bundleArr = new Bundle[1];
        h.f[] fVarArr = new h.f[4];
        fVarArr[0] = new h.f(AppLovinEventParameters.PRODUCT_IDENTIFIER, bVar.f8525c.f(e.j.d.y.b.f8869c));
        fVarArr[1] = new h.f("timeout", String.valueOf(this.f8795b.f8528f));
        fVarArr[2] = new h.f("toto_response_code", (getConfigResponseStats == null || (r6 = getConfigResponseStats.getCode()) == null) ? "not available" : "not available");
        fVarArr[3] = new h.f("toto_latency", getConfigResponseStats != null ? new Long(getConfigResponseStats.getLatency()) : "not available");
        bundleArr[0] = c.i.a.e(fVarArr);
        bVar.o("Onboarding", bundleArr);
        return h.k.a;
    }
}
