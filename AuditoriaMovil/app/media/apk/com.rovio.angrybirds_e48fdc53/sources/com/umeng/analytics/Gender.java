package com.umeng.analytics;

import java.util.Locale;
/* loaded from: classes3.dex */
public enum Gender {
    Male(1) { // from class: com.umeng.analytics.Gender.1
        @Override // java.lang.Enum
        public String toString() {
            return String.format(Locale.US, "Male:%d", Integer.valueOf(this.value));
        }
    },
    Female(2) { // from class: com.umeng.analytics.Gender.2
        @Override // java.lang.Enum
        public String toString() {
            return String.format(Locale.US, "Female:%d", Integer.valueOf(this.value));
        }
    },
    Unknown(0) { // from class: com.umeng.analytics.Gender.3
        @Override // java.lang.Enum
        public String toString() {
            return String.format(Locale.US, "Unknown:%d", Integer.valueOf(this.value));
        }
    };
    
    public int value;

    Gender(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }

    public static Gender getGender(int i) {
        if (i != 1) {
            if (i == 2) {
                return Female;
            }
            return Unknown;
        }
        return Male;
    }

    /* renamed from: com.umeng.analytics.Gender$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Gender.values().length];
            a = iArr;
            try {
                iArr[Gender.Male.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Gender.Female.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Gender.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public static com.umeng.commonsdk.statistics.proto.Gender transGender(Gender gender) {
        int i = AnonymousClass4.a[gender.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.umeng.commonsdk.statistics.proto.Gender.FEMALE;
            }
            return com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN;
        }
        return com.umeng.commonsdk.statistics.proto.Gender.MALE;
    }
}
