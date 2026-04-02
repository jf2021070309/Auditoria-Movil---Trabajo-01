package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
/* loaded from: classes2.dex */
public class Logger {
    private final String mTag;
    private final String zzei;
    private final GmsLogger zzew;
    private final int zzex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Logger(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
        L5:
            r6.<init>(r7, r0)
            return
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 91
            r1.append(r0)
            int r2 = r8.length
            r0 = 0
        L15:
            if (r0 >= r2) goto L2b
            r3 = r8[r0]
            int r4 = r1.length()
            r5 = 1
            if (r4 <= r5) goto L25
            java.lang.String r4 = ","
            r1.append(r4)
        L25:
            r1.append(r3)
            int r0 = r0 + 1
            goto L15
        L2b:
            r0 = 93
            java.lang.StringBuilder r0 = r1.append(r0)
            r2 = 32
            r0.append(r2)
            java.lang.String r0 = r1.toString()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.logging.Logger.<init>(java.lang.String, java.lang.String[]):void");
    }

    private Logger(String str, String str2) {
        this.zzei = str2;
        this.mTag = str;
        this.zzew = new GmsLogger(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.mTag, i)) {
            i++;
        }
        this.zzex = i;
    }

    public boolean isLoggable(int i) {
        return this.zzex <= i;
    }

    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.mTag, format(str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.mTag, format(str, objArr));
        }
    }

    public void i(String str, Object... objArr) {
        Log.i(this.mTag, format(str, objArr));
    }

    public void w(String str, Object... objArr) {
        Log.w(this.mTag, format(str, objArr));
    }

    public void e(String str, Object... objArr) {
        Log.e(this.mTag, format(str, objArr));
    }

    public void e(String str, Throwable th, Object... objArr) {
        Log.e(this.mTag, format(str, objArr), th);
    }

    public void wtf(String str, Throwable th, Object... objArr) {
        Log.wtf(this.mTag, format(str, objArr), th);
    }

    public void wtf(Throwable th) {
        Log.wtf(this.mTag, th);
    }

    private final String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzei.concat(str);
    }
}
