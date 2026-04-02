package com.amazon.aps.iva.w6;

import android.opengl.GLES20;
import com.amazon.aps.iva.t5.k;
import com.amazon.aps.iva.w6.e;
import java.nio.FloatBuffer;
/* compiled from: ProjectionRenderer.java */
/* loaded from: classes.dex */
public final class g {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public a b;
    public com.amazon.aps.iva.t5.j c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final FloatBuffer b;
        public final FloatBuffer c;
        public final int d;

        public a(e.b bVar) {
            float[] fArr = bVar.c;
            this.a = fArr.length / 3;
            this.b = com.amazon.aps.iva.t5.k.d(fArr);
            this.c = com.amazon.aps.iva.t5.k.d(bVar.d);
            int i = bVar.b;
            if (i != 1) {
                if (i != 2) {
                    this.d = 4;
                    return;
                } else {
                    this.d = 6;
                    return;
                }
            }
            this.d = 5;
        }
    }

    public static boolean b(e eVar) {
        e.b[] bVarArr = eVar.a.a;
        if (bVarArr.length != 1 || bVarArr[0].a != 0) {
            return false;
        }
        e.b[] bVarArr2 = eVar.b.a;
        if (bVarArr2.length != 1 || bVarArr2[0].a != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            com.amazon.aps.iva.t5.j jVar = new com.amazon.aps.iva.t5.j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = jVar;
            this.d = GLES20.glGetUniformLocation(jVar.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            this.f = this.c.b("aPosition");
            this.g = this.c.b("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (k.a unused) {
        }
    }
}
