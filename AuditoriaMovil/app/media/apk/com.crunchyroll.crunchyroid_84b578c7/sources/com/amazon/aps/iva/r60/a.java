package com.amazon.aps.iva.r60;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.amazon.aps.iva.l8.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: TranslatablePreferenceExtensions.kt */
/* loaded from: classes2.dex */
public final class a {
    @SuppressLint({"PrivateResource", "RestrictedApi"})
    public static final void a(Preference preference, AttributeSet attributeSet) {
        j.f(preference, "<this>");
        int[] iArr = h.g;
        Context context = preference.b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        j.e(obtainStyledAttributes, "context.obtainStyledAttr…e.R.styleable.Preference)");
        int resourceId = obtainStyledAttributes.getResourceId(34, obtainStyledAttributes.getResourceId(4, 0));
        int resourceId2 = obtainStyledAttributes.getResourceId(33, obtainStyledAttributes.getResourceId(7, 0));
        if (resourceId != 0) {
            String string = context.getString(resourceId);
            if (!TextUtils.equals(string, preference.i)) {
                preference.i = string;
                preference.j();
            }
        }
        if (resourceId2 != 0) {
            preference.x(context.getString(resourceId2));
        }
    }
}
