package com.ellation.crunchyroll.api.etp.playback.store;

import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PlaybackSessionData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÂ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "Ljava/io/Serializable;", "contentId", "", "token", "expirationTimeMs", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getContentId", "()Ljava/lang/String;", "isExpired", "", "()Z", "getToken", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaybackSessionData implements Serializable {
    public static final int $stable = 0;
    @SerializedName("contentId")
    private final String contentId;
    @SerializedName("expirationTimeMs")
    private final long expirationTimeMs;
    @SerializedName("token")
    private final String token;

    public PlaybackSessionData(String str, String str2, long j) {
        j.f(str, "contentId");
        j.f(str2, "token");
        this.contentId = str;
        this.token = str2;
        this.expirationTimeMs = j;
    }

    private final long component3() {
        return this.expirationTimeMs;
    }

    public static /* synthetic */ PlaybackSessionData copy$default(PlaybackSessionData playbackSessionData, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playbackSessionData.contentId;
        }
        if ((i & 2) != 0) {
            str2 = playbackSessionData.token;
        }
        if ((i & 4) != 0) {
            j = playbackSessionData.expirationTimeMs;
        }
        return playbackSessionData.copy(str, str2, j);
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component2() {
        return this.token;
    }

    public final PlaybackSessionData copy(String str, String str2, long j) {
        j.f(str, "contentId");
        j.f(str2, "token");
        return new PlaybackSessionData(str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackSessionData)) {
            return false;
        }
        PlaybackSessionData playbackSessionData = (PlaybackSessionData) obj;
        if (j.a(this.contentId, playbackSessionData.contentId) && j.a(this.token, playbackSessionData.token) && this.expirationTimeMs == playbackSessionData.expirationTimeMs) {
            return true;
        }
        return false;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Long.hashCode(this.expirationTimeMs) + a.b(this.token, this.contentId.hashCode() * 31, 31);
    }

    public final boolean isExpired() {
        if (System.currentTimeMillis() >= this.expirationTimeMs) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.contentId;
        String str2 = this.token;
        return b.b(com.amazon.aps.iva.n4.a.b("PlaybackSessionData(contentId=", str, ", token=", str2, ", expirationTimeMs="), this.expirationTimeMs, ")");
    }
}
