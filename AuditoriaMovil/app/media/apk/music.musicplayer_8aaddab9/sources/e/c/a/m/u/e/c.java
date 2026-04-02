package e.c.a.m.u.e;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    @Override // e.c.a.m.s.w
    public void a() {
    }

    @Override // e.c.a.m.s.w
    public Class<Drawable> c() {
        return this.a.getClass();
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return Math.max(1, this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 4);
    }
}
