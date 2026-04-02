package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.yb0.j;
/* compiled from: LogcatLogHandler.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public static final com.amazon.aps.iva.oe0.f d = new com.amazon.aps.iva.oe0.f("(\\$\\d+)+$");
    public static final String[] e;
    public static final String[] f;
    public final String b;
    public final boolean c;

    static {
        String concat;
        String[] strArr = new String[7];
        strArr[0] = com.amazon.aps.iva.iq.a.class.getCanonicalName();
        strArr[1] = e.class.getCanonicalName();
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            concat = null;
        } else {
            concat = canonicalName.concat("$DefaultImpls");
        }
        strArr[2] = concat;
        strArr[3] = f.class.getCanonicalName();
        strArr[4] = b.class.getCanonicalName();
        strArr[5] = a.class.getCanonicalName();
        strArr[6] = c.class.getCanonicalName();
        e = strArr;
        f = new String[]{"com.datadog.android.timber", "timber.log"};
    }

    public f(String str, boolean z) {
        j.f(str, "serviceName");
        this.b = str;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005a A[EDGE_INSN: B:36:0x005a->B:23:0x005a ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.mq.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r10, java.lang.String r11, java.lang.Throwable r12, java.util.LinkedHashMap r13, java.util.concurrent.CopyOnWriteArraySet r14, java.lang.Long r15) {
        /*
            r9 = this;
            java.lang.String r13 = "message"
            com.amazon.aps.iva.yb0.j.f(r11, r13)
            java.lang.String r13 = "tags"
            com.amazon.aps.iva.yb0.j.f(r14, r13)
            boolean r13 = com.amazon.aps.iva.jp.c.d
            if (r13 == 0) goto L59
            boolean r13 = r9.c
            if (r13 == 0) goto L59
            java.lang.Throwable r13 = new java.lang.Throwable
            r13.<init>()
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()
            java.lang.String r14 = "stackTrace"
            com.amazon.aps.iva.yb0.j.e(r13, r14)
            int r14 = r13.length
            r15 = 0
            r0 = r15
        L23:
            if (r0 >= r14) goto L59
            r1 = r13[r0]
            int r0 = r0 + 1
            java.lang.String r2 = r1.getClassName()
            java.lang.String[] r3 = com.amazon.aps.iva.mq.f.e
            boolean r2 = com.amazon.aps.iva.lb0.o.N(r3, r2)
            if (r2 != 0) goto L55
            java.lang.String[] r2 = com.amazon.aps.iva.mq.f.f
            int r3 = r2.length
            r4 = r15
        L39:
            r5 = 1
            if (r4 >= r3) goto L51
            r6 = r2[r4]
            int r4 = r4 + 1
            java.lang.String r7 = r1.getClassName()
            java.lang.String r8 = "element.className"
            com.amazon.aps.iva.yb0.j.e(r7, r8)
            boolean r6 = com.amazon.aps.iva.oe0.m.h0(r7, r6, r15)
            if (r6 == 0) goto L39
            r2 = r15
            goto L52
        L51:
            r2 = r5
        L52:
            if (r2 == 0) goto L55
            goto L56
        L55:
            r5 = r15
        L56:
            if (r5 == 0) goto L23
            goto L5a
        L59:
            r1 = 0
        L5a:
            java.lang.String r13 = ""
            if (r1 != 0) goto L61
            java.lang.String r14 = r9.b
            goto L81
        L61:
            java.lang.String r14 = r1.getClassName()
            java.lang.String r15 = "stackTraceElement.className"
            com.amazon.aps.iva.yb0.j.e(r14, r15)
            com.amazon.aps.iva.oe0.f r15 = com.amazon.aps.iva.mq.f.d
            java.util.regex.Pattern r15 = r15.b
            java.util.regex.Matcher r14 = r15.matcher(r14)
            java.lang.String r14 = r14.replaceAll(r13)
            java.lang.String r15 = "nativePattern.matcher(in…).replaceAll(replacement)"
            com.amazon.aps.iva.yb0.j.e(r14, r15)
            r15 = 46
            java.lang.String r14 = com.amazon.aps.iva.oe0.q.K0(r15, r14, r14)
        L81:
            r14.getClass()
            if (r1 != 0) goto L87
            goto La3
        L87:
            java.lang.String r13 = r1.getMethodName()
            java.lang.String r15 = r1.getFileName()
            int r0 = r1.getLineNumber()
            java.lang.String r1 = "\t| at ."
            java.lang.String r2 = "("
            java.lang.String r3 = ":"
            java.lang.StringBuilder r13 = com.amazon.aps.iva.n4.a.b(r1, r13, r2, r15, r3)
            java.lang.String r15 = ")"
            java.lang.String r13 = defpackage.e.f(r13, r0, r15)
        La3:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r13)
            java.lang.String r11 = r15.toString()
            android.util.Log.println(r10, r14, r11)
            if (r12 == 0) goto Lbe
            java.lang.String r11 = android.util.Log.getStackTraceString(r12)
            android.util.Log.println(r10, r14, r11)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mq.f.e(int, java.lang.String, java.lang.Throwable, java.util.LinkedHashMap, java.util.concurrent.CopyOnWriteArraySet, java.lang.Long):void");
    }
}
