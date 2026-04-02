package com.amazon.aps.iva.uc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class v implements com.amazon.aps.iva.nc.w<BitmapDrawable>, com.amazon.aps.iva.nc.s {
    public final Resources b;
    public final com.amazon.aps.iva.nc.w<Bitmap> c;

    public v(Resources resources, com.amazon.aps.iva.nc.w<Bitmap> wVar) {
        defpackage.i.l(resources);
        this.b = resources;
        defpackage.i.l(wVar);
        this.c = wVar;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        return this.c.a();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final void b() {
        this.c.b();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.b, this.c.get());
    }

    @Override // com.amazon.aps.iva.nc.s
    public final void initialize() {
        com.amazon.aps.iva.nc.w<Bitmap> wVar = this.c;
        if (wVar instanceof com.amazon.aps.iva.nc.s) {
            ((com.amazon.aps.iva.nc.s) wVar).initialize();
        }
    }
}
