package com.amazon.aps.iva.n5;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.iva.n5.d;
import com.amazon.aps.iva.n5.e;
/* compiled from: MediaSessionManager.java */
/* loaded from: classes.dex */
public final class b {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile b d;
    public final c a;

    /* compiled from: MediaSessionManager.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(e.a aVar);
    }

    public b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new d(context);
        } else {
            this.a = new c(context);
        }
    }

    public static b a(Context context) {
        b bVar;
        if (context != null) {
            synchronized (c) {
                if (d == null) {
                    d = new b(context.getApplicationContext());
                }
                bVar = d;
            }
            return bVar;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    /* compiled from: MediaSessionManager.java */
    /* renamed from: com.amazon.aps.iva.n5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0529b {
        public final e.a a;

        public C0529b(String str, int i, int i2) {
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.a = new d.a(str, i, i2);
                        return;
                    } else {
                        this.a = new e.a(str, i, i2);
                        return;
                    }
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0529b)) {
                return false;
            }
            return this.a.equals(((C0529b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public C0529b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName;
            packageName = remoteUserInfo.getPackageName();
            if (packageName != null) {
                if (!TextUtils.isEmpty(packageName)) {
                    this.a = new d.a(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
