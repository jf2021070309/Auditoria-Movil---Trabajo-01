package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
public final class t {
    public static final float[][] C = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] D = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public int A;
    public int B;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public final float[] l = new float[2];
    public final int[] m = new int[2];
    public float n;
    public float o;
    public final o p;
    public float q;
    public float r;
    public boolean s;
    public float t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public t(Context context, o oVar, XmlResourceParser xmlResourceParser) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = 0.0f;
        this.j = 1.0f;
        this.q = 4.0f;
        this.r = 1.2f;
        this.s = true;
        this.t = 1.0f;
        this.u = 0;
        this.v = 10.0f;
        this.w = 10.0f;
        this.x = 1.0f;
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.A = 0;
        this.B = 0;
        this.p = oVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.p);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 17) {
                int i2 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i2;
                float[] fArr = C[i2];
                float f = fArr[0];
                float f2 = fArr[1];
            } else if (index == 1) {
                int i3 = obtainStyledAttributes.getInt(index, this.b);
                this.b = i3;
                if (i3 < 6) {
                    float[] fArr2 = D[i3];
                    this.i = fArr2[0];
                    this.j = fArr2[1];
                } else {
                    this.j = Float.NaN;
                    this.i = Float.NaN;
                    this.h = true;
                }
            } else if (index == 6) {
                this.q = obtainStyledAttributes.getFloat(index, this.q);
            } else if (index == 5) {
                this.r = obtainStyledAttributes.getFloat(index, this.r);
            } else if (index == 7) {
                this.s = obtainStyledAttributes.getBoolean(index, this.s);
            } else if (index == 2) {
                this.t = obtainStyledAttributes.getFloat(index, this.t);
            } else if (index == 3) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            } else if (index == 18) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
            } else if (index == 9) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 8) {
                this.u = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.g = obtainStyledAttributes.getResourceId(index, this.g);
            } else if (index == 12) {
                this.w = obtainStyledAttributes.getFloat(index, this.w);
            } else if (index == 13) {
                this.x = obtainStyledAttributes.getFloat(index, this.x);
            } else if (index == 14) {
                this.y = obtainStyledAttributes.getFloat(index, this.y);
            } else if (index == 15) {
                this.z = obtainStyledAttributes.getFloat(index, this.z);
            } else if (index == 11) {
                this.A = obtainStyledAttributes.getInt(index, this.A);
            } else if (index == 0) {
                this.B = obtainStyledAttributes.getInt(index, this.B);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(o oVar, RectF rectF) {
        View findViewById;
        int i = this.f;
        if (i == -1 || (findViewById = oVar.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z) {
        float[][] fArr = C;
        float[][] fArr2 = D;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.a];
        float f = fArr3[0];
        float f2 = fArr3[1];
        int i = this.b;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.i = fArr4[0];
        this.j = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.i)) {
            return "rotation";
        }
        return this.i + " , " + this.j;
    }
}
