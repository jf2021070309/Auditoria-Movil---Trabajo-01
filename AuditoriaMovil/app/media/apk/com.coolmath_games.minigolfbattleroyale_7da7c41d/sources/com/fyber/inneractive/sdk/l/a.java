package com.fyber.inneractive.sdk.l;

import android.app.Application;
import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.n;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.config.v;
import com.fyber.inneractive.sdk.util.l;
import java.io.File;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            return "unity3d";
        } catch (Throwable unused) {
            return AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean b() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return Boolean.valueOf(((PowerManager) l.p().getSystemService("power")).isPowerSaveMode());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long c() {
        try {
            Application p = l.p();
            return Long.valueOf((a(p, true) + p.getCacheDir().getFreeSpace()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean d() {
        boolean isWiredHeadsetOn;
        AudioDeviceInfo[] devices;
        try {
            AudioManager audioManager = (AudioManager) l.p().getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                isWiredHeadsetOn = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        isWiredHeadsetOn = true;
                    }
                }
            } else {
                isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(isWiredHeadsetOn);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long e() {
        UUID nameUUIDFromBytes;
        long j = 0;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) l.p().getSystemService("storagestats");
                for (StorageVolume storageVolume : ((StorageManager) l.p().getSystemService("storage")).getStorageVolumes()) {
                    try {
                        try {
                            if (storageVolume.getUuid() == null) {
                                nameUUIDFromBytes = StorageManager.UUID_DEFAULT;
                            } else {
                                nameUUIDFromBytes = UUID.nameUUIDFromBytes(storageVolume.getUuid().getBytes());
                            }
                            if (nameUUIDFromBytes != null) {
                                j += storageStatsManager.getTotalBytes(nameUUIDFromBytes) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                            }
                        } catch (Throwable unused) {
                            if (storageVolume.isRemovable()) {
                                j += a(l.p(), false) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } else {
                Application p = l.p();
                j = (a(p, false) + p.getCacheDir().getTotalSpace()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
        } catch (Throwable unused3) {
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f() {
        try {
            boolean z = false;
            int ringerMode = ((AudioManager) l.p().getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z = true;
            }
            return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g() {
        int intExtra;
        try {
            Intent registerReceiver = l.p().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        try {
            Intent registerReceiver = l.p().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                float intExtra = (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
                return intExtra < 5.0f ? "1" : intExtra <= 9.0f ? "2" : intExtra <= 24.0f ? "3" : intExtra <= 39.0f ? "4" : intExtra <= 54.0f ? "5" : intExtra <= 69.0f ? "6" : intExtra <= 84.0f ? "7" : intExtra <= 100.0f ? "8" : "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean i() {
        if (l.d("android.permission.BLUETOOTH") && Build.VERSION.SDK_INT >= 18) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) l.p().getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2 && bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                    return null;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean j() {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return Boolean.valueOf(Settings.System.getInt(l.p().getContentResolver(), "airplane_mode_on", 0) != 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean k() {
        try {
            NotificationManager notificationManager = (NotificationManager) l.p().getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 23) {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static UnitDisplayType a(String str) {
        t a;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        s b = com.fyber.inneractive.sdk.config.a.b(str);
        if (b == null || b.b.size() <= 0 || (a = b.a()) == null) {
            return unitDisplayType;
        }
        v vVar = a.f;
        n nVar = a.c;
        if (vVar != null) {
            return vVar.j;
        }
        return nVar != null ? nVar.b : unitDisplayType;
    }

    public static Long l() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(Context context) {
        try {
            String y = l.y();
            if (Build.VERSION.SDK_INT >= 19 && context.getExternalFilesDirs(null).length >= 2) {
                if ("mounted".equals(y)) {
                    return true;
                }
                if ("mounted_ro".equals(y)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static long a(Context context, boolean z) {
        long j = 0;
        try {
            if (a(context)) {
                if (z) {
                    j = b(context).getFreeSpace();
                } else {
                    j = b(context).getTotalSpace();
                }
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    private static File b(Context context) {
        File[] externalCacheDirs;
        if (context == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        for (File file : context.getExternalCacheDirs()) {
            if (!Environment.isExternalStorageEmulated(file)) {
                return file;
            }
        }
        return null;
    }
}
