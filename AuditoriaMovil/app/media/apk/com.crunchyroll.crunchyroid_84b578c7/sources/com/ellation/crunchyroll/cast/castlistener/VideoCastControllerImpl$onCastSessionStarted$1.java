package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: VideoCastControllerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/amazon/aps/iva/af/a;", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/af/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VideoCastControllerImpl$onCastSessionStarted$1 extends l implements com.amazon.aps.iva.xb0.l<a, q> {
    public static final VideoCastControllerImpl$onCastSessionStarted$1 INSTANCE = new VideoCastControllerImpl$onCastSessionStarted$1();

    public VideoCastControllerImpl$onCastSessionStarted$1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(a aVar) {
        invoke2(aVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        j.f(aVar, "$this$notify");
        aVar.onCastSessionStarted();
    }
}
