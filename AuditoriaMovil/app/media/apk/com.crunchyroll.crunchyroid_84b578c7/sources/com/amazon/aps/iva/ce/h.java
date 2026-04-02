package com.amazon.aps.iva.ce;

import android.widget.EditText;
import com.amazon.aps.iva.yb0.l;
/* compiled from: OtpTextLayout.kt */
/* loaded from: classes.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<EditText, CharSequence> {
    public static final h h = new h();

    public h() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(EditText editText) {
        EditText editText2 = editText;
        com.amazon.aps.iva.yb0.j.f(editText2, "it");
        return editText2.getText().toString();
    }
}
