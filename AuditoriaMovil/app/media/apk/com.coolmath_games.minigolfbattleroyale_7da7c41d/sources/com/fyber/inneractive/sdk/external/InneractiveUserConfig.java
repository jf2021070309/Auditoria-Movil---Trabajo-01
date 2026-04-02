package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class InneractiveUserConfig {
    private int a = -1;
    private Gender b = null;
    private String c = null;

    /* loaded from: classes.dex */
    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        return i > 0 && i <= 120;
    }

    public InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.a = i;
        } else {
            IAlog.d("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }

    public int getAge() {
        return this.a;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.b = gender;
        } else {
            IAlog.d("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    public Gender getGender() {
        return this.b;
    }

    public String getZipCode() {
        return this.c;
    }

    public InneractiveUserConfig setZipCode(String str) {
        if (str != null && Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            this.c = str;
        } else {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        }
        return this;
    }
}
