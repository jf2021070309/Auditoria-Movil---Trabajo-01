package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amazon.aps.iva.a9.n;
import com.amazon.aps.iva.a9.u;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class TextScale extends n {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(u uVar) {
        View view = uVar.b;
        if (view instanceof TextView) {
            uVar.a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public void captureEndValues(u uVar) {
        captureValues(uVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public void captureStartValues(u uVar) {
        captureValues(uVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public Animator createAnimator(ViewGroup viewGroup, u uVar, u uVar2) {
        float f;
        if (uVar == null || uVar2 == null || !(uVar.b instanceof TextView)) {
            return null;
        }
        View view = uVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap hashMap = uVar.a;
        float f2 = 1.0f;
        if (hashMap.get(PROPNAME_SCALE) != null) {
            f = ((Float) hashMap.get(PROPNAME_SCALE)).floatValue();
        } else {
            f = 1.0f;
        }
        HashMap hashMap2 = uVar2.a;
        if (hashMap2.get(PROPNAME_SCALE) != null) {
            f2 = ((Float) hashMap2.get(PROPNAME_SCALE)).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
