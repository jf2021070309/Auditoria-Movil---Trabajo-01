package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public final class e extends d {
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
    public float q = Float.NaN;
    public float r = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public e() {
        this.c = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // com.amazon.aps.iva.x2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap<java.lang.String, com.amazon.aps.iva.w2.c> r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x2.e.a(java.util.HashMap):void");
    }

    @Override // com.amazon.aps.iva.x2.d
    /* renamed from: b */
    public final d clone() {
        e eVar = new e();
        super.c(this);
        eVar.d = this.d;
        eVar.e = this.e;
        eVar.f = this.f;
        eVar.g = this.g;
        eVar.h = this.h;
        eVar.i = this.i;
        eVar.j = this.j;
        eVar.k = this.k;
        eVar.l = this.l;
        eVar.m = this.m;
        eVar.n = this.n;
        eVar.o = this.o;
        eVar.p = this.p;
        eVar.q = this.q;
        eVar.r = this.r;
        return eVar;
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
        if (!Float.isNaN(this.j)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.r)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.f);
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
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 8:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
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
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 15:
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 16:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 17:
                    this.q = obtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 18:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 19:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 20:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
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
        if (!Float.isNaN(this.j)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("translationX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationZ", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("scaleX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("scaleY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("progress", Integer.valueOf(this.d));
        }
        if (this.c.size() > 0) {
            for (String str : this.c.keySet()) {
                hashMap.put(com.amazon.aps.iva.oa.a.a("CUSTOM,", str), Integer.valueOf(this.d));
            }
        }
    }
}
