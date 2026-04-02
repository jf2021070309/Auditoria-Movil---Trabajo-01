package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UpdatePasswordBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UpdatePasswordBody;", "", "currentPassword", "", "newPassword", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentPassword", "()Ljava/lang/String;", "getNewPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatePasswordBody {
    public static final int $stable = 0;
    @SerializedName("current_password")
    private final String currentPassword;
    @SerializedName("new_password")
    private final String newPassword;

    public UpdatePasswordBody(String str, String str2) {
        j.f(str, "currentPassword");
        j.f(str2, "newPassword");
        this.currentPassword = str;
        this.newPassword = str2;
    }

    public static /* synthetic */ UpdatePasswordBody copy$default(UpdatePasswordBody updatePasswordBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePasswordBody.currentPassword;
        }
        if ((i & 2) != 0) {
            str2 = updatePasswordBody.newPassword;
        }
        return updatePasswordBody.copy(str, str2);
    }

    public final String component1() {
        return this.currentPassword;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final UpdatePasswordBody copy(String str, String str2) {
        j.f(str, "currentPassword");
        j.f(str2, "newPassword");
        return new UpdatePasswordBody(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePasswordBody)) {
            return false;
        }
        UpdatePasswordBody updatePasswordBody = (UpdatePasswordBody) obj;
        if (j.a(this.currentPassword, updatePasswordBody.currentPassword) && j.a(this.newPassword, updatePasswordBody.newPassword)) {
            return true;
        }
        return false;
    }

    public final String getCurrentPassword() {
        return this.currentPassword;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public int hashCode() {
        return this.newPassword.hashCode() + (this.currentPassword.hashCode() * 31);
    }

    public String toString() {
        return e.b("UpdatePasswordBody(currentPassword=", this.currentPassword, ", newPassword=", this.newPassword, ")");
    }
}
