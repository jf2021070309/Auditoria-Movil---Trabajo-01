package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Artists.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/model/music/Artists;", "", "_mainArtists", "", "Lcom/ellation/crunchyroll/model/music/Artist;", "_featuredArtists", "_secondaryArtists", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "featuredArtists", "getFeaturedArtists", "()Ljava/util/List;", "mainArtists", "getMainArtists", "secondaryArtists", "getSecondaryArtists", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Artists {
    public static final int $stable = 8;
    @SerializedName("FeaturedArtist")
    private final List<Artist> _featuredArtists;
    @SerializedName("MainArtist")
    private final List<Artist> _mainArtists;
    @SerializedName("SecondaryArtist")
    private final List<Artist> _secondaryArtists;

    public Artists() {
        this(null, null, null, 7, null);
    }

    private final List<Artist> component1() {
        return this._mainArtists;
    }

    private final List<Artist> component2() {
        return this._featuredArtists;
    }

    private final List<Artist> component3() {
        return this._secondaryArtists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Artists copy$default(Artists artists, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = artists._mainArtists;
        }
        if ((i & 2) != 0) {
            list2 = artists._featuredArtists;
        }
        if ((i & 4) != 0) {
            list3 = artists._secondaryArtists;
        }
        return artists.copy(list, list2, list3);
    }

    public final Artists copy(List<Artist> list, List<Artist> list2, List<Artist> list3) {
        return new Artists(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artists)) {
            return false;
        }
        Artists artists = (Artists) obj;
        if (j.a(this._mainArtists, artists._mainArtists) && j.a(this._featuredArtists, artists._featuredArtists) && j.a(this._secondaryArtists, artists._secondaryArtists)) {
            return true;
        }
        return false;
    }

    public final List<Artist> getFeaturedArtists() {
        List<Artist> list = this._featuredArtists;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<Artist> getMainArtists() {
        List<Artist> list = this._mainArtists;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<Artist> getSecondaryArtists() {
        List<Artist> list = this._secondaryArtists;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<Artist> list = this._mainArtists;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Artist> list2 = this._featuredArtists;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Artist> list3 = this._secondaryArtists;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        List<Artist> list = this._mainArtists;
        List<Artist> list2 = this._featuredArtists;
        List<Artist> list3 = this._secondaryArtists;
        StringBuilder sb = new StringBuilder("Artists(_mainArtists=");
        sb.append(list);
        sb.append(", _featuredArtists=");
        sb.append(list2);
        sb.append(", _secondaryArtists=");
        return a.b(sb, list3, ")");
    }

    public Artists(List<Artist> list, List<Artist> list2, List<Artist> list3) {
        this._mainArtists = list;
        this._featuredArtists = list2;
        this._secondaryArtists = list3;
    }

    public /* synthetic */ Artists(List list, List list2, List list3, int i, e eVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
