package com.ellation.crunchyroll.model.categories;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Category.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/model/categories/Category;", "Ljava/io/Serializable;", "tenantCategoryId", "", "images", "Lcom/ellation/crunchyroll/model/categories/GenreImages;", "localization", "Lcom/ellation/crunchyroll/model/categories/CategoryLocalization;", "(Ljava/lang/String;Lcom/ellation/crunchyroll/model/categories/GenreImages;Lcom/ellation/crunchyroll/model/categories/CategoryLocalization;)V", "backgrounds", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "getBackgrounds", "()Ljava/util/List;", "icons", "getIcons", "getLocalization", "()Lcom/ellation/crunchyroll/model/categories/CategoryLocalization;", "getTenantCategoryId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Category implements Serializable {
    public static final int $stable = 8;
    @SerializedName("images")
    private final GenreImages images;
    @SerializedName("localization")
    private final CategoryLocalization localization;
    @SerializedName("id")
    private final String tenantCategoryId;

    public Category() {
        this(null, null, null, 7, null);
    }

    private final GenreImages component2() {
        return this.images;
    }

    public static /* synthetic */ Category copy$default(Category category, String str, GenreImages genreImages, CategoryLocalization categoryLocalization, int i, Object obj) {
        if ((i & 1) != 0) {
            str = category.tenantCategoryId;
        }
        if ((i & 2) != 0) {
            genreImages = category.images;
        }
        if ((i & 4) != 0) {
            categoryLocalization = category.localization;
        }
        return category.copy(str, genreImages, categoryLocalization);
    }

    public final String component1() {
        return this.tenantCategoryId;
    }

    public final CategoryLocalization component3() {
        return this.localization;
    }

    public final Category copy(String str, GenreImages genreImages, CategoryLocalization categoryLocalization) {
        j.f(str, "tenantCategoryId");
        return new Category(str, genreImages, categoryLocalization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        if (j.a(this.tenantCategoryId, category.tenantCategoryId) && j.a(this.images, category.images) && j.a(this.localization, category.localization)) {
            return true;
        }
        return false;
    }

    public final List<Image> getBackgrounds() {
        List<Image> backgrounds;
        GenreImages genreImages = this.images;
        if (genreImages == null || (backgrounds = genreImages.getBackgrounds()) == null) {
            return z.b;
        }
        return backgrounds;
    }

    public final List<Image> getIcons() {
        List<Image> icons;
        GenreImages genreImages = this.images;
        if (genreImages == null || (icons = genreImages.getIcons()) == null) {
            return z.b;
        }
        return icons;
    }

    public final CategoryLocalization getLocalization() {
        return this.localization;
    }

    public final String getTenantCategoryId() {
        return this.tenantCategoryId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.tenantCategoryId.hashCode() * 31;
        GenreImages genreImages = this.images;
        int i = 0;
        if (genreImages == null) {
            hashCode = 0;
        } else {
            hashCode = genreImages.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        CategoryLocalization categoryLocalization = this.localization;
        if (categoryLocalization != null) {
            i = categoryLocalization.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.tenantCategoryId;
        GenreImages genreImages = this.images;
        CategoryLocalization categoryLocalization = this.localization;
        return "Category(tenantCategoryId=" + str + ", images=" + genreImages + ", localization=" + categoryLocalization + ")";
    }

    public Category(String str, GenreImages genreImages, CategoryLocalization categoryLocalization) {
        j.f(str, "tenantCategoryId");
        this.tenantCategoryId = str;
        this.images = genreImages;
        this.localization = categoryLocalization;
    }

    public /* synthetic */ Category(String str, GenreImages genreImages, CategoryLocalization categoryLocalization, int i, e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : genreImages, (i & 4) != 0 ? null : categoryLocalization);
    }
}
