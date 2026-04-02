package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UsernamesResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UsernamesResponse;", "", "usernames", "", "", "(Ljava/util/List;)V", "getUsernames", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsernamesResponse {
    public static final int $stable = 8;
    @SerializedName("usernames")
    private final List<String> usernames;

    public UsernamesResponse(List<String> list) {
        j.f(list, "usernames");
        this.usernames = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsernamesResponse copy$default(UsernamesResponse usernamesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = usernamesResponse.usernames;
        }
        return usernamesResponse.copy(list);
    }

    public final List<String> component1() {
        return this.usernames;
    }

    public final UsernamesResponse copy(List<String> list) {
        j.f(list, "usernames");
        return new UsernamesResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UsernamesResponse) && j.a(this.usernames, ((UsernamesResponse) obj).usernames)) {
            return true;
        }
        return false;
    }

    public final List<String> getUsernames() {
        return this.usernames;
    }

    public int hashCode() {
        return this.usernames.hashCode();
    }

    public String toString() {
        List<String> list = this.usernames;
        return "UsernamesResponse(usernames=" + list + ")";
    }
}
