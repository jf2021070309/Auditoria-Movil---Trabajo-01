package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SetUsernameBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/SetUsernameBody;", "", "username", "", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetUsernameBody {
    public static final int $stable = 0;
    @SerializedName("username")
    private final String username;

    public SetUsernameBody(String str) {
        j.f(str, "username");
        this.username = str;
    }

    public static /* synthetic */ SetUsernameBody copy$default(SetUsernameBody setUsernameBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setUsernameBody.username;
        }
        return setUsernameBody.copy(str);
    }

    public final String component1() {
        return this.username;
    }

    public final SetUsernameBody copy(String str) {
        j.f(str, "username");
        return new SetUsernameBody(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetUsernameBody) && j.a(this.username, ((SetUsernameBody) obj).username)) {
            return true;
        }
        return false;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.username.hashCode();
    }

    public String toString() {
        return e.e("SetUsernameBody(username=", this.username, ")");
    }
}
