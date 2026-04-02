package com.amazon.aps.iva.w5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* compiled from: ContentDataSource.java */
/* loaded from: classes.dex */
public final class c extends b {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    /* compiled from: ContentDataSource.java */
    /* loaded from: classes.dex */
    public static class a extends g {
        public a(IOException iOException, int i) {
            super(i, iOException);
        }
    }

    public c(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i = CastStatusCodes.AUTHENTICATION_FAILED;
        try {
            Uri normalizeScheme = iVar.a.normalizeScheme();
            this.f = normalizeScheme;
            o(iVar);
            boolean equals = FirebaseAnalytics.Param.CONTENT.equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                long j = iVar.f;
                if (i2 != 0 && j > length) {
                    throw new a(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip == j) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.i = position;
                            if (position < 0) {
                                throw new a(null, 2008);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.i = j2;
                        if (j2 < 0) {
                            throw new a(null, 2008);
                        }
                    }
                    long j3 = iVar.g;
                    if (j3 != -1) {
                        long j4 = this.i;
                        if (j4 == -1) {
                            min = j3;
                        } else {
                            min = Math.min(j4, j3);
                        }
                        this.i = min;
                    }
                    this.j = true;
                    p(iVar);
                    if (j3 == -1) {
                        return this.i;
                    }
                    return j3;
                }
                throw new a(null, 2008);
            }
            throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), CastStatusCodes.AUTHENTICATION_FAILED);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = CastStatusCodes.APPLICATION_NOT_RUNNING;
            }
            throw new a(e2, i);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws a {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                    }
                } catch (IOException e) {
                    throw new a(e, CastStatusCodes.AUTHENTICATION_FAILED);
                }
            } catch (IOException e2) {
                throw new a(e2, CastStatusCodes.AUTHENTICATION_FAILED);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        n();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3, CastStatusCodes.AUTHENTICATION_FAILED);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    n();
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, CastStatusCodes.AUTHENTICATION_FAILED);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = g0.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        m(read);
        return read;
    }
}
