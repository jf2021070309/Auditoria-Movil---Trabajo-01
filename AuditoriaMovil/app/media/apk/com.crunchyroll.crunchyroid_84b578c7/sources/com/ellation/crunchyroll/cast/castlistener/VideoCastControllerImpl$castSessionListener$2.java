package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import kotlin.Metadata;
/* compiled from: VideoCastControllerImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class VideoCastControllerImpl$castSessionListener$2 extends i implements l<b, q> {
    public VideoCastControllerImpl$castSessionListener$2(Object obj) {
        super(1, obj, VideoCastControllerImpl.class, "onCastSessionStarted", "onCastSessionStarted(Lcom/crunchyroll/cast/CastSessionWrapper;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(b bVar) {
        invoke2(bVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(b bVar) {
        j.f(bVar, "p0");
        ((VideoCastControllerImpl) this.receiver).onCastSessionStarted(bVar);
    }
}
