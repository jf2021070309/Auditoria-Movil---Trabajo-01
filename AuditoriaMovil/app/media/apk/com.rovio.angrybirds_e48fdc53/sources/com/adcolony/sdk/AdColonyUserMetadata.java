package com.adcolony.sdk;

import android.location.Location;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";
    JSONArray a = as.b();
    JSONObject b = as.a();
    Location c;

    public AdColonyUserMetadata setUserGender(String str) {
        if (q.d(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public String getUserGender() {
        return as.b(this.b, "adc_gender");
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", i);
        return this;
    }

    public int getUserAge() {
        return as.c(this.b, "adc_age");
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (q.d(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public String getUserMaritalStatus() {
        return as.b(this.b, "adc_marital_status");
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", i);
        return this;
    }

    public int getUserAnnualHouseholdIncome() {
        return as.c(this.b, "adc_household_income");
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (q.d(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public String getUserEducation() {
        return as.b(this.b, "adc_education");
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (q.d(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public String getUserZipCode() {
        return as.b(this.b, "adc_zip");
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", location.getTime());
        setMetadata("adc_accuracy", location.getAccuracy());
        return this;
    }

    public Location getUserLocation() {
        return this.c;
    }

    public AdColonyUserMetadata addUserInterest(String str) {
        if (q.d(str)) {
            as.a(this.a, str);
            as.a(this.b, "adc_interests", this.a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        this.a = as.b();
        as.a(this.b, "adc_interests", this.a);
        return this;
    }

    public String[] getUserInterests() {
        String[] strArr = new String[this.a.length()];
        for (int i = 0; i < this.a.length(); i++) {
            strArr[i] = as.c(this.a, i);
        }
        return strArr;
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (q.d(str)) {
            as.a(this.b, str, z);
        }
        return this;
    }

    public Object getMetadata(String str) {
        return as.a(this.b, str);
    }

    public AdColonyUserMetadata setMetadata(String str, double d) {
        if (q.d(str)) {
            as.a(this.b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (q.d(str2) && q.d(str)) {
            as.a(this.b, str, str2);
        }
        return this;
    }
}
