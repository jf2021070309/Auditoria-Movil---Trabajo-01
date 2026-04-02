package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/MenuButtonData;", "kotlin.jvm.PlatformType", "menuButton", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/ellation/crunchyroll/ui/toolbarmenu/MenuButtonData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToolbarMenuDialog$onViewCreated$1$1 extends l implements com.amazon.aps.iva.xb0.l<MenuButtonData, q> {
    final /* synthetic */ ToolbarMenuDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialog$onViewCreated$1$1(ToolbarMenuDialog toolbarMenuDialog) {
        super(1);
        this.this$0 = toolbarMenuDialog;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(MenuButtonData menuButtonData) {
        invoke2(menuButtonData);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MenuButtonData menuButtonData) {
        ToolbarMenuDialogPresenter presenter;
        ToolbarMenuDialogButton dialogMenuButton;
        this.this$0.anchor = menuButtonData.getRect();
        presenter = this.this$0.getPresenter();
        presenter.onLayoutUpdate();
        dialogMenuButton = this.this$0.getDialogMenuButton();
        dialogMenuButton.bind(menuButtonData);
    }
}
