package com.amazon.aps.iva.aa;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.amazon.aps.iva.ma.f;
/* compiled from: LPaint.java */
/* loaded from: classes.dex */
public final class a extends Paint {
    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = f.a;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = f.a;
        super.setAlpha(Math.max(0, Math.min(255, i)));
    }

    public a(PorterDuff.Mode mode, int i) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
