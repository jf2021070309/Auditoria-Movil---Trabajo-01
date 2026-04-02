package com.amazon.aps.iva.w6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
/* compiled from: OrientationListener.java */
/* loaded from: classes.dex */
public final class d implements SensorEventListener {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[3];
    public final Display e;
    public final a[] f;
    public boolean g;

    /* compiled from: OrientationListener.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float[] fArr);
    }

    public d(Display display, a... aVarArr) {
        this.e = display;
        this.f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.e.getRotation();
        float[] fArr3 = this.b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i2 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.a;
        if (!this.g) {
            c.a(this.c, fArr5);
            this.g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.b, 0, this.c, 0);
        for (a aVar : this.f) {
            aVar.a(f, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
