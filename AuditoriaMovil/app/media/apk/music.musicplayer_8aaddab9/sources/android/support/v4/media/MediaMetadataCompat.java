package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final c.f.a<String, Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f12b;

    /* renamed from: c  reason: collision with root package name */
    public MediaMetadata f13c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i2) {
            return new MediaMetadataCompat[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i2) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f12b);
            this.a = bundle;
            MediaSessionCompat.a(bundle);
            for (String str : bundle.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i2 || bitmap.getWidth() > i2) {
                        float f2 = i2;
                        float min = Math.min(f2 / bitmap.getWidth(), f2 / bitmap.getHeight());
                        a(str, Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true));
                    }
                }
            }
        }

        public b a(String str, Bitmap bitmap) {
            c.f.a<String, Integer> aVar = MediaMetadataCompat.a;
            if (!(aVar.e(str) >= 0) || aVar.getOrDefault(str, null).intValue() == 2) {
                this.a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException(e.a.d.a.a.l("The ", str, " key cannot be used to put a Bitmap"));
        }

        public b b(String str, long j2) {
            c.f.a<String, Integer> aVar = MediaMetadataCompat.a;
            if (!(aVar.e(str) >= 0) || aVar.getOrDefault(str, null).intValue() == 0) {
                this.a.putLong(str, j2);
                return this;
            }
            throw new IllegalArgumentException(e.a.d.a.a.l("The ", str, " key cannot be used to put a long"));
        }

        public b c(String str, String str2) {
            c.f.a<String, Integer> aVar = MediaMetadataCompat.a;
            if (!(aVar.e(str) >= 0) || aVar.getOrDefault(str, null).intValue() == 1) {
                this.a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException(e.a.d.a.a.l("The ", str, " key cannot be used to put a String"));
        }
    }

    static {
        c.f.a<String, Integer> aVar = new c.f.a<>();
        a = aVar;
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
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f12b = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f12b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f12b);
    }
}
