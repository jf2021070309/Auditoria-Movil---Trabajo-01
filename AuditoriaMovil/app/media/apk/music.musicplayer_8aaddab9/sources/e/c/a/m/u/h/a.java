package e.c.a.m.u.h;

import android.graphics.Bitmap;
import e.c.a.m.m;
import e.c.a.m.s.w;
import java.io.ByteArrayOutputStream;
/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f5943b = 100;

    @Override // e.c.a.m.u.h.e
    public w<byte[]> a(w<Bitmap> wVar, m mVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.a, this.f5943b, byteArrayOutputStream);
        wVar.a();
        return new e.c.a.m.u.d.b(byteArrayOutputStream.toByteArray());
    }
}
