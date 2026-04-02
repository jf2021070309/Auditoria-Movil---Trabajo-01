package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public final class f extends d {
    public int d = 0;
    public int e = -1;
    public String f = null;
    public float g = Float.NaN;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = Float.NaN;
    public int k = -1;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public f() {
        this.c = new HashMap<>();
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            stackTrace[i].getFileName();
            stackTrace[i].getLineNumber();
            stackTrace[i].getMethodName();
            str = str + " ";
        }
        for (String str2 : hashMap.keySet()) {
            com.amazon.aps.iva.w2.c cVar = hashMap.get(str2);
            if (cVar != null) {
                str2.getClass();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1249320806:
                        if (str2.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str2.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str2.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str2.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str2.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str2.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str2.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str2.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str2.equals("rotation")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str2.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str2.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str2.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str2.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str2.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        cVar.b(this.p, this.a);
                        continue;
                    case 1:
                        cVar.b(this.q, this.a);
                        continue;
                    case 2:
                        cVar.b(this.t, this.a);
                        continue;
                    case 3:
                        cVar.b(this.u, this.a);
                        continue;
                    case 4:
                        cVar.b(this.v, this.a);
                        continue;
                    case 5:
                        cVar.b(this.j, this.a);
                        continue;
                    case 6:
                        cVar.b(this.r, this.a);
                        continue;
                    case 7:
                        cVar.b(this.s, this.a);
                        continue;
                    case '\b':
                        cVar.b(this.n, this.a);
                        continue;
                    case '\t':
                        cVar.b(this.m, this.a);
                        continue;
                    case '\n':
                        cVar.b(this.o, this.a);
                        continue;
                    case 11:
                        cVar.b(this.l, this.a);
                        continue;
                    case '\f':
                        cVar.b(this.h, this.a);
                        continue;
                    case '\r':
                        cVar.b(this.i, this.a);
                        continue;
                    default:
                        str2.startsWith("CUSTOM");
                        continue;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    /* renamed from: b */
    public final d clone() {
        f fVar = new f();
        super.c(this);
        fVar.d = this.d;
        fVar.e = this.e;
        fVar.f = this.f;
        fVar.g = this.g;
        fVar.h = this.h;
        fVar.i = this.i;
        fVar.j = this.j;
        fVar.k = this.k;
        fVar.l = this.l;
        fVar.m = this.m;
        fVar.n = this.n;
        fVar.o = this.o;
        fVar.p = this.p;
        fVar.q = this.q;
        fVar.r = this.r;
        fVar.s = this.s;
        fVar.t = this.t;
        fVar.u = this.u;
        fVar.v = this.v;
        return fVar;
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.l)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.g);
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
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getInteger(index, this.d);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = obtainStyledAttributes.getString(index);
                        this.e = 7;
                        break;
                    } else {
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    }
                case 6:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    } else {
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    }
                case 8:
                    this.k = obtainStyledAttributes.getInt(index, this.k);
                    break;
                case 9:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 10:
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 11:
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 12:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 13:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 14:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 16:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 17:
                    this.t = obtainStyledAttributes.getDimension(index, this.t);
                    break;
                case 18:
                    this.u = obtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 19:
                    this.v = obtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 20:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 21:
                    this.i = obtainStyledAttributes.getFloat(index, this.i) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
