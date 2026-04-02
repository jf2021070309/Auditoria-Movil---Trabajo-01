package e.c.a.m.u.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class o implements e.c.a.m.q<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.q<Bitmap> f5881b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5882c;

    public o(e.c.a.m.q<Bitmap> qVar, boolean z) {
        this.f5881b = qVar;
        this.f5882c = z;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        this.f5881b.a(messageDigest);
    }

    @Override // e.c.a.m.q
    public e.c.a.m.s.w<Drawable> b(Context context, e.c.a.m.s.w<Drawable> wVar, int i2, int i3) {
        e.c.a.m.s.c0.d dVar = e.c.a.b.b(context).f5437c;
        Drawable drawable = wVar.get();
        e.c.a.m.s.w<Bitmap> a = n.a(dVar, drawable, i2, i3);
        if (a != null) {
            e.c.a.m.s.w<Bitmap> b2 = this.f5881b.b(context, a, i2, i3);
            if (b2.equals(a)) {
                b2.a();
                return wVar;
            }
            return u.b(context.getResources(), b2);
        } else if (this.f5882c) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        } else {
            return wVar;
        }
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f5881b.equals(((o) obj).f5881b);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return this.f5881b.hashCode();
    }
}
