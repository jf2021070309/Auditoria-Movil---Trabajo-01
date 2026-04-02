package com.rovio.fusion;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.places.model.PlaceFields;
import com.rovio.fusion.Location;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class LocationBroadcastReceiver extends BroadcastReceiver {
    public static final int LOCATION_REQUERY_MIN_DELAY_MINS = 5;

    @Override // android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
        boolean z;
        android.location.Location location = (android.location.Location) intent.getExtras().get(PlaceFields.LOCATION);
        if (location != null) {
            Location.Region[] regions = LocationSharedPreferencesUtils.getRegions(context);
            if (regions.length == 0) {
                scheduleNextStart(300, context);
            } else {
                int i = 0;
                int i2 = 1000;
                while (true) {
                    if (i >= regions.length) {
                        z = false;
                        break;
                    }
                    float[] fArr = new float[3];
                    android.location.Location.distanceBetween(regions[i].coord.getLatitude(), regions[i].coord.getLongitude(), location.getLatitude(), location.getLongitude(), fArr);
                    if (fArr[0] < regions[i].informRadius) {
                        z = true;
                        if (true == LocationSharedPreferencesUtils.justEnteredRegion(context, regions[i].regionId)) {
                            Intent intent2 = new Intent("com.rovio.ka3d.LOCATION_PROXIMITY_ALERT");
                            intent2.putExtra(LocationWrapper.KEY_EXTRA_REGION_ID, (int) regions[i].regionId);
                            context.sendBroadcast(intent2);
                        }
                    } else {
                        i++;
                        i2 = (int) Math.min(i2, fArr[0] / 1000.0f);
                    }
                }
                if (!z) {
                    LocationSharedPreferencesUtils.justEnteredRegion(context, -1L);
                    scheduleNextStart(Math.max(i2, 5) * 60, context);
                }
            }
        }
        scheduleNextStart(300, context);
    }

    public synchronized void scheduleNextStart(int i, final Context context) {
        if (LocationSharedPreferencesUtils.isRegionsAlertEnabled(context)) {
            LocationBroadcastSubscription.stopListening(context);
            Date date = new Date(System.currentTimeMillis() + (i * 1000));
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.rovio.fusion.LocationBroadcastReceiver.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    timer.cancel();
                    LocationBroadcastSubscription.startListening(context, "network");
                }
            }, date);
        }
    }
}
