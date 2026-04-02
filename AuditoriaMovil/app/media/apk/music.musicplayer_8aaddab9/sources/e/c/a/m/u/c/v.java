package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import e.c.a.m.u.c.s;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class v implements e.c.a.m.o<ParcelFileDescriptor, Bitmap> {
    public final m a;

    public v(m mVar) {
        this.a = mVar;
    }

    @Override // e.c.a.m.o
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, e.c.a.m.m mVar) throws IOException {
        Objects.requireNonNull(this.a);
        return e.c.a.m.r.m.c();
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        m mVar2 = this.a;
        return mVar2.a(new s.b(parcelFileDescriptor, mVar2.f5879l, mVar2.f5878k), i2, i3, mVar, m.f5873f);
    }
}
