package com.rovio.fusion;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import com.umeng.analytics.pro.bg;
/* loaded from: classes2.dex */
public class AccelerometerWrapper implements SensorEventListener, IActivityListener {
    private static final String TAG = "AccelerometerWrapper";
    private static float sm_filteredX;
    private static float sm_filteredY;
    private static float sm_filteredZ;
    private static float sm_measuredX;
    private static float sm_measuredY;
    private static float sm_measuredZ;
    private static SensorManager mSensorManager = null;
    private static Sensor mAccelerometer = null;
    private static boolean sm_firstReadingDone = false;
    private static boolean sm_listening = false;
    private static AccelerometerWrapper sm_accelerometerWrapper = null;

    /* loaded from: classes2.dex */
    public enum OrientationType {
        ORIENTATION_0,
        ORIENTATION_90,
        ORIENTATION_180,
        ORIENTATION_270
    }

    public static float getFilteredX() {
        return sm_filteredX;
    }

    public static float getFilteredY() {
        return sm_filteredY;
    }

    public static float getFilteredZ() {
        return sm_filteredZ;
    }

    public static float getX() {
        return sm_measuredX;
    }

    public static float getY() {
        return sm_measuredY;
    }

    public static float getZ() {
        return sm_measuredZ;
    }

    public static void start() {
        Log.i(TAG, "start()");
        if (sm_accelerometerWrapper == null) {
            sm_listening = false;
            sm_accelerometerWrapper = new AccelerometerWrapper();
            mSensorManager = (SensorManager) Globals.getActivity().getSystemService(bg.ac);
            mAccelerometer = mSensorManager.getDefaultSensor(1);
        }
        if (!sm_listening) {
            mSensorManager.registerListener(sm_accelerometerWrapper, mAccelerometer, 0);
            Globals.registerActivityListener(sm_accelerometerWrapper);
            sm_listening = true;
            sm_firstReadingDone = false;
        }
    }

    public static void stop() {
        Log.i(TAG, "stop()");
        if (mSensorManager != null && sm_listening) {
            sm_listening = false;
            mSensorManager.unregisterListener(sm_accelerometerWrapper);
            Globals.unregisterActivityListener(sm_accelerometerWrapper);
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        Log.i(TAG, "onResume()");
        if (mSensorManager != null && sm_listening) {
            mSensorManager.registerListener(this, mAccelerometer, 0);
            sm_firstReadingDone = false;
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        Log.i(TAG, "onPause()");
        if (mSensorManager != null && sm_listening) {
            mSensorManager.unregisterListener(this);
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        Log.i(TAG, "onDestroy()");
        Globals.unregisterActivityListener(this);
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
        Log.i(TAG, "onNewIntent()");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
        Log.i(TAG, "onActivityResult()");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        OrientationType orientationType = OrientationType.ORIENTATION_270;
        float f = sensorEvent.values[0] / 9.80665f;
        float f2 = sensorEvent.values[1] / 9.80665f;
        sm_measuredZ = sensorEvent.values[2] / 9.80665f;
        switch (orientationType) {
            case ORIENTATION_0:
                sm_measuredX = f;
                sm_measuredY = f2;
                break;
            case ORIENTATION_90:
                sm_measuredX = -f2;
                sm_measuredY = f;
                break;
            case ORIENTATION_180:
                sm_measuredX = -f;
                sm_measuredY = -f2;
                break;
            case ORIENTATION_270:
                sm_measuredX = f2;
                sm_measuredY = -f;
                break;
        }
        if (sm_firstReadingDone) {
            sm_filteredX = (sm_measuredX * 0.2f) + (sm_filteredX * (1.0f - 0.2f));
            sm_filteredY = (sm_measuredY * 0.2f) + (sm_filteredY * (1.0f - 0.2f));
            sm_filteredZ = ((1.0f - 0.2f) * sm_filteredZ) + (sm_measuredZ * 0.2f);
            return;
        }
        sm_firstReadingDone = true;
        sm_filteredX = sm_measuredX;
        sm_filteredY = sm_measuredY;
        sm_filteredZ = sm_measuredZ;
    }
}
