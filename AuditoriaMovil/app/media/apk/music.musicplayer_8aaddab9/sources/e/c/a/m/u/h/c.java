package e.c.a.m.u.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e.c.a.m.m;
import e.c.a.m.s.w;
/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {
    public final e.c.a.m.s.c0.d a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Bitmap, byte[]> f5944b;

    /* renamed from: c  reason: collision with root package name */
    public final e<e.c.a.m.u.g.c, byte[]> f5945c;

    public c(e.c.a.m.s.c0.d dVar, e<Bitmap, byte[]> eVar, e<e.c.a.m.u.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.f5944b = eVar;
        this.f5945c = eVar2;
    }

    @Override // e.c.a.m.u.h.e
    public w<byte[]> a(w<Drawable> wVar, m mVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f5944b.a(e.c.a.m.u.c.e.b(((BitmapDrawable) drawable).getBitmap(), this.a), mVar);
        }
        if (drawable instanceof e.c.a.m.u.g.c) {
            return this.f5945c.a(wVar, mVar);
        }
        return null;
    }
}
