package com.amazon.aps.iva.w5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: FileDataSource.java */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.w5.b {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    /* compiled from: FileDataSource.java */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: FileDataSource.java */
    /* loaded from: classes.dex */
    public static final class b implements f.a {
        @Override // com.amazon.aps.iva.w5.f.a
        public final f a() {
            return new n();
        }
    }

    /* compiled from: FileDataSource.java */
    /* loaded from: classes.dex */
    public static class c extends g {
        public c(int i, Exception exc) {
            super(i, exc);
        }

        public c(int i, String str, FileNotFoundException fileNotFoundException) {
            super(i, str, fileNotFoundException);
        }
    }

    public n() {
        super(false);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws c {
        Uri uri = iVar.a;
        long j = iVar.f;
        this.f = uri;
        o(iVar);
        int i = CastStatusCodes.MESSAGE_TOO_LARGE;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = iVar.g;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.g = j2;
                if (j2 >= 0) {
                    this.h = true;
                    p(iVar);
                    return this.g;
                }
                throw new c(2008, null, null);
            } catch (IOException e) {
                throw new c(CastStatusCodes.AUTHENTICATION_FAILED, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (g0.a < 21 || !a.b(e2.getCause())) {
                    i = CastStatusCodes.APPLICATION_NOT_RUNNING;
                }
                throw new c(i, e2);
            }
            throw new c(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
        } catch (SecurityException e3) {
            throw new c(CastStatusCodes.MESSAGE_TOO_LARGE, e3);
        } catch (RuntimeException e4) {
            throw new c(CastStatusCodes.AUTHENTICATION_FAILED, e4);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws c {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new c(CastStatusCodes.AUTHENTICATION_FAILED, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                n();
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws c {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = g0.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                m(read);
            }
            return read;
        } catch (IOException e) {
            throw new c(CastStatusCodes.AUTHENTICATION_FAILED, e);
        }
    }
}
