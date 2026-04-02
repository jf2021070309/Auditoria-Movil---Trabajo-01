package com.amazon.aps.iva.m3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class j {
    public static final com.amazon.aps.iva.x.g<String, Typeface> a = new com.amazon.aps.iva.x.g<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final com.amazon.aps.iva.x.h<String, ArrayList<com.amazon.aps.iva.o3.a<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new com.amazon.aps.iva.x.h<>();
    }

    public static a a(String str, Context context, e eVar, int i) {
        int i2;
        com.amazon.aps.iva.x.g<String, Typeface> gVar = a;
        Typeface typeface = gVar.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            k a2 = d.a(context, eVar);
            int i3 = 1;
            l[] lVarArr = a2.b;
            int i4 = a2.a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                if (lVarArr != null && lVarArr.length != 0) {
                    i3 = 0;
                    for (l lVar : lVarArr) {
                        int i5 = lVar.e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                }
                i2 = i3;
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface b2 = com.amazon.aps.iva.g3.i.a.b(context, lVarArr, i);
            if (b2 != null) {
                gVar.put(str, b2);
                return new a(b2);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
