package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.e4.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaa extends zzbi {
    private final String message;
    private final String name;

    public zzaa(String str, String str2) {
        this.name = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbi) {
            zzbi zzbiVar = (zzbi) obj;
            String str = this.name;
            if (str != null ? str.equals(zzbiVar.name()) : zzbiVar.name() == null) {
                String str2 = this.message;
                if (str2 != null ? str2.equals(zzbiVar.message()) : zzbiVar.message() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.message;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public String name() {
        return this.name;
    }

    public String toString() {
        return e.b("LoggableException{name=", this.name, ", message=", this.message, "}");
    }
}
