package com.kwad.framework.filedownloader.message;

import android.os.Parcel;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes.dex */
public abstract class d extends MessageSnapshot {

    /* loaded from: classes.dex */
    public static class a extends b implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, boolean z, long j) {
            super(i, true, j);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {
        private final boolean adU;
        private final long totalBytes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i, boolean z, long j) {
            super(i);
            this.adU = z;
            this.totalBytes = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Parcel parcel) {
            super(parcel);
            this.adU = parcel.readByte() != 0;
            this.totalBytes = parcel.readLong();
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
        public final long ve() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean vf() {
            return this.adU;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.adU ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.totalBytes);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {
        private final String acr;
        private final boolean adV;
        private final String adW;
        private final long totalBytes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i, boolean z, long j, String str, String str2) {
            super(i);
            this.adV = z;
            this.totalBytes = j;
            this.acr = str;
            this.adW = str2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Parcel parcel) {
            super(parcel);
            this.adV = parcel.readByte() != 0;
            this.totalBytes = parcel.readLong();
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
        public final long ve() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.adV ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.totalBytes);
            parcel.writeString(this.acr);
            parcel.writeString(this.adW);
        }
    }

    /* renamed from: com.kwad.framework.filedownloader.message.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0235d extends d {
        private final long adX;
        private final Throwable adY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235d(int i, long j, Throwable th) {
            super(i);
            this.adX = j;
            this.adY = th;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235d(Parcel parcel) {
            super(parcel);
            this.adX = parcel.readLong();
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
        public final long vg() {
            return this.adX;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final Throwable vh() {
            return this.adY;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.adX);
            parcel.writeSerializable(this.adY);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i, long j, long j2) {
            super(i, j, j2);
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) -2;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {
        private final long adX;
        private final long totalBytes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i, long j, long j2) {
            super(i);
            this.adX = j;
            this.totalBytes = j2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Parcel parcel) {
            super(parcel);
            this.adX = parcel.readLong();
            this.totalBytes = parcel.readLong();
        }

        f(f fVar) {
            this(fVar.getId(), fVar.vg(), fVar.ve());
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public byte ta() {
            return (byte) 1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long ve() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long vg() {
            return this.adX;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.adX);
            parcel.writeLong(this.totalBytes);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends d {
        private final long adX;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i, long j) {
            super(i);
            this.adX = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Parcel parcel) {
            super(parcel);
            this.adX = parcel.readLong();
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
        public final long vg() {
            return this.adX;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.adX);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends C0235d {
        private final int adC;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(int i, long j, Throwable th, int i2) {
            super(i, j, th);
            this.adC = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(Parcel parcel) {
            super(parcel);
            this.adC = parcel.readInt();
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0235d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0235d, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) 5;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int te() {
            return this.adC;
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0235d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.adC);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends j implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i, long j, long j2) {
            super(i, j, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends f implements MessageSnapshot.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public j(int i, long j, long j2) {
            super(i, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Parcel parcel) {
            super(parcel);
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) -4;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot.a
        public final MessageSnapshot vi() {
            return new f(this);
        }
    }

    d(int i2) {
        super(i2);
        this.adZ = true;
    }

    d(Parcel parcel) {
        super(parcel);
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int vc() {
        if (vg() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) vg();
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int vd() {
        if (ve() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) ve();
    }
}
