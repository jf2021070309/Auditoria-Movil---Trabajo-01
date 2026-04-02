package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.k50.i;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.wy.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RestoreActivityStackPresenter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter;", "", "isTaskRoot", "Lcom/amazon/aps/iva/kb0/q;", "restoreActivityStack", "Lcom/amazon/aps/iva/k50/i;", "startupFlowRouter", "Lcom/amazon/aps/iva/k50/i;", "view", "<init>", "(Lcom/amazon/aps/iva/wy/h;Lcom/amazon/aps/iva/k50/i;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RestoreActivityStackPresenterImpl extends b<h> implements RestoreActivityStackPresenter {
    private final i startupFlowRouter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestoreActivityStackPresenterImpl(h hVar, i iVar) {
        super(hVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "view");
        com.amazon.aps.iva.yb0.j.f(iVar, "startupFlowRouter");
        this.startupFlowRouter = iVar;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.RestoreActivityStackPresenter
    public void restoreActivityStack(boolean z) {
        if (z) {
            this.startupFlowRouter.a();
        }
    }
}
