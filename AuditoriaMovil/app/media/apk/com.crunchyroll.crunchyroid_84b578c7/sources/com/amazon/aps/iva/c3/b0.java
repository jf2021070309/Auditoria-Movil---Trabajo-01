package com.amazon.aps.iva.c3;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: Person.java */
/* loaded from: classes.dex */
public final class b0 {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class a {
        public static b0 a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.k;
                icon.getClass();
                int c = IconCompat.a.c(icon);
                if (c != 2) {
                    if (c != 4) {
                        if (c != 6) {
                            iconCompat2 = new IconCompat(-1);
                            iconCompat2.b = icon;
                        } else {
                            Uri d = IconCompat.a.d(icon);
                            d.getClass();
                            String uri = d.toString();
                            uri.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.b = uri;
                        }
                    } else {
                        Uri d2 = IconCompat.a.d(icon);
                        d2.getClass();
                        String uri2 = d2.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.b(null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            bVar.b = iconCompat2;
            bVar.c = person.getUri();
            bVar.d = person.getKey();
            bVar.e = person.isBot();
            bVar.f = person.isImportant();
            return new b0(bVar);
        }

        public static Person b(b0 b0Var) {
            Person.Builder name = new Person.Builder().setName(b0Var.a);
            Icon icon = null;
            IconCompat iconCompat = b0Var.b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(b0Var.c).setKey(b0Var.d).setBot(b0Var.e).setImportant(b0Var.f).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class b {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
    }

    public b0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
    }

    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle.putInt("type", iconCompat.a);
            bundle.putInt("int1", iconCompat.e);
            bundle.putInt("int2", iconCompat.f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }
}
