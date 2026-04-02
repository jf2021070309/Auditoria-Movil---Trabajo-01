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
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final long f61b;

    /* renamed from: c  reason: collision with root package name */
    public final long f62c;

    /* renamed from: d  reason: collision with root package name */
    public final float f63d;

    /* renamed from: e  reason: collision with root package name */
    public final long f64e;

    /* renamed from: f  reason: collision with root package name */
    public final int f65f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f66g;

    /* renamed from: h  reason: collision with root package name */
    public final long f67h;

    /* renamed from: i  reason: collision with root package name */
    public List<CustomAction> f68i;

    /* renamed from: j  reason: collision with root package name */
    public final long f69j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f70k;

    /* renamed from: l  reason: collision with root package name */
    public PlaybackState f71l;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f72b;

        /* renamed from: c  reason: collision with root package name */
        public final int f73c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f74d;

        /* renamed from: e  reason: collision with root package name */
        public PlaybackState.CustomAction f75e;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.f72b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f73c = parcel.readInt();
            this.f74d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.a = str;
            this.f72b = charSequence;
            this.f73c = i2;
            this.f74d = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Action:mName='");
            y.append((Object) this.f72b);
            y.append(", mIcon=");
            y.append(this.f73c);
            y.append(", mExtras=");
            y.append(this.f74d);
            return y.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.f72b, parcel, i2);
            parcel.writeInt(this.f73c);
            parcel.writeBundle(this.f74d);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
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

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i2) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i2);
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

        public static void s(PlaybackState.Builder builder, long j2) {
            builder.setActions(j2);
        }

        public static void t(PlaybackState.Builder builder, long j2) {
            builder.setActiveQueueItemId(j2);
        }

        public static void u(PlaybackState.Builder builder, long j2) {
            builder.setBufferedPosition(j2);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i2, long j2, float f2, long j3) {
            builder.setState(i2, j2, f2, j3);
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

    public PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.a = i2;
        this.f61b = j2;
        this.f62c = j3;
        this.f63d = f2;
        this.f64e = j4;
        this.f65f = i3;
        this.f66g = charSequence;
        this.f67h = j5;
        this.f68i = new ArrayList(list);
        this.f69j = j6;
        this.f70k = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.f61b = parcel.readLong();
        this.f63d = parcel.readFloat();
        this.f67h = parcel.readLong();
        this.f62c = parcel.readLong();
        this.f64e = parcel.readLong();
        this.f66g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f68i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f69j = parcel.readLong();
        this.f70k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f65f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.f61b);
        sb.append(", buffered position=");
        sb.append(this.f62c);
        sb.append(", speed=");
        sb.append(this.f63d);
        sb.append(", updated=");
        sb.append(this.f67h);
        sb.append(", actions=");
        sb.append(this.f64e);
        sb.append(", error code=");
        sb.append(this.f65f);
        sb.append(", error message=");
        sb.append(this.f66g);
        sb.append(", custom actions=");
        sb.append(this.f68i);
        sb.append(", active item id=");
        return e.a.d.a.a.q(sb, this.f69j, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.f61b);
        parcel.writeFloat(this.f63d);
        parcel.writeLong(this.f67h);
        parcel.writeLong(this.f62c);
        parcel.writeLong(this.f64e);
        TextUtils.writeToParcel(this.f66g, parcel, i2);
        parcel.writeTypedList(this.f68i);
        parcel.writeLong(this.f69j);
        parcel.writeBundle(this.f70k);
        parcel.writeInt(this.f65f);
    }
}
