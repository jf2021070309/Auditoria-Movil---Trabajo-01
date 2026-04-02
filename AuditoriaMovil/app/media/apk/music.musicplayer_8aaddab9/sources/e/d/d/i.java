package e.d.d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
/* loaded from: classes.dex */
public final class i {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7049b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7050c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7051d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7052e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7053f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7054g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f7049b = str;
        this.a = str2;
        this.f7050c = str3;
        this.f7051d = str4;
        this.f7052e = str5;
        this.f7053f = str6;
        this.f7054g = str7;
    }

    public static i a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f7049b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return Objects.equal(this.f7049b, iVar.f7049b) && Objects.equal(this.a, iVar.a) && Objects.equal(this.f7050c, iVar.f7050c) && Objects.equal(this.f7051d, iVar.f7051d) && Objects.equal(this.f7052e, iVar.f7052e) && Objects.equal(this.f7053f, iVar.f7053f) && Objects.equal(this.f7054g, iVar.f7054g);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7049b, this.a, this.f7050c, this.f7051d, this.f7052e, this.f7053f, this.f7054g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f7049b).add("apiKey", this.a).add("databaseUrl", this.f7050c).add("gcmSenderId", this.f7052e).add("storageBucket", this.f7053f).add("projectId", this.f7054g).toString();
    }
}
