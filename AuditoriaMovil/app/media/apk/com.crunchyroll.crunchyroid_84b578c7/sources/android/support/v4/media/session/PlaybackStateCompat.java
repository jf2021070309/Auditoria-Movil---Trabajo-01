package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int b;
    public final long c;
    public final long d;
    public final float e;
    public final long f;
    public final int g;
    public final CharSequence h;
    public final long i;
    public final ArrayList j;
    public final long k;
    public final Bundle l;
    public PlaybackState m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        public static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        public static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public int b;
        public long c;
        public long d;
        public float e;
        public long f;
        public int g;
        public CharSequence h;
        public long i;
        public Bundle k;
        public final ArrayList a = new ArrayList();
        public long j = -1;

        public final void a(CustomAction customAction) {
            this.a.add(customAction);
        }

        public final PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public final void c(long j) {
            this.f = j;
        }

        public final void d(long j) {
            this.j = j;
        }

        public final void e(long j) {
            this.d = j;
        }

        public final void f(int i, CharSequence charSequence) {
            this.g = i;
            this.h = charSequence;
        }

        public final void g(Bundle bundle) {
            this.k = bundle;
        }

        public final void h(float f, int i, long j, long j2) {
            this.b = i;
            this.c = j;
            this.i = j2;
            this.e = f;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = j3;
        this.g = i2;
        this.h = charSequence;
        this.i = j4;
        this.j = new ArrayList(arrayList);
        this.k = j5;
        this.l = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = b.j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            for (PlaybackState.CustomAction customAction2 : j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l = b.l(customAction3);
                    MediaSessionCompat.a(l);
                    customAction = new CustomAction(b.f(customAction3), b.o(customAction3), b.m(customAction3), l);
                    customAction.f = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a2 = c.a(playbackState);
        MediaSessionCompat.a(a2);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), a2);
        playbackStateCompat.m = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", buffered position=");
        sb.append(this.d);
        sb.append(", speed=");
        sb.append(this.e);
        sb.append(", updated=");
        sb.append(this.i);
        sb.append(", actions=");
        sb.append(this.f);
        sb.append(", error code=");
        sb.append(this.g);
        sb.append(", error message=");
        sb.append(this.h);
        sb.append(", custom actions=");
        sb.append(this.j);
        sb.append(", active item id=");
        return com.amazon.aps.iva.c.b.b(sb, this.k, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.e);
        parcel.writeLong(this.i);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.g);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String b;
        public final CharSequence c;
        public final int d;
        public final Bundle e;
        public PlaybackState.CustomAction f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            public final String a;
            public final CharSequence b;
            public final int c;
            public Bundle d;

            public b(CharSequence charSequence, int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (i != 0) {
                            this.a = str;
                            this.b = charSequence;
                            this.c = i;
                            return;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            }

            public final CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public final void b(Bundle bundle) {
                this.d = bundle;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.b = str;
            this.c = charSequence;
            this.d = i;
            this.e = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.c) + ", mIcon=" + this.d + ", mExtras=" + this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d);
            parcel.writeBundle(this.e);
        }

        public CustomAction(Parcel parcel) {
            this.b = parcel.readString();
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt();
            this.e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.e = parcel.readFloat();
        this.i = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k = parcel.readLong();
        this.l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.g = parcel.readInt();
    }
}
