package com.ellation.crunchyroll.cast.overlay;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.ye.c;
import kotlin.Metadata;
/* compiled from: CastOverlayPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/ye/c;", "it", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.overlay.CastOverlayPresenterImpl$onCreate$2", f = "CastOverlayPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastOverlayPresenterImpl$onCreate$2 extends i implements p<c, d<? super q>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CastOverlayPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayPresenterImpl$onCreate$2(CastOverlayPresenterImpl castOverlayPresenterImpl, d<? super CastOverlayPresenterImpl$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = castOverlayPresenterImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        CastOverlayPresenterImpl$onCreate$2 castOverlayPresenterImpl$onCreate$2 = new CastOverlayPresenterImpl$onCreate$2(this.this$0, dVar);
        castOverlayPresenterImpl$onCreate$2.L$0 = obj;
        return castOverlayPresenterImpl$onCreate$2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(c cVar, d<? super q> dVar) {
        return ((CastOverlayPresenterImpl$onCreate$2) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        InternalCastOverlayView view;
        String deviceName;
        InternalCastOverlayView view2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            c cVar = (c) this.L$0;
            if (cVar != c.CONNECTING && cVar != c.CONNECTED) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                view = this.this$0.getView();
                view.hideCastingLayout();
            } else {
                CastOverlayPresenterImpl castOverlayPresenterImpl = this.this$0;
                deviceName = castOverlayPresenterImpl.getDeviceName();
                castOverlayPresenterImpl.updateCastingText(deviceName);
                view2 = this.this$0.getView();
                view2.showCastingLayout();
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
