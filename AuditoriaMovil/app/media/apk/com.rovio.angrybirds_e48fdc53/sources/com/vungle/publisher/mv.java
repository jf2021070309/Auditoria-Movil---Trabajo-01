package com.vungle.publisher;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class mv {
    @Inject
    Context a;
    public int b;
    public int c;

    public float a(int i) {
        return TypedValue.applyDimension(1, i, this.a.getResources().getDisplayMetrics());
    }

    public float a() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels / displayMetrics.density;
    }

    public float b() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        return displayMetrics.heightPixels / displayMetrics.density;
    }

    public int c() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int d() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public void a(DisplayMetrics displayMetrics, boolean z) {
        if (z) {
            b((int) (displayMetrics.widthPixels / displayMetrics.density));
            c((int) (((float) Math.round(displayMetrics.widthPixels * 0.5625d)) / displayMetrics.density));
            return;
        }
        b((int) (((float) Math.round(displayMetrics.heightPixels * 0.5625d)) / displayMetrics.density));
        c((int) (displayMetrics.heightPixels / displayMetrics.density));
    }
}
