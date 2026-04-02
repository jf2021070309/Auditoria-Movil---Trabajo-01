package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: ChromecastUserStatusInteractor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/cast/UserStatusUpdateEvent;", "Lcom/amazon/aps/iva/ye/g;", "", "component1", "eventName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserStatusUpdateEvent implements g {
    @SerializedName("event")
    private final String eventName;

    public UserStatusUpdateEvent(String str) {
        j.f(str, "eventName");
        this.eventName = str;
    }

    private final String component1() {
        return this.eventName;
    }

    public static /* synthetic */ UserStatusUpdateEvent copy$default(UserStatusUpdateEvent userStatusUpdateEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userStatusUpdateEvent.eventName;
        }
        return userStatusUpdateEvent.copy(str);
    }

    public final UserStatusUpdateEvent copy(String str) {
        j.f(str, "eventName");
        return new UserStatusUpdateEvent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UserStatusUpdateEvent) && j.a(this.eventName, ((UserStatusUpdateEvent) obj).eventName)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    public String toString() {
        return e.e("UserStatusUpdateEvent(eventName=", this.eventName, ")");
    }
}
