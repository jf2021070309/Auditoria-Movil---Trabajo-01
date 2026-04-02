package com.vungle.warren.model;
/* loaded from: classes2.dex */
public class VisionData {
    public String advertiser;
    public String campaign;
    public String creative;
    public long timestamp;

    public VisionData(long j, String str, String str2, String str3) {
        this.timestamp = j;
        this.creative = str;
        this.campaign = str2;
        this.advertiser = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisionData visionData = (VisionData) obj;
        if (this.timestamp != visionData.timestamp) {
            return false;
        }
        String str = this.creative;
        if (str == null ? visionData.creative == null : str.equals(visionData.creative)) {
            String str2 = this.campaign;
            if (str2 == null ? visionData.campaign == null : str2.equals(visionData.campaign)) {
                String str3 = this.advertiser;
                String str4 = visionData.advertiser;
                return str3 != null ? str3.equals(str4) : str4 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.creative;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.campaign;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.advertiser;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
