package com.amazon.aps.iva.w5;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public class p extends g {
    public final i d;
    public final int e;

    public p(i iVar, int i) {
        super(i == 2000 ? CastStatusCodes.INVALID_REQUEST : i);
        this.d = iVar;
        this.e = 1;
    }

    public static p a(IOException iOException, i iVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = CastStatusCodes.CANCELED;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = CastStatusCodes.INVALID_REQUEST;
        }
        if (i2 == 2007) {
            return new o(iOException, iVar);
        }
        return new p(iOException, iVar, i2, i);
    }

    public p(String str, i iVar, int i) {
        super(str, i == 2000 ? CastStatusCodes.INVALID_REQUEST : i);
        this.d = iVar;
        this.e = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(java.io.IOException r2, com.amazon.aps.iva.w5.i r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L9
            r0 = 1
            if (r5 != r0) goto L9
            r4 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r2)
            r1.d = r3
            r1.e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w5.p.<init>(java.io.IOException, com.amazon.aps.iva.w5.i, int, int):void");
    }

    public p(String str, IOException iOException, i iVar, int i) {
        super(i == 2000 ? CastStatusCodes.INVALID_REQUEST : i, str, iOException);
        this.d = iVar;
        this.e = 1;
    }
}
