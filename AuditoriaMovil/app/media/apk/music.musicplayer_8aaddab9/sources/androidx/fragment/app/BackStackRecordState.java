package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.m.b.d;
import c.m.b.d0;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f370b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f371c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f372d;

    /* renamed from: e  reason: collision with root package name */
    public final int f373e;

    /* renamed from: f  reason: collision with root package name */
    public final String f374f;

    /* renamed from: g  reason: collision with root package name */
    public final int f375g;

    /* renamed from: h  reason: collision with root package name */
    public final int f376h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f377i;

    /* renamed from: j  reason: collision with root package name */
    public final int f378j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f379k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<String> f380l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f381m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f382n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.f370b = parcel.createStringArrayList();
        this.f371c = parcel.createIntArray();
        this.f372d = parcel.createIntArray();
        this.f373e = parcel.readInt();
        this.f374f = parcel.readString();
        this.f375g = parcel.readInt();
        this.f376h = parcel.readInt();
        this.f377i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f378j = parcel.readInt();
        this.f379k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f380l = parcel.createStringArrayList();
        this.f381m = parcel.createStringArrayList();
        this.f382n = parcel.readInt() != 0;
    }

    public BackStackRecordState(d dVar) {
        int size = dVar.a.size();
        this.a = new int[size * 6];
        if (!dVar.f2320g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f370b = new ArrayList<>(size);
        this.f371c = new int[size];
        this.f372d = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            d0.a aVar = dVar.a.get(i2);
            int i4 = i3 + 1;
            this.a[i3] = aVar.a;
            ArrayList<String> arrayList = this.f370b;
            Fragment fragment = aVar.f2328b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.a;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f2329c ? 1 : 0;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f2330d;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f2331e;
            int i8 = i7 + 1;
            iArr[i7] = aVar.f2332f;
            iArr[i8] = aVar.f2333g;
            this.f371c[i2] = aVar.f2334h.ordinal();
            this.f372d[i2] = aVar.f2335i.ordinal();
            i2++;
            i3 = i8 + 1;
        }
        this.f373e = dVar.f2319f;
        this.f374f = dVar.f2322i;
        this.f375g = dVar.s;
        this.f376h = dVar.f2323j;
        this.f377i = dVar.f2324k;
        this.f378j = dVar.f2325l;
        this.f379k = dVar.f2326m;
        this.f380l = dVar.f2327n;
        this.f381m = dVar.o;
        this.f382n = dVar.p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.f370b);
        parcel.writeIntArray(this.f371c);
        parcel.writeIntArray(this.f372d);
        parcel.writeInt(this.f373e);
        parcel.writeString(this.f374f);
        parcel.writeInt(this.f375g);
        parcel.writeInt(this.f376h);
        TextUtils.writeToParcel(this.f377i, parcel, 0);
        parcel.writeInt(this.f378j);
        TextUtils.writeToParcel(this.f379k, parcel, 0);
        parcel.writeStringList(this.f380l);
        parcel.writeStringList(this.f381m);
        parcel.writeInt(this.f382n ? 1 : 0);
    }
}
