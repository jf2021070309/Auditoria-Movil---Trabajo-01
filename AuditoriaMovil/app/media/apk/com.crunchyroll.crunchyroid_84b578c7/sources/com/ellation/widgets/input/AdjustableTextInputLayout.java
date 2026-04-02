package com.ellation.widgets.input;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.amazon.aps.iva.h70.b;
import com.amazon.aps.iva.q.i1;
import com.amazon.aps.iva.q.j1;
import com.amazon.aps.iva.yb0.j;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
/* compiled from: AdjustableTextInputLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/widgets/input/AdjustableTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/amazon/aps/iva/h70/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AdjustableTextInputLayout extends TextInputLayout implements b {
    public static final /* synthetic */ int d = 0;
    public final com.amazon.aps.iva.h70.a b;
    public EditText c;

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean z;
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                AdjustableTextInputLayout adjustableTextInputLayout = (AdjustableTextInputLayout) view;
                EditText editText = adjustableTextInputLayout.c;
                if (editText != null) {
                    boolean hasFocus = editText.hasFocus();
                    EditText editText2 = adjustableTextInputLayout.c;
                    if (editText2 != null) {
                        Editable text = editText2.getText();
                        if (text != null && text.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean z2 = !z;
                        com.amazon.aps.iva.h70.a aVar = adjustableTextInputLayout.b;
                        aVar.getClass();
                        if (!hasFocus && !z2) {
                            aVar.getView().fa();
                        } else {
                            aVar.getView().J8();
                        }
                    } else {
                        j.m("inputEditText");
                        throw null;
                    }
                } else {
                    j.m("inputEditText");
                    throw null;
                }
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdjustableTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.h70.b
    public final void J8() {
        post(new i1(this, 6));
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        j.f(view, "child");
        j.f(layoutParams, "params");
        if (view instanceof EditText) {
            this.c = (EditText) view;
        }
        super.addView(view, i, layoutParams);
    }

    public final int b1(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        EditText editText = this.c;
        if (editText != null) {
            boolean hasFocus = editText.hasFocus();
            EditText editText2 = this.c;
            if (editText2 != null) {
                Editable text = editText2.getText();
                if (text != null && text.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = !z;
                com.amazon.aps.iva.h70.a aVar = this.b;
                aVar.getClass();
                if (!hasFocus && !z2) {
                    aVar.getView().fa();
                    return;
                } else {
                    aVar.getView().J8();
                    return;
                }
            }
            j.m("inputEditText");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.h70.b
    public final void fa() {
        post(new j1(this, 9));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new a(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustableTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new com.amazon.aps.iva.h70.a(this);
    }
}
