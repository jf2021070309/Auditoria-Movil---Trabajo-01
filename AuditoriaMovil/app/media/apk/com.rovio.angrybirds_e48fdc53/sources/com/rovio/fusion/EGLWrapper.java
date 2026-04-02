package com.rovio.fusion;

import android.util.Log;
import java.util.Vector;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* loaded from: classes2.dex */
public class EGLWrapper {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final boolean ENABLE_LOGGING = false;
    public static EGLConfig config;
    public static Vector<EGLContextWrapper> contexts = new Vector<>(8);
    public static EGLDisplay display;

    public static void init(EGLConfig eGLConfig) {
        config = eGLConfig;
        display = ((EGL10) EGLContext.getEGL()).eglGetCurrentDisplay();
        contexts.addElement(new EGLContextWrapper());
        getCurrentContext();
    }

    public static int getCurrentContext() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLContext eglGetCurrentContext = egl10.eglGetCurrentContext();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < contexts.size()) {
                if (contexts.get(i2).context != eglGetCurrentContext) {
                    i = i2 + 1;
                } else {
                    return i2;
                }
            } else {
                contexts.addElement(new EGLContextWrapper(eglGetCurrentContext, egl10.eglGetCurrentSurface(12377), egl10.eglGetCurrentSurface(12378)));
                return contexts.size() - 1;
            }
        }
    }

    public static int createSharedContext(int i) {
        if (i <= 0 || i >= contexts.size()) {
            return 0;
        }
        Debug("createSharedContext: " + i);
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLContext eglCreateContext = egl10.eglCreateContext(display, config, contexts.get(i).context, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        if (eglCreateContext == null) {
            return 0;
        }
        EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(display, config, new int[]{12375, 64, 12374, 64, 12344});
        if (eglCreatePbufferSurface == null) {
            return 0;
        }
        contexts.addElement(new EGLContextWrapper(eglCreateContext, eglCreatePbufferSurface, eglCreatePbufferSurface));
        return contexts.size() - 1;
    }

    public static void destroySharedContext(int i) {
        if (i <= 0 || i >= contexts.size()) {
            Log.e("EGLWrapper", "destroySharedContext: invalid handle");
        } else if (i == 1) {
            Log.e("EGLWrapper", "destroySharedContext: cannot destroy main context");
        } else {
            Debug("destroySharedContext: " + i);
            EGLContextWrapper eGLContextWrapper = contexts.get(i);
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            if (eGLContextWrapper.drawSurface != null && eGLContextWrapper.drawSurface == eGLContextWrapper.readSurface) {
                egl10.eglDestroySurface(display, eGLContextWrapper.drawSurface);
                eGLContextWrapper.drawSurface = null;
                eGLContextWrapper.readSurface = null;
            }
            if (eGLContextWrapper.context != null) {
                egl10.eglDestroyContext(display, eGLContextWrapper.context);
                eGLContextWrapper.context = null;
            }
        }
    }

    public static boolean registerThread(int i) {
        if (i <= 0 || i >= contexts.size()) {
            return false;
        }
        Debug("registerThread: " + i);
        EGLContextWrapper eGLContextWrapper = contexts.get(i);
        return eGLContextWrapper.context != null && ((EGL10) EGLContext.getEGL()).eglMakeCurrent(display, eGLContextWrapper.drawSurface, eGLContextWrapper.readSurface, eGLContextWrapper.context);
    }

    public static void unregisterThread() {
        Debug("unregisterThread");
        ((EGL10) EGLContext.getEGL()).eglMakeCurrent(display, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    }

    public static void Debug(String str) {
    }
}
