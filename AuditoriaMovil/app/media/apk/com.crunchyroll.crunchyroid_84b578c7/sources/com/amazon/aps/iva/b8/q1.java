package com.amazon.aps.iva.b8;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.util.SparseBooleanArray;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.q5.l0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MediaUtils.java */
/* loaded from: classes.dex */
public final class q1 {
    public static long a(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Unrecognized FolderType: ", i));
        }
    }

    public static MediaDescriptionCompat b(com.amazon.aps.iva.q5.b0 b0Var, Bitmap bitmap) {
        String str;
        Bitmap bitmap2;
        boolean z;
        if (b0Var.b.equals("")) {
            str = null;
        } else {
            str = b0Var.b;
        }
        if (bitmap != null) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = null;
        }
        com.amazon.aps.iva.q5.d0 d0Var = b0Var.e;
        Bundle bundle = d0Var.I;
        boolean z2 = true;
        Integer num = d0Var.p;
        if (num != null && num.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer num2 = d0Var.H;
        if (num2 == null) {
            z2 = false;
        }
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            } else {
                bundle = new Bundle(bundle);
            }
            if (z) {
                num.getClass();
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a(num.intValue()));
            }
            if (z2) {
                num2.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num2.intValue());
            }
        }
        Bundle bundle2 = bundle;
        CharSequence charSequence = d0Var.b;
        CharSequence charSequence2 = d0Var.c;
        if (charSequence2 == null) {
            charSequence2 = d0Var.g;
        }
        return new MediaDescriptionCompat(str, charSequence, charSequence2, d0Var.h, bitmap2, d0Var.m, bundle2, b0Var.g.b);
    }

    public static MediaMetadataCompat c(com.amazon.aps.iva.q5.d0 d0Var, String str, Uri uri, long j, Bitmap bitmap) {
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.d("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = d0Var.b;
        if (charSequence != null) {
            bVar.e(charSequence, "android.media.metadata.TITLE");
            bVar.e(d0Var.b, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence2 = d0Var.g;
        if (charSequence2 != null) {
            bVar.e(charSequence2, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence3 = d0Var.h;
        if (charSequence3 != null) {
            bVar.e(charSequence3, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence4 = d0Var.c;
        if (charSequence4 != null) {
            bVar.e(charSequence4, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence5 = d0Var.d;
        if (charSequence5 != null) {
            bVar.e(charSequence5, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence6 = d0Var.e;
        if (charSequence6 != null) {
            bVar.e(charSequence6, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num = d0Var.t;
        if (num != null) {
            bVar.b(num.intValue(), "android.media.metadata.YEAR");
        }
        if (uri != null) {
            bVar.d("android.media.metadata.MEDIA_URI", uri.toString());
        }
        Uri uri2 = d0Var.m;
        if (uri2 != null) {
            bVar.d("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            bVar.d("android.media.metadata.ALBUM_ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            bVar.a("android.media.metadata.DISPLAY_ICON", bitmap);
            bVar.a("android.media.metadata.ALBUM_ART", bitmap);
        }
        Integer num2 = d0Var.p;
        if (num2 != null && num2.intValue() != -1) {
            bVar.b(a(num2.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j != -9223372036854775807L) {
            bVar.b(j, "android.media.metadata.DURATION");
        }
        RatingCompat g = g(d0Var.i);
        if (g != null) {
            bVar.c("android.media.metadata.USER_RATING", g);
        }
        RatingCompat g2 = g(d0Var.j);
        if (g2 != null) {
            bVar.c("android.media.metadata.RATING", g2);
        }
        Integer num3 = d0Var.H;
        if (num3 != null) {
            bVar.b(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        return new MediaMetadataCompat(bVar.a);
    }

    public static int d(com.amazon.aps.iva.q5.j0 j0Var, int i, boolean z) {
        if (j0Var != null) {
            return 7;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 1;
                    }
                    throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Unrecognized State: ", i));
                } else if (!z) {
                    return 2;
                } else {
                    return 3;
                }
            } else if (!z) {
                return 2;
            } else {
                return 6;
            }
        }
        return 0;
    }

    public static long e(int i) {
        if (i == -1) {
            return -1L;
        }
        return i;
    }

    public static com.amazon.aps.iva.q5.n0 f(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = false;
        float f = ratingCompat.c;
        int i = ratingCompat.b;
        switch (i) {
            case 1:
                if (ratingCompat.c()) {
                    if (i == 1) {
                        if (f != 1.0f) {
                            z = false;
                        }
                        z2 = z;
                    }
                    return new com.amazon.aps.iva.q5.x(z2);
                }
                return new com.amazon.aps.iva.q5.x();
            case 2:
                if (ratingCompat.c()) {
                    if (i == 2) {
                        if (f != 1.0f) {
                            z = false;
                        }
                        z2 = z;
                    }
                    return new com.amazon.aps.iva.q5.q0(z2);
                }
                return new com.amazon.aps.iva.q5.q0();
            case 3:
                if (ratingCompat.c()) {
                    return new com.amazon.aps.iva.q5.o0(3, ratingCompat.b());
                }
                return new com.amazon.aps.iva.q5.o0(3);
            case 4:
                if (ratingCompat.c()) {
                    return new com.amazon.aps.iva.q5.o0(4, ratingCompat.b());
                }
                return new com.amazon.aps.iva.q5.o0(4);
            case 5:
                if (ratingCompat.c()) {
                    return new com.amazon.aps.iva.q5.o0(5, ratingCompat.b());
                }
                return new com.amazon.aps.iva.q5.o0(5);
            case 6:
                if (ratingCompat.c()) {
                    return new com.amazon.aps.iva.q5.i0((i == 6 && ratingCompat.c()) ? -1.0f : -1.0f);
                }
                return new com.amazon.aps.iva.q5.i0();
            default:
                return null;
        }
    }

    @SuppressLint({"WrongConstant"})
    public static RatingCompat g(com.amazon.aps.iva.q5.n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        int i = i(n0Var);
        if (!n0Var.a()) {
            return RatingCompat.e(i);
        }
        float f = 1.0f;
        switch (i) {
            case 1:
                if (!((com.amazon.aps.iva.q5.x) n0Var).e) {
                    f = 0.0f;
                }
                return new RatingCompat(1, f);
            case 2:
                if (!((com.amazon.aps.iva.q5.q0) n0Var).e) {
                    f = 0.0f;
                }
                return new RatingCompat(2, f);
            case 3:
            case 4:
            case 5:
                return RatingCompat.d(((com.amazon.aps.iva.q5.o0) n0Var).e, i);
            case 6:
                float f2 = ((com.amazon.aps.iva.q5.i0) n0Var).d;
                if (f2 < 0.0f || f2 > 100.0f) {
                    return null;
                }
                return new RatingCompat(6, f2);
            default:
                return null;
        }
    }

    public static int h(com.amazon.aps.iva.q5.f fVar) {
        int i = AudioAttributesCompat.b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(fVar.b);
        builder.setFlags(fVar.c);
        builder.setUsage(fVar.d);
        int a = new AudioAttributesCompat(new AudioAttributesImplApi26(builder.build())).a.a();
        if (a == Integer.MIN_VALUE) {
            return 3;
        }
        return a;
    }

    public static int i(com.amazon.aps.iva.q5.n0 n0Var) {
        if (n0Var instanceof com.amazon.aps.iva.q5.x) {
            return 1;
        }
        if (n0Var instanceof com.amazon.aps.iva.q5.q0) {
            return 2;
        }
        if (n0Var instanceof com.amazon.aps.iva.q5.o0) {
            int i = ((com.amazon.aps.iva.q5.o0) n0Var).d;
            int i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return i2;
        } else if (n0Var instanceof com.amazon.aps.iva.q5.i0) {
            return 6;
        } else {
            return 0;
        }
    }

    public static l0.a j(l0.a aVar, l0.a aVar2) {
        if (aVar != null && aVar2 != null) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i = 0; i < aVar.c(); i++) {
                if (aVar2.a(aVar.b(i))) {
                    int b = aVar.b(i);
                    com.amazon.aps.iva.cq.b.C(!false);
                    sparseBooleanArray.append(b, true);
                }
            }
            com.amazon.aps.iva.cq.b.C(!false);
            return new l0.a(new com.amazon.aps.iva.q5.u(sparseBooleanArray));
        }
        return l0.a.c;
    }

    public static void k(com.amazon.aps.iva.q5.l0 l0Var, q.e eVar) {
        int i = eVar.b;
        ImmutableList<com.amazon.aps.iva.q5.b0> immutableList = eVar.a;
        if (i == -1) {
            if (l0Var.V(20)) {
                l0Var.z(immutableList);
                return;
            } else if (!immutableList.isEmpty()) {
                l0Var.q0(immutableList.get(0));
                return;
            } else {
                return;
            }
        }
        boolean V = l0Var.V(20);
        long j = eVar.c;
        if (V) {
            l0Var.y0(eVar.b, j, immutableList);
        } else if (!immutableList.isEmpty()) {
            l0Var.t(immutableList.get(0), j);
        }
    }

    public static ArrayList l(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel obtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                obtain.writeParcelable(parcelable, 0);
                if (obtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } finally {
                obtain.recycle();
            }
        }
        return arrayList;
    }
}
