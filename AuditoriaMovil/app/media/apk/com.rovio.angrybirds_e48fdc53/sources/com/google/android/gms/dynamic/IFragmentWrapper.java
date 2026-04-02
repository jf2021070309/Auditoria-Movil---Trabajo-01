package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
/* loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* loaded from: classes2.dex */
        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final IObjectWrapper zzad() {
                Parcel zza = zza(2, zza());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final Bundle getArguments() {
                Parcel zza = zza(3, zza());
                Bundle bundle = (Bundle) zzc.zza(zza, Bundle.CREATOR);
                zza.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final int getId() {
                Parcel zza = zza(4, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final IFragmentWrapper zzae() {
                Parcel zza = zza(5, zza());
                IFragmentWrapper asInterface = Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final IObjectWrapper zzaf() {
                Parcel zza = zza(6, zza());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean getRetainInstance() {
                Parcel zza = zza(7, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final String getTag() {
                Parcel zza = zza(8, zza());
                String readString = zza.readString();
                zza.recycle();
                return readString;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final IFragmentWrapper zzag() {
                Parcel zza = zza(9, zza());
                IFragmentWrapper asInterface = Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final int getTargetRequestCode() {
                Parcel zza = zza(10, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean getUserVisibleHint() {
                Parcel zza = zza(11, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final IObjectWrapper zzah() {
                Parcel zza = zza(12, zza());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isAdded() {
                Parcel zza = zza(13, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isDetached() {
                Parcel zza = zza(14, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isHidden() {
                Parcel zza = zza(15, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isInLayout() {
                Parcel zza = zza(16, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isRemoving() {
                Parcel zza = zza(17, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isResumed() {
                Parcel zza = zza(18, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isVisible() {
                Parcel zza = zza(19, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void zza(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.zza(zza, iObjectWrapper);
                zzb(20, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setHasOptionsMenu(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(21, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setMenuVisibility(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(22, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setRetainInstance(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(23, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setUserVisibleHint(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(24, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void startActivity(Intent intent) {
                Parcel zza = zza();
                zzc.zza(zza, intent);
                zzb(25, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void startActivityForResult(Intent intent, int i) {
                Parcel zza = zza();
                zzc.zza(zza, intent);
                zza.writeInt(i);
                zzb(26, zza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void zzb(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.zza(zza, iObjectWrapper);
                zzb(27, zza);
            }
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IObjectWrapper zzad = zzad();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzad);
                    break;
                case 3:
                    Bundle arguments = getArguments();
                    parcel2.writeNoException();
                    zzc.zzb(parcel2, arguments);
                    break;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    break;
                case 5:
                    IFragmentWrapper zzae = zzae();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 6:
                    IObjectWrapper zzaf = zzaf();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzaf);
                    break;
                case 7:
                    boolean retainInstance = getRetainInstance();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    break;
                case 9:
                    IFragmentWrapper zzag = zzag();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzag);
                    break;
                case 10:
                    int targetRequestCode = getTargetRequestCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(targetRequestCode);
                    break;
                case 11:
                    boolean userVisibleHint = getUserVisibleHint();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, userVisibleHint);
                    break;
                case 12:
                    IObjectWrapper zzah = zzah();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzah);
                    break;
                case 13:
                    boolean isAdded = isAdded();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isAdded);
                    break;
                case 14:
                    boolean isDetached = isDetached();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isDetached);
                    break;
                case 15:
                    boolean isHidden = isHidden();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isHidden);
                    break;
                case 16:
                    boolean isInLayout = isInLayout();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isInLayout);
                    break;
                case 17:
                    boolean isRemoving = isRemoving();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isRemoving);
                    break;
                case 18:
                    boolean isResumed = isResumed();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isResumed);
                    break;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, isVisible);
                    break;
                case 20:
                    zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    setHasOptionsMenu(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 22:
                    setMenuVisibility(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 23:
                    setRetainInstance(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 24:
                    setUserVisibleHint(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 25:
                    startActivity((Intent) zzc.zza(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    startActivityForResult((Intent) zzc.zza(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    Bundle getArguments();

    int getId();

    boolean getRetainInstance();

    String getTag();

    int getTargetRequestCode();

    boolean getUserVisibleHint();

    boolean isAdded();

    boolean isDetached();

    boolean isHidden();

    boolean isInLayout();

    boolean isRemoving();

    boolean isResumed();

    boolean isVisible();

    void setHasOptionsMenu(boolean z);

    void setMenuVisibility(boolean z);

    void setRetainInstance(boolean z);

    void setUserVisibleHint(boolean z);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void zza(IObjectWrapper iObjectWrapper);

    IObjectWrapper zzad();

    IFragmentWrapper zzae();

    IObjectWrapper zzaf();

    IFragmentWrapper zzag();

    IObjectWrapper zzah();

    void zzb(IObjectWrapper iObjectWrapper);
}
