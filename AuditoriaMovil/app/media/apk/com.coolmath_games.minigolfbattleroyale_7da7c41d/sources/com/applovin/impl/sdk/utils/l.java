package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class l implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final int a;
    private final float b;
    private final SensorManager c;
    private final Sensor d;
    private final Sensor e;
    private final com.applovin.impl.sdk.k f;
    private float[] g;
    private float h;

    public l(com.applovin.impl.sdk.k kVar) {
        this.f = kVar;
        SensorManager sensorManager = (SensorManager) kVar.J().getSystemService("sensor");
        this.c = sensorManager;
        this.d = sensorManager.getDefaultSensor(9);
        this.e = this.c.getDefaultSensor(4);
        this.a = ((Integer) kVar.a(com.applovin.impl.sdk.c.b.dS)).intValue();
        this.b = ((Float) kVar.a(com.applovin.impl.sdk.c.b.dR)).floatValue();
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a() {
        this.c.unregisterListener(this);
        if (((Boolean) this.f.I().a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            this.c.registerListener(this, this.d, (int) TimeUnit.MILLISECONDS.toMicros(this.a));
        }
        if (((Boolean) this.f.I().a(com.applovin.impl.sdk.c.b.dQ)).booleanValue()) {
            this.c.registerListener(this, this.e, (int) TimeUnit.MILLISECONDS.toMicros(this.a));
        }
    }

    public float b() {
        return this.h;
    }

    public float c() {
        float[] fArr = this.g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.h * this.b;
            this.h = f;
            this.h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
