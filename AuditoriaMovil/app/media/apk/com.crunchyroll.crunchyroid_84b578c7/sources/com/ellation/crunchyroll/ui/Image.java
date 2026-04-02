package com.ellation.crunchyroll.ui;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/ui/Image;", "", ImagesContract.URL, "", "width", "", "height", "(Ljava/lang/String;II)V", "getHeight", "()I", "getUrl", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Image {
    public static final int $stable = 0;
    private final int height;
    private final String url;
    private final int width;

    public Image() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ Image copy$default(Image image, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = image.url;
        }
        if ((i3 & 2) != 0) {
            i = image.width;
        }
        if ((i3 & 4) != 0) {
            i2 = image.height;
        }
        return image.copy(str, i, i2);
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final Image copy(String str, int i, int i2) {
        return new Image(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (j.a(this.url, image.url) && this.width == image.width && this.height == image.height) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        String str = this.url;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.height) + r.a(this.width, hashCode * 31, 31);
    }

    public String toString() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        StringBuilder sb = new StringBuilder("Image(url=");
        sb.append(str);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        return e.f(sb, i2, ")");
    }

    public Image(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ Image(String str, int i, int i2, int i3, e eVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
