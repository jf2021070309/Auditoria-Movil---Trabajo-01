package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.CastDevice;
import kotlin.Metadata;
/* compiled from: CastSessionWrapperImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapperImpl;", "Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapper;", "castDevice", "Lcom/google/android/gms/cast/CastDevice;", "(Lcom/google/android/gms/cast/CastDevice;)V", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "hostAddress", "getHostAddress", "modelName", "getModelName", "version", "getVersion", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CastDeviceWrapperImpl implements CastDeviceWrapper {
    private final String deviceId;
    private final String hostAddress;
    private final String modelName;
    private final String version;

    public CastDeviceWrapperImpl(CastDevice castDevice) {
        j.f(castDevice, "castDevice");
        String deviceId = castDevice.getDeviceId();
        j.e(deviceId, "castDevice.deviceId");
        this.deviceId = deviceId;
        String modelName = castDevice.getModelName();
        j.e(modelName, "castDevice.modelName");
        this.modelName = modelName;
        String deviceVersion = castDevice.getDeviceVersion();
        j.e(deviceVersion, "castDevice.deviceVersion");
        this.version = deviceVersion;
        this.hostAddress = castDevice.getInetAddress().getHostAddress();
    }

    @Override // com.ellation.crunchyroll.cast.session.CastDeviceWrapper
    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastDeviceWrapper
    public String getHostAddress() {
        return this.hostAddress;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastDeviceWrapper
    public String getModelName() {
        return this.modelName;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastDeviceWrapper
    public String getVersion() {
        return this.version;
    }
}
