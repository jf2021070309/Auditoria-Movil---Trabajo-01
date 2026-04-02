package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzcbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbh> CREATOR = new zzcbi();
    @SafeParcelable.Field(id = 2)
    public ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzcbh(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                try {
                    zzchg.zza.execute(new Runnable(autoCloseOutputStream, marshall) { // from class: com.google.android.gms.internal.ads.zzcbg
                        private final OutputStream zza;
                        private final byte[] zzb;

                        {
                            this.zza = autoCloseOutputStream;
                            this.zzb = marshall;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            DataOutputStream dataOutputStream;
                            OutputStream outputStream = this.zza;
                            byte[] bArr = this.zzb;
                            Parcelable.Creator<zzcbh> creator = zzcbh.CREATOR;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                IOUtils.closeQuietly(dataOutputStream);
                            } catch (IOException e4) {
                                e = e4;
                                dataOutputStream2 = dataOutputStream;
                                zzcgt.zzg("Error transporting the ad response", e);
                                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    IOUtils.closeQuietly(outputStream);
                                } else {
                                    IOUtils.closeQuietly(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    IOUtils.closeQuietly(outputStream);
                                } else {
                                    IOUtils.closeQuietly(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e3) {
                    e = e3;
                    zzcgt.zzg("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "LargeParcelTeleporter.pipeData.2");
                    IOUtils.closeQuietly(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
                    SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i2, false);
                    SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int beginObjectHeader2 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader2);
    }

    public final <T extends SafeParcelable> T zza(Parcelable.Creator<T> creator) {
        if (this.zzc) {
            ParcelFileDescriptor parcelFileDescriptor = this.zza;
            if (parcelFileDescriptor == null) {
                zzcgt.zzf("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e2) {
                    zzcgt.zzg("Could not read from parcel file descriptor", e2);
                    IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (T) this.zzb;
    }
}
