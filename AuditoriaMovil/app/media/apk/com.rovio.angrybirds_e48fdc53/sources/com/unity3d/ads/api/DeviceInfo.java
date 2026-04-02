package com.unity3d.ads.api;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.umeng.analytics.pro.bg;
import com.unity3d.ads.device.Device;
import com.unity3d.ads.device.DeviceError;
import com.unity3d.ads.device.IVolumeChangeListener;
import com.unity3d.ads.device.VolumeChange;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.properties.ClientProperties;
import com.unity3d.ads.webview.WebViewApp;
import com.unity3d.ads.webview.WebViewEventCategory;
import com.unity3d.ads.webview.bridge.WebViewCallback;
import com.unity3d.ads.webview.bridge.WebViewExposed;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class DeviceInfo {
    private static SparseArray<IVolumeChangeListener> _volumeChangeListeners;

    /* loaded from: classes4.dex */
    public enum DeviceInfoEvent {
        VOLUME_CHANGED
    }

    /* loaded from: classes4.dex */
    public enum StorageType {
        EXTERNAL,
        INTERNAL
    }

    @WebViewExposed
    public static void getAndroidId(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getAndroidId());
    }

    @WebViewExposed
    public static void getAdvertisingTrackingId(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getAdvertisingTrackingId());
    }

    @WebViewExposed
    public static void getLimitAdTrackingFlag(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(Device.isLimitAdTrackingEnabled()));
    }

    @WebViewExposed
    public static void getApiLevel(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getApiLevel()));
    }

    @WebViewExposed
    public static void getOsVersion(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getOsVersion());
    }

    @WebViewExposed
    public static void getManufacturer(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getManufacturer());
    }

    @WebViewExposed
    public static void getModel(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getModel());
    }

    @WebViewExposed
    public static void getScreenLayout(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getScreenLayout()));
    }

    @WebViewExposed
    public static void getScreenDensity(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getScreenDensity()));
    }

    @WebViewExposed
    public static void getScreenWidth(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getScreenWidth()));
    }

    @WebViewExposed
    public static void getScreenHeight(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getScreenHeight()));
    }

    @WebViewExposed
    public static void getTimeZone(Boolean bool, WebViewCallback webViewCallback) {
        webViewCallback.invoke(TimeZone.getDefault().getDisplayName(bool.booleanValue(), 0, Locale.US));
    }

    @WebViewExposed
    public static void getConnectionType(WebViewCallback webViewCallback) {
        String str;
        if (Device.isUsingWifi()) {
            str = "wifi";
        } else if (Device.isActiveNetworkConnected()) {
            str = "cellular";
        } else {
            str = "none";
        }
        webViewCallback.invoke(str);
    }

    @WebViewExposed
    public static void getNetworkType(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getNetworkType()));
    }

    @WebViewExposed
    public static void getNetworkOperator(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getNetworkOperator());
    }

    @WebViewExposed
    public static void getNetworkOperatorName(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getNetworkOperatorName());
    }

    @WebViewExposed
    public static void isAppInstalled(String str, WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(Device.isAppInstalled(str)));
    }

    @WebViewExposed
    public static void isRooted(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(Device.isRooted()));
    }

    @WebViewExposed
    public static void getInstalledPackages(boolean z, WebViewCallback webViewCallback) {
        webViewCallback.invoke(new JSONArray((Collection) Device.getInstalledPackages(z)));
    }

    @WebViewExposed
    public static void getPackageInfo(String str, WebViewCallback webViewCallback) {
        if (ClientProperties.getApplicationContext() != null) {
            PackageManager packageManager = ClientProperties.getApplicationContext().getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("installer", packageManager.getInstallerPackageName(str));
                    jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
                    jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                    jSONObject.put("versionCode", packageInfo.versionCode);
                    jSONObject.put("versionName", packageInfo.versionName);
                    jSONObject.put(DBDefinition.PACKAGE_NAME, packageInfo.packageName);
                    webViewCallback.invoke(jSONObject);
                    return;
                } catch (JSONException e) {
                    webViewCallback.error(DeviceError.JSON_ERROR, e.getMessage());
                    return;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                webViewCallback.error(DeviceError.APPLICATION_INFO_NOT_AVAILABLE, str);
                return;
            }
        }
        webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getUniqueEventId(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getUniqueEventId());
    }

    @WebViewExposed
    public static void getHeadset(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(Device.isWiredHeadsetOn()));
    }

    @WebViewExposed
    public static void getSystemProperty(String str, String str2, WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getSystemProperty(str, str2));
    }

    @WebViewExposed
    public static void getRingerMode(WebViewCallback webViewCallback) {
        int ringerMode = Device.getRingerMode();
        if (ringerMode <= -1) {
            switch (ringerMode) {
                case -2:
                    webViewCallback.error(DeviceError.AUDIOMANAGER_NULL, Integer.valueOf(ringerMode));
                    return;
                case -1:
                    webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, Integer.valueOf(ringerMode));
                    return;
                default:
                    DeviceLog.error("Unhandled ringerMode error: " + ringerMode);
                    return;
            }
        }
        webViewCallback.invoke(Integer.valueOf(ringerMode));
    }

    @WebViewExposed
    public static void getSystemLanguage(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Locale.getDefault().toString());
    }

    @WebViewExposed
    public static void getDeviceVolume(Integer num, WebViewCallback webViewCallback) {
        int streamVolume = Device.getStreamVolume(num.intValue());
        if (streamVolume <= -1) {
            switch (streamVolume) {
                case -2:
                    webViewCallback.error(DeviceError.AUDIOMANAGER_NULL, Integer.valueOf(streamVolume));
                    return;
                case -1:
                    webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, Integer.valueOf(streamVolume));
                    return;
                default:
                    DeviceLog.error("Unhandled deviceVolume error: " + streamVolume);
                    return;
            }
        }
        webViewCallback.invoke(Integer.valueOf(streamVolume));
    }

    @WebViewExposed
    public static void getDeviceMaxVolume(Integer num, WebViewCallback webViewCallback) {
        int streamMaxVolume = Device.getStreamMaxVolume(num.intValue());
        if (streamMaxVolume <= -1) {
            switch (streamMaxVolume) {
                case -2:
                    webViewCallback.error(DeviceError.AUDIOMANAGER_NULL, Integer.valueOf(streamMaxVolume));
                    return;
                case -1:
                    webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, Integer.valueOf(streamMaxVolume));
                    return;
                default:
                    DeviceLog.error("Unhandled deviceMaxVolume error: " + streamMaxVolume);
                    return;
            }
        }
        webViewCallback.invoke(Integer.valueOf(streamMaxVolume));
    }

    @WebViewExposed
    public static void registerVolumeChangeListener(final Integer num, WebViewCallback webViewCallback) {
        if (_volumeChangeListeners == null) {
            _volumeChangeListeners = new SparseArray<>();
        }
        if (_volumeChangeListeners.get(num.intValue()) == null) {
            IVolumeChangeListener iVolumeChangeListener = new IVolumeChangeListener() { // from class: com.unity3d.ads.api.DeviceInfo.1
                private int _streamType;

                {
                    this._streamType = num.intValue();
                }

                @Override // com.unity3d.ads.device.IVolumeChangeListener
                public void onVolumeChanged(int i) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i), Integer.valueOf(Device.getStreamMaxVolume(this._streamType)));
                }

                @Override // com.unity3d.ads.device.IVolumeChangeListener
                public int getStreamType() {
                    return this._streamType;
                }
            };
            _volumeChangeListeners.append(num.intValue(), iVolumeChangeListener);
            VolumeChange.registerListener(iVolumeChangeListener);
        }
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void unregisterVolumeChangeListener(Integer num, WebViewCallback webViewCallback) {
        if (_volumeChangeListeners != null && _volumeChangeListeners.get(num.intValue()) != null) {
            VolumeChange.unregisterListener(_volumeChangeListeners.get(num.intValue()));
            _volumeChangeListeners.remove(num.intValue());
        }
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getScreenBrightness(WebViewCallback webViewCallback) {
        int screenBrightness = Device.getScreenBrightness();
        if (screenBrightness <= -1) {
            switch (screenBrightness) {
                case -1:
                    webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, Integer.valueOf(screenBrightness));
                    return;
                default:
                    DeviceLog.error("Unhandled screenBrightness error: " + screenBrightness);
                    return;
            }
        }
        webViewCallback.invoke(Integer.valueOf(screenBrightness));
    }

    private static StorageType getStorageTypeFromString(String str) {
        try {
            return StorageType.valueOf(str);
        } catch (IllegalArgumentException e) {
            DeviceLog.exception("Illegal argument: " + str, e);
            return null;
        }
    }

    private static File getFileForStorageType(StorageType storageType) {
        switch (storageType) {
            case INTERNAL:
                return ClientProperties.getApplicationContext().getCacheDir();
            case EXTERNAL:
                return ClientProperties.getApplicationContext().getExternalCacheDir();
            default:
                DeviceLog.error("Unhandled storagetype: " + storageType);
                return null;
        }
    }

    @WebViewExposed
    public static void getFreeSpace(String str, WebViewCallback webViewCallback) {
        StorageType storageTypeFromString = getStorageTypeFromString(str);
        if (storageTypeFromString == null) {
            webViewCallback.error(DeviceError.INVALID_STORAGETYPE, str);
            return;
        }
        long freeSpace = Device.getFreeSpace(getFileForStorageType(storageTypeFromString));
        if (freeSpace <= -1) {
            webViewCallback.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(freeSpace));
        } else {
            webViewCallback.invoke(Long.valueOf(freeSpace));
        }
    }

    @WebViewExposed
    public static void getTotalSpace(String str, WebViewCallback webViewCallback) {
        StorageType storageTypeFromString = getStorageTypeFromString(str);
        if (storageTypeFromString == null) {
            webViewCallback.error(DeviceError.INVALID_STORAGETYPE, str);
            return;
        }
        long totalSpace = Device.getTotalSpace(getFileForStorageType(storageTypeFromString));
        if (totalSpace <= -1) {
            webViewCallback.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(totalSpace));
        } else {
            webViewCallback.invoke(Long.valueOf(totalSpace));
        }
    }

    @WebViewExposed
    public static void getBatteryLevel(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Float.valueOf(Device.getBatteryLevel()));
    }

    @WebViewExposed
    public static void getBatteryStatus(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Integer.valueOf(Device.getBatteryStatus()));
    }

    @WebViewExposed
    public static void getFreeMemory(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Long.valueOf(Device.getFreeMemory()));
    }

    @WebViewExposed
    public static void getTotalMemory(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Long.valueOf(Device.getTotalMemory()));
    }

    @WebViewExposed
    public static void getGLVersion(WebViewCallback webViewCallback) {
        String gLVersion = Device.getGLVersion();
        if (gLVersion == null) {
            webViewCallback.error(DeviceError.COULDNT_GET_GL_VERSION, new Object[0]);
        } else {
            webViewCallback.invoke(gLVersion);
        }
    }

    @WebViewExposed
    public static void getBoard(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getBoard());
    }

    @WebViewExposed
    public static void getBootloader(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getBootloader());
    }

    @WebViewExposed
    public static void getBrand(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getBrand());
    }

    @WebViewExposed
    public static void getDevice(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getDevice());
    }

    @WebViewExposed
    public static void getHardware(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getHardware());
    }

    @WebViewExposed
    public static void getHost(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getHost());
    }

    @WebViewExposed
    public static void getProduct(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Device.getProduct());
    }

    @WebViewExposed
    public static void getSupportedAbis(WebViewCallback webViewCallback) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = Device.getSupportedAbis().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        webViewCallback.invoke(jSONArray);
    }

    @WebViewExposed
    public static void getSensorList(WebViewCallback webViewCallback) {
        JSONArray jSONArray = new JSONArray();
        List<Sensor> sensorList = Device.getSensorList();
        if (sensorList != null) {
            for (Sensor sensor : sensorList) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", sensor.getName());
                    jSONObject.put("type", sensor.getType());
                    jSONObject.put("vendor", sensor.getVendor());
                    jSONObject.put("maximumRange", sensor.getMaximumRange());
                    jSONObject.put("power", sensor.getPower());
                    jSONObject.put("version", sensor.getVersion());
                    jSONObject.put(bg.z, sensor.getResolution());
                    jSONObject.put("minDelay", sensor.getMinDelay());
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    webViewCallback.error(DeviceError.JSON_ERROR, e.getMessage());
                    return;
                }
            }
        }
        webViewCallback.invoke(jSONArray);
    }
}
