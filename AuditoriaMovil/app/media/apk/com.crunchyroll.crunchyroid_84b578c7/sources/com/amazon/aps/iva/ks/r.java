package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.e4.t0;
/* compiled from: ScreenProperty.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.is.a {
    private final a actionDetail;
    private final String channelName = null;
    private final e contentMedia;
    private final com.amazon.aps.iva.js.i eventSource;
    private final g experiment;
    private final boolean isAuthenticated;
    private float screenLoadTime;
    private final String tab;

    public r(boolean z, float f, e eVar, String str, g gVar, a aVar, com.amazon.aps.iva.js.i iVar) {
        this.isAuthenticated = z;
        this.screenLoadTime = f;
        this.contentMedia = eVar;
        this.tab = str;
        this.experiment = gVar;
        this.actionDetail = aVar;
        this.eventSource = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.isAuthenticated == rVar.isAuthenticated && Float.compare(this.screenLoadTime, rVar.screenLoadTime) == 0 && com.amazon.aps.iva.yb0.j.a(this.contentMedia, rVar.contentMedia) && com.amazon.aps.iva.yb0.j.a(this.tab, rVar.tab) && com.amazon.aps.iva.yb0.j.a(this.channelName, rVar.channelName) && com.amazon.aps.iva.yb0.j.a(this.experiment, rVar.experiment) && com.amazon.aps.iva.yb0.j.a(this.actionDetail, rVar.actionDetail) && this.eventSource == rVar.eventSource) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z = this.isAuthenticated;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int b = t0.b(this.screenLoadTime, r0 * 31, 31);
        e eVar = this.contentMedia;
        int i = 0;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str = this.tab;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.channelName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        g gVar = this.experiment;
        if (gVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = gVar.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        a aVar = this.actionDetail;
        if (aVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = aVar.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        com.amazon.aps.iva.js.i iVar = this.eventSource;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        boolean z = this.isAuthenticated;
        float f = this.screenLoadTime;
        e eVar = this.contentMedia;
        String str = this.tab;
        String str2 = this.channelName;
        g gVar = this.experiment;
        a aVar = this.actionDetail;
        com.amazon.aps.iva.js.i iVar = this.eventSource;
        return "ScreenProperty(isAuthenticated=" + z + ", screenLoadTime=" + f + ", contentMedia=" + eVar + ", tab=" + str + ", channelName=" + str2 + ", experiment=" + gVar + ", actionDetail=" + aVar + ", eventSource=" + iVar + ")";
    }
}
