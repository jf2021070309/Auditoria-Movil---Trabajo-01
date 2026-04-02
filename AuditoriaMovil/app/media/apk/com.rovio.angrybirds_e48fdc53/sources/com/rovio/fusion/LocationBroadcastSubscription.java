package com.rovio.fusion;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.facebook.places.model.PlaceFields;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes2.dex */
public class LocationBroadcastSubscription {
    public static final String LOCATION_INTENT_NAME = "com.rovio.fusion.LocationBroadcastSubscription.LOCATION_READY";

    public static void startListening(Context context, String str) {
        LocationManager locationManager = (LocationManager) context.getSystemService(PlaceFields.LOCATION);
        locationManager.requestLocationUpdates(locationManager.isProviderEnabled(str) ? str : "passive", 0L, 0.0f, PendingIntent.getBroadcast(context.getApplicationContext(), 0, new Intent(LOCATION_INTENT_NAME), DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25));
    }

    public static void stopListening(Context context) {
        ((LocationManager) context.getSystemService(PlaceFields.LOCATION)).removeUpdates(PendingIntent.getBroadcast(context.getApplicationContext(), 0, new Intent(LOCATION_INTENT_NAME), DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25));
    }
}
