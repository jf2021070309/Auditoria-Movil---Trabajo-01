package com.amazon.aps.iva.pc;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final int b;
    public final int c;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Context a;
        public final ActivityManager b;
        public final b c;
        public final float d;

        public a(Context context) {
            this.d = 1;
            this.a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.b = activityManager;
            this.c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i;
        float f;
        Context context = aVar.a;
        ActivityManager activityManager = aVar.b;
        if (activityManager.isLowRamDevice()) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        this.c = i;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (isLowRamDevice) {
            f = 0.33f;
        } else {
            f = 0.4f;
        }
        int round = Math.round(memoryClass * f);
        DisplayMetrics displayMetrics = aVar.c.a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f3 = aVar.d;
        int round2 = Math.round(f2 * f3);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f4 = i2 / (f3 + 2.0f);
            this.b = Math.round(2.0f * f4);
            this.a = Math.round(f4 * f3);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
