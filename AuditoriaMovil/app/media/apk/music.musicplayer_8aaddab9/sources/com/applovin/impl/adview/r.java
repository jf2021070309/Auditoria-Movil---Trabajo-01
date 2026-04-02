package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.i;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class r extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3255c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f3256d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private final float[] f3257e;

    /* renamed from: f  reason: collision with root package name */
    private Path f3258f;

    public r(Context context) {
        super(context);
        this.f3257e = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f3255c.setARGB(80, 0, 0, 0);
        Paint paint = f3256d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        int i2 = 0;
        while (true) {
            float[] fArr = this.f3257e;
            if (i2 >= fArr.length) {
                Path path = new Path();
                this.f3258f = path;
                float[] fArr2 = this.f3257e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f3258f;
                float[] fArr3 = this.f3257e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f3258f;
                float[] fArr4 = this.f3257e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f3258f;
                float[] fArr5 = this.f3257e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f3258f;
                float[] fArr6 = this.f3257e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f3258f;
                float[] fArr7 = this.f3257e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i2] = fArr[i2] * 0.3f * this.a;
            i2++;
        }
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i2) {
        setViewScale(i2 / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.a * 2.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3255c);
        Paint paint = f3256d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f3258f, paint);
    }
}
