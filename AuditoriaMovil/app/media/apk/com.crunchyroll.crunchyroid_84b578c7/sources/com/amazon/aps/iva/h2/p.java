package com.amazon.aps.iva.h2;

import android.content.Context;
import android.os.Build;
/* compiled from: FontFamilyResolver.android.kt */
/* loaded from: classes.dex */
public final class p {
    public static final n a(Context context) {
        int i;
        b bVar = new b(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new n(bVar, new d(i));
    }
}
