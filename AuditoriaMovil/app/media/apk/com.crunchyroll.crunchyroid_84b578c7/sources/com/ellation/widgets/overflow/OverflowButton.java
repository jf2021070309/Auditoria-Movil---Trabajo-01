package com.ellation.widgets.overflow;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.view.menu.i;
import com.amazon.aps.iva.a70.h;
import com.amazon.aps.iva.fe.a;
import com.amazon.aps.iva.n70.b;
import com.amazon.aps.iva.n70.e;
import com.amazon.aps.iva.n70.f;
import com.amazon.aps.iva.q.o;
import com.amazon.aps.iva.q.t0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OverflowButton.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ellation/widgets/overflow/OverflowButton;", "Lcom/amazon/aps/iva/q/o;", "Lcom/amazon/aps/iva/n70/f;", "", "popupMenuTheme", "Lcom/amazon/aps/iva/kb0/q;", "setPopupMenuTheme", "position", "setSelectedOptionPosition", "color", "setSelectedMenuItemTextColor", "setDefaultMenuItemTextColor", "Landroid/content/Context;", "context", "setRippleEffect", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OverflowButton extends o implements f {
    public static final /* synthetic */ int h = 0;
    public final e b;
    public t0 c;
    public Integer d;
    public int e;
    public int f;
    public int g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverflowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    public static /* synthetic */ void b1(OverflowButton overflowButton, List list) {
        overflowButton.G(list, null, null, null, null);
    }

    public final void G(List<b> list, Integer num, Integer num2, Integer num3, Integer num4) {
        j.f(list, "menu");
        setOnClickListener(new a(this, 21));
        e eVar = this.b;
        eVar.getClass();
        eVar.b = list;
        if (list.isEmpty()) {
            eVar.getView().p1();
        }
        if (num != null) {
            eVar.getView().setPopupMenuTheme(num.intValue());
        }
        if (num2 != null) {
            eVar.getView().setSelectedOptionPosition(num2.intValue());
        }
        if (num3 != null) {
            eVar.getView().setSelectedMenuItemTextColor(num3.intValue());
        }
        if (num4 != null) {
            eVar.getView().setDefaultMenuItemTextColor(num4.intValue());
        }
    }

    @Override // com.amazon.aps.iva.n70.f
    public final void Sd(ArrayList arrayList) {
        Context context = getContext();
        Integer num = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        j.e(context, "context");
        this.c = new h(context, arrayList, i, num, i2, i3, new com.amazon.aps.iva.n70.a(this)).G(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.onConfigurationChanged(configuration);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t0 t0Var = this.c;
        if (t0Var != null) {
            i iVar = t0Var.b;
            if (iVar.b()) {
                iVar.j.dismiss();
            }
        }
    }

    @Override // com.amazon.aps.iva.n70.f
    public final void p1() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.n70.f
    public void setDefaultMenuItemTextColor(int i) {
        this.f = i;
    }

    @Override // com.amazon.aps.iva.n70.f
    public void setPopupMenuTheme(int i) {
        this.d = Integer.valueOf(i);
    }

    public void setRippleEffect(Context context) {
        j.f(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    @Override // com.amazon.aps.iva.n70.f
    public void setSelectedMenuItemTextColor(int i) {
        this.g = i;
    }

    @Override // com.amazon.aps.iva.n70.f
    public void setSelectedOptionPosition(int i) {
        this.e = i;
    }

    public /* synthetic */ OverflowButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new e(this);
        this.e = -1;
        this.f = R.color.action_menu_default_text_color;
        this.g = R.color.action_menu_selected_text_color;
    }
}
