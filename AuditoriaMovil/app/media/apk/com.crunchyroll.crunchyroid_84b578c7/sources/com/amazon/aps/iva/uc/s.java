package com.amazon.aps.iva.uc;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class s {
    public static final boolean e;
    public static final boolean f;
    public static final File g;
    public static volatile s h;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final int a = 20000;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
        if (i < 28) {
            z2 = false;
        }
        f = z2;
        g = new File("/proc/self/fd");
    }

    public static s a() {
        if (h == null) {
            synchronized (s.class) {
                if (h == null) {
                    h = new s();
                }
            }
        }
        return h;
    }

    public final int b() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Build.MODEL.startsWith((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        }
        return this.a;
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            if (e && !this.d.get()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (z2) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (i >= 0 && i2 >= 0) {
                synchronized (this) {
                    int i3 = this.b + 1;
                    this.b = i3;
                    if (i3 >= 50) {
                        this.b = 0;
                        if (g.list().length < b()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.c = z5;
                        if (!z5) {
                            Log.isLoggable("Downsampler", 5);
                        }
                    }
                    z4 = this.c;
                }
                if (z4) {
                    return true;
                }
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            }
        }
    }
}
