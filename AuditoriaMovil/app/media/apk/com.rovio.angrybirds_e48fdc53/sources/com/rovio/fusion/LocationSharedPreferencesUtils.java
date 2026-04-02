package com.rovio.fusion;

import android.content.Context;
import android.content.SharedPreferences;
import com.rovio.fusion.Location;
/* loaded from: classes2.dex */
public class LocationSharedPreferencesUtils {
    public static final String COUNT_SUFIX = "_COUNT";
    public static final String ENABLED_SUFIX = "_ENABLED";
    public static final String LAT_SUFIX = "_LAT";
    public static final String LNG_SUFIX = "_LNG";
    public static final String PREV_REGION_SUFIX = "_PREV_REGION";
    public static final String PROX_ALERT_PREFIX = "LOCATION_PROXIMITY_ALERT_";
    public static final String RADIUS_SUFIX = "_RADIUS";
    public static final String REGION_SUFIX = "_REGIONID";
    public static final String SHARED_PREFS_NAME = "ANGRY_BIRDS_MAGIC_PLACES";

    public static void setRegionsAlertEnabled(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFS_NAME, 0).edit();
        edit.putBoolean("LOCATION_PROXIMITY_ALERT__ENABLED", z);
        edit.commit();
    }

    public static boolean isRegionsAlertEnabled(Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean("LOCATION_PROXIMITY_ALERT__ENABLED", true);
    }

    public static void defineRegions(Context context, Location.Region[] regionArr) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFS_NAME, 0).edit();
        if (regionArr != null && regionArr.length > 0) {
            for (int i = 0; i < regionArr.length; i++) {
                edit.putLong(PROX_ALERT_PREFIX + i + REGION_SUFIX, regionArr[i].regionId);
                edit.putLong(PROX_ALERT_PREFIX + i + LAT_SUFIX, Double.doubleToLongBits(regionArr[i].coord.getLatitude()));
                edit.putLong(PROX_ALERT_PREFIX + i + LNG_SUFIX, Double.doubleToLongBits(regionArr[i].coord.getLongitude()));
                edit.putInt(PROX_ALERT_PREFIX + i + RADIUS_SUFIX, regionArr[i].informRadius);
            }
            edit.putInt("LOCATION_PROXIMITY_ALERT__COUNT", regionArr.length);
        } else {
            edit.putInt("LOCATION_PROXIMITY_ALERT__COUNT", 0);
        }
        edit.commit();
    }

    public static Location.Region[] getRegions(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, 0);
        Location.Region[] regionArr = new Location.Region[sharedPreferences.getInt("LOCATION_PROXIMITY_ALERT__COUNT", 0)];
        for (int i = 0; i < regionArr.length; i++) {
            long j = sharedPreferences.getLong(PROX_ALERT_PREFIX + i + REGION_SUFIX, 0L);
            double longBitsToDouble = Double.longBitsToDouble(sharedPreferences.getLong(PROX_ALERT_PREFIX + i + LAT_SUFIX, 0L));
            double longBitsToDouble2 = Double.longBitsToDouble(sharedPreferences.getLong(PROX_ALERT_PREFIX + i + LNG_SUFIX, 0L));
            regionArr[i] = new Location.Region(j, new Location.GeoCoordinate(longBitsToDouble, longBitsToDouble2), sharedPreferences.getInt(PROX_ALERT_PREFIX + i + RADIUS_SUFIX, 0));
        }
        return regionArr;
    }

    public static int getMonitoredRegionsCount(Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getInt("LOCATION_PROXIMITY_ALERT__COUNT", 0);
    }

    public static boolean justEnteredRegion(Context context, long j) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, 0);
        long j2 = sharedPreferences.getLong("LOCATION_PROXIMITY_ALERT__PREV_REGION", -1L);
        sharedPreferences.edit().putLong("LOCATION_PROXIMITY_ALERT__PREV_REGION", j).commit();
        return j >= 0 && j2 != j;
    }
}
