package com.kwad.framework.filedownloader.message;

import android.os.Parcel;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes.dex */
public abstract class h extends MessageSnapshot {

    /* loaded from: classes.dex */
    public static class a extends b implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, boolean z, int i2) {
            super(i, true, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h {
        private final boolean adU;
        private final int aej;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i, boolean z, int i2) {
            super(i);
            this.adU = z;
            this.aej = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Parcel parcel) {
            super(parcel);
            this.adU = parcel.readByte() != 0;
            this.aej = parcel.readInt();
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) -3;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vd() {
            return this.aej;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean vf() {
            return this.adU;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.adU ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.aej);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends h {
        private final String acr;
        private final boolean adV;
        private final String adW;
        private final int aej;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i, boolean z, int i2, String str, String str2) {
            super(i);
            this.adV = z;
            this.aej = i2;
            this.acr = str;
            this.adW = str2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Parcel parcel) {
            super(parcel);
            this.adV = parcel.readByte() != 0;
            this.aej = parcel.readInt();
            this.acr = parcel.readString();
            this.adW = parcel.readString();
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final String getEtag() {
            return this.acr;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final String getFileName() {
            return this.adW;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) 2;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean uU() {
            return this.adV;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vd() {
            return this.aej;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.adV ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.aej);
            parcel.writeString(this.acr);
            parcel.writeString(this.adW);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends h {
        private final Throwable adY;
        private final int aek;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(int i, int i2, Throwable th) {
            super(i);
            this.aek = i2;
            this.adY = th;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Parcel parcel) {
            super(parcel);
            this.aek = parcel.readInt();
            this.adY = (Throwable) parcel.readSerializable();
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public byte ta() {
            return (byte) -1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vc() {
            return this.aek;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final Throwable vh() {
            return this.adY;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.aek);
            parcel.writeSerializable(this.adY);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) -2;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends h {
        private final int aej;
        private final int aek;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i, int i2, int i3) {
            super(i);
            this.aek = i2;
            this.aej = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Parcel parcel) {
            super(parcel);
            this.aek = parcel.readInt();
            this.aej = parcel.readInt();
        }

        f(f fVar) {
            this(fVar.getId(), fVar.vc(), fVar.vd());
        }

        public byte ta() {
            return (byte) 1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vc() {
            return this.aek;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vd() {
            return this.aej;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.aek);
            parcel.writeInt(this.aej);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends h {
        private final int aek;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i, int i2) {
            super(i);
            this.aek = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Parcel parcel) {
            super(parcel);
            this.aek = parcel.readInt();
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) 3;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int vc() {
            return this.aek;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.aek);
        }
    }

    /* renamed from: com.kwad.framework.filedownloader.message.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0236h extends d {
        private final int adC;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0236h(int i, int i2, Throwable th, int i3) {
            super(i, i2, th);
            this.adC = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0236h(Parcel parcel) {
            super(parcel);
            this.adC = parcel.readInt();
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) 5;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int te() {
            return this.adC;
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.adC);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends j implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends f implements MessageSnapshot.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public j(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Parcel parcel) {
            super(parcel);
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) -4;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot.a
        public final MessageSnapshot vi() {
            return new f(this);
        }
    }

    h(int i2) {
        super(i2);
        this.adZ = false;
    }

    h(Parcel parcel) {
        super(parcel);
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long ve() {
        return vd();
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long vg() {
        return vc();
    }
}
