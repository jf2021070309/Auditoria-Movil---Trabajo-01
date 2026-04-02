package com.kwad.sdk.core.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.umeng.analytics.pro.bg;
import java.util.Random;
/* loaded from: classes.dex */
public final class d {
    private static float auY = 9.81f;
    private static double auZ = 0.01d;
    private volatile boolean auP = true;
    private float auX;
    private b ava;
    private a avb;

    /* loaded from: classes.dex */
    class a implements SensorEventListener {
        private Random aqb;
        private boolean avd;
        private final float[] avc = {0.0f, 0.0f, 9.8f};
        private final float[] ave = {0.0f, 0.0f, 0.0f};

        public a() {
            this.avd = false;
            if (((DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class)) != null) {
                this.avd = false;
            }
        }

        private void CL() {
            if (this.aqb == null) {
                this.aqb = new Random();
            }
            if (this.aqb.nextInt(100) == 1) {
                a(this.avc);
            }
        }

        private void a(float[] fArr) {
            c(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            double abs = Math.abs(Math.sqrt((f * f) + (f2 * f2) + (f3 * f3)));
            if (b(fArr)) {
                abs = Math.abs(abs - d.auY);
            }
            if (!d.this.auP || abs < d.this.auX || d.this.ava == null) {
                return;
            }
            d.a(d.this, false);
            d.this.ava.a(abs);
        }

        private static boolean b(float[] fArr) {
            return Math.abs(Math.abs(Math.sqrt((double) (((fArr[0] * fArr[0]) + (fArr[1] * fArr[1])) + (fArr[2] * fArr[2])))) - ((double) d.auY)) <= d.auZ;
        }

        private void c(float[] fArr) {
            float[] fArr2 = this.ave;
            float f = (fArr2[0] == 0.0f && fArr2[1] == 0.0f && fArr2[2] == 0.0f) ? 1.0f : 0.6f;
            float f2 = 1.0f - f;
            fArr[0] = (fArr[0] * f) + (fArr2[0] * f2);
            fArr[1] = (fArr[1] * f) + (fArr2[1] * f2);
            fArr[2] = (f * fArr[2]) + (f2 * fArr2[2]);
            System.arraycopy(fArr, 0, fArr2, 0, 3);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            a(sensorEvent.values);
            if (this.avd) {
                CL();
            }
        }
    }

    public d(float f) {
        if (f <= 0.0f) {
            this.auX = 5.0f;
        } else {
            this.auX = f;
        }
    }

    static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.auP = false;
        return false;
    }

    public final synchronized void CF() {
        this.auP = true;
    }

    public final void a(b bVar) {
        this.ava = bVar;
    }

    public final void bi(Context context) {
        String str;
        if (context == null) {
            str = "startDetect context is null";
        } else {
            SensorManager sensorManager = (SensorManager) context.getSystemService(bg.ac);
            Sensor defaultSensor = sensorManager.getDefaultSensor(10);
            if (defaultSensor != null) {
                if (this.avb == null) {
                    this.avb = new a();
                }
                try {
                    sensorManager.registerListener(this.avb, defaultSensor, 2);
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
            b bVar = this.ava;
            if (bVar != null) {
                bVar.aT();
            }
            str = "startDetect default linear acceleration is null";
        }
        com.kwad.sdk.core.e.c.d("ShakeDetector", str);
    }

    public final synchronized void bj(Context context) {
        if (context != null) {
            if (this.avb != null) {
                ((SensorManager) context.getSystemService(bg.ac)).unregisterListener(this.avb);
                this.avb = null;
            }
        }
    }

    public final void e(float f) {
        this.auX = f;
    }
}
