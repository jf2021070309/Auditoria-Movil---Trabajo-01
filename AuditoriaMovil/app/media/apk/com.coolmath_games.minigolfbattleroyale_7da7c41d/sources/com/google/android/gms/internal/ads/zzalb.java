package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzalb implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] zza = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler zzb;
    private final int[] zzc = new int[1];
    private EGLDisplay zzd;
    private EGLContext zze;
    private EGLSurface zzf;
    private SurfaceTexture zzg;

    public zzalb(Handler handler, zzala zzalaVar) {
        this.zzb = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzb.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.zzg;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void zza(int i) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new zzaky("eglGetDisplay failed", null);
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.zzd = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, zza, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                throw new zzaky(zzamq.zzv("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.zzd, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext != null) {
                this.zze = eglCreateContext;
                EGLDisplay eGLDisplay = this.zzd;
                if (i == 1) {
                    eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    if (eglCreatePbufferSurface == null) {
                        throw new zzaky("eglCreatePbufferSurface failed", null);
                    }
                }
                if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                    this.zzf = eglCreatePbufferSurface;
                    GLES20.glGenTextures(1, this.zzc, 0);
                    int i2 = 0;
                    while (true) {
                        int glGetError = GLES20.glGetError();
                        if (glGetError == 0) {
                            break;
                        }
                        String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                        Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                        i2 = glGetError;
                    }
                    if (i2 != 0) {
                        String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
                        Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
                    }
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.zzc[0]);
                    this.zzg = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    return;
                }
                throw new zzaky("eglMakeCurrent failed", null);
            }
            throw new zzaky("eglCreateContext failed", null);
        }
        throw new zzaky("eglInitialize failed", null);
    }

    public final void zzb() {
        this.zzb.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.zzg;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.zzc, 0);
            }
            EGLDisplay eGLDisplay = this.zzd;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.zzd, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.zzf;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            EGLContext eGLContext = this.zze;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.zzd, eGLContext);
            }
            if (zzamq.zza >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.zzd;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay3 = this.zzd;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.zzd, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.zzf;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            EGLContext eGLContext2 = this.zze;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.zzd, eGLContext2);
            }
            if (zzamq.zza >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay4 = this.zzd;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            throw th;
        }
    }

    public final SurfaceTexture zzc() {
        SurfaceTexture surfaceTexture = this.zzg;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        throw null;
    }
}
