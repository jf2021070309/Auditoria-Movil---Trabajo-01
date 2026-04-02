package com.amazon.aps.iva.d40;

import com.crunchyroll.crunchyroid.R;
/* compiled from: MaturityRestrictionOption.kt */
/* loaded from: classes2.dex */
public enum a implements com.amazon.aps.iva.p70.c {
    MATURITY_RESTRICTION_L(R.string.maturity_restriction_setting_l_title, R.string.maturity_restriction_setting_l_description, "L"),
    MATURITY_RESTRICTION_10(R.string.maturity_restriction_setting_10_title, R.string.maturity_restriction_setting_10_description, "10"),
    MATURITY_RESTRICTION_12(R.string.maturity_restriction_setting_12_title, R.string.maturity_restriction_setting_12_description, "12"),
    MATURITY_RESTRICTION_14(R.string.maturity_restriction_setting_14_title, R.string.maturity_restriction_setting_14_description, "14"),
    MATURITY_RESTRICTION_16(R.string.maturity_restriction_setting_16_title, R.string.maturity_restriction_setting_16_description, "16"),
    MATURITY_RESTRICTION_18(R.string.maturity_restriction_setting_18_title, R.string.maturity_restriction_setting_18_description, "18");
    
    public static final C0191a Companion = new C0191a();
    private final int description;
    private final int title;
    private final String value;

    /* compiled from: MaturityRestrictionOption.kt */
    /* renamed from: com.amazon.aps.iva.d40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0191a {
    }

    a(int i, int i2, String str) {
        this.title = i;
        this.description = i2;
        this.value = str;
    }

    @Override // com.amazon.aps.iva.p70.c
    public Integer getDescription() {
        return Integer.valueOf(this.description);
    }

    @Override // com.amazon.aps.iva.p70.c
    public int getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
