package com.fyber.inneractive.sdk.player.c.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class e implements g {
    private final ContentResolver a;
    private final u<? super e> b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public e(Context context, u<? super e> uVar) {
        this.a = context.getContentResolver();
        this.b = uVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(i iVar) throws a {
        try {
            Uri uri = iVar.a;
            this.c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            this.d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.c);
            }
            this.e = new FileInputStream(this.d.getFileDescriptor());
            long startOffset = this.d.getStartOffset();
            if (this.e.skip(iVar.d + startOffset) - startOffset != iVar.d) {
                throw new EOFException();
            }
            if (iVar.e != -1) {
                this.f = iVar.e;
            } else {
                long length = this.d.getLength();
                this.f = length;
                if (length == -1) {
                    long available = this.e.available();
                    this.f = available;
                    if (available == 0) {
                        this.f = -1L;
                    }
                }
            }
            this.g = true;
            u<? super e> uVar = this.b;
            if (uVar != null) {
                uVar.a();
            }
            return this.f;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int read = this.e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        u<? super e> uVar = this.b;
        if (uVar != null) {
            uVar.a(read);
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws a {
        this.c = null;
        try {
            try {
                if (this.e != null) {
                    this.e.close();
                }
                this.e = null;
            } catch (Throwable th) {
                this.e = null;
                try {
                    try {
                        if (this.d != null) {
                            this.d.close();
                        }
                        this.d = null;
                        if (this.g) {
                            this.g = false;
                            u<? super e> uVar = this.b;
                            if (uVar != null) {
                                uVar.b();
                            }
                        }
                        throw th;
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        u<? super e> uVar2 = this.b;
                        if (uVar2 != null) {
                            uVar2.b();
                        }
                    }
                }
            }
            try {
                try {
                    if (this.d != null) {
                        this.d.close();
                    }
                } catch (IOException e2) {
                    throw new a(e2);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    u<? super e> uVar3 = this.b;
                    if (uVar3 != null) {
                        uVar3.b();
                    }
                }
            }
        } catch (IOException e3) {
            throw new a(e3);
        }
    }
}
