package com.amazon.aps.iva.q5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.Cast;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
/* compiled from: BundleListRetriever.java */
/* loaded from: classes.dex */
public final class j extends Binder {
    public static final int b;
    public final ImmutableList<Bundle> a;

    static {
        int i;
        if (com.amazon.aps.iva.t5.g0.a >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = Cast.MAX_MESSAGE_LENGTH;
        }
        b = i;
    }

    public j(List<Bundle> list) {
        this.a = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList<Bundle> a(IBinder iBinder) {
        int readInt;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            builder.add((ImmutableList.Builder) readBundle);
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        ImmutableList<Bundle> immutableList = this.a;
        int size = immutableList.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(immutableList.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
