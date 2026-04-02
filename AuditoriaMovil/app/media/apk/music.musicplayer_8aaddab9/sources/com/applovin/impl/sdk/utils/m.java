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
public class m implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4360b;

    /* renamed from: c  reason: collision with root package name */
    private final SensorManager f4361c;

    /* renamed from: d  reason: collision with root package name */
    private final Sensor f4362d;

    /* renamed from: e  reason: collision with root package name */
    private final Sensor f4363e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f4364f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f4365g;

    /* renamed from: h  reason: collision with root package name */
    private float f4366h;

    public m(com.applovin.impl.sdk.m mVar) {
        this.f4364f = mVar;
        SensorManager sensorManager = (SensorManager) mVar.L().getSystemService("sensor");
        this.f4361c = sensorManager;
        this.f4362d = sensorManager.getDefaultSensor(9);
        this.f4363e = sensorManager.getDefaultSensor(4);
        this.a = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.dU)).intValue();
        this.f4360b = ((Float) mVar.a(com.applovin.impl.sdk.c.b.dT)).floatValue();
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a() {
        this.f4361c.unregisterListener(this);
        if (((Boolean) this.f4364f.K().a(com.applovin.impl.sdk.c.b.dR)).booleanValue()) {
            this.f4361c.registerListener(this, this.f4362d, (int) TimeUnit.MILLISECONDS.toMicros(this.a));
        }
        if (((Boolean) this.f4364f.K().a(com.applovin.impl.sdk.c.b.dS)).booleanValue()) {
            this.f4361c.registerListener(this, this.f4363e, (int) TimeUnit.MILLISECONDS.toMicros(this.a));
        }
    }

    public float b() {
        return this.f4366h;
    }

    public float c() {
        float[] fArr = this.f4365g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4361c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f4365g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f2 = this.f4366h * this.f4360b;
            this.f4366h = f2;
            float abs = Math.abs(sensorEvent.values[0]);
            this.f4366h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + abs + f2;
        }
    }
}
