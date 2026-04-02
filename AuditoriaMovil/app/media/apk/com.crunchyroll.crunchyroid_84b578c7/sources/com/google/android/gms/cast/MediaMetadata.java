package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaMetadataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String KEY_BOOK_TITLE = "com.google.android.gms.cast.metadata.BOOK_TITLE";
    public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String KEY_CHAPTER_NUMBER = "com.google.android.gms.cast.metadata.CHAPTER_NUMBER";
    public static final String KEY_CHAPTER_TITLE = "com.google.android.gms.cast.metadata.CHAPTER_TITLE";
    public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String KEY_QUEUE_ITEM_ID = "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID";
    public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String KEY_SECTION_DURATION = "com.google.android.gms.cast.metadata.SECTION_DURATION";
    public static final String KEY_SECTION_START_ABSOLUTE_TIME = "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME";
    public static final String KEY_SECTION_START_TIME_IN_CONTAINER = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER";
    public static final String KEY_SECTION_START_TIME_IN_MEDIA = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA";
    public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
    public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
    public static final int MEDIA_TYPE_AUDIOBOOK_CHAPTER = 5;
    public static final int MEDIA_TYPE_GENERIC = 0;
    public static final int MEDIA_TYPE_MOVIE = 1;
    public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
    public static final int MEDIA_TYPE_PHOTO = 4;
    public static final int MEDIA_TYPE_TV_SHOW = 2;
    public static final int MEDIA_TYPE_USER = 100;
    private static final zzcd zzc;
    @SafeParcelable.Field(id = 3)
    final Bundle zza;
    @SafeParcelable.Field(getter = "getImages", id = 2)
    private final List zzd;
    @SafeParcelable.Field(getter = "getMediaType", id = 4)
    private int zze;
    private final Writer zzf;
    private static final String[] zzb = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new zzce();

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public Object getRawValue(String str) {
            return MediaMetadata.this.zza.get(str);
        }

        @KeepForSdk
        public void remove(String str) {
            MediaMetadata.this.zza.remove(str);
        }

        @KeepForSdk
        public void setMediaType(int i) {
            MediaMetadata.this.zze = i;
        }
    }

    static {
        zzcd zzcdVar = new zzcd();
        zzcdVar.zzb(KEY_CREATION_DATE, "creationDateTime", 4);
        zzcdVar.zzb(KEY_RELEASE_DATE, "releaseDate", 4);
        zzcdVar.zzb(KEY_BROADCAST_DATE, "originalAirdate", 4);
        zzcdVar.zzb(KEY_TITLE, "title", 1);
        zzcdVar.zzb(KEY_SUBTITLE, MediaTrack.ROLE_SUBTITLE, 1);
        zzcdVar.zzb(KEY_ARTIST, "artist", 1);
        zzcdVar.zzb(KEY_ALBUM_ARTIST, "albumArtist", 1);
        zzcdVar.zzb(KEY_ALBUM_TITLE, "albumName", 1);
        zzcdVar.zzb(KEY_COMPOSER, "composer", 1);
        zzcdVar.zzb(KEY_DISC_NUMBER, "discNumber", 2);
        zzcdVar.zzb(KEY_TRACK_NUMBER, "trackNumber", 2);
        zzcdVar.zzb(KEY_SEASON_NUMBER, "season", 2);
        zzcdVar.zzb(KEY_EPISODE_NUMBER, "episode", 2);
        zzcdVar.zzb(KEY_SERIES_TITLE, "seriesTitle", 1);
        zzcdVar.zzb(KEY_STUDIO, "studio", 1);
        zzcdVar.zzb(KEY_WIDTH, "width", 2);
        zzcdVar.zzb(KEY_HEIGHT, "height", 2);
        zzcdVar.zzb(KEY_LOCATION_NAME, FirebaseAnalytics.Param.LOCATION, 1);
        zzcdVar.zzb(KEY_LOCATION_LATITUDE, "latitude", 3);
        zzcdVar.zzb(KEY_LOCATION_LONGITUDE, "longitude", 3);
        zzcdVar.zzb(KEY_SECTION_DURATION, "sectionDuration", 5);
        zzcdVar.zzb(KEY_SECTION_START_TIME_IN_MEDIA, "sectionStartTimeInMedia", 5);
        zzcdVar.zzb(KEY_SECTION_START_ABSOLUTE_TIME, "sectionStartAbsoluteTime", 5);
        zzcdVar.zzb(KEY_SECTION_START_TIME_IN_CONTAINER, "sectionStartTimeInContainer", 5);
        zzcdVar.zzb(KEY_QUEUE_ITEM_ID, "queueItemId", 2);
        zzcdVar.zzb(KEY_BOOK_TITLE, "bookTitle", 1);
        zzcdVar.zzb(KEY_CHAPTER_NUMBER, "chapterNumber", 2);
        zzcdVar.zzb(KEY_CHAPTER_TITLE, "chapterTitle", 1);
        zzc = zzcdVar;
    }

    public MediaMetadata() {
        this(0);
    }

    @KeepForSdk
    public static int getTypeForKey(String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            return zzc.zza(str);
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    @KeepForSdk
    public static void throwIfWrongType(String str, int i) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            int zza = zzc.zza(str);
            if (zza != i && zza != 0) {
                throw new IllegalArgumentException(b.a("Value for ", str, " must be a ", zzb[i]));
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    private final boolean zzd(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !zzd((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void addImage(WebImage webImage) {
        this.zzd.add(webImage);
    }

    public void clear() {
        this.zza.clear();
        this.zzd.clear();
    }

    public void clearImages() {
        this.zzd.clear();
    }

    public boolean containsKey(String str) {
        return this.zza.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        if (zzd(this.zza, mediaMetadata.zza) && this.zzd.equals(mediaMetadata.zzd)) {
            return true;
        }
        return false;
    }

    public Calendar getDate(String str) {
        throwIfWrongType(str, 4);
        String string = this.zza.getString(str);
        if (string != null) {
            return com.google.android.gms.cast.internal.media.zza.zzb(string);
        }
        return null;
    }

    public String getDateAsString(String str) {
        throwIfWrongType(str, 4);
        return this.zza.getString(str);
    }

    public double getDouble(String str) {
        throwIfWrongType(str, 3);
        return this.zza.getDouble(str);
    }

    public List<WebImage> getImages() {
        return this.zzd;
    }

    public int getInt(String str) {
        throwIfWrongType(str, 2);
        return this.zza.getInt(str);
    }

    public int getMediaType() {
        return this.zze;
    }

    public String getString(String str) {
        throwIfWrongType(str, 1);
        return this.zza.getString(str);
    }

    public long getTimeMillis(String str) {
        throwIfWrongType(str, 5);
        return this.zza.getLong(str);
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzf;
    }

    public boolean hasImages() {
        List list = this.zzd;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Bundle bundle = this.zza;
        int i2 = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.zza.get(str);
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
        }
        return this.zzd.hashCode() + (i2 * 31);
    }

    public Set<String> keySet() {
        return this.zza.keySet();
    }

    public void putDate(String str, Calendar calendar) {
        throwIfWrongType(str, 4);
        this.zza.putString(str, com.google.android.gms.cast.internal.media.zza.zza(calendar));
    }

    public void putDouble(String str, double d) {
        throwIfWrongType(str, 3);
        this.zza.putDouble(str, d);
    }

    public void putInt(String str, int i) {
        throwIfWrongType(str, 2);
        this.zza.putInt(str, i);
    }

    public void putString(String str, String str2) {
        throwIfWrongType(str, 1);
        this.zza.putString(str, str2);
    }

    public void putTimeMillis(String str, long j) {
        throwIfWrongType(str, 5);
        this.zza.putLong(str, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getImages(), false);
        SafeParcelWriter.writeBundle(parcel, 3, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 4, getMediaType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        zzcd zzcdVar;
        String zzc2;
        c cVar = new c();
        try {
            cVar.put("metadataType", this.zze);
        } catch (com.amazon.aps.iva.if0.b unused) {
        }
        a zzc3 = com.google.android.gms.cast.internal.media.zza.zzc(this.zzd);
        if (zzc3.e() != 0) {
            try {
                cVar.put("images", zzc3);
            } catch (com.amazon.aps.iva.if0.b unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.zze;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Collections.addAll(arrayList, KEY_CHAPTER_TITLE, KEY_CHAPTER_NUMBER, KEY_TITLE, KEY_BOOK_TITLE, KEY_SUBTITLE);
                            }
                        } else {
                            Collections.addAll(arrayList, KEY_TITLE, KEY_ARTIST, KEY_LOCATION_NAME, KEY_LOCATION_LATITUDE, KEY_LOCATION_LONGITUDE, KEY_WIDTH, KEY_HEIGHT, KEY_CREATION_DATE);
                        }
                    } else {
                        Collections.addAll(arrayList, KEY_TITLE, KEY_ARTIST, KEY_ALBUM_TITLE, KEY_ALBUM_ARTIST, KEY_COMPOSER, KEY_TRACK_NUMBER, KEY_DISC_NUMBER, KEY_RELEASE_DATE);
                    }
                } else {
                    Collections.addAll(arrayList, KEY_TITLE, KEY_SERIES_TITLE, KEY_SEASON_NUMBER, KEY_EPISODE_NUMBER, KEY_BROADCAST_DATE);
                }
            } else {
                Collections.addAll(arrayList, KEY_TITLE, KEY_STUDIO, KEY_SUBTITLE, KEY_RELEASE_DATE);
            }
        } else {
            Collections.addAll(arrayList, KEY_TITLE, KEY_ARTIST, KEY_SUBTITLE, KEY_RELEASE_DATE);
        }
        Collections.addAll(arrayList, KEY_SECTION_DURATION, KEY_SECTION_START_TIME_IN_MEDIA, KEY_SECTION_START_ABSOLUTE_TIME, KEY_SECTION_START_TIME_IN_CONTAINER, KEY_QUEUE_ITEM_ID);
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null && this.zza.containsKey(str) && (zzc2 = (zzcdVar = zzc).zzc(str)) != null) {
                    int zza = zzcdVar.zza(str);
                    if (zza != 1) {
                        if (zza != 2) {
                            if (zza != 3) {
                                if (zza != 4) {
                                    if (zza == 5) {
                                        cVar.put(zzc2, CastUtils.millisecToSec(this.zza.getLong(str)));
                                    }
                                }
                            } else {
                                cVar.put(zzc2, this.zza.getDouble(str));
                            }
                        } else {
                            cVar.put(zzc2, this.zza.getInt(str));
                        }
                    }
                    cVar.put(zzc2, this.zza.getString(str));
                }
            }
            for (String str2 : this.zza.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.zza.get(str2);
                    if (obj instanceof String) {
                        cVar.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        cVar.put(str2, obj);
                    } else if (obj instanceof Double) {
                        cVar.put(str2, obj);
                    }
                }
            }
        } catch (com.amazon.aps.iva.if0.b unused3) {
        }
        return cVar;
    }

    public final void zzc(c cVar) {
        clear();
        this.zze = 0;
        try {
            this.zze = cVar.getInt("metadataType");
        } catch (com.amazon.aps.iva.if0.b unused) {
        }
        a optJSONArray = cVar.optJSONArray("images");
        if (optJSONArray != null) {
            com.google.android.gms.cast.internal.media.zza.zzd(this.zzd, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.zze;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Collections.addAll(arrayList, KEY_CHAPTER_TITLE, KEY_CHAPTER_NUMBER, KEY_TITLE, KEY_BOOK_TITLE, KEY_SUBTITLE);
                            }
                        } else {
                            Collections.addAll(arrayList, KEY_TITLE, KEY_ARTIST, KEY_LOCATION_NAME, KEY_LOCATION_LATITUDE, KEY_LOCATION_LONGITUDE, KEY_WIDTH, KEY_HEIGHT, KEY_CREATION_DATE);
                        }
                    } else {
                        Collections.addAll(arrayList, KEY_TITLE, KEY_ALBUM_TITLE, KEY_ARTIST, KEY_ALBUM_ARTIST, KEY_COMPOSER, KEY_TRACK_NUMBER, KEY_DISC_NUMBER, KEY_RELEASE_DATE);
                    }
                } else {
                    Collections.addAll(arrayList, KEY_TITLE, KEY_SERIES_TITLE, KEY_SEASON_NUMBER, KEY_EPISODE_NUMBER, KEY_BROADCAST_DATE);
                }
            } else {
                Collections.addAll(arrayList, KEY_TITLE, KEY_STUDIO, KEY_SUBTITLE, KEY_RELEASE_DATE);
            }
        } else {
            Collections.addAll(arrayList, KEY_TITLE, KEY_ARTIST, KEY_SUBTITLE, KEY_RELEASE_DATE);
        }
        Collections.addAll(arrayList, KEY_SECTION_DURATION, KEY_SECTION_START_TIME_IN_MEDIA, KEY_SECTION_START_ABSOLUTE_TIME, KEY_SECTION_START_TIME_IN_CONTAINER, KEY_QUEUE_ITEM_ID);
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = cVar.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    zzcd zzcdVar = zzc;
                    String zzd = zzcdVar.zzd(next);
                    if (zzd != null) {
                        if (hashSet.contains(zzd)) {
                            try {
                                Object obj = cVar.get(next);
                                if (obj != null) {
                                    int zza = zzcdVar.zza(zzd);
                                    if (zza != 1) {
                                        if (zza != 2) {
                                            if (zza != 3) {
                                                if (zza != 4) {
                                                    if (zza == 5) {
                                                        this.zza.putLong(zzd, CastUtils.secToMillisec(cVar.optLong(next)));
                                                    }
                                                } else if (obj instanceof String) {
                                                    String str = (String) obj;
                                                    if (com.google.android.gms.cast.internal.media.zza.zzb(str) != null) {
                                                        this.zza.putString(zzd, str);
                                                    }
                                                }
                                            } else {
                                                double optDouble = cVar.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    this.zza.putDouble(zzd, optDouble);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            this.zza.putInt(zzd, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        this.zza.putString(zzd, (String) obj);
                                    }
                                }
                            } catch (com.amazon.aps.iva.if0.b unused2) {
                            }
                        }
                    } else {
                        Object obj2 = cVar.get(next);
                        if (obj2 instanceof String) {
                            this.zza.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            this.zza.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            this.zza.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (com.amazon.aps.iva.if0.b unused3) {
        }
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    @SafeParcelable.Constructor
    public MediaMetadata(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i) {
        this.zzf = new Writer();
        this.zzd = list;
        this.zza = bundle;
        this.zze = i;
    }
}
