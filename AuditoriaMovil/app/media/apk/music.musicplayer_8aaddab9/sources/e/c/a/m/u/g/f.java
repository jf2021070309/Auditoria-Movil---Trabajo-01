package e.c.a.m.u.g;

import android.content.Context;
import android.graphics.Bitmap;
import e.c.a.m.q;
import e.c.a.m.s.w;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public class f implements q<c> {

    /* renamed from: b  reason: collision with root package name */
    public final q<Bitmap> f5922b;

    public f(q<Bitmap> qVar) {
        Objects.requireNonNull(qVar, "Argument must not be null");
        this.f5922b = qVar;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        this.f5922b.a(messageDigest);
    }

    @Override // e.c.a.m.q
    public w<c> b(Context context, w<c> wVar, int i2, int i3) {
        c cVar = wVar.get();
        w<Bitmap> eVar = new e.c.a.m.u.c.e(cVar.b(), e.c.a.b.b(context).f5437c);
        w<Bitmap> b2 = this.f5922b.b(context, eVar, i2, i3);
        if (!eVar.equals(b2)) {
            eVar.a();
        }
        q<Bitmap> qVar = this.f5922b;
        cVar.a.a.c(qVar, b2.get());
        return wVar;
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f5922b.equals(((f) obj).f5922b);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return this.f5922b.hashCode();
    }
}
