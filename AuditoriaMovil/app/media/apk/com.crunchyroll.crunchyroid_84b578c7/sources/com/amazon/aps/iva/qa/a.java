package com.amazon.aps.iva.qa;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: AIOnDeCServiceInterface.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void a();

    void a(String str);

    void j(com.amazon.aps.iva.za.a aVar);

    /* compiled from: AIOnDeCServiceInterface.java */
    /* renamed from: com.amazon.aps.iva.qa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0637a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: AIOnDeCServiceInterface.java */
        /* renamed from: com.amazon.aps.iva.qa.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0638a implements a {
            public final IBinder a;

            public C0638a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.amazon.aps.iva.qa.a
            public final void a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.aiondec.api.AIOnDeCServiceInterface");
                    obtain.writeString(str);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0637a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.amazon.aps.iva.qa.a
            public final void j(com.amazon.aps.iva.za.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.aiondec.api.AIOnDeCServiceInterface");
                    obtain.writeStrongBinder(aVar);
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0637a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.aps.iva.qa.a
            public final void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.aiondec.api.AIOnDeCServiceInterface");
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0637a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
