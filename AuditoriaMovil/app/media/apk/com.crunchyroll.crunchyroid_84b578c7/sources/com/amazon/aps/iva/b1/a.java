package com.amazon.aps.iva.b1;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class a implements b {
    public final View a;
    public final g b;
    public final AutofillManager c;

    public a(View view, g gVar) {
        j.f(view, "view");
        j.f(gVar, "autofillTree");
        this.a = view;
        this.b = gVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
