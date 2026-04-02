package com.kwad.sdk.h.a;

import android.text.TextUtils;
import com.kwad.sdk.utils.bc;
/* loaded from: classes3.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    public String aCj;
    public String aCk;
    public String aCl;
    public long aCm;
    public boolean aCn;
    public String ags;
    public int loadType;
    public int packageType;
    public String packageUrl;
    public String version;

    public final long FB() {
        return this.aCm;
    }

    public final void am(long j) {
        this.aCm = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (bc.isEquals(this.aCj, bVar.aCj) && bc.isEquals(this.ags, bVar.ags) && bc.isEquals(this.version, bVar.version)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.aCj);
        sb.append("_");
        sb.append(this.ags);
        sb.append("_");
        sb.append(this.version);
        return TextUtils.isEmpty(sb.toString()) ? super.hashCode() : sb.toString().hashCode();
    }

    public final boolean isValid() {
        return (TextUtils.isEmpty(this.aCj) || TextUtils.isEmpty(this.packageUrl) || TextUtils.isEmpty(this.version) || TextUtils.isEmpty(this.aCk)) ? false : true;
    }

    @Override // com.kwad.sdk.core.response.a.a
    public String toString() {
        return "PackageInfoBean{packageId='" + this.aCj + "', zipFileName='" + this.aCk + "', zipPath='" + this.aCl + "', startDownloadTime=" + this.aCm + ", packageUrl='" + this.packageUrl + "', version='" + this.version + "', checksum='" + this.ags + "', loadType=" + this.loadType + ", packageType=" + this.packageType + ", isPublic=" + this.aCn + '}';
    }
}
