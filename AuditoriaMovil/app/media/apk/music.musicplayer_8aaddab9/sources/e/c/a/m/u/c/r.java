package e.c.a.m.u.c;

import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
/* loaded from: classes.dex */
public final class r {
    public static final File a = new File("/proc/self/fd");

    /* renamed from: b  reason: collision with root package name */
    public static volatile r f5884b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5885c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5886d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5887e;

    /* renamed from: f  reason: collision with root package name */
    public int f5888f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5889g = true;

    public r() {
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.hashCode();
            char c2 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.f5885c = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5886d = Level.INFO_INT;
            this.f5887e = 0;
            return;
        }
        this.f5886d = 700;
        this.f5887e = 128;
    }

    public static r a() {
        if (f5884b == null) {
            synchronized (r.class) {
                if (f5884b == null) {
                    f5884b = new r();
                }
            }
        }
        return f5884b;
    }

    public boolean b(int i2, int i3, boolean z, boolean z2) {
        int i4;
        boolean z3;
        if (!z || !this.f5885c || Build.VERSION.SDK_INT < 26 || z2 || i2 < (i4 = this.f5887e) || i3 < i4) {
            return false;
        }
        synchronized (this) {
            int i5 = this.f5888f + 1;
            this.f5888f = i5;
            if (i5 >= 50) {
                this.f5888f = 0;
                int length = a.list().length;
                boolean z4 = length < this.f5886d;
                this.f5889g = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f5886d);
                }
            }
            z3 = this.f5889g;
        }
        return z3;
    }
}
