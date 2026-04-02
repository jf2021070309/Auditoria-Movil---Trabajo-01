package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public final class h extends i {
    public String e = null;
    public int f = -1;
    public int g = 0;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public int n = 0;

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    /* renamed from: b */
    public final d clone() {
        h hVar = new h();
        super.c(this);
        hVar.e = this.e;
        hVar.f = this.f;
        hVar.g = this.g;
        hVar.h = this.h;
        hVar.i = Float.NaN;
        hVar.j = this.j;
        hVar.k = this.k;
        hVar.l = this.l;
        hVar.m = this.m;
        return hVar;
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.h);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    int i2 = o.R;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.e = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.e = com.amazon.aps.iva.t2.c.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.d = obtainStyledAttributes.getInteger(index, this.d);
                    break;
                case 5:
                    this.g = obtainStyledAttributes.getInt(index, this.g);
                    break;
                case 6:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.i);
                    this.h = f;
                    this.i = f;
                    break;
                case 9:
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                    break;
                case 10:
                    this.f = obtainStyledAttributes.getInt(index, this.f);
                    break;
                case 11:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 12:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap) {
    }
}
