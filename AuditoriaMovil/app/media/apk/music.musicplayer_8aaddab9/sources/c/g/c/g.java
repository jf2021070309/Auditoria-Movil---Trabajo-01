package c.g.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;
/* loaded from: classes.dex */
public class g extends View {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public View f1907b;

    /* renamed from: c  reason: collision with root package name */
    public int f1908c;

    public View getContent() {
        return this.f1907b;
    }

    public int getEmptyVisibility() {
        return this.f1908c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.a == i2) {
            return;
        }
        View view = this.f1907b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f1907b.getLayoutParams()).f0 = false;
            this.f1907b = null;
        }
        this.a = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f1908c = i2;
    }
}
