package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final Bitmap f;
    public final Uri g;
    public final Bundle h;
    public final Uri i;
    public MediaDescription j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = bitmap;
        this.g = uri;
        this.h = bundle;
        this.i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L61
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.b.g(r13)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r13)
            java.lang.CharSequence r4 = android.support.v4.media.MediaDescriptionCompat.b.h(r13)
            java.lang.CharSequence r5 = android.support.v4.media.MediaDescriptionCompat.b.c(r13)
            android.graphics.Bitmap r6 = android.support.v4.media.MediaDescriptionCompat.b.e(r13)
            android.net.Uri r7 = android.support.v4.media.MediaDescriptionCompat.b.f(r13)
            android.os.Bundle r1 = android.support.v4.media.MediaDescriptionCompat.b.d(r13)
            if (r1 == 0) goto L2b
            android.support.v4.media.session.MediaSessionCompat.a(r1)
            r1.isEmpty()     // Catch: android.os.BadParcelableException -> L2a
            goto L2b
        L2a:
            r1 = r0
        L2b:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L36
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L37
        L36:
            r9 = r0
        L37:
            if (r9 == 0) goto L50
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L4a
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L4a
            r8 = r0
            goto L51
        L4a:
            r1.remove(r8)
            r1.remove(r10)
        L50:
            r8 = r1
        L51:
            if (r9 == 0) goto L54
            goto L59
        L54:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r13)
            r9 = r0
        L59:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.j = r13
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.j;
        if (mediaDescription == null) {
            MediaDescription.Builder b2 = b.b();
            b.n(b2, this.b);
            b.p(b2, this.c);
            b.o(b2, this.d);
            b.j(b2, this.e);
            b.l(b2, this.f);
            b.m(b2, this.g);
            b.k(b2, this.h);
            c.b(b2, this.i);
            MediaDescription a2 = b.a(b2);
            this.j = a2;
            return a2;
        }
        return mediaDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.c) + ", " + ((Object) this.d) + ", " + ((Object) this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
