package com.amazon.aps.iva.b8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.io.ByteStreams;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
/* compiled from: SimpleBitmapLoader.java */
/* loaded from: classes.dex */
public final class h2 implements com.amazon.aps.iva.t5.b {
    public static final Supplier<ListeningExecutorService> b = Suppliers.memoize(new e2(0));
    public final ListeningExecutorService a;

    public h2() {
        ListeningExecutorService listeningExecutorService = b.get();
        com.amazon.aps.iva.cq.b.D(listeningExecutorService);
        this.a = MoreExecutors.listeningDecorator(listeningExecutorService);
    }

    @Override // com.amazon.aps.iva.t5.b
    public final ListenableFuture<Bitmap> b(final Uri uri) {
        return this.a.submit(new Callable() { // from class: com.amazon.aps.iva.b8.f2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                if ("file".equals(uri2.getScheme())) {
                    String path = uri2.getPath();
                    if (path != null) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(path);
                        if (decodeFile == null) {
                            throw new IllegalArgumentException("Could not read image from file");
                        }
                        return decodeFile;
                    }
                    throw new IllegalArgumentException("Could not read image from file");
                }
                URLConnection openConnection = new URL(uri2.toString()).openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] byteArray = ByteStreams.toByteArray(inputStream);
                            boolean z = false;
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                            if (decodeByteArray != null) {
                                z = true;
                            }
                            com.amazon.aps.iva.cq.b.v(z, "Could not decode image data");
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return decodeByteArray;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    throw new IOException(com.amazon.aps.iva.q.c0.a("Invalid response status code: ", responseCode));
                }
                throw new UnsupportedOperationException("Unsupported scheme: " + uri2.getScheme());
            }
        });
    }

    @Override // com.amazon.aps.iva.t5.b
    public final ListenableFuture<Bitmap> c(byte[] bArr) {
        return this.a.submit((Callable) new g2(bArr, 0));
    }
}
