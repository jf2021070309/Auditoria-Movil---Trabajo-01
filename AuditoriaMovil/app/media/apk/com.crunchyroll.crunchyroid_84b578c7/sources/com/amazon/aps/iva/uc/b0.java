package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import java.io.IOException;
/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class b0 implements com.amazon.aps.iva.kc.j<Bitmap, Bitmap> {
    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(Bitmap bitmap, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return new a(bitmap);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return true;
    }

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.nc.w<Bitmap> {
        public final Bitmap b;

        public a(Bitmap bitmap) {
            this.b = bitmap;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final int a() {
            return com.amazon.aps.iva.hd.l.c(this.b);
        }

        @Override // com.amazon.aps.iva.nc.w
        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final Bitmap get() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.nc.w
        public final void b() {
        }
    }
}
