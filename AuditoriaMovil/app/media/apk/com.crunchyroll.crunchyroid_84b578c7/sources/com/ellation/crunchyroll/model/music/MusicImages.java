package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MusicImages.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/model/music/MusicImages;", "", "_postersTall", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "_postersWide", "_thumbnails", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "postersTall", "getPostersTall", "()Ljava/util/List;", "postersWide", "getPostersWide", "thumbnails", "getThumbnails", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MusicImages {
    public static final int $stable = 8;
    @SerializedName("poster_tall")
    private final List<Image> _postersTall;
    @SerializedName("poster_wide")
    private final List<Image> _postersWide;
    @SerializedName("thumbnail")
    private final List<Image> _thumbnails;

    public MusicImages() {
        this(null, null, null, 7, null);
    }

    private final List<Image> component1() {
        return this._postersTall;
    }

    private final List<Image> component2() {
        return this._postersWide;
    }

    private final List<Image> component3() {
        return this._thumbnails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicImages copy$default(MusicImages musicImages, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = musicImages._postersTall;
        }
        if ((i & 2) != 0) {
            list2 = musicImages._postersWide;
        }
        if ((i & 4) != 0) {
            list3 = musicImages._thumbnails;
        }
        return musicImages.copy(list, list2, list3);
    }

    public final MusicImages copy(List<Image> list, List<Image> list2, List<Image> list3) {
        return new MusicImages(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicImages)) {
            return false;
        }
        MusicImages musicImages = (MusicImages) obj;
        if (j.a(this._postersTall, musicImages._postersTall) && j.a(this._postersWide, musicImages._postersWide) && j.a(this._thumbnails, musicImages._thumbnails)) {
            return true;
        }
        return false;
    }

    public final List<Image> getPostersTall() {
        List<Image> list = this._postersTall;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<Image> getPostersWide() {
        List<Image> list = this._postersWide;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final List<Image> getThumbnails() {
        List<Image> list = this._thumbnails;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<Image> list = this._postersTall;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Image> list2 = this._postersWide;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Image> list3 = this._thumbnails;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        List<Image> list = this._postersTall;
        List<Image> list2 = this._postersWide;
        List<Image> list3 = this._thumbnails;
        StringBuilder sb = new StringBuilder("MusicImages(_postersTall=");
        sb.append(list);
        sb.append(", _postersWide=");
        sb.append(list2);
        sb.append(", _thumbnails=");
        return a.b(sb, list3, ")");
    }

    public MusicImages(List<Image> list, List<Image> list2, List<Image> list3) {
        this._postersTall = list;
        this._postersWide = list2;
        this._thumbnails = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MusicImages(java.util.List r2, java.util.List r3, java.util.List r4, int r5, com.amazon.aps.iva.yb0.e r6) {
        /*
            r1 = this;
            r6 = r5 & 1
            com.amazon.aps.iva.lb0.z r0 = com.amazon.aps.iva.lb0.z.b
            if (r6 == 0) goto L7
            r2 = r0
        L7:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            r3 = r0
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L11
            r4 = r0
        L11:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.model.music.MusicImages.<init>(java.util.List, java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }
}
