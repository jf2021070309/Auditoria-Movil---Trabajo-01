package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public final class k extends d {
    public float p;
    public String d = null;
    public int e = -1;
    public String f = null;
    public String g = null;
    public int h = -1;
    public int i = -1;
    public View j = null;
    public float k = 0.1f;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public float o = Float.NaN;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public RectF u = new RectF();
    public RectF v = new RectF();
    public HashMap<String, Method> w = new HashMap<>();

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public k() {
        this.c = new HashMap<>();
    }

    public static void h(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    /* renamed from: b */
    public final d clone() {
        k kVar = new k();
        super.c(this);
        kVar.d = this.d;
        kVar.e = this.e;
        kVar.f = this.f;
        kVar.g = this.g;
        kVar.h = this.h;
        kVar.i = this.i;
        kVar.j = this.j;
        kVar.k = this.k;
        kVar.l = this.l;
        kVar.m = this.m;
        kVar.n = this.n;
        kVar.o = this.o;
        kVar.p = this.p;
        kVar.q = this.q;
        kVar.u = this.u;
        kVar.v = this.v;
        kVar.w = this.w;
        return kVar;
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.j);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.g = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 6:
                    this.h = obtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 7:
                    int i2 = o.R;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.o = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.i = obtainStyledAttributes.getResourceId(index, this.i);
                    break;
                case 10:
                    this.q = obtainStyledAttributes.getBoolean(index, this.q);
                    break;
                case 11:
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    break;
                case 12:
                    this.t = obtainStyledAttributes.getResourceId(index, this.t);
                    break;
                case 13:
                    this.r = obtainStyledAttributes.getResourceId(index, this.r);
                    break;
                case 14:
                    this.s = obtainStyledAttributes.getResourceId(index, this.s);
                    break;
            }
        }
    }

    public final void g(View view, String str) {
        Method method;
        boolean z;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            if (str.length() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str2 : this.c.keySet()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (z || lowerCase.matches(str)) {
                    androidx.constraintlayout.widget.a aVar = this.c.get(str2);
                    if (aVar != null) {
                        Class<?> cls = view.getClass();
                        boolean z2 = aVar.a;
                        String str3 = aVar.b;
                        if (!z2) {
                            str3 = com.amazon.aps.iva.oa.a.a("set", str3);
                        }
                        try {
                            switch (a.C0023a.a[aVar.c.ordinal()]) {
                                case 1:
                                case 6:
                                    cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf(aVar.d));
                                    break;
                                case 2:
                                    cls.getMethod(str3, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                                    break;
                                case 3:
                                    cls.getMethod(str3, CharSequence.class).invoke(view, aVar.f);
                                    break;
                                case 4:
                                    cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf(aVar.h));
                                    break;
                                case 5:
                                    Method method2 = cls.getMethod(str3, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(aVar.h);
                                    method2.invoke(view, colorDrawable);
                                    break;
                                case 7:
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                                    break;
                                case 8:
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                                    break;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
                            e2.getMessage();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
            return;
        }
        if (this.w.containsKey(str)) {
            method = this.w.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.w.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.w.put(str, null);
                view.getClass();
                com.amazon.aps.iva.x2.a.c(view);
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            view.getClass();
            com.amazon.aps.iva.x2.a.c(view);
        }
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap) {
    }

    @Override // com.amazon.aps.iva.x2.d
    public final void d(HashSet<String> hashSet) {
    }
}
