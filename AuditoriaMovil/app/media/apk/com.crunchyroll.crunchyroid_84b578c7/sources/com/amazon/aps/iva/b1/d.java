package com.amazon.aps.iva.b1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final AutofillId a(ViewStructure viewStructure) {
        j.f(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        j.f(viewStructure, "structure");
        j.f(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        j.f(viewStructure, "structure");
        j.f(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void h(ViewStructure viewStructure, int i) {
        j.f(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        j.e(textValue, "value.textValue");
        return textValue;
    }
}
