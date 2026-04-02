package com.kwad.framework.filedownloader.d;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.kwad.framework.filedownloader.f.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.kwad.framework.filedownloader.d.c.1
        private static c[] bz(int i) {
            return new c[i];
        }

        private static c c(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c[] newArray(int i) {
            return bz(i);
        }
    };
    private String Tv;
    private boolean adZ;
    private boolean aem;
    private final AtomicInteger aen;
    private final AtomicLong aeo;
    private long aep;
    private String aeq;
    private String aer;
    private int aes;
    private String filename;
    private int id;
    private String url;

    public c() {
        this.aeo = new AtomicLong();
        this.aen = new AtomicInteger();
    }

    protected c(Parcel parcel) {
        this.id = parcel.readInt();
        this.url = parcel.readString();
        this.Tv = parcel.readString();
        this.aem = parcel.readByte() != 0;
        this.filename = parcel.readString();
        this.aen = new AtomicInteger(parcel.readByte());
        this.aeo = new AtomicLong(parcel.readLong());
        this.aep = parcel.readLong();
        this.aeq = parcel.readString();
        this.aer = parcel.readString();
        this.aes = parcel.readInt();
        this.adZ = parcel.readByte() != 0;
    }

    private String vr() {
        return this.aeq;
    }

    public final void L(long j) {
        this.aeo.set(j);
    }

    public final void M(long j) {
        this.aeo.addAndGet(j);
    }

    public final void N(long j) {
        this.adZ = j > 2147483647L;
        this.aep = j;
    }

    public final void bj(String str) {
        this.aer = str;
    }

    public final void bk(String str) {
        this.aeq = str;
    }

    public final void bl(String str) {
        this.filename = str;
    }

    public final void by(int i) {
        this.aes = i;
    }

    public final void c(String str, boolean z) {
        this.Tv = str;
        this.aem = z;
    }

    public final void d(byte b) {
        this.aen.set(b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPath() {
        return this.Tv;
    }

    public final String getTargetFilePath() {
        return f.a(getPath(), sW(), getFilename());
    }

    public final long getTotal() {
        return this.aep;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isChunked() {
        return this.aep == -1;
    }

    public final boolean sW() {
        return this.aem;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final byte ta() {
        return (byte) this.aen.get();
    }

    public final boolean tg() {
        return this.adZ;
    }

    public final String toString() {
        return f.b("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.id), this.url, this.Tv, Integer.valueOf(this.aen.get()), this.aeo, Long.valueOf(this.aep), this.aer, super.toString());
    }

    public final String uH() {
        if (getTargetFilePath() == null) {
            return null;
        }
        return f.bp(getTargetFilePath());
    }

    public final ContentValues vn() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(getId()));
        contentValues.put("url", getUrl());
        contentValues.put("path", getPath());
        contentValues.put("status", Byte.valueOf(ta()));
        contentValues.put("sofar", Long.valueOf(vp()));
        contentValues.put("total", Long.valueOf(getTotal()));
        contentValues.put("errMsg", vr());
        contentValues.put("etag", vq());
        contentValues.put("connectionCount", Integer.valueOf(vs()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(sW()));
        if (sW() && getFilename() != null) {
            contentValues.put("filename", getFilename());
        }
        return contentValues;
    }

    public final long vp() {
        return this.aeo.get();
    }

    public final String vq() {
        return this.aer;
    }

    public final int vs() {
        return this.aes;
    }

    public final void vt() {
        this.aes = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.Tv);
        parcel.writeByte(this.aem ? (byte) 1 : (byte) 0);
        parcel.writeString(this.filename);
        parcel.writeByte((byte) this.aen.get());
        parcel.writeLong(this.aeo.get());
        parcel.writeLong(this.aep);
        parcel.writeString(this.aeq);
        parcel.writeString(this.aer);
        parcel.writeInt(this.aes);
        parcel.writeByte(this.adZ ? (byte) 1 : (byte) 0);
    }
}
