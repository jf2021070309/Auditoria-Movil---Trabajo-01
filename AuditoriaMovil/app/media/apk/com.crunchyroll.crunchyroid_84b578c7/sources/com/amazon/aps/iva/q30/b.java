package com.amazon.aps.iva.q30;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.gson.annotations.SerializedName;
/* compiled from: RecentSearchesCache.kt */
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("panel")
    private final Panel a;
    @SerializedName("music_asset")
    private final MusicAsset b;
    @SerializedName("timestamp")
    private final long c;

    static {
        int i = MusicAsset.$stable;
        int i2 = Panel.$stable;
    }

    public b(Panel panel, MusicAsset musicAsset, long j) {
        this.a = panel;
        this.b = musicAsset;
        this.c = j;
    }

    public final String a() {
        String id;
        Panel panel = this.a;
        if (panel == null || (id = panel.getId()) == null) {
            MusicAsset musicAsset = this.b;
            if (musicAsset != null) {
                return musicAsset.getId();
            }
            return "";
        }
        return id;
    }

    public final MusicAsset b() {
        return this.b;
    }

    public final Panel c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        String title;
        Panel panel = this.a;
        if (panel == null || (title = panel.getTitle()) == null) {
            MusicAsset musicAsset = this.b;
            if (musicAsset != null) {
                return musicAsset.getTitle();
            }
            return "";
        }
        return title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && this.c == bVar.c) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Panel panel = this.a;
        int i = 0;
        if (panel == null) {
            hashCode = 0;
        } else {
            hashCode = panel.hashCode();
        }
        int i2 = hashCode * 31;
        MusicAsset musicAsset = this.b;
        if (musicAsset != null) {
            i = musicAsset.hashCode();
        }
        return Long.hashCode(this.c) + ((i2 + i) * 31);
    }

    public final String toString() {
        return e();
    }

    public /* synthetic */ b(Panel panel, MusicAsset musicAsset, long j, int i) {
        this((i & 1) != 0 ? null : panel, (i & 2) != 0 ? null : musicAsset, j);
    }
}
