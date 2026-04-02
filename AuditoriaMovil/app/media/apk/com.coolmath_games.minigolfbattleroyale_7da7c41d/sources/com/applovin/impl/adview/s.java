package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.j;
/* loaded from: classes.dex */
public final class s extends j {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);

    public s(Context context) {
        super(context);
        c.setARGB(80, 0, 0, 0);
        d.setColor(-1);
        d.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.j
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.a * 8.0f;
    }

    protected float getStrokeWidth() {
        return this.a * 2.0f;
    }

    @Override // com.applovin.impl.adview.j
    public j.a getStyle() {
        return j.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        d.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, d);
        canvas.drawLine(crossOffset, size, size, crossOffset, d);
    }
}
