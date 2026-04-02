package com.amazon.aps.iva.w5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: RawResourceDataSource.java */
/* loaded from: classes.dex */
public final class v extends b {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    /* compiled from: RawResourceDataSource.java */
    /* loaded from: classes.dex */
    public static class a extends g {
        public a(int i, String str, Exception exc) {
            super(i, str, exc);
        }
    }

    public v(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    @Override // com.amazon.aps.iva.w5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.amazon.aps.iva.w5.i r17) throws com.amazon.aps.iva.w5.v.a {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w5.v.b(com.amazon.aps.iva.w5.i):long");
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws a {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(CastStatusCodes.AUTHENTICATION_FAILED, null, e);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        n();
                    }
                }
            } catch (IOException e2) {
                throw new a(CastStatusCodes.AUTHENTICATION_FAILED, null, e2);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        n();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(CastStatusCodes.AUTHENTICATION_FAILED, null, e3);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    n();
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(CastStatusCodes.AUTHENTICATION_FAILED, null, e);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = g0.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new a(CastStatusCodes.AUTHENTICATION_FAILED, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        m(read);
        return read;
    }
}
