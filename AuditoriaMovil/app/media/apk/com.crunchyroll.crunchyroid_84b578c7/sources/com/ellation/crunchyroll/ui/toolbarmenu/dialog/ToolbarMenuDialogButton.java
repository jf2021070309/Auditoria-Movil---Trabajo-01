package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.amazon.aps.iva.q.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialogButton.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogButton;", "Lcom/amazon/aps/iva/q/q;", "Landroid/graphics/Rect;", "rect", "Lcom/amazon/aps/iva/kb0/q;", "moveOver", "Lcom/ellation/crunchyroll/ui/toolbarmenu/MenuButtonData;", "menuButtonData", "bind", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToolbarMenuDialogButton extends q {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialogButton(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final void moveOver(Rect rect) {
        int i;
        setX(rect.left);
        float f = rect.top;
        Activity a = com.amazon.aps.iva.xw.q.a(getContext());
        if (a != null) {
            Rect rect2 = new Rect();
            a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            i = rect2.top;
        } else {
            i = 0;
        }
        setY(f - i);
        requestLayout();
    }

    public final void bind(MenuButtonData menuButtonData) {
        j.f(menuButtonData, "menuButtonData");
        t0.k(this, Integer.valueOf(menuButtonData.getRect().width()), Integer.valueOf(menuButtonData.getRect().height()));
        setImageResource(menuButtonData.getDrawableRes());
        moveOver(menuButtonData.getRect());
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialogButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ ToolbarMenuDialogButton(Context context, AttributeSet attributeSet, int i, int i2, e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
    }
}
