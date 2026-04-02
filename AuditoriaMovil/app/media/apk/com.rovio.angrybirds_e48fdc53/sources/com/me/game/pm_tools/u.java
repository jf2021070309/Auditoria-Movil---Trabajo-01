package com.me.game.pm_tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/* loaded from: classes5.dex */
public class u {
    private static volatile u e;
    private DisplayMetrics a;
    private float b;
    private float c;
    private Resources d;

    private u() {
        this.a = null;
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = null;
        this.d = b.d.getResources();
        this.a = new DisplayMetrics();
        ((WindowManager) b.d.getSystemService("window")).getDefaultDisplay().getMetrics(this.a);
        DisplayMetrics displayMetrics = this.a;
        this.b = displayMetrics.density;
        this.c = displayMetrics.scaledDensity;
    }

    public static u f() {
        if (e == null) {
            synchronized (u.class) {
                if (e == null) {
                    e = new u();
                }
            }
        }
        return e;
    }

    public int a(float f) {
        return (int) ((f * this.b) + 0.5f);
    }

    public int b(int i) {
        return this.d.getColor(i);
    }

    public float c(Context context) {
        return this.b;
    }

    public final DisplayMetrics d() {
        return this.a;
    }

    public Drawable e(int i) {
        return this.d.getDrawable(i);
    }

    public int g() {
        return this.a.heightPixels;
    }

    public int h() {
        return this.a.widthPixels;
    }

    public int i(Context context, float f) {
        return (int) ((f / this.b) + 0.5f);
    }

    public float j(Context context, float f) {
        return f / this.c;
    }

    public float k(Context context, float f) {
        return f * this.c;
    }
}
