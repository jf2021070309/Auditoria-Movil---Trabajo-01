package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ObjectType.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/worldturner/medeia/parser/type/PropertyType;", "", "propertyName", "", "type", "Lcom/worldturner/medeia/parser/type/MapperType;", "kotlinPropertyName", "readOnly", "", "(Ljava/lang/String;Lcom/worldturner/medeia/parser/type/MapperType;Ljava/lang/String;Z)V", "getKotlinPropertyName", "()Ljava/lang/String;", "getPropertyName", "getReadOnly", "()Z", "getType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class PropertyType {
    private final String kotlinPropertyName;
    private final String propertyName;
    private final boolean readOnly;
    private final MapperType type;

    public PropertyType(String str, MapperType mapperType, String str2, boolean z) {
        j.g(str, "propertyName");
        j.g(mapperType, "type");
        j.g(str2, "kotlinPropertyName");
        this.propertyName = str;
        this.type = mapperType;
        this.kotlinPropertyName = str2;
        this.readOnly = z;
    }

    public static /* synthetic */ PropertyType copy$default(PropertyType propertyType, String str, MapperType mapperType, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyType.propertyName;
        }
        if ((i & 2) != 0) {
            mapperType = propertyType.type;
        }
        if ((i & 4) != 0) {
            str2 = propertyType.kotlinPropertyName;
        }
        if ((i & 8) != 0) {
            z = propertyType.readOnly;
        }
        return propertyType.copy(str, mapperType, str2, z);
    }

    public final String component1() {
        return this.propertyName;
    }

    public final MapperType component2() {
        return this.type;
    }

    public final String component3() {
        return this.kotlinPropertyName;
    }

    public final boolean component4() {
        return this.readOnly;
    }

    public final PropertyType copy(String str, MapperType mapperType, String str2, boolean z) {
        j.g(str, "propertyName");
        j.g(mapperType, "type");
        j.g(str2, "kotlinPropertyName");
        return new PropertyType(str, mapperType, str2, z);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof PropertyType) {
                PropertyType propertyType = (PropertyType) obj;
                if (j.a(this.propertyName, propertyType.propertyName) && j.a(this.type, propertyType.type) && j.a(this.kotlinPropertyName, propertyType.kotlinPropertyName)) {
                    if (this.readOnly == propertyType.readOnly) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getKotlinPropertyName() {
        return this.kotlinPropertyName;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final MapperType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2;
        String str = this.propertyName;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        MapperType mapperType = this.type;
        if (mapperType != null) {
            i2 = mapperType.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.kotlinPropertyName;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        boolean z = this.readOnly;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return i6 + i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyType(propertyName=");
        sb.append(this.propertyName);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", kotlinPropertyName=");
        sb.append(this.kotlinPropertyName);
        sb.append(", readOnly=");
        return e.c(sb, this.readOnly, ")");
    }

    public /* synthetic */ PropertyType(String str, MapperType mapperType, String str2, boolean z, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(str, mapperType, (i & 4) != 0 ? str : str2, (i & 8) != 0 ? false : z);
    }
}
