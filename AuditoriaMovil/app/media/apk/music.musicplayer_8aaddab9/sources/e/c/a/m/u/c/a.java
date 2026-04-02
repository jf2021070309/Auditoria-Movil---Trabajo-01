package e.c.a.m.u.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
/* loaded from: classes.dex */
public class a<DataType> implements e.c.a.m.o<DataType, BitmapDrawable> {
    public final e.c.a.m.o<DataType, Bitmap> a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5848b;

    public a(Resources resources, e.c.a.m.o<DataType, Bitmap> oVar) {
        this.f5848b = resources;
        this.a = oVar;
    }

    @Override // e.c.a.m.o
    public boolean a(DataType datatype, e.c.a.m.m mVar) throws IOException {
        return this.a.a(datatype, mVar);
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<BitmapDrawable> b(DataType datatype, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        return u.b(this.f5848b, this.a.b(datatype, i2, i3, mVar));
    }
}
