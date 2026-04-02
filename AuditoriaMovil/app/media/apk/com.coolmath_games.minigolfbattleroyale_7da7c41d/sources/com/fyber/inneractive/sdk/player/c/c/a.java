package com.fyber.inneractive.sdk.player.c.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class a implements Parcelable, Comparator<C0053a> {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.fyber.inneractive.sdk.player.c.c.a.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    public final C0053a[] a;
    public final int b;
    private int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(C0053a c0053a, C0053a c0053a2) {
        C0053a c0053a3 = c0053a;
        C0053a c0053a4 = c0053a2;
        if (com.fyber.inneractive.sdk.player.c.b.b.equals(c0053a3.e)) {
            return com.fyber.inneractive.sdk.player.c.b.b.equals(c0053a4.e) ? 0 : 1;
        }
        return c0053a3.e.compareTo(c0053a4.e);
    }

    public a(List<C0053a> list) {
        this(false, (C0053a[]) list.toArray(new C0053a[list.size()]));
    }

    public a(C0053a... c0053aArr) {
        this(true, c0053aArr);
    }

    private a(boolean z, C0053a... c0053aArr) {
        c0053aArr = z ? (C0053a[]) c0053aArr.clone() : c0053aArr;
        Arrays.sort(c0053aArr, this);
        for (int i = 1; i < c0053aArr.length; i++) {
            if (c0053aArr[i - 1].e.equals(c0053aArr[i].e)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + c0053aArr[i].e);
            }
        }
        this.a = c0053aArr;
        this.b = c0053aArr.length;
    }

    a(Parcel parcel) {
        C0053a[] c0053aArr = (C0053a[]) parcel.createTypedArray(C0053a.CREATOR);
        this.a = c0053aArr;
        this.b = c0053aArr.length;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.a);
        }
        return this.c;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((a) obj).a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0053a implements Parcelable {
        public static final Parcelable.Creator<C0053a> CREATOR = new Parcelable.Creator<C0053a>() { // from class: com.fyber.inneractive.sdk.player.c.c.a.a.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0053a[] newArray(int i) {
                return new C0053a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0053a createFromParcel(Parcel parcel) {
                return new C0053a(parcel);
            }
        };
        public final String a;
        public final byte[] b;
        public final boolean c;
        private int d;
        private final UUID e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public C0053a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private C0053a(UUID uuid, String str, byte[] bArr, byte b) {
            this.e = (UUID) com.fyber.inneractive.sdk.player.c.k.a.a(uuid);
            this.a = (String) com.fyber.inneractive.sdk.player.c.k.a.a(str);
            this.b = (byte[]) com.fyber.inneractive.sdk.player.c.k.a.a(bArr);
            this.c = false;
        }

        C0053a(Parcel parcel) {
            this.e = new UUID(parcel.readLong(), parcel.readLong());
            this.a = parcel.readString();
            this.b = parcel.createByteArray();
            this.c = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0053a) {
                if (obj == this) {
                    return true;
                }
                C0053a c0053a = (C0053a) obj;
                return this.a.equals(c0053a.a) && t.a(this.e, c0053a.e) && Arrays.equals(this.b, c0053a.b);
            }
            return false;
        }

        public final int hashCode() {
            if (this.d == 0) {
                this.d = (((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + Arrays.hashCode(this.b);
            }
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.e.getMostSignificantBits());
            parcel.writeLong(this.e.getLeastSignificantBits());
            parcel.writeString(this.a);
            parcel.writeByteArray(this.b);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        }
    }
}
