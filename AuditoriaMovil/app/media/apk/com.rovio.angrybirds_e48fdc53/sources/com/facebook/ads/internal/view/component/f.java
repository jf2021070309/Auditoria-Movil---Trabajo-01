package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
/* loaded from: classes2.dex */
public class f extends RelativeLayout {
    private static final int a = (int) (4.0f * v.b);
    private final Path b;
    private final RectF c;

    public f(Context context) {
        super(context);
        this.b = new Path();
        this.c = new RectF();
        v.a(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.b.reset();
        this.b.addRoundRect(this.c, a, a, Path.Direction.CW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
    }
}
