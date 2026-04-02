package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.i;
import kotlin.Metadata;
/* compiled from: VideoCastControllerImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class VideoCastControllerImpl$castSessionListener$3 extends i implements a<q> {
    public VideoCastControllerImpl$castSessionListener$3(Object obj) {
        super(0, obj, VideoCastControllerImpl.class, "stopCasting", "stopCasting()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public /* bridge */ /* synthetic */ q invoke() {
        invoke2();
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VideoCastControllerImpl) this.receiver).stopCasting();
    }
}
