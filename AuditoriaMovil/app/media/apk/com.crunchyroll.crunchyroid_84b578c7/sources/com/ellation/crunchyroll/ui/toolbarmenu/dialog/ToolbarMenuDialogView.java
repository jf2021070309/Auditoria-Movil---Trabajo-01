package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import com.amazon.aps.iva.wy.h;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogView;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/kb0/q;", "displayContent", "dismiss", "positionDialogForRtl", "positionDialogForLtr", "", "getCanGoBack", "()Z", "canGoBack", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ToolbarMenuDialogView extends h {
    void dismiss();

    void displayContent();

    boolean getCanGoBack();

    void positionDialogForLtr();

    void positionDialogForRtl();
}
