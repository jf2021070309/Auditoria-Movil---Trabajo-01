package com.amazon.aps.iva.uc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public final class a<DataType> implements com.amazon.aps.iva.kc.j<DataType, BitmapDrawable> {
    public final com.amazon.aps.iva.kc.j<DataType, Bitmap> a;
    public final Resources b;

    public a(Resources resources, com.amazon.aps.iva.kc.j<DataType, Bitmap> jVar) {
        this.b = resources;
        this.a = jVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<BitmapDrawable> a(DataType datatype, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        com.amazon.aps.iva.nc.w<Bitmap> a = this.a.a(datatype, i, i2, hVar);
        if (a == null) {
            return null;
        }
        return new v(this.b, a);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(DataType datatype, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return this.a.b(datatype, hVar);
    }
}
