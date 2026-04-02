package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import c.b0.b;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f346b = bVar.k(iconCompat.f346b, 1);
        byte[] bArr = iconCompat.f348d;
        if (bVar.i(2)) {
            bArr = bVar.g();
        }
        iconCompat.f348d = bArr;
        iconCompat.f349e = bVar.m(iconCompat.f349e, 3);
        iconCompat.f350f = bVar.k(iconCompat.f350f, 4);
        iconCompat.f351g = bVar.k(iconCompat.f351g, 5);
        iconCompat.f352h = (ColorStateList) bVar.m(iconCompat.f352h, 6);
        String str = iconCompat.f354j;
        if (bVar.i(7)) {
            str = bVar.n();
        }
        iconCompat.f354j = str;
        String str2 = iconCompat.f355k;
        if (bVar.i(8)) {
            str2 = bVar.n();
        }
        iconCompat.f355k = str2;
        iconCompat.f353i = PorterDuff.Mode.valueOf(iconCompat.f354j);
        switch (iconCompat.f346b) {
            case -1:
                Parcelable parcelable = iconCompat.f349e;
                if (parcelable != null) {
                    iconCompat.f347c = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f349e;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f348d;
                    iconCompat.f347c = bArr2;
                    iconCompat.f346b = 3;
                    iconCompat.f350f = 0;
                    iconCompat.f351g = bArr2.length;
                    break;
                } else {
                    iconCompat.f347c = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f348d, Charset.forName("UTF-16"));
                iconCompat.f347c = str3;
                if (iconCompat.f346b == 2 && iconCompat.f355k == null) {
                    iconCompat.f355k = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f347c = iconCompat.f348d;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        Objects.requireNonNull(bVar);
        iconCompat.f354j = iconCompat.f353i.name();
        switch (iconCompat.f346b) {
            case -1:
                iconCompat.f349e = (Parcelable) iconCompat.f347c;
                break;
            case 1:
            case 5:
                iconCompat.f349e = (Parcelable) iconCompat.f347c;
                break;
            case 2:
                iconCompat.f348d = ((String) iconCompat.f347c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f348d = (byte[]) iconCompat.f347c;
                break;
            case 4:
            case 6:
                iconCompat.f348d = iconCompat.f347c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f346b;
        if (-1 != i2) {
            bVar.p(1);
            bVar.t(i2);
        }
        byte[] bArr = iconCompat.f348d;
        if (bArr != null) {
            bVar.p(2);
            bVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f349e;
        if (parcelable != null) {
            bVar.p(3);
            bVar.u(parcelable);
        }
        int i3 = iconCompat.f350f;
        if (i3 != 0) {
            bVar.p(4);
            bVar.t(i3);
        }
        int i4 = iconCompat.f351g;
        if (i4 != 0) {
            bVar.p(5);
            bVar.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f352h;
        if (colorStateList != null) {
            bVar.p(6);
            bVar.u(colorStateList);
        }
        String str = iconCompat.f354j;
        if (str != null) {
            bVar.p(7);
            bVar.v(str);
        }
        String str2 = iconCompat.f355k;
        if (str2 != null) {
            bVar.p(8);
            bVar.v(str2);
        }
    }
}
