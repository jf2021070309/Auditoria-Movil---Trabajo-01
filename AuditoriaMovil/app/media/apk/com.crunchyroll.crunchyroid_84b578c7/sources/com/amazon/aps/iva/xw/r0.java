package com.amazon.aps.iva.xw;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
/* compiled from: TextViewExtensions.kt */
/* loaded from: classes2.dex */
public final class r0 {
    public static final void a(EditText editText) {
        com.amazon.aps.iva.yb0.j.f(editText, "<this>");
        editText.setOnEditorActionListener(new q0());
    }

    public static final void b(TextView textView, SpannableString spannableString) {
        com.amazon.aps.iva.yb0.j.f(textView, "<this>");
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final void c(TextView textView, int i) {
        com.amazon.aps.iva.yb0.j.f(textView, "<this>");
        textView.setTextColor(com.amazon.aps.iva.d3.a.getColor(textView.getContext(), i));
    }

    public static final void d(EditText editText, final int i, final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(editText, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.amazon.aps.iva.xw.p0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                com.amazon.aps.iva.xb0.a aVar2 = aVar;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$callback");
                if (i2 == i) {
                    aVar2.invoke();
                    return true;
                }
                return false;
            }
        });
    }
}
