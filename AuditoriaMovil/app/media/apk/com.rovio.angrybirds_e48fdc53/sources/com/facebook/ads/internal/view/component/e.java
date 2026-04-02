package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;
import com.facebook.ads.internal.q.a.v;
/* loaded from: classes2.dex */
public class e extends ImageView {
    private static final int a = (int) (8.0f * v.b);
    private final Path b;
    private final RectF c;
    private int d;

    public e(Context context) {
        super(context);
        this.d = a;
        this.b = new Path();
        this.c = new RectF();
        v.a(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.b.reset();
        this.b.addRoundRect(this.c, this.d, this.d, Path.Direction.CW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
    }

    public void setRadius(int i) {
        this.d = (int) (i * v.b);
    }
}
