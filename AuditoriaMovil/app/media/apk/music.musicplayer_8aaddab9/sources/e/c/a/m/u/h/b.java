package e.c.a.m.u.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import e.c.a.m.m;
import e.c.a.m.s.w;
import e.c.a.m.u.c.u;
/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(Resources resources) {
        this.a = resources;
    }

    @Override // e.c.a.m.u.h.e
    public w<BitmapDrawable> a(w<Bitmap> wVar, m mVar) {
        return u.b(this.a, wVar);
    }
}
