package com.fyber.inneractive.sdk.player.c.j;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c implements g {
    private final AssetManager a;
    private final u<? super c> b;
    private Uri c;
    private InputStream d;
    private long e;
    private boolean f;

    /* loaded from: classes.dex */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(Context context, u<? super c> uVar) {
        this.a = context.getAssets();
        this.b = uVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(i iVar) throws a {
        try {
            Uri uri = iVar.a;
            this.c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.a.open(path, 1);
            this.d = open;
            if (open.skip(iVar.d) < iVar.d) {
                throw new EOFException();
            }
            if (iVar.e != -1) {
                this.e = iVar.e;
            } else {
                long available = this.d.available();
                this.e = available;
                if (available == 2147483647L) {
                    this.e = -1L;
                }
            }
            this.f = true;
            u<? super c> uVar = this.b;
            if (uVar != null) {
                uVar.a();
            }
            return this.e;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
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
        int read = this.d.read(bArr, i, i2);
        if (read == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        u<? super c> uVar = this.b;
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
                if (this.d != null) {
                    this.d.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.d = null;
            if (this.f) {
                this.f = false;
                u<? super c> uVar = this.b;
                if (uVar != null) {
                    uVar.b();
                }
            }
        }
    }
}
