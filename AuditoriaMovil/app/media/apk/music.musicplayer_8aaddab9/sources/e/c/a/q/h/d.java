package e.c.a.q.h;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // e.c.a.q.h.e
    public void i(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
