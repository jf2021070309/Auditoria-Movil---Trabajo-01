package com.facebook.ads.internal.view.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class d extends ImageView {
    public d(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float min = Math.min(getWidth(), getHeight()) / 2;
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
