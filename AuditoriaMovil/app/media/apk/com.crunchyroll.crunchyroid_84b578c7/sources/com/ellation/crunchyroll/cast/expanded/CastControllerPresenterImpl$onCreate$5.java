package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CastControllerPresenterImpl$onCreate$5 extends i implements l<Boolean, q> {
    public CastControllerPresenterImpl$onCreate$5(Object obj) {
        super(1, obj, CastControllerPresenterImpl.class, "setSkipNextButtonVisibility", "setSkipNextButtonVisibility(Z)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return q.a;
    }

    public final void invoke(boolean z) {
        ((CastControllerPresenterImpl) this.receiver).setSkipNextButtonVisibility(z);
    }
}
