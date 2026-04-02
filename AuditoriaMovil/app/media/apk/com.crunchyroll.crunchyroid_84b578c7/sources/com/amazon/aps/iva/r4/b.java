package com.amazon.aps.iva.r4;
/* compiled from: GlanceAppWidget.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.p4.m {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.a == ((b) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return com.amazon.aps.iva.d0.b2.b(new StringBuilder("AppWidgetId(appWidgetId="), this.a, ')');
    }
}
