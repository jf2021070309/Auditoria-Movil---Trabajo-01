package com.amazon.aps.iva.v6;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.amazon.aps.iva.t5.k;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: classes.dex */
public final class e extends GLSurfaceView implements f {
    public static final /* synthetic */ int c = 0;
    public final a b;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.Renderer {
        public static final float[] k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] l = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer m = com.amazon.aps.iva.t5.k.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public final GLSurfaceView b;
        public final int[] c = new int[3];
        public final int[] d = new int[3];
        public final int[] e = new int[3];
        public final int[] f = new int[3];
        public final AtomicReference<com.amazon.aps.iva.z5.i> g = new AtomicReference<>();
        public com.amazon.aps.iva.t5.j h;
        public int i;
        public com.amazon.aps.iva.z5.i j;

        public a(GLSurfaceView gLSurfaceView) {
            this.b = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.e;
                this.f[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            com.amazon.aps.iva.z5.i andSet = this.g.getAndSet(null);
            if (andSet == null && this.j == null) {
                return;
            }
            if (andSet != null) {
                com.amazon.aps.iva.z5.i iVar = this.j;
                if (iVar != null) {
                    iVar.getClass();
                    throw null;
                }
                this.j = andSet;
            }
            this.j.getClass();
            GLES20.glUniformMatrix3fv(this.i, 1, false, k, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.d;
            try {
                com.amazon.aps.iva.t5.j jVar = new com.amazon.aps.iva.t5.j("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.h = jVar;
                GLES20.glVertexAttribPointer(jVar.b("in_pos"), 2, 5126, false, 0, (Buffer) m);
                iArr[0] = this.h.b("in_tc_y");
                iArr[1] = this.h.b("in_tc_u");
                iArr[2] = this.h.b("in_tc_v");
                this.i = GLES20.glGetUniformLocation(this.h.a, "mColorConversion");
                com.amazon.aps.iva.t5.k.b();
                int[] iArr2 = this.c;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i = 0; i < 3; i++) {
                        com.amazon.aps.iva.t5.j jVar2 = this.h;
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(jVar2.a, l[i]), i);
                        GLES20.glActiveTexture(33984 + i);
                        com.amazon.aps.iva.t5.k.a(3553, iArr2[i]);
                    }
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a unused) {
                }
                com.amazon.aps.iva.t5.k.b();
            } catch (k.a unused2) {
            }
        }
    }

    public e(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(com.amazon.aps.iva.z5.i iVar) {
        a aVar = this.b;
        if (aVar.g.getAndSet(iVar) == null) {
            aVar.b.requestRender();
            return;
        }
        throw null;
    }

    @Deprecated
    public f getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
