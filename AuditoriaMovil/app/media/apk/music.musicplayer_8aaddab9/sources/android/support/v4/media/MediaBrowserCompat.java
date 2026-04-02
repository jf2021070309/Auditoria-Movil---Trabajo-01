package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void b(int i2, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void b(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.e(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            MediaItem mediaItem = (MediaItem) parcelable;
            throw null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaDescriptionCompat f3b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i2) {
                return new MediaItem[i2];
            }
        }

        public MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.f3b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i2;
            this.f3b = mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.f3b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            this.f3b.writeToParcel(parcel, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void b(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.e(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }
}
