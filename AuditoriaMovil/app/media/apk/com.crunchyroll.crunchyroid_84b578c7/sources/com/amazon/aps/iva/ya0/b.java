package com.amazon.aps.iva.ya0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: InflateRequest.kt */
/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final Context b;
    public final AttributeSet c;
    public final View d;
    public final a e;

    public b(String str, Context context, AttributeSet attributeSet, View view, a aVar) {
        j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.g(context, "context");
        j.g(aVar, "fallbackViewCreator");
        this.a = str;
        this.b = context;
        this.c = attributeSet;
        this.d = view;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!j.a(this.a, bVar.a) || !j.a(this.b, bVar.b) || !j.a(this.c, bVar.c) || !j.a(this.d, bVar.d) || !j.a(this.e, bVar.e)) {
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
        int i4;
        int i5 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Context context = this.b;
        if (context != null) {
            i2 = context.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        AttributeSet attributeSet = this.c;
        if (attributeSet != null) {
            i3 = attributeSet.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        View view = this.d;
        if (view != null) {
            i4 = view.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i5 = aVar.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        return "InflateRequest(name=" + this.a + ", context=" + this.b + ", attrs=" + this.c + ", parent=" + this.d + ", fallbackViewCreator=" + this.e + ")";
    }

    public /* synthetic */ b(String str, Context context, AttributeSet attributeSet, a aVar) {
        this(str, context, attributeSet, null, aVar);
    }
}
