package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import c.b.c.w;
import c.b.i.d;
import c.b.i.f;
import c.b.i.g;
import c.b.i.r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.d.b.d.j.a;
import e.d.b.d.y.p;
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends w {
    @Override // c.b.c.w
    public d a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    @Override // c.b.c.w
    public f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // c.b.c.w
    public g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // c.b.c.w
    public r d(Context context, AttributeSet attributeSet) {
        return new e.d.b.d.s.a(context, attributeSet);
    }

    @Override // c.b.c.w
    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
