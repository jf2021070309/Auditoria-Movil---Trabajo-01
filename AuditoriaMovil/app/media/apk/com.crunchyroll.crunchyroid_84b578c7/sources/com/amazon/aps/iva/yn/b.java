package com.amazon.aps.iva.yn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.amazon.aps.iva.yn.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: BifFile.java */
/* loaded from: classes2.dex */
public final class b extends a {
    @Override // com.amazon.aps.iva.yn.a
    public final Bitmap a(int i) {
        List<a.C0894a> list;
        long millis = TimeUnit.SECONDS.toMillis(i);
        long j = Long.MAX_VALUE;
        a.C0894a c0894a = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            list = this.c;
            if (i2 >= list.size()) {
                break;
            }
            a.C0894a c0894a2 = list.get(i2);
            long abs = Math.abs((c0894a2.a * this.d) - millis);
            if (abs < j) {
                i3 = i2;
                c0894a = c0894a2;
                j = abs;
            }
            i2++;
        }
        int i4 = i3 + 1;
        if (i4 >= this.b) {
            return null;
        }
        int i5 = list.get(i4).b;
        int i6 = c0894a.b;
        int i7 = i5 - i6;
        byte[] bArr = this.a;
        if (bArr.length < i6 + i7) {
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6, i7 + i6);
        Bitmap bitmap = this.e;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.e.recycle();
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(copyOfRange, 0, copyOfRange.length);
        this.e = decodeByteArray;
        return decodeByteArray;
    }
}
