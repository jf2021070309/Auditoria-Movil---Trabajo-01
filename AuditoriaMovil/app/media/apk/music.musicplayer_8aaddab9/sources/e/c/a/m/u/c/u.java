package e.c.a.m.u.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class u implements e.c.a.m.s.w<BitmapDrawable>, e.c.a.m.s.s {
    public final Resources a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.s.w<Bitmap> f5894b;

    public u(Resources resources, e.c.a.m.s.w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.a = resources;
        this.f5894b = wVar;
    }

    public static e.c.a.m.s.w<BitmapDrawable> b(Resources resources, e.c.a.m.s.w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    @Override // e.c.a.m.s.w
    public void a() {
        this.f5894b.a();
    }

    @Override // e.c.a.m.s.w
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // e.c.a.m.s.w
    public BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.f5894b.get());
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return this.f5894b.getSize();
    }

    @Override // e.c.a.m.s.s
    public void initialize() {
        e.c.a.m.s.w<Bitmap> wVar = this.f5894b;
        if (wVar instanceof e.c.a.m.s.s) {
            ((e.c.a.m.s.s) wVar).initialize();
        }
    }
}
