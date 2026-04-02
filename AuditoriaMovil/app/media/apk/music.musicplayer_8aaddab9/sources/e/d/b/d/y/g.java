package e.d.b.d.y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
/* loaded from: classes2.dex */
public class g extends e.d.b.d.w.g {
    public final RectF A;
    public int B;
    public final Paint z;

    public g() {
        this(null);
    }

    public g(e.d.b.d.w.j jVar) {
        super(jVar == null ? new e.d.b.d.w.j() : jVar);
        Paint paint = new Paint(1);
        this.z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A = new RectF();
    }

    @Override // e.d.b.d.w.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.B);
    }

    @Override // e.d.b.d.w.g
    public void h(Canvas canvas) {
        if (this.A.isEmpty()) {
            super.h(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.h(canvas2);
        canvas2.drawRect(this.A, this.z);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public void y(float f2, float f3, float f4, float f5) {
        RectF rectF = this.A;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
