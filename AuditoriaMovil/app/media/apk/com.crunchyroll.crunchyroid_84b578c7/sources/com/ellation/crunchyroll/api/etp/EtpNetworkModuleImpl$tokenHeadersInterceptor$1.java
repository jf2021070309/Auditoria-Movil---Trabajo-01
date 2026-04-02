package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.application.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/ellation/crunchyroll/api/AccountPendingRestrictions;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$tokenHeadersInterceptor$1 extends l implements com.amazon.aps.iva.xb0.l<List<? extends AccountPendingRestrictions>, q> {
    public static final EtpNetworkModuleImpl$tokenHeadersInterceptor$1 INSTANCE = new EtpNetworkModuleImpl$tokenHeadersInterceptor$1();

    public EtpNetworkModuleImpl$tokenHeadersInterceptor$1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(List<? extends AccountPendingRestrictions> list) {
        invoke2(list);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends AccountPendingRestrictions> list) {
        j.f(list, "it");
        ((d0) e.a()).e.i().a(list);
        ((d0) e.a()).f.i().a(list);
    }
}
