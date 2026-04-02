package com.amazon.aps.iva.b1;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AutofillCallback.android.kt */
/* loaded from: classes.dex */
public final class e extends AutofillManager.AutofillCallback {
    public static final e a = new e();

    public final void a(a aVar) {
        j.f(aVar, "autofill");
        aVar.c.registerCallback(this);
    }

    public final void b(a aVar) {
        j.f(aVar, "autofill");
        aVar.c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        j.f(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
