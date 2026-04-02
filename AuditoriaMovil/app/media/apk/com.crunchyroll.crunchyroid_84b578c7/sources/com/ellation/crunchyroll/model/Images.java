package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Images.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b \u0010!J>\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R$\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R$\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/model/Images;", "Ljava/io/Serializable;", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "postersTall", "postersWide", "channelLogoMarkSimple", "thumbnails", "Lcom/amazon/aps/iva/kb0/q;", "updateImages", "", "other", "", "equals", "", "hashCode", "_postersTall", "Ljava/util/List;", "_postersWide", "_channelLogoMarkSimple", "_thumbnails", "getPostersTall", "()Ljava/util/List;", "getPostersWide", "getChannelLogoMarkSimple", "getThumbnails", "", "getPosterWideMediumThumbnailUrl", "()Ljava/lang/String;", "posterWideMediumThumbnailUrl", "getPosterWideMediumImageUrl", "posterWideMediumImageUrl", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Images implements Serializable {
    public static final int $stable = 8;
    @SerializedName("logo_mark_simple")
    private List<? extends List<Image>> _channelLogoMarkSimple;
    @SerializedName("poster_tall")
    private List<? extends List<Image>> _postersTall;
    @SerializedName("poster_wide")
    private List<? extends List<Image>> _postersWide;
    @SerializedName("thumbnail")
    private List<? extends List<Image>> _thumbnails;

    public Images() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(Images.class, cls)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.model.Images");
        Images images = (Images) obj;
        if (j.a(this._postersTall, images._postersTall) && j.a(this._postersWide, images._postersWide) && j.a(this._channelLogoMarkSimple, images._channelLogoMarkSimple) && j.a(this._thumbnails, images._thumbnails)) {
            return true;
        }
        return false;
    }

    public final List<Image> getChannelLogoMarkSimple() {
        List<Image> list;
        List<? extends List<Image>> list2 = this._channelLogoMarkSimple;
        if (list2 == null || (list = (List) x.v0(list2)) == null) {
            return z.b;
        }
        return list;
    }

    public final String getPosterWideMediumImageUrl() {
        Image image;
        String str;
        List<Image> postersWide = getPostersWide();
        if (1 <= f1.B(postersWide)) {
            image = postersWide.get(1);
        } else {
            image = (Image) x.v0(getPostersWide());
        }
        Image image2 = image;
        if (image2 != null) {
            str = image2.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getPosterWideMediumThumbnailUrl() {
        Image image;
        String str;
        List<Image> thumbnails = getThumbnails();
        if (1 <= f1.B(thumbnails)) {
            image = thumbnails.get(1);
        } else {
            image = (Image) x.v0(getThumbnails());
        }
        Image image2 = image;
        if (image2 != null) {
            str = image2.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<Image> getPostersTall() {
        List<Image> list;
        List<? extends List<Image>> list2 = this._postersTall;
        if (list2 == null || (list = (List) x.v0(list2)) == null) {
            return z.b;
        }
        return list;
    }

    public final List<Image> getPostersWide() {
        List<Image> list;
        List<? extends List<Image>> list2 = this._postersWide;
        if (list2 == null || (list = (List) x.v0(list2)) == null) {
            return z.b;
        }
        return list;
    }

    public final List<Image> getThumbnails() {
        List<Image> list;
        List<? extends List<Image>> list2 = this._thumbnails;
        if (list2 == null || (list = (List) x.v0(list2)) == null) {
            return z.b;
        }
        return list;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        List<? extends List<Image>> list = this._postersTall;
        int i4 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        List<? extends List<Image>> list2 = this._postersWide;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        List<? extends List<Image>> list3 = this._channelLogoMarkSimple;
        if (list3 != null) {
            i3 = list3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        List<? extends List<Image>> list4 = this._thumbnails;
        if (list4 != null) {
            i4 = list4.hashCode();
        }
        return i7 + i4;
    }

    public final void updateImages(List<Image> list, List<Image> list2, List<Image> list3, List<Image> list4) {
        j.f(list, "postersTall");
        j.f(list2, "postersWide");
        j.f(list3, "channelLogoMarkSimple");
        j.f(list4, "thumbnails");
        this._postersTall = f1.J(list);
        this._postersWide = f1.J(list2);
        this._channelLogoMarkSimple = f1.J(list3);
        this._thumbnails = f1.J(list4);
    }

    public Images(List<Image> list, List<Image> list2, List<Image> list3, List<Image> list4) {
        j.f(list, "postersTall");
        j.f(list2, "postersWide");
        j.f(list3, "channelLogoMarkSimple");
        j.f(list4, "thumbnails");
        this._postersTall = f1.J(list);
        this._postersWide = f1.J(list2);
        this._channelLogoMarkSimple = f1.J(list3);
        this._thumbnails = f1.J(list4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Images(java.util.List r2, java.util.List r3, java.util.List r4, java.util.List r5, int r6, com.amazon.aps.iva.yb0.e r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            com.amazon.aps.iva.lb0.z r0 = com.amazon.aps.iva.lb0.z.b
            if (r7 == 0) goto L7
            r2 = r0
        L7:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            r3 = r0
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            r4 = r0
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L16
            r5 = r0
        L16:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.model.Images.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }
}
