package com.amazon.aps.iva.metrics.types;
/* loaded from: classes.dex */
public class DeviceInfo {
    private String device;
    private String model;
    private String os;
    private int osSdkVersion;

    /* loaded from: classes.dex */
    public static class DeviceInfoBuilder {
        private String device;
        private String model;
        private String os;
        private int osSdkVersion;

        public DeviceInfo build() {
            return new DeviceInfo(this.model, this.device, this.osSdkVersion, this.os);
        }

        public DeviceInfoBuilder device(String str) {
            this.device = str;
            return this;
        }

        public DeviceInfoBuilder model(String str) {
            this.model = str;
            return this;
        }

        public DeviceInfoBuilder os(String str) {
            this.os = str;
            return this;
        }

        public DeviceInfoBuilder osSdkVersion(int i) {
            this.osSdkVersion = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeviceInfo.DeviceInfoBuilder(model=");
            sb.append(this.model);
            sb.append(", device=");
            sb.append(this.device);
            sb.append(", osSdkVersion=");
            sb.append(this.osSdkVersion);
            sb.append(", os=");
            return b.c(sb, this.os, ")");
        }
    }

    public DeviceInfo(String str, String str2, int i, String str3) {
        this.model = str;
        this.device = str2;
        this.osSdkVersion = i;
        this.os = str3;
    }

    public static DeviceInfoBuilder builder() {
        return new DeviceInfoBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DeviceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        if (!deviceInfo.canEqual(this) || getOsSdkVersion() != deviceInfo.getOsSdkVersion()) {
            return false;
        }
        String model = getModel();
        String model2 = deviceInfo.getModel();
        if (model != null ? !model.equals(model2) : model2 != null) {
            return false;
        }
        String device = getDevice();
        String device2 = deviceInfo.getDevice();
        if (device != null ? !device.equals(device2) : device2 != null) {
            return false;
        }
        String os = getOs();
        String os2 = deviceInfo.getOs();
        if (os != null ? os.equals(os2) : os2 == null) {
            return true;
        }
        return false;
    }

    public String getDevice() {
        return this.device;
    }

    public String getModel() {
        return this.model;
    }

    public String getOs() {
        return this.os;
    }

    public int getOsSdkVersion() {
        return this.osSdkVersion;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String model = getModel();
        int osSdkVersion = (getOsSdkVersion() + 59) * 59;
        int i = 43;
        if (model == null) {
            hashCode = 43;
        } else {
            hashCode = model.hashCode();
        }
        int i2 = osSdkVersion + hashCode;
        String device = getDevice();
        int i3 = i2 * 59;
        if (device == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = device.hashCode();
        }
        int i4 = i3 + hashCode2;
        String os = getOs();
        int i5 = i4 * 59;
        if (os != null) {
            i = os.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "DeviceInfo(model=" + getModel() + ", device=" + getDevice() + ", osSdkVersion=" + getOsSdkVersion() + ", os=" + getOs() + ")";
    }
}
