package com.amazon.aps.iva.v6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.k;
import com.amazon.aps.iva.t5.p;
/* compiled from: PlaceholderSurface.java */
/* loaded from: classes.dex */
public final class d extends Surface {
    public static int e;
    public static boolean f;
    public final boolean b;
    public final a c;
    public boolean d;

    /* compiled from: PlaceholderSurface.java */
    /* loaded from: classes.dex */
    public static class a extends HandlerThread implements Handler.Callback {
        public com.amazon.aps.iva.t5.i b;
        public Handler c;
        public Error d;
        public RuntimeException e;
        public d f;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i) throws k.a {
            boolean z;
            boolean z2;
            int[] iArr;
            boolean z3;
            int[] iArr2;
            EGLSurface eglCreatePbufferSurface;
            boolean z4;
            this.b.getClass();
            com.amazon.aps.iva.t5.i iVar = this.b;
            iVar.getClass();
            boolean z5 = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.t5.k.c("eglGetDisplay failed", z);
            int[] iArr3 = new int[2];
            com.amazon.aps.iva.t5.k.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
            iVar.d = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr4 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, com.amazon.aps.iva.t5.i.h, 0, eGLConfigArr, 0, 1, iArr4, 0);
            if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.amazon.aps.iva.t5.k.c(g0.o("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), z2);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLDisplay eGLDisplay = iVar.d;
            if (i == 0) {
                iArr = new int[]{12440, 2, 12344};
            } else {
                iArr = new int[]{12440, 2, 12992, 1, 12344};
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
            if (eglCreateContext != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.amazon.aps.iva.t5.k.c("eglCreateContext failed", z3);
            iVar.e = eglCreateContext;
            EGLDisplay eGLDisplay2 = iVar.d;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                if (i == 2) {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                } else {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                }
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                if (eglCreatePbufferSurface != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                com.amazon.aps.iva.t5.k.c("eglCreatePbufferSurface failed", z4);
            }
            com.amazon.aps.iva.t5.k.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
            iVar.f = eglCreatePbufferSurface;
            int[] iArr5 = iVar.c;
            GLES20.glGenTextures(1, iArr5, 0);
            com.amazon.aps.iva.t5.k.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
            iVar.g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(iVar);
            SurfaceTexture surfaceTexture2 = this.b.g;
            surfaceTexture2.getClass();
            if (i != 0) {
                z5 = true;
            }
            this.f = new d(this, surfaceTexture2, z5);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
        public final void b() {
            this.b.getClass();
            com.amazon.aps.iva.t5.i iVar = this.b;
            iVar.b.removeCallbacks(iVar);
            try {
                SurfaceTexture surfaceTexture = iVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, iVar.c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = iVar.d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = iVar.d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = iVar.f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(iVar.d, iVar.f);
                }
                EGLContext eGLContext = iVar.e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(iVar.d, eGLContext);
                }
                if (g0.a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = iVar.d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(iVar.d);
                }
                iVar.d = null;
                iVar.e = null;
                iVar.f = null;
                iVar.g = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (k.a e) {
                    p.d("Failed to initialize placeholder surface", e);
                    this.e = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    p.d("Failed to initialize placeholder surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    p.d("Failed to initialize placeholder surface", e3);
                    this.e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public d(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c = aVar;
        this.b = z;
    }

    public static int a(Context context) {
        boolean z;
        String eglQueryString;
        String eglQueryString2;
        int i = g0.a;
        boolean z2 = false;
        if (i >= 24 && ((i >= 26 || (!"samsung".equals(g0.c) && !"XT1650".equals(g0.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        if (i >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z2 = true;
        }
        if (z2) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.v6.d b(android.content.Context r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<com.amazon.aps.iva.v6.d> r2 = com.amazon.aps.iva.v6.d.class
            monitor-enter(r2)
            boolean r3 = com.amazon.aps.iva.v6.d.f     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            int r4 = a(r4)     // Catch: java.lang.Throwable -> L20
            com.amazon.aps.iva.v6.d.e = r4     // Catch: java.lang.Throwable -> L20
            com.amazon.aps.iva.v6.d.f = r0     // Catch: java.lang.Throwable -> L20
        L13:
            int r4 = com.amazon.aps.iva.v6.d.e     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = r1
        L1a:
            monitor-exit(r2)
            if (r4 == 0) goto L1e
            goto L23
        L1e:
            r4 = r1
            goto L24
        L20:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L23:
            r4 = r0
        L24:
            com.amazon.aps.iva.cq.b.C(r4)
            com.amazon.aps.iva.v6.d$a r4 = new com.amazon.aps.iva.v6.d$a
            r4.<init>()
            if (r5 == 0) goto L31
            int r5 = com.amazon.aps.iva.v6.d.e
            goto L32
        L31:
            r5 = r1
        L32:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.c = r2
            com.amazon.aps.iva.t5.i r3 = new com.amazon.aps.iva.t5.i
            r3.<init>(r2)
            r4.b = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.c     // Catch: java.lang.Throwable -> L7d
            android.os.Message r5 = r2.obtainMessage(r0, r5, r1)     // Catch: java.lang.Throwable -> L7d
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L7d
        L51:
            com.amazon.aps.iva.v6.d r5 = r4.f     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.RuntimeException r5 = r4.e     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.Error r5 = r4.d     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            r4.wait()     // Catch: java.lang.InterruptedException -> L61 java.lang.Throwable -> L7d
            goto L51
        L61:
            r1 = r0
            goto L51
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L6d:
            java.lang.RuntimeException r5 = r4.e
            if (r5 != 0) goto L7c
            java.lang.Error r5 = r4.d
            if (r5 != 0) goto L7b
            com.amazon.aps.iva.v6.d r4 = r4.f
            r4.getClass()
            return r4
        L7b:
            throw r5
        L7c:
            throw r5
        L7d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.d.b(android.content.Context, boolean):com.amazon.aps.iva.v6.d");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            if (!this.d) {
                a aVar = this.c;
                aVar.c.getClass();
                aVar.c.sendEmptyMessage(2);
                this.d = true;
            }
        }
    }
}
