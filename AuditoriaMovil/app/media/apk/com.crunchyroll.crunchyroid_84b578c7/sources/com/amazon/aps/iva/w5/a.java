package com.amazon.aps.iva.w5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: AssetDataSource.java */
/* loaded from: classes.dex */
public final class a extends b {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    /* compiled from: AssetDataSource.java */
    /* renamed from: com.amazon.aps.iva.w5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0819a extends g {
        public C0819a(int i, IOException iOException) {
            super(i, iOException);
        }
    }

    public a(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws C0819a {
        int i;
        try {
            Uri uri = iVar.a;
            long j = iVar.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            o(iVar);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(j) >= j) {
                long j2 = iVar.g;
                if (j2 != -1) {
                    this.h = j2;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                p(iVar);
                return this.h;
            }
            throw new C0819a(2008, null);
        } catch (C0819a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = CastStatusCodes.APPLICATION_NOT_RUNNING;
            } else {
                i = CastStatusCodes.AUTHENTICATION_FAILED;
            }
            throw new C0819a(i, e2);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws C0819a {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C0819a(CastStatusCodes.AUTHENTICATION_FAILED, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                n();
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws C0819a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0819a(CastStatusCodes.AUTHENTICATION_FAILED, e);
            }
        }
        InputStream inputStream = this.g;
        int i3 = g0.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        m(read);
        return read;
    }
}
