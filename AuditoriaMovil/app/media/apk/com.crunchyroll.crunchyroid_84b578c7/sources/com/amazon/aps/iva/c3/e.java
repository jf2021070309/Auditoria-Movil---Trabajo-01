package com.amazon.aps.iva.c3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class e {
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.amazon.aps.iva.c3.e.g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            com.amazon.aps.iva.c3.e.a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            com.amazon.aps.iva.c3.e.b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            com.amazon.aps.iva.c3.e.c = r0
            java.lang.Class<?> r0 = com.amazon.aps.iva.c3.e.a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L3f
            goto L53
        L3f:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L53
            r8[r3] = r7     // Catch: java.lang.Throwable -> L53
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L53
            r8[r2] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L53
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r0 = r1
        L54:
            com.amazon.aps.iva.c3.e.d = r0
            java.lang.Class<?> r0 = com.amazon.aps.iva.c3.e.a
            if (r0 != 0) goto L5b
            goto L6b
        L5b:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L6b
            r8[r3] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6b
            r8[r2] = r9     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L6b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            com.amazon.aps.iva.c3.e.e = r0
            java.lang.Class<?> r0 = com.amazon.aps.iva.c3.e.a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L81
            r10 = 27
            if (r9 != r10) goto L7f
            goto L81
        L7f:
            r9 = r3
            goto L82
        L81:
            r9 = r2
        L82:
            if (r9 == 0) goto Lb1
            if (r0 != 0) goto L87
            goto Lb1
        L87:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb1
            r10[r3] = r7     // Catch: java.lang.Throwable -> Lb1
            r10[r2] = r8     // Catch: java.lang.Throwable -> Lb1
            r10[r6] = r8     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb1
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb1
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 5
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 6
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb1
            r1 = r0
        Lb1:
            com.amazon.aps.iva.c3.e.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c3.e.<clinit>():void");
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public Object b;
        public Activity c;
        public final int d;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;

        public a(Activity activity) {
            this.c = activity;
            this.d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.c == activity) {
                this.c = null;
                this.f = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onActivityPaused(android.app.Activity r5) {
            /*
                r4 = this;
                boolean r0 = r4.f
                if (r0 == 0) goto L3a
                boolean r0 = r4.g
                if (r0 != 0) goto L3a
                boolean r0 = r4.e
                if (r0 != 0) goto L3a
                java.lang.Object r0 = r4.b
                r1 = 1
                java.lang.reflect.Field r2 = com.amazon.aps.iva.c3.e.c     // Catch: java.lang.Throwable -> L32
                java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L32
                if (r2 != r0) goto L32
                int r0 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
                int r3 = r4.d
                if (r0 == r3) goto L20
                goto L32
            L20:
                java.lang.reflect.Field r0 = com.amazon.aps.iva.c3.e.b     // Catch: java.lang.Throwable -> L32
                java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L32
                android.os.Handler r0 = com.amazon.aps.iva.c3.e.g     // Catch: java.lang.Throwable -> L32
                com.amazon.aps.iva.c3.d r3 = new com.amazon.aps.iva.c3.d     // Catch: java.lang.Throwable -> L32
                r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> L32
                r0.postAtFrontOfQueue(r3)     // Catch: java.lang.Throwable -> L32
                r5 = r1
                goto L33
            L32:
                r5 = 0
            L33:
                if (r5 == 0) goto L3a
                r4.g = r1
                r5 = 0
                r4.b = r5
            L3a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c3.e.a.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.c == activity) {
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
