package com.amazon.aps.iva.v1;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                Class<?> cls = AndroidComposeView.O0;
                com.amazon.aps.iva.yb0.j.f(androidComposeView, "this$0");
                androidComposeView.J();
                return;
            default:
                ToolbarMenuDialog.ci((ToolbarMenuDialog) obj);
                return;
        }
    }
}
