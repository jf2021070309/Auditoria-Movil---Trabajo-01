package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class q extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3253c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f3254d = new Paint(1);

    public q(Context context) {
        super(context);
        f3253c.setARGB(80, 0, 0, 0);
        Paint paint = f3254d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i2) {
        setViewScale(i2 / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.a * 2.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3253c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f3254d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
