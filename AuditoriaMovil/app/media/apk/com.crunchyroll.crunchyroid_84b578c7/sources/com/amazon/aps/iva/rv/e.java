package com.amazon.aps.iva.rv;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: Device.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.rv.a {
    public final Context a;
    public final boolean b;
    public final b c;
    public final m d;

    /* compiled from: Device.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<f> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final f invoke() {
            int ceil;
            long j;
            f fVar;
            int i;
            String str;
            String str2;
            e eVar = e.this;
            eVar.getClass();
            Context context = eVar.a;
            j.f(context, "context");
            int i2 = new com.amazon.aps.iva.l3.a().a;
            if (i2 != 0) {
                com.amazon.aps.iva.mf0.a.a.a(com.amazon.aps.iva.c80.a.d("Framework performance class: ", i2, "."), new Object[0]);
                if (i2 >= 33) {
                    return f.HIGH;
                }
                if (i2 == 31) {
                    return f.MEDIUM;
                }
                return f.LOW;
            }
            com.amazon.aps.iva.mf0.a.a.a("Framework performance class is not defined.", new Object[0]);
            int[] iArr = {-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
            Object systemService = context.getSystemService("activity");
            j.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            int memoryClass = activityManager.getMemoryClass();
            if (Build.VERSION.SDK_INT >= 31) {
                str = Build.SOC_MODEL;
                if (!j.a(str, "unknown")) {
                    str2 = Build.SOC_MODEL;
                    j.e(str2, "SOC_MODEL");
                    Locale locale = Locale.getDefault();
                    j.e(locale, "getDefault()");
                    String upperCase = str2.toUpperCase(locale);
                    j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    int hashCode = upperCase.hashCode();
                    for (int i3 = 0; i3 < 11; i3++) {
                        if (iArr[i3] == hashCode) {
                            return f.LOW;
                        }
                    }
                }
            }
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < availableProcessors; i6++) {
                try {
                    String format = String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1));
                    j.e(format, "format(locale, format, *args)");
                    RandomAccessFile randomAccessFile = new RandomAccessFile(format, "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        Integer W = com.amazon.aps.iva.oe0.l.W(readLine);
                        if (W != null) {
                            i = W.intValue();
                        } else {
                            i = 0;
                        }
                        i5 += i / 1000;
                        i4++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            if (i4 == 0) {
                ceil = -1;
            } else {
                ceil = (int) Math.ceil(i5 / i4);
            }
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.totalMem;
            } catch (Exception unused2) {
                j = -1;
            }
            if (availableProcessors > 2 && memoryClass > 100 && ((availableProcessors > 4 || ceil == -1 || ceil > 1250) && (j == -1 || j >= 2147483648L))) {
                if (availableProcessors >= 8 && memoryClass > 160 && (ceil == -1 || ceil > 2055)) {
                    fVar = f.HIGH;
                } else {
                    fVar = f.MEDIUM;
                }
            } else {
                fVar = f.LOW;
            }
            com.amazon.aps.iva.mf0.a.a.a("Device performance info: selected_class = " + fVar + " (cpu_count = " + availableProcessors + ", freq = " + ceil + ", memoryClass = " + memoryClass + ", android version " + Build.VERSION.SDK_INT + ", manufacture " + Build.MANUFACTURER + ")", new Object[0]);
            return fVar;
        }
    }

    public e(Context context) {
        j.f(context, "context");
        this.a = context;
        this.b = j.a(Build.MANUFACTURER, "Amazon");
        this.c = new b(context, new d(context));
        this.d = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.rv.a
    public final boolean S0() {
        if (this.a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.rv.a
    public final boolean a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.rv.a
    public final boolean b() {
        if (this.a.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.rv.a
    public final boolean c() {
        return this.a.getResources().getBoolean(R.bool.isTablet);
    }
}
