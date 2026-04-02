package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final com.amazon.aps.iva.x.a<String, Integer> e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public final Bundle b;
    public MediaMetadata c;
    public MediaDescriptionCompat d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        com.amazon.aps.iva.x.a<String, Integer> aVar = new com.amazon.aps.iva.x.a<>();
        e = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        g = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        h = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.c = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public final MediaDescriptionCompat b() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bundle bundle;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.d;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String c = c("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        Bundle bundle2 = this.b;
        CharSequence charSequence = bundle2.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(charSequence)) {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = bundle2.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle2.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence2 = bundle2.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i] = charSequence2;
                    i++;
                }
                i2 = i3;
            }
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = g;
            if (i4 < strArr2.length) {
                try {
                    bitmap2 = (Bitmap) bundle2.getParcelable(strArr2[i4]);
                } catch (Exception unused) {
                    bitmap2 = null;
                }
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                    break;
                }
                i4++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = h;
            if (i5 < strArr3.length) {
                String c2 = c(strArr3[i5]);
                if (!TextUtils.isEmpty(c2)) {
                    uri = Uri.parse(c2);
                    break;
                }
                i5++;
            } else {
                uri = null;
                break;
            }
        }
        String c3 = c("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(c3)) {
            uri2 = Uri.parse(c3);
        } else {
            uri2 = null;
        }
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle3 = new Bundle();
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle3.putLong("android.media.extra.BT_FOLDER_TYPE", bundle2.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle3.putLong("android.media.extra.DOWNLOAD_STATUS", bundle2.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        if (!bundle3.isEmpty()) {
            bundle = bundle3;
        } else {
            bundle = null;
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(c, charSequence3, charSequence4, charSequence5, bitmap, uri, bundle, uri2);
        this.d = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final String c(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public final void a(String str, Bitmap bitmap) {
            com.amazon.aps.iva.x.a<String, Integer> aVar = MediaMetadataCompat.e;
            if (aVar.containsKey(str) && aVar.getOrDefault(str, null).intValue() != 2) {
                throw new IllegalArgumentException(e.e("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.a.putParcelable(str, bitmap);
        }

        public final void b(long j, String str) {
            com.amazon.aps.iva.x.a<String, Integer> aVar = MediaMetadataCompat.e;
            if (aVar.containsKey(str) && aVar.getOrDefault(str, null).intValue() != 0) {
                throw new IllegalArgumentException(e.e("The ", str, " key cannot be used to put a long"));
            }
            this.a.putLong(str, j);
        }

        public final void c(String str, RatingCompat ratingCompat) {
            com.amazon.aps.iva.x.a<String, Integer> aVar = MediaMetadataCompat.e;
            Object obj = null;
            if (aVar.containsKey(str) && aVar.getOrDefault(str, null).intValue() != 3) {
                throw new IllegalArgumentException(e.e("The ", str, " key cannot be used to put a Rating"));
            }
            if (ratingCompat.d == null) {
                boolean c = ratingCompat.c();
                int i = ratingCompat.b;
                if (c) {
                    boolean z = true;
                    boolean z2 = false;
                    float f = ratingCompat.c;
                    switch (i) {
                        case 1:
                            if (i == 1) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            ratingCompat.d = RatingCompat.b.g(z2);
                            break;
                        case 2:
                            if (i == 2) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            ratingCompat.d = RatingCompat.b.j(z2);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            ratingCompat.d = RatingCompat.b.i(i, ratingCompat.b());
                            break;
                        case 6:
                            ratingCompat.d = RatingCompat.b.h((i == 6 && ratingCompat.c()) ? -1.0f : -1.0f);
                            break;
                    }
                    this.a.putParcelable(str, (Parcelable) obj);
                }
                ratingCompat.d = RatingCompat.b.k(i);
            }
            obj = ratingCompat.d;
            this.a.putParcelable(str, (Parcelable) obj);
        }

        public final void d(String str, String str2) {
            com.amazon.aps.iva.x.a<String, Integer> aVar = MediaMetadataCompat.e;
            if (aVar.containsKey(str) && aVar.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(e.e("The ", str, " key cannot be used to put a String"));
            }
            this.a.putCharSequence(str, str2);
        }

        public final void e(CharSequence charSequence, String str) {
            com.amazon.aps.iva.x.a<String, Integer> aVar = MediaMetadataCompat.e;
            if (aVar.containsKey(str) && aVar.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(e.e("The ", str, " key cannot be used to put a CharSequence"));
            }
            this.a.putCharSequence(str, charSequence);
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.b);
            this.a = bundle;
            MediaSessionCompat.a(bundle);
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
