package e.j.d.c0;

import android.app.Application;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.UUID;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$launchDebugBillingFlow$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
    public final /* synthetic */ i a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.j.d.h f8748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, e.j.d.h hVar, h.m.d<? super o> dVar) {
        super(2, dVar);
        this.a = iVar;
        this.f8748b = hVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new o(this.a, this.f8748b, dVar);
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
        o oVar = new o(this.a, this.f8748b, dVar);
        h.k kVar = h.k.a;
        oVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        e.j.d.w.E0(obj);
        i iVar = this.a;
        e.a.a.a.j jVar = new e.a.a.a.j();
        jVar.a = 0;
        h.o.c.j.d(jVar, "newBuilder().setResponse…gResponseCode.OK).build()");
        Application application = this.a.f8646b;
        String str = this.f8748b.a;
        h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        iVar.a(jVar, h.l.c.e(new Purchase("{\n\"orderId\":\"DEBUG.OFFER." + UUID.randomUUID() + "\",\n\"packageName\":\"" + ((Object) application.getPackageName()) + "\",\n\"productId\":\"" + str + "\",\n\"purchaseTime\":" + System.currentTimeMillis() + ",\n\"purchaseState\":0,\n\"purchaseToken\":\"debugtoken." + UUID.randomUUID() + "\",\n\"obfuscatedAccountId\":\"debugaccount." + UUID.randomUUID() + "\",\n\"acknowledged\":true,\n\"autoRenewing\":true\n}", UUID.randomUUID().toString())));
        return h.k.a;
    }
}
