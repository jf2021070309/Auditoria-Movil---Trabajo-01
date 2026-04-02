package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
/* compiled from: Device.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/Device;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "manufacturer", "model", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getManufacturer", "getModel", "getName", "type", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Device {
    public static final int $stable = 0;
    private final String id;
    private final String manufacturer;
    private final String model;
    private final String name;
    private final String type;

    public Device(String str, String str2, String str3, String str4) {
        j.f(str, "id");
        j.f(str3, "manufacturer");
        j.f(str4, "model");
        this.id = str;
        this.name = str2;
        this.manufacturer = str3;
        this.model = str4;
        this.type = q.b(str3, " ", str4);
    }

    public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = device.id;
        }
        if ((i & 2) != 0) {
            str2 = device.name;
        }
        if ((i & 4) != 0) {
            str3 = device.manufacturer;
        }
        if ((i & 8) != 0) {
            str4 = device.model;
        }
        return device.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.manufacturer;
    }

    public final String component4() {
        return this.model;
    }

    public final Device copy(String str, String str2, String str3, String str4) {
        j.f(str, "id");
        j.f(str3, "manufacturer");
        j.f(str4, "model");
        return new Device(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        if (j.a(this.id, device.id) && j.a(this.name, device.name) && j.a(this.manufacturer, device.manufacturer) && j.a(this.model, device.model)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.model.hashCode() + a.b(this.manufacturer, (hashCode2 + hashCode) * 31, 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return f.a(com.amazon.aps.iva.n4.a.b("Device(id=", str, ", name=", str2, ", manufacturer="), this.manufacturer, ", model=", this.model, ")");
    }
}
