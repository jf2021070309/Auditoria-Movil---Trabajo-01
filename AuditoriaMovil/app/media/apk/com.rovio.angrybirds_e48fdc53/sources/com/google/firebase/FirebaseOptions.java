package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
/* loaded from: classes2.dex */
public final class FirebaseOptions {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    /* synthetic */ FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public Builder() {
        }

        public Builder(FirebaseOptions firebaseOptions) {
            this.b = firebaseOptions.b;
            this.a = firebaseOptions.a;
            this.c = firebaseOptions.c;
            this.d = firebaseOptions.d;
            this.e = firebaseOptions.e;
            this.f = firebaseOptions.f;
            this.g = firebaseOptions.g;
        }

        public final Builder setApiKey(String str) {
            this.a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public final Builder setApplicationId(String str) {
            this.b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public final Builder setDatabaseUrl(String str) {
            this.c = str;
            return this;
        }

        public final Builder setGaTrackingId(String str) {
            this.d = str;
            return this;
        }

        public final Builder setGcmSenderId(String str) {
            this.e = str;
            return this;
        }

        public final Builder setStorageBucket(String str) {
            this.f = str;
            return this;
        }

        public final Builder setProjectId(String str) {
            this.g = str;
            return this;
        }

        public final FirebaseOptions build() {
            return new FirebaseOptions(this.b, this.a, this.c, this.d, this.e, this.f, this.g, (byte) 0);
        }
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static FirebaseOptions fromResource(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final String getApiKey() {
        return this.a;
    }

    public final String getApplicationId() {
        return this.b;
    }

    public final String getDatabaseUrl() {
        return this.c;
    }

    public final String getGaTrackingId() {
        return this.d;
    }

    public final String getGcmSenderId() {
        return this.e;
    }

    public final String getStorageBucket() {
        return this.f;
    }

    public final String getProjectId() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FirebaseOptions) {
            FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
            return Objects.equal(this.b, firebaseOptions.b) && Objects.equal(this.a, firebaseOptions.a) && Objects.equal(this.c, firebaseOptions.c) && Objects.equal(this.d, firebaseOptions.d) && Objects.equal(this.e, firebaseOptions.e) && Objects.equal(this.f, firebaseOptions.f) && Objects.equal(this.g, firebaseOptions.g);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
