package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CastControllerPresenterImpl$onCreate$2 extends i implements l<String, q> {
    public CastControllerPresenterImpl$onCreate$2(Object obj) {
        super(1, obj, CastControllerView.class, "loadImage", "loadImage(Ljava/lang/String;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(String str) {
        invoke2(str);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        j.f(str, "p0");
        ((CastControllerView) this.receiver).loadImage(str);
    }
}
