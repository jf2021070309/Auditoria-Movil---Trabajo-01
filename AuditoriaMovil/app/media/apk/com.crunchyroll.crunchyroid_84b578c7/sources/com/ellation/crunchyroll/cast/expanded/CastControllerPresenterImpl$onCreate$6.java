package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isProcessing", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.expanded.CastControllerPresenterImpl$onCreate$6", f = "CastControllerPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastControllerPresenterImpl$onCreate$6 extends i implements p<Boolean, d<? super q>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CastControllerPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerPresenterImpl$onCreate$6(CastControllerPresenterImpl castControllerPresenterImpl, d<? super CastControllerPresenterImpl$onCreate$6> dVar) {
        super(2, dVar);
        this.this$0 = castControllerPresenterImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        CastControllerPresenterImpl$onCreate$6 castControllerPresenterImpl$onCreate$6 = new CastControllerPresenterImpl$onCreate$6(this.this$0, dVar);
        castControllerPresenterImpl$onCreate$6.Z$0 = ((Boolean) obj).booleanValue();
        return castControllerPresenterImpl$onCreate$6;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super q> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        CastControllerView view;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            if (this.Z$0) {
                view = this.this$0.getView();
                view.showLoadingOverlay();
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z, d<? super q> dVar) {
        return ((CastControllerPresenterImpl$onCreate$6) create(Boolean.valueOf(z), dVar)).invokeSuspend(q.a);
    }
}
