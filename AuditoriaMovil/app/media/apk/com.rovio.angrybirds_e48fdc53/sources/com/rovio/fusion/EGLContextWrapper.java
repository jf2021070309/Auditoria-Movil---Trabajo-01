package com.rovio.fusion;

import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;
/* loaded from: classes2.dex */
public class EGLContextWrapper {
    public EGLContext context;
    public EGLSurface drawSurface;
    public EGLSurface readSurface;

    public EGLContextWrapper() {
    }

    public EGLContextWrapper(EGLContext eGLContext, EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        this.context = eGLContext;
        this.drawSurface = eGLSurface;
        this.readSurface = eGLSurface2;
    }
}
