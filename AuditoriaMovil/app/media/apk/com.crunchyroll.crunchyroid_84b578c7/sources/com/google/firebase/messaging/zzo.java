package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.iva.d90.b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
final class zzo implements Closeable {
    private final URL zza;
    private Task<Bitmap> zzb;
    private volatile InputStream zzc;

    private zzo(URL url) {
        this.zza = url;
    }

    public static zzo zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zzo(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            }
            return null;
        }
    }

    private final byte[] zzc() throws IOException {
        URLConnection openConnection = this.zza.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.zzc = inputStream;
                byte[] zza = com.google.android.gms.internal.firebase_messaging.zzj.zza(com.google.android.gms.internal.firebase_messaging.zzj.zza(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = zza.length;
                    new StringBuilder(String.valueOf(this.zza).length() + 34);
                }
                if (zza.length <= 1048576) {
                    return zza;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.firebase_messaging.zzm.zza(th, th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            com.google.android.gms.internal.firebase_messaging.zzk.zza(this.zzc);
        } catch (NullPointerException unused) {
        }
    }

    public final Bitmap zzb() throws IOException {
        new StringBuilder(String.valueOf(this.zza).length() + 22);
        byte[] zzc = zzc();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzc, 0, zzc.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                new StringBuilder(String.valueOf(this.zza).length() + 31);
            }
            return decodeByteArray;
        }
        String valueOf = String.valueOf(this.zza);
        throw new IOException(b.a(valueOf.length() + 24, "Failed to decode image: ", valueOf));
    }

    public final void zza(Executor executor) {
        this.zzb = Tasks.call(executor, new Callable(this) { // from class: com.google.firebase.messaging.zzq
            private final zzo zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final Task<Bitmap> zza() {
        return (Task) Preconditions.checkNotNull(this.zzb);
    }
}
