package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public final class j extends d {
    public int d = -1;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public int q = 0;
    public float r = Float.NaN;
    public float s = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public j() {
        this.c = new HashMap<>();
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // com.amazon.aps.iva.x2.d
    /* renamed from: b */
    public final d clone() {
        j jVar = new j();
        super.c(this);
        jVar.d = this.d;
        jVar.q = this.q;
        jVar.r = this.r;
        jVar.s = this.s;
        jVar.p = this.p;
        jVar.e = this.e;
        jVar.f = this.f;
        jVar.g = this.g;
        jVar.j = this.j;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.k = this.k;
        jVar.l = this.l;
        jVar.m = this.m;
        jVar.n = this.n;
        jVar.o = this.o;
        return jVar;
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("progress");
        }
        if (this.c.size() > 0) {
            Iterator<String> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.i);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 5:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 6:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 7:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    int i2 = o.R;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 12:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.d = obtainStyledAttributes.getInteger(index, this.d);
                    break;
                case 14:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 15:
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 16:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 17:
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 18:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.q = 7;
                        break;
                    } else {
                        this.q = obtainStyledAttributes.getInt(index, this.q);
                        break;
                    }
                case 20:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.s = obtainStyledAttributes.getDimension(index, this.s);
                        break;
                    } else {
                        this.s = obtainStyledAttributes.getFloat(index, this.s);
                        break;
                    }
            }
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.d == -1) {
            return;
        }
        if (!Float.isNaN(this.e)) {
            hashMap.put("alpha", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("elevation", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.g)) {
            hashMap.put("rotation", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.h)) {
            hashMap.put("rotationX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("rotationY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("translationX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("translationY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("translationZ", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("scaleX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("scaleY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("progress", Integer.valueOf(this.d));
        }
        if (this.c.size() > 0) {
            for (String str : this.c.keySet()) {
                hashMap.put(com.amazon.aps.iva.oa.a.a("CUSTOM,", str), Integer.valueOf(this.d));
            }
        }
    }
}
