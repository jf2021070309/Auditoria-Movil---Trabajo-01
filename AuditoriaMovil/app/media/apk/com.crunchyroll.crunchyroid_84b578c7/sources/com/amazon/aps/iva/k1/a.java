package com.amazon.aps.iva.k1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f3.c;
import com.amazon.aps.iva.f3.j;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes.dex */
public final class a {
    public final XmlPullParser a;
    public int b = 0;

    public a(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final c a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        c c = j.c(typedArray, this.a, theme, str, i);
        f(typedArray.getChangingConfigurations());
        return c;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        float d = j.d(typedArray, this.a, str, i, f);
        f(typedArray.getChangingConfigurations());
        return d;
    }

    public final int c(TypedArray typedArray, String str, int i, int i2) {
        int e = j.e(typedArray, this.a, str, i, i2);
        f(typedArray.getChangingConfigurations());
        return e;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        f(typedArray.getChangingConfigurations());
        return string;
    }

    public final TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray i = j.i(resources, theme, attributeSet, iArr);
        com.amazon.aps.iva.yb0.j.e(i, "obtainAttributes(\n      …          attrs\n        )");
        f(i.getChangingConfigurations());
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        this.b = i | this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return b2.b(sb, this.b, ')');
    }
}
