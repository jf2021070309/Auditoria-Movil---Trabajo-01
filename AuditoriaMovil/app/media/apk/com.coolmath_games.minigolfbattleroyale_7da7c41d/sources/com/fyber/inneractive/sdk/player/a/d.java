package com.fyber.inneractive.sdk.player.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.player.a.g;
import com.fyber.inneractive.sdk.util.q;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.c.j.g {
    com.fyber.inneractive.sdk.player.a.a b;
    a c;
    b d;
    int e;
    s f;
    private g g;
    private Uri h;
    private FileInputStream j;
    private FileInputStream k;
    boolean a = false;
    private long i = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(g gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(com.fyber.inneractive.sdk.player.c.j.i iVar) throws IOException {
        if (this.b == null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            final com.fyber.inneractive.sdk.util.d dVar = new com.fyber.inneractive.sdk.util.d();
            this.h = iVar.a;
            g a2 = n.a().a(this.e, iVar.a.toString(), this.f, new g.e() { // from class: com.fyber.inneractive.sdk.player.a.d.1
                @Override // com.fyber.inneractive.sdk.player.a.g.e
                public final void a(com.fyber.inneractive.sdk.player.a.a aVar, Exception exc) {
                    if (!d.this.a) {
                        if (exc != null) {
                            atomicReference.set(exc);
                        } else {
                            Bitmap bitmap = dVar.a;
                            if (bitmap != null && d.this.c != null) {
                                d.this.c.a(bitmap);
                            }
                            d.this.b = aVar;
                        }
                    }
                    countDownLatch.countDown();
                }
            });
            this.g = a2;
            a2.o = dVar;
            this.g.a();
            b bVar = this.d;
            if (bVar != null) {
                bVar.a(this.g);
            }
            try {
                countDownLatch.await(7L, TimeUnit.SECONDS);
                if (this.b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e) {
                this.g.c();
                throw new IOException(e);
            }
        }
        this.i = iVar.d;
        String a3 = this.b.c ? this.b.a("http.file.length") : String.valueOf(this.b.a().length());
        if (a3 == null || !TextUtils.isDigitsOnly(a3)) {
            return -1L;
        }
        return Long.parseLong(a3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:10:0x000c, B:12:0x001a, B:13:0x0031, B:15:0x0033, B:21:0x0042, B:22:0x0045, B:24:0x0052, B:25:0x0057, B:26:0x0058, B:28:0x005c, B:33:0x0092, B:35:0x0096, B:37:0x009b, B:40:0x00a3, B:43:0x00b0, B:44:0x00b7, B:45:0x00b8, B:46:0x00c6, B:36:0x0099, B:30:0x006b, B:32:0x006f), top: B:54:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:10:0x000c, B:12:0x001a, B:13:0x0031, B:15:0x0033, B:21:0x0042, B:22:0x0045, B:24:0x0052, B:25:0x0057, B:26:0x0058, B:28:0x005c, B:33:0x0092, B:35:0x0096, B:37:0x009b, B:40:0x00a3, B:43:0x00b0, B:44:0x00b7, B:45:0x00b8, B:46:0x00c6, B:36:0x0099, B:30:0x006b, B:32:0x006f), top: B:54:0x000c, inners: #0 }] */
    @Override // com.fyber.inneractive.sdk.player.c.j.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.d.a(byte[], int, int):int");
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws IOException {
        this.a = true;
        this.i = 0L;
        q.a((Closeable) this.j);
        q.a((Closeable) this.k);
        this.j = null;
        this.k = null;
    }
}
