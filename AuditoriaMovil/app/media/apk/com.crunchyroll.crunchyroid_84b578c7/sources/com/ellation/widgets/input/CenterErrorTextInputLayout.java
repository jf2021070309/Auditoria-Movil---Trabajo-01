package com.ellation.widgets.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.yb0.j;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
/* compiled from: CenterErrorTextInputLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ellation/widgets/input/CenterErrorTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "enabled", "Lcom/amazon/aps/iva/kb0/q;", "setErrorEnabled", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CenterErrorTextInputLayout extends TextInputLayout {
    public CenterErrorTextInputLayout() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterErrorTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setErrorEnabled(boolean z) {
        super.setErrorEnabled(z);
        TextView textView = (TextView) findViewById(R.id.textinput_error);
        if (textView != null) {
            ViewParent parent = textView.getParent();
            j.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            textView.setGravity(17);
            ((FrameLayout) parent).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
    }
}
