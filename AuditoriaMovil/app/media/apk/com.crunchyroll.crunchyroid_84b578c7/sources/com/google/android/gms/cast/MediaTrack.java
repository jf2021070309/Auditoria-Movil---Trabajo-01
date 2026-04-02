package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.q.c0;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzfq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaTrackCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<MediaTrack> CREATOR = new zzcn();
    public static final String ROLE_ALTERNATE = "alternate";
    public static final String ROLE_CAPTION = "caption";
    public static final String ROLE_COMMENTARY = "commentary";
    public static final String ROLE_DESCRIPTION = "description";
    public static final String ROLE_DUB = "dub";
    public static final String ROLE_EMERGENCY = "emergency";
    public static final String ROLE_FORCED_SUBTITLE = "forced_subtitle";
    public static final String ROLE_MAIN = "main";
    public static final String ROLE_SIGN = "sign";
    public static final String ROLE_SUBTITLE = "subtitle";
    public static final String ROLE_SUPPLEMENTARY = "supplementary";
    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    @SafeParcelable.Field(id = 10)
    String zza;
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getType", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getContentId", id = 4)
    private String zzd;
    @SafeParcelable.Field(getter = "getContentType", id = 5)
    private String zze;
    @SafeParcelable.Field(getter = "getName", id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getLanguage", id = 7)
    private final String zzg;
    @SafeParcelable.Field(getter = "getSubtype", id = 8)
    private final int zzh;
    @SafeParcelable.Field(getter = "getRoles", id = 9)
    private final List zzi;
    private final c zzj;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final long zza;
        private final int zzb;
        private String zzc;
        private String zzd;
        private String zze;
        private String zzf;
        private int zzg = 0;
        private List zzh;
        private c zzi;

        public Builder(long j, int i) throws IllegalArgumentException {
            this.zza = j;
            this.zzb = i;
        }

        public MediaTrack build() {
            return new MediaTrack(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }

        public Builder setContentId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setContentType(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setCustomData(c cVar) {
            this.zzi = cVar;
            return this;
        }

        public Builder setLanguage(String str) {
            this.zzf = str;
            return this;
        }

        public Builder setName(String str) {
            this.zze = str;
            return this;
        }

        public Builder setRoles(List<String> list) {
            if (list != null) {
                list = zzfq.zzj(list);
            }
            this.zzh = list;
            return this;
        }

        public Builder setSubtype(int i) throws IllegalArgumentException {
            if (i >= -1 && i <= 5) {
                if (i != 0 && this.zzb != 1) {
                    throw new IllegalArgumentException("subtypes are only valid for text tracks");
                }
                this.zzg = i;
                return this;
            }
            throw new IllegalArgumentException(c0.a("invalid subtype ", i));
        }

        public Builder setLanguage(Locale locale) {
            this.zzf = CastUtils.zzb(locale);
            return this;
        }
    }

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, c cVar) {
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = i2;
        this.zzi = list;
        this.zzj = cVar;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        c cVar = this.zzj;
        if (cVar != null) {
            z = false;
        } else {
            z = true;
        }
        c cVar2 = mediaTrack.zzj;
        if (cVar2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((cVar == null || cVar2 == null || JsonUtils.areJsonValuesEquivalent(cVar, cVar2)) && this.zzb == mediaTrack.zzb && this.zzc == mediaTrack.zzc && CastUtils.zze(this.zzd, mediaTrack.zzd) && CastUtils.zze(this.zze, mediaTrack.zze) && CastUtils.zze(this.zzf, mediaTrack.zzf) && CastUtils.zze(this.zzg, mediaTrack.zzg) && this.zzh == mediaTrack.zzh && CastUtils.zze(this.zzi, mediaTrack.zzi)) {
            return true;
        }
        return false;
    }

    public String getContentId() {
        return this.zzd;
    }

    public String getContentType() {
        return this.zze;
    }

    public c getCustomData() {
        return this.zzj;
    }

    public long getId() {
        return this.zzb;
    }

    public String getLanguage() {
        return this.zzg;
    }

    @TargetApi(21)
    public Locale getLanguageLocale() {
        if (TextUtils.isEmpty(this.zzg)) {
            return null;
        }
        if (PlatformVersion.isAtLeastLollipop()) {
            return Locale.forLanguageTag(this.zzg);
        }
        String[] split = this.zzg.split("-", -1);
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        return new Locale(split[0], split[1]);
    }

    public String getName() {
        return this.zzf;
    }

    public List<String> getRoles() {
        return this.zzi;
    }

    public int getSubtype() {
        return this.zzh;
    }

    public int getType() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh), this.zzi, String.valueOf(this.zzj));
    }

    public void setContentId(String str) {
        this.zzd = str;
    }

    public void setContentType(String str) {
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzj;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zza = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getId());
        SafeParcelWriter.writeInt(parcel, 3, getType());
        SafeParcelWriter.writeString(parcel, 4, getContentId(), false);
        SafeParcelWriter.writeString(parcel, 5, getContentType(), false);
        SafeParcelWriter.writeString(parcel, 6, getName(), false);
        SafeParcelWriter.writeString(parcel, 7, getLanguage(), false);
        SafeParcelWriter.writeInt(parcel, 8, getSubtype());
        SafeParcelWriter.writeStringList(parcel, 9, getRoles(), false);
        SafeParcelWriter.writeString(parcel, 10, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            cVar.put("trackId", this.zzb);
            int i = this.zzc;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        cVar.put("type", "VIDEO");
                    }
                } else {
                    cVar.put("type", "AUDIO");
                }
            } else {
                cVar.put("type", "TEXT");
            }
            String str = this.zzd;
            if (str != null) {
                cVar.put("trackContentId", str);
            }
            String str2 = this.zze;
            if (str2 != null) {
                cVar.put("trackContentType", str2);
            }
            String str3 = this.zzf;
            if (str3 != null) {
                cVar.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                cVar.put("language", this.zzg);
            }
            int i2 = this.zzh;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                cVar.put("subtype", "METADATA");
                            }
                        } else {
                            cVar.put("subtype", "CHAPTERS");
                        }
                    } else {
                        cVar.put("subtype", "DESCRIPTIONS");
                    }
                } else {
                    cVar.put("subtype", "CAPTIONS");
                }
            } else {
                cVar.put("subtype", "SUBTITLES");
            }
            List list = this.zzi;
            if (list != null) {
                cVar.put("roles", new a((Collection<?>) list));
            }
            c cVar2 = this.zzj;
            if (cVar2 != null) {
                cVar.put("customData", cVar2);
            }
        } catch (b unused) {
        }
        return cVar;
    }
}
