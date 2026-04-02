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
public class i implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f4306b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f4307c;

    /* renamed from: d  reason: collision with root package name */
    private final a f4308d;

    /* renamed from: e  reason: collision with root package name */
    private float f4309e;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public i(com.applovin.impl.sdk.m mVar, a aVar) {
        this.a = mVar;
        SensorManager sensorManager = (SensorManager) mVar.L().getSystemService("sensor");
        this.f4306b = sensorManager;
        this.f4307c = sensorManager.getDefaultSensor(1);
        this.f4308d = aVar;
    }

    public void a() {
        this.f4306b.unregisterListener(this);
        this.f4306b.registerListener(this, this.f4307c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        this.a.aj().unregisterReceiver(this);
        this.a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void b() {
        this.a.aj().unregisterReceiver(this);
        this.f4306b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4306b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f2 = this.f4309e;
            float f3 = (max * 0.5f) + (f2 * 0.5f);
            this.f4309e = f3;
            if (f2 < 0.8f && f3 > 0.8f) {
                this.f4308d.c();
            } else if (f2 <= -0.8f || f3 >= -0.8f) {
            } else {
                this.f4308d.b();
            }
        }
    }
}
