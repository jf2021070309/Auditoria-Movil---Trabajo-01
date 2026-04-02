package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "EditTracksInfoDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class EditTracksInfoData extends AbstractSafeParcelable implements zzw {
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    final zza zzb;
    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 3)
    private final long[] zzd;
    @SafeParcelable.Field(getter = "getLanguage", id = 4)
    private final String zze;
    @SafeParcelable.Field(getter = "getTextTrackStyle", id = 5)
    private final TextTrackStyle zzf;
    @SafeParcelable.Field(getter = "getIsSuggestedLanguage", id = 6)
    private final Boolean zzg;
    @SafeParcelable.Field(getter = "getEnableTextTracks", id = 7)
    private final Boolean zzh;
    private static final Logger zzc = new Logger("EdtTrkInfoData");
    public static final Parcelable.Creator<EditTracksInfoData> CREATOR = new zzc();

    public EditTracksInfoData(zza zzaVar, long[] jArr, String str, TextTrackStyle textTrackStyle, Boolean bool, Boolean bool2) {
        this.zzb = zzaVar;
        this.zzd = jArr;
        this.zze = str;
        this.zzf = textTrackStyle;
        this.zzg = bool;
        this.zzh = bool2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.cast.tv.media.EditTracksInfoData zza(com.amazon.aps.iva.if0.c r8) {
        /*
            java.lang.String r0 = "activeTrackIds"
            com.amazon.aps.iva.if0.a r0 = r8.optJSONArray(r0)
            long[] r3 = com.google.android.gms.cast.internal.CastUtils.toLongArraySafely(r0)
            java.lang.String r0 = "language"
            boolean r1 = r8.has(r0)
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.String r0 = r8.optString(r0)
            r4 = r0
            goto L1a
        L19:
            r4 = r2
        L1a:
            java.lang.String r0 = "textTrackStyle"
            com.amazon.aps.iva.if0.c r0 = r8.optJSONObject(r0)
            if (r0 == 0) goto L3c
            com.google.android.gms.cast.TextTrackStyle r1 = new com.google.android.gms.cast.TextTrackStyle     // Catch: com.amazon.aps.iva.if0.b -> L2d
            r1.<init>()     // Catch: com.amazon.aps.iva.if0.b -> L2d
            r1.fromJson(r0)     // Catch: com.amazon.aps.iva.if0.b -> L2b
            goto L3a
        L2b:
            r0 = move-exception
            goto L2f
        L2d:
            r0 = move-exception
            r1 = r2
        L2f:
            com.google.android.gms.cast.internal.Logger r5 = com.google.android.gms.cast.tv.media.EditTracksInfoData.zzc
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r6 = "Malformed textTrackStyle in EditTracksInfoData, ignoring this field"
            r5.w(r6, r0)
        L3a:
            r5 = r1
            goto L3d
        L3c:
            r5 = r2
        L3d:
            java.lang.String r0 = "isSuggestedLanguage"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L4f
            boolean r0 = r8.optBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6 = r0
            goto L50
        L4f:
            r6 = r2
        L50:
            java.lang.String r0 = "enableTextTracks"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L62
            boolean r0 = r8.optBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7 = r0
            goto L63
        L62:
            r7 = r2
        L63:
            com.google.android.gms.cast.tv.media.EditTracksInfoData r0 = new com.google.android.gms.cast.tv.media.EditTracksInfoData
            com.google.android.gms.cast.tv.media.zza r2 = com.google.android.gms.cast.tv.media.zza.zzb(r8)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.tv.media.EditTracksInfoData.zza(com.amazon.aps.iva.if0.c):com.google.android.gms.cast.tv.media.EditTracksInfoData");
    }

    public long[] getActiveTrackIds() {
        return this.zzd;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public Boolean getEnableTextTracks() {
        return this.zzh;
    }

    public Boolean getIsSuggestedLanguage() {
        return this.zzg;
    }

    public String getLanguage() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLongArray(parcel, 3, getActiveTrackIds(), false);
        SafeParcelWriter.writeString(parcel, 4, getLanguage(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getTextTrackStyle(), i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 6, getIsSuggestedLanguage(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 7, getEnableTextTracks(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }
}
