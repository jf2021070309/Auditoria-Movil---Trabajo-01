package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: FmsImages.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/model/FmsImages;", "", "desktopLarge", "Lcom/ellation/crunchyroll/model/FmsImage;", "desktopSmall", "mobileLarge", "mobileSmall", "(Lcom/ellation/crunchyroll/model/FmsImage;Lcom/ellation/crunchyroll/model/FmsImage;Lcom/ellation/crunchyroll/model/FmsImage;Lcom/ellation/crunchyroll/model/FmsImage;)V", "getDesktopLarge", "()Lcom/ellation/crunchyroll/model/FmsImage;", "getDesktopSmall", "getMobileLarge", "getMobileSmall", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FmsImages {
    public static final int $stable = 0;
    @SerializedName("desktop_large")
    private final FmsImage desktopLarge;
    @SerializedName("desktop_small")
    private final FmsImage desktopSmall;
    @SerializedName("mobile_large")
    private final FmsImage mobileLarge;
    @SerializedName("mobile_small")
    private final FmsImage mobileSmall;

    public FmsImages() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FmsImages copy$default(FmsImages fmsImages, FmsImage fmsImage, FmsImage fmsImage2, FmsImage fmsImage3, FmsImage fmsImage4, int i, Object obj) {
        if ((i & 1) != 0) {
            fmsImage = fmsImages.desktopLarge;
        }
        if ((i & 2) != 0) {
            fmsImage2 = fmsImages.desktopSmall;
        }
        if ((i & 4) != 0) {
            fmsImage3 = fmsImages.mobileLarge;
        }
        if ((i & 8) != 0) {
            fmsImage4 = fmsImages.mobileSmall;
        }
        return fmsImages.copy(fmsImage, fmsImage2, fmsImage3, fmsImage4);
    }

    public final FmsImage component1() {
        return this.desktopLarge;
    }

    public final FmsImage component2() {
        return this.desktopSmall;
    }

    public final FmsImage component3() {
        return this.mobileLarge;
    }

    public final FmsImage component4() {
        return this.mobileSmall;
    }

    public final FmsImages copy(FmsImage fmsImage, FmsImage fmsImage2, FmsImage fmsImage3, FmsImage fmsImage4) {
        return new FmsImages(fmsImage, fmsImage2, fmsImage3, fmsImage4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmsImages)) {
            return false;
        }
        FmsImages fmsImages = (FmsImages) obj;
        if (j.a(this.desktopLarge, fmsImages.desktopLarge) && j.a(this.desktopSmall, fmsImages.desktopSmall) && j.a(this.mobileLarge, fmsImages.mobileLarge) && j.a(this.mobileSmall, fmsImages.mobileSmall)) {
            return true;
        }
        return false;
    }

    public final FmsImage getDesktopLarge() {
        return this.desktopLarge;
    }

    public final FmsImage getDesktopSmall() {
        return this.desktopSmall;
    }

    public final FmsImage getMobileLarge() {
        return this.mobileLarge;
    }

    public final FmsImage getMobileSmall() {
        return this.mobileSmall;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        FmsImage fmsImage = this.desktopLarge;
        int i = 0;
        if (fmsImage == null) {
            hashCode = 0;
        } else {
            hashCode = fmsImage.hashCode();
        }
        int i2 = hashCode * 31;
        FmsImage fmsImage2 = this.desktopSmall;
        if (fmsImage2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fmsImage2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        FmsImage fmsImage3 = this.mobileLarge;
        if (fmsImage3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fmsImage3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        FmsImage fmsImage4 = this.mobileSmall;
        if (fmsImage4 != null) {
            i = fmsImage4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        FmsImage fmsImage = this.desktopLarge;
        FmsImage fmsImage2 = this.desktopSmall;
        FmsImage fmsImage3 = this.mobileLarge;
        FmsImage fmsImage4 = this.mobileSmall;
        return "FmsImages(desktopLarge=" + fmsImage + ", desktopSmall=" + fmsImage2 + ", mobileLarge=" + fmsImage3 + ", mobileSmall=" + fmsImage4 + ")";
    }

    public FmsImages(FmsImage fmsImage, FmsImage fmsImage2, FmsImage fmsImage3, FmsImage fmsImage4) {
        this.desktopLarge = fmsImage;
        this.desktopSmall = fmsImage2;
        this.mobileLarge = fmsImage3;
        this.mobileSmall = fmsImage4;
    }

    public /* synthetic */ FmsImages(FmsImage fmsImage, FmsImage fmsImage2, FmsImage fmsImage3, FmsImage fmsImage4, int i, e eVar) {
        this((i & 1) != 0 ? null : fmsImage, (i & 2) != 0 ? null : fmsImage2, (i & 4) != 0 ? null : fmsImage3, (i & 8) != 0 ? null : fmsImage4);
    }
}
