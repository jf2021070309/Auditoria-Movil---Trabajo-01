package com.kwad.sdk.core.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.umeng.analytics.pro.bg;
/* loaded from: classes.dex */
public final class c {
    private volatile boolean auP = true;
    private long auQ = 0;
    private double auR = 9.999999717180685E-10d;
    private double[] auS = {PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE};
    private double[] auT = {PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE};
    private com.kwad.sdk.core.g.a auU;
    private a auV;
    private AdMatrixInfo.RotateInfo rotateInfo;

    /* loaded from: classes.dex */
    class a implements SensorEventListener {
        private a() {
        }

        /* synthetic */ a(c cVar, byte b) {
            this();
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            if (c.this.auQ != 0) {
                double d = (sensorEvent.timestamp - c.this.auQ) * c.this.auR;
                double[] dArr = c.this.auT;
                dArr[0] = dArr[0] + Math.toDegrees(f * d);
                double[] dArr2 = c.this.auT;
                dArr2[1] = dArr2[1] + Math.toDegrees(f2 * d);
                double[] dArr3 = c.this.auT;
                dArr3[2] = dArr3[2] + Math.toDegrees(f3 * d);
                c.this.CG();
                c.this.CH();
            }
            c.this.auQ = sensorEvent.timestamp;
        }
    }

    public c(AdMatrixInfo.RotateInfo rotateInfo) {
        this.rotateInfo = rotateInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CG() {
        if (this.auP) {
            if (Math.abs(this.auT[0]) > Math.abs(this.auS[0])) {
                this.auS[0] = this.auT[0];
            }
            if (Math.abs(this.auT[1]) > Math.abs(this.auS[1])) {
                this.auS[1] = this.auT[1];
            }
            if (Math.abs(this.auT[2]) > Math.abs(this.auS[2])) {
                this.auS[2] = this.auT[2];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CH() {
        AdMatrixInfo.RotateInfo rotateInfo;
        if (!this.auP || (rotateInfo = this.rotateInfo) == null || this.auU == null) {
            return;
        }
        if (a(0, rotateInfo.x.rotateDegree, this.rotateInfo.x.direction) || a(1, this.rotateInfo.y.rotateDegree, this.rotateInfo.y.direction) || a(2, this.rotateInfo.z.rotateDegree, this.rotateInfo.z.direction)) {
            this.auP = false;
            this.auU.ab(CI());
            this.auT = new double[]{PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE};
            this.auS = new double[]{PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE, PangleAdapterUtils.CPM_DEFLAUT_VALUE};
        }
    }

    private String CI() {
        return "{\"x\": " + this.auS[0] + ",\"y\":" + this.auS[1] + ",\"z\":" + this.auS[2] + "}";
    }

    private boolean a(int i, double d, int i2) {
        if (d <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || Math.abs(this.auT[i]) < d) {
            return false;
        }
        double[] dArr = this.auT;
        return (dArr[i] <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || i2 != 1) && (dArr[i] >= PangleAdapterUtils.CPM_DEFLAUT_VALUE || i2 != 2);
    }

    public final synchronized void CF() {
        this.auP = true;
    }

    public final void a(com.kwad.sdk.core.g.a aVar) {
        this.auU = aVar;
    }

    public final void a(AdMatrixInfo.RotateInfo rotateInfo) {
        this.rotateInfo = rotateInfo;
    }

    public final void bi(Context context) {
        if (context == null) {
            return;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(bg.ac);
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor != null) {
            if (this.auV == null) {
                this.auV = new a(this, (byte) 0);
            }
            sensorManager.registerListener(this.auV, defaultSensor, 2);
            return;
        }
        com.kwad.sdk.core.g.a aVar = this.auU;
        if (aVar != null) {
            aVar.ln();
        }
    }

    public final synchronized void bj(Context context) {
        if (context != null) {
            if (this.auV != null) {
                ((SensorManager) context.getSystemService(bg.ac)).unregisterListener(this.auV);
                this.auV = null;
            }
        }
    }
}
