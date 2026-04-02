package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.uc.t;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes.dex */
public final class w implements com.amazon.aps.iva.kc.j<ParcelFileDescriptor, Bitmap> {
    public final n a;

    public w(n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        n nVar = this.a;
        return nVar.a(new t.c(parcelFileDescriptor, nVar.d, nVar.c), i, i2, hVar, n.k);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(ParcelFileDescriptor parcelFileDescriptor, com.amazon.aps.iva.kc.h hVar) throws IOException {
        boolean z;
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        this.a.getClass();
        if (!(!"robolectric".equals(Build.FINGERPRINT))) {
            return false;
        }
        return true;
    }
}
