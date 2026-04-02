package com.facebook.ads;
/* loaded from: classes2.dex */
public class RewardData {
    private String a;
    private String b;

    public RewardData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String getCurrency() {
        return this.b;
    }

    public String getUserID() {
        return this.a;
    }
}
