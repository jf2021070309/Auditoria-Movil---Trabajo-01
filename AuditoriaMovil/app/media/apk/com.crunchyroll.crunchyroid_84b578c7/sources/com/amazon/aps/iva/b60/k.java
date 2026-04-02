package com.amazon.aps.iva.b60;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
/* compiled from: WatchlistItemUiModel.kt */
/* loaded from: classes2.dex */
public final class k extends s implements PlayheadTimeProvider {
    public final String a;
    public final long b;
    public final boolean c;
    public boolean d;
    public final boolean e;
    public final boolean f;
    public final Panel g;
    public final com.amazon.aps.iva.e60.a h;

    public k(String str, long j, boolean z, boolean z2, boolean z3, boolean z4, Panel panel, com.amazon.aps.iva.e60.a aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = panel;
        this.h = aVar;
    }

    public static k a(k kVar, com.amazon.aps.iva.e60.a aVar) {
        String str = kVar.a;
        long j = kVar.b;
        boolean z = kVar.c;
        boolean z2 = kVar.d;
        boolean z3 = kVar.e;
        boolean z4 = kVar.f;
        Panel panel = kVar.g;
        kVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        return new k(str, j, z, z2, z3, z4, panel, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && com.amazon.aps.iva.yb0.j.a(this.g, kVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.b60.s, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return this.g.getId();
    }

    @Override // com.ellation.crunchyroll.model.PlayheadTimeProvider
    public final long getPlayheadSec() {
        if (this.c) {
            return 0L;
        }
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int a = com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31);
        int i = 1;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        boolean z2 = this.d;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.e;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z4 = this.f;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        int hashCode2 = (this.g.hashCode() + ((i7 + i) * 31)) * 31;
        com.amazon.aps.iva.e60.a aVar = this.h;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        boolean z = this.d;
        return "WatchlistDataItemUiModel(adapterId=" + this.a + ", _playheadSec=" + this.b + ", isFullyWatched=" + this.c + ", isFavorite=" + z + ", isNew=" + this.e + ", neverWatched=" + this.f + ", panel=" + this.g + ", image=" + this.h + ")";
    }
}
