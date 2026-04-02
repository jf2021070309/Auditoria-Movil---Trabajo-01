package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.n4.a;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzab extends NetworkRequestData {
    private final int connectionTimeoutMs;
    private final String content;
    private final String id;
    private final int readTimeoutMs;
    private final NetworkRequestData.RequestType requestType;
    private final String url;
    private final String userAgent;

    public zzab(NetworkRequestData.RequestType requestType, String str, String str2, String str3, String str4, int i, int i2) {
        if (requestType != null) {
            this.requestType = requestType;
            if (str != null) {
                this.id = str;
                if (str2 != null) {
                    this.url = str2;
                    this.content = str3;
                    if (str4 != null) {
                        this.userAgent = str4;
                        this.connectionTimeoutMs = i;
                        this.readTimeoutMs = i2;
                        return;
                    }
                    throw new NullPointerException("Null userAgent");
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null id");
        }
        throw new NullPointerException("Null requestType");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkRequestData) {
            NetworkRequestData networkRequestData = (NetworkRequestData) obj;
            if (this.requestType.equals(networkRequestData.requestType()) && this.id.equals(networkRequestData.id()) && this.url.equals(networkRequestData.url()) && ((str = this.content) != null ? str.equals(networkRequestData.content()) : networkRequestData.content() == null) && this.userAgent.equals(networkRequestData.userAgent()) && this.connectionTimeoutMs == networkRequestData.connectionTimeoutMs() && this.readTimeoutMs == networkRequestData.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.url.hashCode();
        String str = this.content;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public NetworkRequestData.RequestType requestType() {
        return this.requestType;
    }

    public String toString() {
        String valueOf = String.valueOf(this.requestType);
        String str = this.id;
        String str2 = this.url;
        String str3 = this.content;
        String str4 = this.userAgent;
        int i = this.connectionTimeoutMs;
        int i2 = this.readTimeoutMs;
        StringBuilder b = a.b("NetworkRequestData{requestType=", valueOf, ", id=", str, ", url=");
        com.amazon.aps.iva.m80.a.c(b, str2, ", content=", str3, ", userAgent=");
        b.append(str4);
        b.append(", connectionTimeoutMs=");
        b.append(i);
        b.append(", readTimeoutMs=");
        return e.f(b, i2, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String userAgent() {
        return this.userAgent;
    }
}
