package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.n4.a;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "ApplicationMetadataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "getApplicationId", id = 2)
    String zza;
    @SafeParcelable.Field(getter = "getName", id = 3)
    String zzb;
    @SafeParcelable.Field(getter = "getSupportedNamespaces", id = 5)
    final List zzc;
    @SafeParcelable.Field(getter = "getSenderAppIdentifier", id = 6)
    String zzd;
    @SafeParcelable.Field(getter = "getSenderAppLaunchUrl", id = 7)
    Uri zze;
    @SafeParcelable.Field(getter = "getIconUrl", id = 8)
    String zzf;
    @SafeParcelable.Field(getter = "getApplicationType", id = 9)
    private String zzg;
    @SafeParcelable.Field(getter = "getSenderConnected", id = 10)
    private Boolean zzh;
    @SafeParcelable.Field(getter = "getLaunchedFromCloud", id = 11)
    private Boolean zzi;

    private ApplicationMetadata() {
        this.zzc = new ArrayList();
    }

    public boolean areNamespacesSupported(List<String> list) {
        List list2 = this.zzc;
        if (list2 != null && list2.containsAll(list)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        if (CastUtils.zze(this.zza, applicationMetadata.zza) && CastUtils.zze(this.zzb, applicationMetadata.zzb) && CastUtils.zze(this.zzc, applicationMetadata.zzc) && CastUtils.zze(this.zzd, applicationMetadata.zzd) && CastUtils.zze(this.zze, applicationMetadata.zze) && CastUtils.zze(this.zzf, applicationMetadata.zzf) && CastUtils.zze(this.zzg, applicationMetadata.zzg)) {
            return true;
        }
        return false;
    }

    public String getApplicationId() {
        return this.zza;
    }

    public String getIconUrl() {
        return this.zzf;
    }

    @Deprecated
    public List<WebImage> getImages() {
        return null;
    }

    public String getName() {
        return this.zzb;
    }

    public String getSenderAppIdentifier() {
        return this.zzd;
    }

    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    public boolean isNamespaceSupported(String str) {
        List list = this.zzc;
        if (list != null && list.contains(str)) {
            return true;
        }
        return false;
    }

    public void setIconUrl(String str) {
        this.zzf = str;
    }

    public String toString() {
        int size;
        String str = this.zza;
        String str2 = this.zzb;
        List list = this.zzc;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String str3 = this.zzd;
        String valueOf = String.valueOf(this.zze);
        String str4 = this.zzf;
        String str5 = this.zzg;
        StringBuilder b = a.b("applicationId: ", str, ", name: ", str2, ", namespaces.count: ");
        b.append(size);
        b.append(", senderAppIdentifier: ");
        b.append(str3);
        b.append(", senderAppLaunchUrl: ");
        com.amazon.aps.iva.m80.a.c(b, valueOf, ", iconUrl: ", str4, ", type: ");
        b.append(str5);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getApplicationId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getImages(), false);
        SafeParcelWriter.writeStringList(parcel, 5, getSupportedNamespaces(), false);
        SafeParcelWriter.writeString(parcel, 6, getSenderAppIdentifier(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 8, getIconUrl(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzg, false);
        SafeParcelWriter.writeBooleanObject(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeBooleanObject(parcel, 11, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ApplicationMetadata(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List list, @SafeParcelable.Param(id = 5) List list2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Uri uri, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 9) String str5, @SafeParcelable.Param(id = 10) Boolean bool, @SafeParcelable.Param(id = 11) Boolean bool2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list2;
        this.zzd = str3;
        this.zze = uri;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = bool;
        this.zzi = bool2;
    }
}
