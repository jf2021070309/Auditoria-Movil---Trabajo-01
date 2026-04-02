package com.ellation.crunchyroll.cast.overlay;

import com.amazon.aps.iva.cf.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CastOverlayPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/amazon/aps/iva/cf/b;", "kotlin.jvm.PlatformType", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/cf/b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastOverlayPresenterImpl$onCreate$1 extends l implements com.amazon.aps.iva.xb0.l<b, q> {
    final /* synthetic */ CastOverlayPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayPresenterImpl$onCreate$1(CastOverlayPresenterImpl castOverlayPresenterImpl) {
        super(1);
        this.this$0 = castOverlayPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(b bVar) {
        invoke2(bVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(b bVar) {
        InternalCastOverlayView view;
        view = this.this$0.getView();
        view.loadCastPreviewImage(bVar.a.getPostersWide());
    }
}
