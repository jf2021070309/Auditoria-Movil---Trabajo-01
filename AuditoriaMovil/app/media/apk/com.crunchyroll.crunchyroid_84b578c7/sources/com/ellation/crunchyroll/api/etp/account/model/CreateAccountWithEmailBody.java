package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CreateAccountWithEmailBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/CreateAccountWithEmailBody;", "", Scopes.EMAIL, "", "password", "preferredCommunicationLanguage", "preferredAudioLanguage", "preferredSubtitleLanguage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "getPreferredAudioLanguage", "getPreferredCommunicationLanguage", "getPreferredSubtitleLanguage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateAccountWithEmailBody {
    public static final int $stable = 0;
    @SerializedName(Scopes.EMAIL)
    private final String email;
    @SerializedName("password")
    private final String password;
    @SerializedName("preferred_content_audio_language")
    private final String preferredAudioLanguage;
    @SerializedName("preferred_communication_language")
    private final String preferredCommunicationLanguage;
    @SerializedName("preferred_content_subtitle_language")
    private final String preferredSubtitleLanguage;

    public CreateAccountWithEmailBody(String str, String str2, String str3, String str4, String str5) {
        j.f(str, Scopes.EMAIL);
        j.f(str2, "password");
        j.f(str3, "preferredCommunicationLanguage");
        this.email = str;
        this.password = str2;
        this.preferredCommunicationLanguage = str3;
        this.preferredAudioLanguage = str4;
        this.preferredSubtitleLanguage = str5;
    }

    public static /* synthetic */ CreateAccountWithEmailBody copy$default(CreateAccountWithEmailBody createAccountWithEmailBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createAccountWithEmailBody.email;
        }
        if ((i & 2) != 0) {
            str2 = createAccountWithEmailBody.password;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = createAccountWithEmailBody.preferredCommunicationLanguage;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = createAccountWithEmailBody.preferredAudioLanguage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = createAccountWithEmailBody.preferredSubtitleLanguage;
        }
        return createAccountWithEmailBody.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.preferredCommunicationLanguage;
    }

    public final String component4() {
        return this.preferredAudioLanguage;
    }

    public final String component5() {
        return this.preferredSubtitleLanguage;
    }

    public final CreateAccountWithEmailBody copy(String str, String str2, String str3, String str4, String str5) {
        j.f(str, Scopes.EMAIL);
        j.f(str2, "password");
        j.f(str3, "preferredCommunicationLanguage");
        return new CreateAccountWithEmailBody(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAccountWithEmailBody)) {
            return false;
        }
        CreateAccountWithEmailBody createAccountWithEmailBody = (CreateAccountWithEmailBody) obj;
        if (j.a(this.email, createAccountWithEmailBody.email) && j.a(this.password, createAccountWithEmailBody.password) && j.a(this.preferredCommunicationLanguage, createAccountWithEmailBody.preferredCommunicationLanguage) && j.a(this.preferredAudioLanguage, createAccountWithEmailBody.preferredAudioLanguage) && j.a(this.preferredSubtitleLanguage, createAccountWithEmailBody.preferredSubtitleLanguage)) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPreferredAudioLanguage() {
        return this.preferredAudioLanguage;
    }

    public final String getPreferredCommunicationLanguage() {
        return this.preferredCommunicationLanguage;
    }

    public final String getPreferredSubtitleLanguage() {
        return this.preferredSubtitleLanguage;
    }

    public int hashCode() {
        int hashCode;
        int b = a.b(this.preferredCommunicationLanguage, a.b(this.password, this.email.hashCode() * 31, 31), 31);
        String str = this.preferredAudioLanguage;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.preferredSubtitleLanguage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.preferredCommunicationLanguage;
        String str4 = this.preferredAudioLanguage;
        String str5 = this.preferredSubtitleLanguage;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("CreateAccountWithEmailBody(email=", str, ", password=", str2, ", preferredCommunicationLanguage=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", preferredAudioLanguage=", str4, ", preferredSubtitleLanguage=");
        return b.c(b, str5, ")");
    }
}
