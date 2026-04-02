package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
class MediaRowFocusView extends View {
    public final Paint b;
    public final RectF c;
    public int d;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        this.b = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        RectF rectF = this.c;
        rectF.set(0.0f, -height2, getWidth(), getHeight() + height2);
        int i = this.d;
        canvas.drawRoundRect(rectF, i, i, this.b);
    }
}
