package com.amazon.aps.iva.tb0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes4.dex */
public class a extends com.amazon.aps.iva.sb0.a {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: com.amazon.aps.iva.tb0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0738a {
        public static final Integer a;

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L27
                int r2 = r1.intValue()
                if (r2 <= 0) goto L23
                r2 = 1
                goto L24
            L23:
                r2 = 0
            L24:
                if (r2 == 0) goto L27
                r0 = r1
            L27:
                com.amazon.aps.iva.tb0.a.C0738a.a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tb0.a.C0738a.<clinit>():void");
        }
    }

    @Override // com.amazon.aps.iva.sb0.a
    public final void a(Throwable th, Throwable th2) {
        boolean z;
        j.f(th, "cause");
        j.f(th2, "exception");
        Integer num = C0738a.a;
        if (num != null && num.intValue() < 19) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
