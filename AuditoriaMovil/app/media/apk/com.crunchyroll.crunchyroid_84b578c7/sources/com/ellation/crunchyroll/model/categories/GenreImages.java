package com.ellation.crunchyroll.model.categories;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Category.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/model/categories/GenreImages;", "Ljava/io/Serializable;", "icons", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "backgrounds", "(Ljava/util/List;Ljava/util/List;)V", "getBackgrounds", "()Ljava/util/List;", "getIcons", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GenreImages implements Serializable {
    public static final int $stable = 8;
    @SerializedName("background")
    private final List<Image> backgrounds;
    @SerializedName("low")
    private final List<Image> icons;

    public GenreImages(List<Image> list, List<Image> list2) {
        j.f(list, "icons");
        j.f(list2, "backgrounds");
        this.icons = list;
        this.backgrounds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenreImages copy$default(GenreImages genreImages, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = genreImages.icons;
        }
        if ((i & 2) != 0) {
            list2 = genreImages.backgrounds;
        }
        return genreImages.copy(list, list2);
    }

    public final List<Image> component1() {
        return this.icons;
    }

    public final List<Image> component2() {
        return this.backgrounds;
    }

    public final GenreImages copy(List<Image> list, List<Image> list2) {
        j.f(list, "icons");
        j.f(list2, "backgrounds");
        return new GenreImages(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenreImages)) {
            return false;
        }
        GenreImages genreImages = (GenreImages) obj;
        if (j.a(this.icons, genreImages.icons) && j.a(this.backgrounds, genreImages.backgrounds)) {
            return true;
        }
        return false;
    }

    public final List<Image> getBackgrounds() {
        return this.backgrounds;
    }

    public final List<Image> getIcons() {
        return this.icons;
    }

    public int hashCode() {
        return this.backgrounds.hashCode() + (this.icons.hashCode() * 31);
    }

    public String toString() {
        List<Image> list = this.icons;
        List<Image> list2 = this.backgrounds;
        return "GenreImages(icons=" + list + ", backgrounds=" + list2 + ")";
    }
}
