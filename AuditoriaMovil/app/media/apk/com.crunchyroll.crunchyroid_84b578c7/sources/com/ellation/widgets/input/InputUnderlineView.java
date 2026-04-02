package com.ellation.widgets.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.i70.g;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: InputUnderlineView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"Lcom/ellation/widgets/input/InputUnderlineView;", "Landroid/view/View;", "Landroid/content/res/TypedArray;", "Lcom/amazon/aps/iva/kb0/q;", "setBackground", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class InputUnderlineView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputUnderlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        setDuplicateParentStateEnabled(true);
        a(attributeSet);
    }

    private final void setBackground(TypedArray typedArray) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int color = typedArray.getColor(R.styleable.InputUnderlineView_errorColor, 0);
        if (color != 0) {
            stateListDrawable.addState(g.STATE_ERROR.getAttributes(), new ColorDrawable(color));
        }
        int color2 = typedArray.getColor(R.styleable.InputUnderlineView_focusedColor, 0);
        if (color2 != 0) {
            stateListDrawable.addState(g.STATE_FOCUSED.getAttributes(), new ColorDrawable(color2));
        }
        int color3 = typedArray.getColor(R.styleable.InputUnderlineView_defaultColor, 0);
        if (color3 != 0) {
            stateListDrawable.addState(new int[0], new ColorDrawable(color3));
        }
        setBackground(stateListDrawable);
    }

    public final void a(AttributeSet attributeSet) {
        Context context = getContext();
        j.e(context, "context");
        int[] iArr = R.styleable.InputUnderlineView;
        j.e(iArr, "InputUnderlineView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setBackground(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
