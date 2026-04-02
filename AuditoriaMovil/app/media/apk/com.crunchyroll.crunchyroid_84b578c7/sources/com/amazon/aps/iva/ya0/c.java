package com.amazon.aps.iva.ya0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: InflateResult.kt */
/* loaded from: classes4.dex */
public final class c {
    public final View a;
    public final String b;
    public final Context c;
    public final AttributeSet d;

    public c(View view, String str, Context context, AttributeSet attributeSet) {
        j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.g(context, "context");
        this.a = view;
        this.b = str;
        this.c = context;
        this.d = attributeSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!j.a(this.a, cVar.a) || !j.a(this.b, cVar.b) || !j.a(this.c, cVar.c) || !j.a(this.d, cVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        View view = this.a;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Context context = this.c;
        if (context != null) {
            i3 = context.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        AttributeSet attributeSet = this.d;
        if (attributeSet != null) {
            i4 = attributeSet.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "InflateResult(view=" + this.a + ", name=" + this.b + ", context=" + this.c + ", attrs=" + this.d + ")";
    }
}
