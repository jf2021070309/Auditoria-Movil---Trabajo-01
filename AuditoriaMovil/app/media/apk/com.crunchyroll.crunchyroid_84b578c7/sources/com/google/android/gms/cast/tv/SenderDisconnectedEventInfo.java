package com.google.android.gms.cast.tv;

import com.google.android.gms.common.internal.Objects;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class SenderDisconnectedEventInfo {
    private final SenderInfo zza;
    @DisconnectReason
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public @interface DisconnectReason {
        public static final int ERROR = 2;
        public static final int REQUESTED_BY_SENDER = 1;
        public static final int UNKNOWN = 0;
    }

    public SenderDisconnectedEventInfo(SenderInfo senderInfo, @DisconnectReason int i) {
        this.zza = senderInfo;
        this.zzb = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SenderDisconnectedEventInfo)) {
            return false;
        }
        SenderDisconnectedEventInfo senderDisconnectedEventInfo = (SenderDisconnectedEventInfo) obj;
        if (Objects.equal(this.zza, senderDisconnectedEventInfo.zza) && this.zzb == senderDisconnectedEventInfo.zzb) {
            return true;
        }
        return false;
    }

    @DisconnectReason
    public int getDisconnectReason() {
        return this.zzb;
    }

    public SenderInfo getSenderInfo() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }
}
