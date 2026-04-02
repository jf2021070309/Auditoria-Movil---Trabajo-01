package e.c.a.q.h;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // e.c.a.q.h.e
    public void i(Bitmap bitmap) {
        ((ImageView) this.a).setImageBitmap(bitmap);
    }
}
