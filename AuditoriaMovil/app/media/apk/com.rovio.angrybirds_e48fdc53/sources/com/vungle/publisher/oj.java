package com.vungle.publisher;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class oj extends oa {
    private ShapeDrawable a;
    private int b;
    private int c;
    private int d;
    private int e;

    private oj(Context context) {
        super(context);
        this.a = new ShapeDrawable();
        this.b = -1;
        this.a.getPaint().setColor(-13659954);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = View.MeasureSpec.getSize(i);
    }

    private void setProgressBarWidth(float f) {
        this.a.setBounds(0, 0, (int) (this.b * f), this.d);
    }

    public void setMaxTimeMillis(int i) {
        this.c = i;
    }

    public void setCurrentTimeMillis(int i) {
        setProgressBarWidth(i / this.c);
        invalidate();
    }

    public int getProgressBarHeight() {
        return this.d;
    }

    @Override // android.view.View
    public int getId() {
        return this.e;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Context a;
        @Inject
        mv b;

        public oj a(int i) {
            oj ojVar = new oj(this.a);
            ojVar.e = i;
            ojVar.d = (int) this.b.a(2);
            return ojVar;
        }
    }
}
