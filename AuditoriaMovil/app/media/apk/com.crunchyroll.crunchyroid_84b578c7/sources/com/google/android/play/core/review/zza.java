package com.google.android.play.core.review;

import android.app.PendingIntent;
/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes3.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.zza = pendingIntent;
            this.zzb = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.zza.equals(reviewInfo.zza()) && this.zzb == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.zza.toString();
        boolean z = this.zzb;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z + "}";
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.zzb;
    }
}
