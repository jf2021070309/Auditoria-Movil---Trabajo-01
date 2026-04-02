package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.j;
/* loaded from: classes.dex */
public final class y extends j {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);
    private static final Paint e = new Paint(1);

    public y(Context context) {
        super(context);
        c.setColor(-1);
        d.setColor(ViewCompat.MEASURED_STATE_MASK);
        e.setColor(-1);
        e.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.a * 3.0f;
    }

    @Override // com.applovin.impl.adview.j
    public j.a getStyle() {
        return j.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        e.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, e);
        canvas.drawLine(crossOffset, size, size, crossOffset, e);
    }
}
