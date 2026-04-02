package e.d.d.w;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzm;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
/* loaded from: classes2.dex */
public class b0 implements Closeable {
    public final URL a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Bitmap> f7629b;

    /* renamed from: c  reason: collision with root package name */
    public volatile InputStream f7630c;

    public b0(URL url) {
        this.a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            zzm.zza(this.f7630c);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }
}
