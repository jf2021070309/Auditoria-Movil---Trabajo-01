package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
/* loaded from: classes.dex */
public class b implements e.c.a.m.p<BitmapDrawable> {
    public final e.c.a.m.s.c0.d a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.p<Bitmap> f5849b;

    public b(e.c.a.m.s.c0.d dVar, e.c.a.m.p<Bitmap> pVar) {
        this.a = dVar;
        this.f5849b = pVar;
    }

    @Override // e.c.a.m.d
    public boolean a(Object obj, File file, e.c.a.m.m mVar) {
        return this.f5849b.a(new e(((BitmapDrawable) ((e.c.a.m.s.w) obj).get()).getBitmap(), this.a), file, mVar);
    }

    @Override // e.c.a.m.p
    public e.c.a.m.c b(e.c.a.m.m mVar) {
        return this.f5849b.b(mVar);
    }
}
