package com.amazon.aps.iva.t5;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: BitmapLoader.java */
/* loaded from: classes.dex */
public interface b {
    default ListenableFuture<Bitmap> a(com.amazon.aps.iva.q5.d0 d0Var) {
        byte[] bArr = d0Var.k;
        if (bArr != null) {
            return c(bArr);
        }
        Uri uri = d0Var.m;
        if (uri != null) {
            return b(uri);
        }
        return null;
    }

    ListenableFuture<Bitmap> b(Uri uri);

    ListenableFuture<Bitmap> c(byte[] bArr);
}
