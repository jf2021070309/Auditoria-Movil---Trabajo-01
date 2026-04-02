package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.FmsImages;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: HomeFeedItemRaw.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/api/model/GameItem;", "", "id", "", "link", "title", "genre", "images", "Lcom/ellation/crunchyroll/model/FmsImages;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/FmsImages;)V", "getGenre", "()Ljava/lang/String;", "getId", "getImages", "()Lcom/ellation/crunchyroll/model/FmsImages;", "getLink", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameItem {
    public static final int $stable = 0;
    @SerializedName("genre")
    private final String genre;
    @SerializedName("id")
    private final String id;
    @SerializedName("images")
    private final FmsImages images;
    @SerializedName("link")
    private final String link;
    @SerializedName("title")
    private final String title;

    public GameItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GameItem copy$default(GameItem gameItem, String str, String str2, String str3, String str4, FmsImages fmsImages, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gameItem.id;
        }
        if ((i & 2) != 0) {
            str2 = gameItem.link;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = gameItem.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = gameItem.genre;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            fmsImages = gameItem.images;
        }
        return gameItem.copy(str, str5, str6, str7, fmsImages);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.link;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.genre;
    }

    public final FmsImages component5() {
        return this.images;
    }

    public final GameItem copy(String str, String str2, String str3, String str4, FmsImages fmsImages) {
        return new GameItem(str, str2, str3, str4, fmsImages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameItem)) {
            return false;
        }
        GameItem gameItem = (GameItem) obj;
        if (j.a(this.id, gameItem.id) && j.a(this.link, gameItem.link) && j.a(this.title, gameItem.title) && j.a(this.genre, gameItem.genre) && j.a(this.images, gameItem.images)) {
            return true;
        }
        return false;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final String getId() {
        return this.id;
    }

    public final FmsImages getImages() {
        return this.images;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.link;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.genre;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        FmsImages fmsImages = this.images;
        if (fmsImages != null) {
            i = fmsImages.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.link;
        String str3 = this.title;
        String str4 = this.genre;
        FmsImages fmsImages = this.images;
        StringBuilder b = a.b("GameItem(id=", str, ", link=", str2, ", title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", genre=", str4, ", images=");
        b.append(fmsImages);
        b.append(")");
        return b.toString();
    }

    public GameItem(String str, String str2, String str3, String str4, FmsImages fmsImages) {
        this.id = str;
        this.link = str2;
        this.title = str3;
        this.genre = str4;
        this.images = fmsImages;
    }

    public /* synthetic */ GameItem(String str, String str2, String str3, String str4, FmsImages fmsImages, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : fmsImages);
    }
}
