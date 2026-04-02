package com.amazon.aps.iva.b8;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
/* compiled from: CacheBitmapLoader.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.t5.b {
    public final com.amazon.aps.iva.t5.b a;
    public C0133a b;

    public a(h2 h2Var) {
        this.a = h2Var;
    }

    @Override // com.amazon.aps.iva.t5.b
    public final ListenableFuture<Bitmap> b(Uri uri) {
        boolean z;
        C0133a c0133a = this.b;
        if (c0133a != null) {
            Uri uri2 = c0133a.b;
            if (uri2 != null && uri2.equals(uri)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ListenableFuture<Bitmap> listenableFuture = this.b.c;
                com.amazon.aps.iva.cq.b.D(listenableFuture);
                return listenableFuture;
            }
        }
        ListenableFuture<Bitmap> b = this.a.b(uri);
        this.b = new C0133a(uri, b);
        return b;
    }

    @Override // com.amazon.aps.iva.t5.b
    public final ListenableFuture<Bitmap> c(byte[] bArr) {
        boolean z;
        C0133a c0133a = this.b;
        if (c0133a != null) {
            byte[] bArr2 = c0133a.a;
            if (bArr2 != null && Arrays.equals(bArr2, bArr)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ListenableFuture<Bitmap> listenableFuture = this.b.c;
                com.amazon.aps.iva.cq.b.D(listenableFuture);
                return listenableFuture;
            }
        }
        ListenableFuture<Bitmap> c = this.a.c(bArr);
        this.b = new C0133a(bArr, c);
        return c;
    }

    /* compiled from: CacheBitmapLoader.java */
    /* renamed from: com.amazon.aps.iva.b8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0133a {
        public final byte[] a;
        public final Uri b;
        public final ListenableFuture<Bitmap> c;

        public C0133a(byte[] bArr, ListenableFuture<Bitmap> listenableFuture) {
            this.a = bArr;
            this.b = null;
            this.c = listenableFuture;
        }

        public C0133a(Uri uri, ListenableFuture<Bitmap> listenableFuture) {
            this.a = null;
            this.b = uri;
            this.c = listenableFuture;
        }
    }
}
