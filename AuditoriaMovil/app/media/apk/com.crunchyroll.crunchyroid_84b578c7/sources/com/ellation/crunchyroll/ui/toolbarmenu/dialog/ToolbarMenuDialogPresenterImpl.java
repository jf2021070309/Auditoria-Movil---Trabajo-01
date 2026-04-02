package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import android.os.Bundle;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.a;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarMenuDialogPresenter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogView;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "onLayoutUpdate", "onCancel", "Lkotlin/Function0;", "", "isRtl", "Lcom/amazon/aps/iva/xb0/a;", "isTablet", "view", "<init>", "(Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogView;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToolbarMenuDialogPresenterImpl extends b<ToolbarMenuDialogView> implements ToolbarMenuDialogPresenter {
    private final a<Boolean> isRtl;
    private final a<Boolean> isTablet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialogPresenterImpl(ToolbarMenuDialogView toolbarMenuDialogView, a<Boolean> aVar, a<Boolean> aVar2) {
        super(toolbarMenuDialogView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(toolbarMenuDialogView, "view");
        com.amazon.aps.iva.yb0.j.f(aVar, "isRtl");
        com.amazon.aps.iva.yb0.j.f(aVar2, "isTablet");
        this.isRtl = aVar;
        this.isTablet = aVar2;
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogPresenter
    public void onCancel() {
        if (getView().getCanGoBack()) {
            getView().dismiss();
        }
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogPresenter
    public void onCreate(Bundle bundle) {
        if (bundle == null) {
            getView().displayContent();
        }
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogPresenter
    public void onLayoutUpdate() {
        if (!this.isTablet.invoke().booleanValue()) {
            return;
        }
        if (this.isRtl.invoke().booleanValue()) {
            getView().positionDialogForRtl();
        } else {
            getView().positionDialogForLtr();
        }
    }
}
