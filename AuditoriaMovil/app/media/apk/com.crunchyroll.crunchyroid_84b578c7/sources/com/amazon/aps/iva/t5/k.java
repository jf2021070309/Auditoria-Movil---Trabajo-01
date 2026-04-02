package com.amazon.aps.iva.t5;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: GlUtil.java */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: GlUtil.java */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
    }

    public static void a(int i, int i2) throws a {
        GLES20.glBindTexture(i, i2);
        b();
        GLES20.glTexParameteri(i, 10240, 9729);
        b();
        GLES20.glTexParameteri(i, 10241, 9729);
        b();
        GLES20.glTexParameteri(i, 10242, 33071);
        b();
        GLES20.glTexParameteri(i, 10243, 33071);
        b();
    }

    public static void b() throws a {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (!z) {
            return;
        }
        throw new a(sb.toString());
    }

    public static void c(String str, boolean z) throws a {
        if (z) {
            return;
        }
        throw new a(str);
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
