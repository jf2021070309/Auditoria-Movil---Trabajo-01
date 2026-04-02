package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class w extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3269c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f3270d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f3271e = new Paint(1);

    public w(Context context) {
        super(context);
        f3269c.setColor(-1);
        f3270d.setColor(-16777216);
        Paint paint = f3271e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.a * 3.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3269c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f3270d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f3271e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
