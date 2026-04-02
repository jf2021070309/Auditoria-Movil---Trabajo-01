package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bt;
/* loaded from: classes3.dex */
public enum Gender implements bt {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);
    
    private final int value;

    Gender(int i) {
        this.value = i;
    }

    @Override // com.umeng.analytics.pro.bt
    public int getValue() {
        return this.value;
    }

    public static Gender findByValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return UNKNOWN;
                }
                return null;
            }
            return FEMALE;
        }
        return MALE;
    }
}
