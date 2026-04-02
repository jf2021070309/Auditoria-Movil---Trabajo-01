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
public class h implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.k a;
    private final SensorManager b;
    private final Sensor c;
    private final a d;
    private float e;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public h(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        SensorManager sensorManager = (SensorManager) kVar.J().getSystemService("sensor");
        this.b = sensorManager;
        this.c = sensorManager.getDefaultSensor(1);
        this.d = aVar;
    }

    public void a() {
        this.b.unregisterListener(this);
        this.b.registerListener(this, this.c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        this.a.ai().unregisterReceiver(this);
        this.a.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.a.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void b() {
        this.a.ai().unregisterReceiver(this);
        this.b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.e;
            float f2 = (f * 0.5f) + (max * 0.5f);
            this.e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.d.c();
            } else if (f <= -0.8f || this.e >= -0.8f) {
            } else {
                this.d.b();
            }
        }
    }
}
