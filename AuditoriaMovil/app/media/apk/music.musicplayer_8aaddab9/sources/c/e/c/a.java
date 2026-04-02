package c.e.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c.e.c.g;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c.e.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0027a implements g.a {
        public C0027a(a aVar) {
        }

        @Override // c.e.c.g.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    @Override // c.e.c.e
    public void i() {
        g.f1620b = new C0027a(this);
    }
}
