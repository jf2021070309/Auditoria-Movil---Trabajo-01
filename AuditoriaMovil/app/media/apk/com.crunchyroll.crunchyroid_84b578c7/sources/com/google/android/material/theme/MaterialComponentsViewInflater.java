package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.k.r;
import com.amazon.aps.iva.q.c;
import com.amazon.aps.iva.q.e;
import com.amazon.aps.iva.q.f;
import com.amazon.aps.iva.q.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends r {
    @Override // com.amazon.aps.iva.k.r
    public c createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // com.amazon.aps.iva.k.r
    public e createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.amazon.aps.iva.k.r
    public f createCheckBox(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // com.amazon.aps.iva.k.r
    public u createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // com.amazon.aps.iva.k.r
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
