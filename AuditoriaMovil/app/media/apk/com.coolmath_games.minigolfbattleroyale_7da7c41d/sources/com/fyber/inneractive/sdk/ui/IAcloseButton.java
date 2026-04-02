package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.l;
/* loaded from: classes.dex */
public class IAcloseButton extends View {
    Paint a;
    Path b;

    public IAcloseButton(Context context, int i) {
        super(context);
        int b = l.b(10);
        int i2 = ((i - (b * 2)) / 4) + b;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.b.moveTo(point.x, point.y);
        this.b.lineTo(point3.x, point3.y);
        this.b.moveTo(point2.x, point2.y);
        this.b.lineTo(point4.x, point4.y);
        this.b.close();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStrokeWidth(l.b(2));
        this.a.setColor(-1);
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(l.b(2), -1);
        l.a(this, gradientDrawable);
        setPadding(b, b, b, b);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.b, this.a);
    }
}
