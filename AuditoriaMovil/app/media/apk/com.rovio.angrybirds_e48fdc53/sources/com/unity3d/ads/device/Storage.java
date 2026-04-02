package com.unity3d.ads.device;

import com.unity3d.ads.device.StorageManager;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.misc.JsonStorage;
import com.unity3d.ads.misc.Utilities;
import com.unity3d.ads.webview.WebViewApp;
import com.unity3d.ads.webview.WebViewEventCategory;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class Storage extends JsonStorage {
    private String _targetFileName;
    private StorageManager.StorageType _type;

    public Storage(String str, StorageManager.StorageType storageType) {
        this._targetFileName = str;
        this._type = storageType;
    }

    public StorageManager.StorageType getType() {
        return this._type;
    }

    public synchronized boolean readStorage() {
        boolean z = false;
        synchronized (this) {
            File file = new File(this._targetFileName);
            if (Utilities.readFile(file) != null) {
                try {
                    setData(new JSONObject(Utilities.readFile(file)));
                    z = true;
                } catch (Exception e) {
                    DeviceLog.exception("Error creating storage JSON", e);
                }
            }
        }
        return z;
    }

    public synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean writeStorage() {
        return getData() != null ? Utilities.writeFile(new File(this._targetFileName), getData().toString()) : false;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        synchronized (this) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this._type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
        }
    }
}
