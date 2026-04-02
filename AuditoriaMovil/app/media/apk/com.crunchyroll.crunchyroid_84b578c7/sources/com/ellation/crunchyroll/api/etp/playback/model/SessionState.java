package com.ellation.crunchyroll.api.etp.playback.model;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.e4.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SessionState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;", "", "renewInSeconds", "", "noNetworkRetryIntervalInSeconds", "noNetworkTimeoutInSeconds", "maximumPauseInSeconds", "sessionExpirationInSeconds", "endOfVideoUnloadSeconds", "usersStreamLimit", "", "(IIIIIIZ)V", "getEndOfVideoUnloadSeconds", "()I", "getMaximumPauseInSeconds", "getNoNetworkRetryIntervalInSeconds", "getNoNetworkTimeoutInSeconds", "getRenewInSeconds", "getSessionExpirationInSeconds", "getUsersStreamLimit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionState {
    public static final int $stable = 0;
    @SerializedName("endOfVideoUnloadSeconds")
    private final int endOfVideoUnloadSeconds;
    @SerializedName("maximumPauseSeconds")
    private final int maximumPauseInSeconds;
    @SerializedName("noNetworkRetryIntervalSeconds")
    private final int noNetworkRetryIntervalInSeconds;
    @SerializedName("noNetworkTimeoutSeconds")
    private final int noNetworkTimeoutInSeconds;
    @SerializedName("renewSeconds")
    private final int renewInSeconds;
    @SerializedName("sessionExpirationSeconds")
    private final int sessionExpirationInSeconds;
    @SerializedName("usesStreamLimits")
    private final boolean usersStreamLimit;

    public SessionState() {
        this(0, 0, 0, 0, 0, 0, false, 127, null);
    }

    public static /* synthetic */ SessionState copy$default(SessionState sessionState, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = sessionState.renewInSeconds;
        }
        if ((i7 & 2) != 0) {
            i2 = sessionState.noNetworkRetryIntervalInSeconds;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = sessionState.noNetworkTimeoutInSeconds;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = sessionState.maximumPauseInSeconds;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = sessionState.sessionExpirationInSeconds;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = sessionState.endOfVideoUnloadSeconds;
        }
        int i12 = i6;
        if ((i7 & 64) != 0) {
            z = sessionState.usersStreamLimit;
        }
        return sessionState.copy(i, i8, i9, i10, i11, i12, z);
    }

    public final int component1() {
        return this.renewInSeconds;
    }

    public final int component2() {
        return this.noNetworkRetryIntervalInSeconds;
    }

    public final int component3() {
        return this.noNetworkTimeoutInSeconds;
    }

    public final int component4() {
        return this.maximumPauseInSeconds;
    }

    public final int component5() {
        return this.sessionExpirationInSeconds;
    }

    public final int component6() {
        return this.endOfVideoUnloadSeconds;
    }

    public final boolean component7() {
        return this.usersStreamLimit;
    }

    public final SessionState copy(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        return new SessionState(i, i2, i3, i4, i5, i6, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (this.renewInSeconds == sessionState.renewInSeconds && this.noNetworkRetryIntervalInSeconds == sessionState.noNetworkRetryIntervalInSeconds && this.noNetworkTimeoutInSeconds == sessionState.noNetworkTimeoutInSeconds && this.maximumPauseInSeconds == sessionState.maximumPauseInSeconds && this.sessionExpirationInSeconds == sessionState.sessionExpirationInSeconds && this.endOfVideoUnloadSeconds == sessionState.endOfVideoUnloadSeconds && this.usersStreamLimit == sessionState.usersStreamLimit) {
            return true;
        }
        return false;
    }

    public final int getEndOfVideoUnloadSeconds() {
        return this.endOfVideoUnloadSeconds;
    }

    public final int getMaximumPauseInSeconds() {
        return this.maximumPauseInSeconds;
    }

    public final int getNoNetworkRetryIntervalInSeconds() {
        return this.noNetworkRetryIntervalInSeconds;
    }

    public final int getNoNetworkTimeoutInSeconds() {
        return this.noNetworkTimeoutInSeconds;
    }

    public final int getRenewInSeconds() {
        return this.renewInSeconds;
    }

    public final int getSessionExpirationInSeconds() {
        return this.sessionExpirationInSeconds;
    }

    public final boolean getUsersStreamLimit() {
        return this.usersStreamLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = r.a(this.endOfVideoUnloadSeconds, r.a(this.sessionExpirationInSeconds, r.a(this.maximumPauseInSeconds, r.a(this.noNetworkTimeoutInSeconds, r.a(this.noNetworkRetryIntervalInSeconds, Integer.hashCode(this.renewInSeconds) * 31, 31), 31), 31), 31), 31);
        boolean z = this.usersStreamLimit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public String toString() {
        int i = this.renewInSeconds;
        int i2 = this.noNetworkRetryIntervalInSeconds;
        int i3 = this.noNetworkTimeoutInSeconds;
        int i4 = this.maximumPauseInSeconds;
        int i5 = this.sessionExpirationInSeconds;
        int i6 = this.endOfVideoUnloadSeconds;
        boolean z = this.usersStreamLimit;
        StringBuilder a = x.a("SessionState(renewInSeconds=", i, ", noNetworkRetryIntervalInSeconds=", i2, ", noNetworkTimeoutInSeconds=");
        a.append(i3);
        a.append(", maximumPauseInSeconds=");
        a.append(i4);
        a.append(", sessionExpirationInSeconds=");
        a.append(i5);
        a.append(", endOfVideoUnloadSeconds=");
        a.append(i6);
        a.append(", usersStreamLimit=");
        return e.c(a, z, ")");
    }

    public SessionState(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.renewInSeconds = i;
        this.noNetworkRetryIntervalInSeconds = i2;
        this.noNetworkTimeoutInSeconds = i3;
        this.maximumPauseInSeconds = i4;
        this.sessionExpirationInSeconds = i5;
        this.endOfVideoUnloadSeconds = i6;
        this.usersStreamLimit = z;
    }

    public /* synthetic */ SessionState(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, com.amazon.aps.iva.yb0.e eVar) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? false : z);
    }
}
