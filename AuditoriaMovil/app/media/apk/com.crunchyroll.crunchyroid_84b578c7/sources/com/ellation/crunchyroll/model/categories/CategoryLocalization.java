package com.ellation.crunchyroll.model.categories;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: Category.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/model/categories/CategoryLocalization;", "", "title", "", MediaTrack.ROLE_DESCRIPTION, "locale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getLocale", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CategoryLocalization {
    public static final int $stable = 0;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String description;
    @SerializedName("locale")
    private final String locale;
    @SerializedName("title")
    private final String title;

    public CategoryLocalization() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CategoryLocalization copy$default(CategoryLocalization categoryLocalization, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryLocalization.title;
        }
        if ((i & 2) != 0) {
            str2 = categoryLocalization.description;
        }
        if ((i & 4) != 0) {
            str3 = categoryLocalization.locale;
        }
        return categoryLocalization.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.locale;
    }

    public final CategoryLocalization copy(String str, String str2, String str3) {
        return new CategoryLocalization(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryLocalization)) {
            return false;
        }
        CategoryLocalization categoryLocalization = (CategoryLocalization) obj;
        if (j.a(this.title, categoryLocalization.title) && j.a(this.description, categoryLocalization.description) && j.a(this.locale, categoryLocalization.locale)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.title;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.locale;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return b.c(a.b("CategoryLocalization(title=", str, ", description=", str2, ", locale="), this.locale, ")");
    }

    public CategoryLocalization(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.locale = str3;
    }

    public /* synthetic */ CategoryLocalization(String str, String str2, String str3, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
