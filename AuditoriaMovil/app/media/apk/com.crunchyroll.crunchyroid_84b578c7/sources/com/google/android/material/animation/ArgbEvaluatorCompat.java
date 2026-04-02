package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import com.amazon.aps.iva.e4.t0;
/* loaded from: classes3.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float a = t0.a(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float a2 = t0.a(pow4, pow, f, pow);
        float a3 = t0.a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float a4 = t0.a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(a2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a * 255.0f) << 24) | (Math.round(((float) Math.pow(a3, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
