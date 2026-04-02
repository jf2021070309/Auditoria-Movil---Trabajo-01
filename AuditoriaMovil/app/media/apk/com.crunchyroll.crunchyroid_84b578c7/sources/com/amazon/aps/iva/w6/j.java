package com.amazon.aps.iva.w6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.amazon.aps.iva.t5.a0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.k;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.w6.d;
import com.amazon.aps.iva.w6.e;
import com.amazon.aps.iva.w6.g;
import com.amazon.aps.iva.w6.k;
import com.amazon.aps.iva.x2.u;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;
/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes.dex */
public final class j extends GLSurfaceView {
    public static final /* synthetic */ int m = 0;
    public final CopyOnWriteArrayList<b> b;
    public final SensorManager c;
    public final Sensor d;
    public final d e;
    public final Handler f;
    public final i g;
    public SurfaceTexture h;
    public Surface i;
    public boolean j;
    public boolean k;
    public boolean l;

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes.dex */
    public final class a implements GLSurfaceView.Renderer, k.a, d.a {
        public final i b;
        public final float[] e;
        public final float[] f;
        public final float[] g;
        public float h;
        public float i;
        public final float[] c = new float[16];
        public final float[] d = new float[16];
        public final float[] j = new float[16];
        public final float[] k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.e = fArr;
            float[] fArr2 = new float[16];
            this.f = fArr2;
            float[] fArr3 = new float[16];
            this.g = fArr3;
            this.b = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.i = 3.1415927f;
        }

        @Override // com.amazon.aps.iva.w6.d.a
        public final synchronized void a(float f, float[] fArr) {
            float[] fArr2 = this.e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.i = f2;
            Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(f2), (float) Math.sin(this.i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long d;
            e d2;
            float[] d3;
            float[] fArr2;
            synchronized (this) {
                Matrix.multiplyMM(this.k, 0, this.e, 0, this.g, 0);
                Matrix.multiplyMM(this.j, 0, this.f, 0, this.k, 0);
            }
            Matrix.multiplyMM(this.d, 0, this.c, 0, this.j, 0);
            i iVar = this.b;
            float[] fArr3 = this.d;
            iVar.getClass();
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            try {
                com.amazon.aps.iva.t5.k.b();
            } catch (k.a e) {
                p.d("Failed to draw a frame", e);
            }
            if (iVar.b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = iVar.k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a e2) {
                    p.d("Failed to draw a frame", e2);
                }
                if (iVar.c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(iVar.h, 0);
                }
                long timestamp = iVar.k.getTimestamp();
                a0<Long> a0Var = iVar.f;
                synchronized (a0Var) {
                    d = a0Var.d(timestamp, false);
                }
                Long l = d;
                if (l != null) {
                    c cVar = iVar.e;
                    float[] fArr4 = iVar.h;
                    long longValue = l.longValue();
                    a0<float[]> a0Var2 = cVar.c;
                    synchronized (a0Var2) {
                        d3 = a0Var2.d(longValue, true);
                    }
                    float[] fArr5 = d3;
                    if (fArr5 != null) {
                        float[] fArr6 = cVar.b;
                        float f = fArr5[0];
                        float f2 = -fArr5[1];
                        float f3 = -fArr5[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            fArr2 = fArr4;
                            Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            fArr2 = fArr4;
                            Matrix.setIdentityM(fArr6, 0);
                        }
                        if (!cVar.d) {
                            c.a(cVar.a, cVar.b);
                            cVar.d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, cVar.a, 0, cVar.b, 0);
                    }
                }
                a0<e> a0Var3 = iVar.g;
                synchronized (a0Var3) {
                    d2 = a0Var3.d(timestamp, true);
                }
                e eVar = d2;
                if (eVar != null) {
                    g gVar = iVar.d;
                    gVar.getClass();
                    if (g.b(eVar)) {
                        gVar.a = eVar.c;
                        gVar.b = new g.a(eVar.a.a[0]);
                        if (!eVar.d) {
                            e.b bVar = eVar.b.a[0];
                            float[] fArr7 = bVar.c;
                            int length2 = fArr7.length / 3;
                            com.amazon.aps.iva.t5.k.d(fArr7);
                            com.amazon.aps.iva.t5.k.d(bVar.d);
                            int i = bVar.b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(iVar.i, 0, fArr3, 0, iVar.h, 0);
            g gVar2 = iVar.d;
            int i2 = iVar.j;
            float[] fArr8 = iVar.i;
            g.a aVar = gVar2.b;
            if (aVar != null) {
                int i3 = gVar2.a;
                if (i3 == 1) {
                    fArr = g.j;
                } else if (i3 == 2) {
                    fArr = g.k;
                } else {
                    fArr = g.i;
                }
                GLES20.glUniformMatrix3fv(gVar2.e, 1, false, fArr, 0);
                GLES20.glUniformMatrix4fv(gVar2.d, 1, false, fArr8, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i2);
                GLES20.glUniform1i(gVar2.h, 0);
                try {
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a unused) {
                }
                GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) aVar.b);
                try {
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a unused2) {
                }
                GLES20.glVertexAttribPointer(gVar2.g, 2, 5126, false, 8, (Buffer) aVar.c);
                try {
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a unused3) {
                }
                GLES20.glDrawArrays(aVar.d, 0, aVar.a);
                try {
                    com.amazon.aps.iva.t5.k.b();
                } catch (k.a unused4) {
                }
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            float f;
            boolean z = false;
            GLES20.glViewport(0, 0, i, i2);
            float f2 = i / i2;
            if (f2 > 1.0f) {
                z = true;
            }
            if (z) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            j jVar = j.this;
            jVar.f.post(new u(6, jVar, this.b.a()));
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Surface surface);

        void b();
    }

    public j(Context context) {
        super(context, null);
        this.b = new CopyOnWriteArrayList<>();
        this.f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.c = sensorManager;
        Sensor defaultSensor = g0.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.g = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener kVar = new k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.e = new d(windowManager.getDefaultDisplay(), kVar, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(kVar);
    }

    public final void a() {
        boolean z;
        if (this.j && this.k) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.d;
        if (sensor != null && z != this.l) {
            d dVar = this.e;
            SensorManager sensorManager = this.c;
            if (z) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.l = z;
        }
    }

    public com.amazon.aps.iva.w6.a getCameraMotionListener() {
        return this.g;
    }

    public com.amazon.aps.iva.v6.g getVideoFrameMetadataListener() {
        return this.g;
    }

    public Surface getVideoSurface() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.post(new com.amazon.aps.iva.e.k(this, 4));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.g.l = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        a();
    }
}
