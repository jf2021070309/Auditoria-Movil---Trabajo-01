package e.c.a.m.u.c;

import android.content.Context;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public abstract class f implements e.c.a.m.q<Bitmap> {
    @Override // e.c.a.m.q
    public final e.c.a.m.s.w<Bitmap> b(Context context, e.c.a.m.s.w<Bitmap> wVar, int i2, int i3) {
        if (!e.c.a.s.j.i(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        e.c.a.m.s.c0.d dVar = e.c.a.b.b(context).f5437c;
        Bitmap bitmap = wVar.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap c2 = c(dVar, bitmap, i2, i3);
        return bitmap.equals(c2) ? wVar : e.b(c2, dVar);
    }

    public abstract Bitmap c(e.c.a.m.s.c0.d dVar, Bitmap bitmap, int i2, int i3);
}
