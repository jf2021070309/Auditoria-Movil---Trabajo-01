package com.amazon.aps.iva.b8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.amazon.aps.iva.b8.e;
import com.amazon.aps.iva.b8.h;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.q5.u0;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface j extends IInterface {

    /* compiled from: IMediaSession.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {
        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSession");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            final boolean z;
            e.b<IBinder> orDefault;
            q.d e;
            q.d e2;
            if (i != 1598968902) {
                switch (i) {
                    case 3002:
                        h b = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt = parcel.readInt();
                        float readFloat = parcel.readFloat();
                        p1 p1Var = (p1) this;
                        if (b != null) {
                            p1Var.y0(b, readInt, 24, p1.B0(new x(readFloat)));
                        }
                        return true;
                    case 3003:
                        h b2 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt2 = parcel.readInt();
                        final int readInt3 = parcel.readInt();
                        p1 p1Var2 = (p1) this;
                        if (b2 != null) {
                            p1Var2.y0(b2, readInt2, 25, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.r0
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).S0(readInt3);
                                }
                            }));
                        }
                        return true;
                    case 3004:
                        h b3 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt4 = parcel.readInt();
                        p1 p1Var3 = (p1) this;
                        if (b3 != null) {
                            p1Var3.y0(b3, readInt4, 26, p1.B0(new com.amazon.aps.iva.q5.e(12)));
                        }
                        return true;
                    case 3005:
                        h b4 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt5 = parcel.readInt();
                        p1 p1Var4 = (p1) this;
                        if (b4 != null) {
                            p1Var4.y0(b4, readInt5, 26, p1.B0(new com.amazon.aps.iva.q5.z(8)));
                        }
                        return true;
                    case 3006:
                        h b5 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt6 = parcel.readInt();
                        z = parcel.readInt() != 0;
                        p1 p1Var5 = (p1) this;
                        if (b5 != null) {
                            p1Var5.y0(b5, readInt6, 26, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.z0
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).X(z);
                                }
                            }));
                        }
                        return true;
                    case 3007:
                        ((p1) this).D0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, true);
                        return true;
                    case 3008:
                        h b6 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt7 = parcel.readInt();
                        Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        final long readLong = parcel.readLong();
                        p1 p1Var6 = (p1) this;
                        if (b6 != null && bundle != null) {
                            try {
                                final com.amazon.aps.iva.q5.b0 b0Var = (com.amazon.aps.iva.q5.b0) com.amazon.aps.iva.q5.b0.o.e(bundle);
                                p1Var6.y0(b6, readInt7, 31, p1.C0(new com.amazon.aps.iva.b6.p(new p1.e() { // from class: com.amazon.aps.iva.b8.y0
                                    @Override // com.amazon.aps.iva.b8.p1.e
                                    public final Object e(t tVar, q.d dVar, int i3) {
                                        return tVar.j(ImmutableList.of(com.amazon.aps.iva.q5.b0.this), 0, readLong);
                                    }
                                }, new com.amazon.aps.iva.q5.b(8))));
                            } catch (RuntimeException e3) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e3);
                            }
                        }
                        return true;
                    case 3009:
                        ((p1) this).D0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                        return true;
                    case 3010:
                        ((p1) this).E0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readStrongBinder(), true);
                        return true;
                    case 3011:
                        ((p1) this).E0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                        return true;
                    case 3012:
                        h b7 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt8 = parcel.readInt();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        int readInt9 = parcel.readInt();
                        long readLong2 = parcel.readLong();
                        p1 p1Var7 = (p1) this;
                        if (b7 != null && readStrongBinder != null) {
                            try {
                                p1Var7.y0(b7, readInt8, 20, p1.C0(new com.amazon.aps.iva.b6.p(new com.amazon.aps.iva.b6.c(readInt9, readLong2, com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.q5.b0.o, com.amazon.aps.iva.q5.j.a(readStrongBinder))), new com.amazon.aps.iva.g1.e(8))));
                            } catch (RuntimeException e4) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e4);
                            }
                        }
                        return true;
                    case 3013:
                        h b8 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt10 = parcel.readInt();
                        z = parcel.readInt() != 0;
                        p1 p1Var8 = (p1) this;
                        if (b8 != null) {
                            p1Var8.y0(b8, readInt10, 1, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.m1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).L(z);
                                }
                            }));
                        }
                        return true;
                    case 3014:
                        h b9 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt11 = parcel.readInt();
                        Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var9 = (p1) this;
                        if (b9 != null && bundle2 != null) {
                            try {
                                a2 a2Var = (a2) a2.h.e(bundle2);
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    e<IBinder> eVar = p1Var9.e;
                                    IBinder asBinder = b9.asBinder();
                                    synchronized (eVar.a) {
                                        q.d e5 = eVar.e(asBinder);
                                        orDefault = e5 != null ? eVar.c.getOrDefault(e5, null) : null;
                                    }
                                    w1 w1Var = orDefault != null ? orDefault.b : null;
                                    if (w1Var != null) {
                                        synchronized (w1Var.a) {
                                            if (w1Var.c.remove(Integer.valueOf(readInt11)) != null) {
                                                throw null;
                                            }
                                        }
                                    }
                                } finally {
                                }
                            } catch (RuntimeException e6) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for SessionResult", e6);
                            }
                        }
                        return true;
                    case 3015:
                        parcel.enforceInterface("androidx.media3.session.IMediaSession");
                        h o0 = h.a.o0(parcel.readStrongBinder());
                        parcel.readInt();
                        Bundle bundle3 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var10 = (p1) this;
                        if (o0 != null && bundle3 != null) {
                            try {
                                f fVar = (f) f.l.e(bundle3);
                                int callingUid = Binder.getCallingUid();
                                int callingPid = Binder.getCallingPid();
                                long clearCallingIdentity2 = Binder.clearCallingIdentity();
                                if (callingPid == 0) {
                                    callingPid = fVar.e;
                                }
                                try {
                                    p1Var10.o0(o0, fVar.b, fVar.c, fVar.d, callingPid, callingUid);
                                } finally {
                                }
                            } catch (RuntimeException e7) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for ConnectionRequest", e7);
                            }
                        }
                        return true;
                    case 3016:
                        ((p1) this).x0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 3017:
                        h b10 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt12 = parcel.readInt();
                        final int readInt13 = parcel.readInt();
                        p1 p1Var11 = (p1) this;
                        if (b10 != null) {
                            p1Var11.y0(b10, readInt12, 15, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.s0
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).l(readInt13);
                                }
                            }));
                        }
                        return true;
                    case 3018:
                        h b11 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt14 = parcel.readInt();
                        z = parcel.readInt() != 0;
                        p1 p1Var12 = (p1) this;
                        if (b11 != null) {
                            p1Var12.y0(b11, readInt14, 14, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.h1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).l0(z);
                                }
                            }));
                        }
                        return true;
                    case 3019:
                        h b12 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt15 = parcel.readInt();
                        int readInt16 = parcel.readInt();
                        p1 p1Var13 = (p1) this;
                        if (b12 != null) {
                            p1Var13.y0(b12, readInt15, 20, new com.amazon.aps.iva.g1.r(new w0(p1Var13, readInt16)));
                        }
                        return true;
                    case 3020:
                        h b13 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt17 = parcel.readInt();
                        int readInt18 = parcel.readInt();
                        int readInt19 = parcel.readInt();
                        p1 p1Var14 = (p1) this;
                        if (b13 != null) {
                            p1Var14.y0(b13, readInt17, 20, new com.amazon.aps.iva.g1.r(new b1(readInt18, readInt19, p1Var14)));
                        }
                        return true;
                    case 3021:
                        h b14 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt20 = parcel.readInt();
                        p1 p1Var15 = (p1) this;
                        if (b14 != null) {
                            p1Var15.y0(b14, readInt20, 20, p1.B0(new com.amazon.aps.iva.q5.e(10)));
                        }
                        return true;
                    case 3022:
                        h b15 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt21 = parcel.readInt();
                        final int readInt22 = parcel.readInt();
                        final int readInt23 = parcel.readInt();
                        p1 p1Var16 = (p1) this;
                        if (b15 != null) {
                            p1Var16.y0(b15, readInt21, 20, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.a1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).M0(readInt22, readInt23);
                                }
                            }));
                        }
                        return true;
                    case 3023:
                        h b16 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt24 = parcel.readInt();
                        final int readInt25 = parcel.readInt();
                        final int readInt26 = parcel.readInt();
                        final int readInt27 = parcel.readInt();
                        p1 p1Var17 = (p1) this;
                        if (b16 != null) {
                            p1Var17.y0(b16, readInt24, 20, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.o1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).N0(readInt25, readInt26, readInt27);
                                }
                            }));
                        }
                        return true;
                    case 3024:
                        h b17 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt28 = parcel.readInt();
                        p1 p1Var18 = (p1) this;
                        if (b17 != null && (e = p1Var18.e.e(b17.asBinder())) != null) {
                            p1Var18.y0(b17, readInt28, 1, p1.B0(new com.amazon.aps.iva.b6.g(2, p1Var18, e)));
                        }
                        return true;
                    case 3025:
                        h b18 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt29 = parcel.readInt();
                        p1 p1Var19 = (p1) this;
                        if (b18 != null) {
                            p1Var19.y0(b18, readInt29, 1, p1.B0(new com.amazon.aps.iva.q5.m(8)));
                        }
                        return true;
                    case 3026:
                        h b19 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt30 = parcel.readInt();
                        p1 p1Var20 = (p1) this;
                        if (b19 != null) {
                            p1Var20.y0(b19, readInt30, 2, p1.B0(new com.amazon.aps.iva.q5.e(14)));
                        }
                        return true;
                    case 3027:
                        h b20 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt31 = parcel.readInt();
                        Bundle bundle4 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var21 = (p1) this;
                        if (b20 != null && bundle4 != null) {
                            p1Var21.y0(b20, readInt31, 13, p1.B0(new com.amazon.aps.iva.g1.p((com.amazon.aps.iva.q5.k0) com.amazon.aps.iva.q5.k0.h.e(bundle4), 3)));
                        }
                        return true;
                    case 3028:
                        h b21 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt32 = parcel.readInt();
                        final float readFloat2 = parcel.readFloat();
                        p1 p1Var22 = (p1) this;
                        if (b21 != null) {
                            p1Var22.y0(b21, readInt32, 13, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.v0
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).k(readFloat2);
                                }
                            }));
                        }
                        return true;
                    case 3029:
                        h b22 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt33 = parcel.readInt();
                        Bundle bundle5 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var23 = (p1) this;
                        if (b22 != null && bundle5 != null) {
                            try {
                                p1Var23.y0(b22, readInt33, 20, p1.C0(p1.u0(new com.amazon.aps.iva.g1.p((com.amazon.aps.iva.q5.b0) com.amazon.aps.iva.q5.b0.o.e(bundle5), 5), new com.amazon.aps.iva.q5.m(10))));
                            } catch (RuntimeException e8) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e8);
                            }
                        }
                        return true;
                    case 3030:
                        h b23 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt34 = parcel.readInt();
                        final int readInt35 = parcel.readInt();
                        Bundle bundle6 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        final p1 p1Var24 = (p1) this;
                        if (b23 != null && bundle6 != null) {
                            try {
                                p1Var24.y0(b23, readInt34, 20, p1.C0(p1.u0(new com.amazon.aps.iva.f1.c0((com.amazon.aps.iva.q5.b0) com.amazon.aps.iva.q5.b0.o.e(bundle6), 7), new p1.c() { // from class: com.amazon.aps.iva.b8.t0
                                    @Override // com.amazon.aps.iva.b8.p1.c
                                    public final void b(v1 v1Var, q.d dVar, List list) {
                                        int i3 = r3;
                                        int i4 = readInt35;
                                        p1 p1Var25 = p1Var24;
                                        switch (i3) {
                                            case 0:
                                                v1Var.F0(p1Var25.w0(i4, dVar, v1Var), list);
                                                return;
                                            default:
                                                v1Var.F0(p1Var25.w0(i4, dVar, v1Var), list);
                                                return;
                                        }
                                    }
                                })));
                            } catch (RuntimeException e9) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e9);
                            }
                        }
                        return true;
                    case 3031:
                        h b24 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt36 = parcel.readInt();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        p1 p1Var25 = (p1) this;
                        if (b24 != null && readStrongBinder2 != null) {
                            try {
                                p1Var25.y0(b24, readInt36, 20, p1.C0(p1.u0(new com.amazon.aps.iva.g1.q(com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.q5.b0.o, com.amazon.aps.iva.q5.j.a(readStrongBinder2)), 5), new com.amazon.aps.iva.q5.p(7))));
                            } catch (RuntimeException e10) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e10);
                            }
                        }
                        return true;
                    case 3032:
                        h b25 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt37 = parcel.readInt();
                        final int readInt38 = parcel.readInt();
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        final p1 p1Var26 = (p1) this;
                        if (b25 != null && readStrongBinder3 != null) {
                            try {
                                p1Var26.y0(b25, readInt37, 20, p1.C0(p1.u0(new com.amazon.aps.iva.f1.c0(com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.q5.b0.o, com.amazon.aps.iva.q5.j.a(readStrongBinder3)), 6), new p1.c() { // from class: com.amazon.aps.iva.b8.t0
                                    @Override // com.amazon.aps.iva.b8.p1.c
                                    public final void b(v1 v1Var, q.d dVar, List list) {
                                        int i3 = r3;
                                        int i4 = readInt38;
                                        p1 p1Var252 = p1Var26;
                                        switch (i3) {
                                            case 0:
                                                v1Var.F0(p1Var252.w0(i4, dVar, v1Var), list);
                                                return;
                                            default:
                                                v1Var.F0(p1Var252.w0(i4, dVar, v1Var), list);
                                                return;
                                        }
                                    }
                                })));
                            } catch (RuntimeException e11) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e11);
                            }
                        }
                        return true;
                    case 3033:
                        h b26 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt39 = parcel.readInt();
                        Bundle bundle7 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var27 = (p1) this;
                        if (b26 != null && bundle7 != null) {
                            try {
                                p1Var27.y0(b26, readInt39, 19, p1.B0(new w((com.amazon.aps.iva.q5.d0) com.amazon.aps.iva.q5.d0.L0.e(bundle7))));
                            } catch (RuntimeException e12) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaMetadata", e12);
                            }
                        }
                        return true;
                    case 3034:
                        h b27 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt40 = parcel.readInt();
                        p1 p1Var28 = (p1) this;
                        if (b27 != null) {
                            p1Var28.y0(b27, readInt40, 3, p1.B0(new com.amazon.aps.iva.q5.z(9)));
                        }
                        return true;
                    case 3035:
                        parcel.enforceInterface("androidx.media3.session.IMediaSession");
                        h o02 = h.a.o0(parcel.readStrongBinder());
                        parcel.readInt();
                        p1 p1Var29 = (p1) this;
                        if (o02 != null) {
                            long clearCallingIdentity3 = Binder.clearCallingIdentity();
                            try {
                                t tVar = p1Var29.a.get();
                                if (tVar != null && !tVar.g()) {
                                    com.amazon.aps.iva.t5.g0.U(tVar.j, new com.amazon.aps.iva.o4.c(3, p1Var29, o02));
                                }
                            } finally {
                            }
                        }
                        return true;
                    case 3036:
                        h b28 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt41 = parcel.readInt();
                        p1 p1Var30 = (p1) this;
                        if (b28 != null) {
                            p1Var30.y0(b28, readInt41, 4, p1.B0(new com.amazon.aps.iva.g1.e(7)));
                        }
                        return true;
                    case 3037:
                        h b29 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt42 = parcel.readInt();
                        int readInt43 = parcel.readInt();
                        p1 p1Var31 = (p1) this;
                        if (b29 != null) {
                            p1Var31.y0(b29, readInt42, 10, new com.amazon.aps.iva.g1.r(new i1(p1Var31, readInt43)));
                        }
                        return true;
                    case 3038:
                        h b30 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt44 = parcel.readInt();
                        final long readLong3 = parcel.readLong();
                        p1 p1Var32 = (p1) this;
                        if (b30 != null) {
                            p1Var32.y0(b30, readInt44, 5, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.k1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).c(readLong3);
                                }
                            }));
                        }
                        return true;
                    case 3039:
                        h b31 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt45 = parcel.readInt();
                        final int readInt46 = parcel.readInt();
                        final long readLong4 = parcel.readLong();
                        final p1 p1Var33 = (p1) this;
                        if (b31 != null) {
                            p1Var33.y0(b31, readInt45, 10, new com.amazon.aps.iva.g1.r(new p1.b() { // from class: com.amazon.aps.iva.b8.x0
                                @Override // com.amazon.aps.iva.b8.p1.b
                                public final void c(q.d dVar, v1 v1Var) {
                                    v1Var.i0(p1.this.w0(readInt46, dVar, v1Var), readLong4);
                                }
                            }));
                        }
                        return true;
                    case 3040:
                        h b32 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt47 = parcel.readInt();
                        p1 p1Var34 = (p1) this;
                        if (b32 != null) {
                            p1Var34.y0(b32, readInt47, 11, p1.B0(new com.amazon.aps.iva.q5.m(9)));
                        }
                        return true;
                    case 3041:
                        h b33 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt48 = parcel.readInt();
                        p1 p1Var35 = (p1) this;
                        if (b33 != null) {
                            p1Var35.y0(b33, readInt48, 12, p1.B0(new com.amazon.aps.iva.q5.e(13)));
                        }
                        return true;
                    case 3042:
                        h b34 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt49 = parcel.readInt();
                        p1 p1Var36 = (p1) this;
                        if (b34 != null) {
                            p1Var36.y0(b34, readInt49, 6, p1.B0(new com.amazon.aps.iva.g1.n(10)));
                        }
                        return true;
                    case 3043:
                        h b35 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt50 = parcel.readInt();
                        p1 p1Var37 = (p1) this;
                        if (b35 != null) {
                            p1Var37.y0(b35, readInt50, 8, p1.B0(new com.amazon.aps.iva.g1.n(9)));
                        }
                        return true;
                    case 3044:
                        h b36 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt51 = parcel.readInt();
                        Surface surface = parcel.readInt() != 0 ? (Surface) Surface.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var38 = (p1) this;
                        if (b36 != null) {
                            p1Var38.y0(b36, readInt51, 27, p1.B0(new com.amazon.aps.iva.g1.p(surface, 4)));
                        }
                        return true;
                    case 3045:
                        h b37 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        p1 p1Var39 = (p1) this;
                        if (b37 != null) {
                            long clearCallingIdentity4 = Binder.clearCallingIdentity();
                            try {
                                t tVar2 = p1Var39.a.get();
                                if (tVar2 != null && !tVar2.g() && (e2 = p1Var39.e.e(b37.asBinder())) != null) {
                                    com.amazon.aps.iva.t5.g0.U(tVar2.j, new com.amazon.aps.iva.o4.c(4, p1Var39, e2));
                                }
                            } finally {
                            }
                        }
                        return true;
                    case 3046:
                        h b38 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt52 = parcel.readInt();
                        p1 p1Var40 = (p1) this;
                        if (b38 != null) {
                            p1Var40.y0(b38, readInt52, 7, p1.B0(new com.amazon.aps.iva.q5.a0(7)));
                        }
                        return true;
                    case 3047:
                        h b39 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt53 = parcel.readInt();
                        p1 p1Var41 = (p1) this;
                        if (b39 != null) {
                            p1Var41.y0(b39, readInt53, 9, p1.B0(new com.amazon.aps.iva.q5.e(11)));
                        }
                        return true;
                    case 3048:
                        h b40 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt54 = parcel.readInt();
                        Bundle bundle8 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var42 = (p1) this;
                        if (b40 != null) {
                            try {
                                com.amazon.aps.iva.q5.u0 u0Var = com.amazon.aps.iva.q5.u0.B;
                                p1Var42.y0(b40, readInt54, 29, p1.B0(new com.amazon.aps.iva.b6.g0(4, p1Var42, new com.amazon.aps.iva.q5.u0(new u0.a(bundle8)))));
                            } catch (RuntimeException e13) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for TrackSelectionParameters", e13);
                            }
                        }
                        return true;
                    case 3049:
                        h b41 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt55 = parcel.readInt();
                        String readString = parcel.readString();
                        Bundle bundle9 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var43 = (p1) this;
                        if (b41 != null && bundle9 != null) {
                            if (TextUtils.isEmpty(readString)) {
                                com.amazon.aps.iva.t5.p.g();
                            } else {
                                try {
                                    p1Var43.p0(b41, readInt55, 40010, p1.C0(new com.amazon.aps.iva.b6.d(5, readString, (com.amazon.aps.iva.q5.n0) com.amazon.aps.iva.q5.n0.c.e(bundle9))));
                                } catch (RuntimeException e14) {
                                    com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for Rating", e14);
                                }
                            }
                        }
                        return true;
                    case 3050:
                        h b42 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt56 = parcel.readInt();
                        Bundle bundle10 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var44 = (p1) this;
                        if (b42 != null && bundle10 != null) {
                            try {
                                p1Var44.p0(b42, readInt56, 40010, p1.C0(new com.amazon.aps.iva.f1.c0((com.amazon.aps.iva.q5.n0) com.amazon.aps.iva.q5.n0.c.e(bundle10), 5)));
                            } catch (RuntimeException e15) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for Rating", e15);
                            }
                        }
                        return true;
                    case 3051:
                        h b43 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt57 = parcel.readInt();
                        final int readInt58 = parcel.readInt();
                        final int readInt59 = parcel.readInt();
                        p1 p1Var45 = (p1) this;
                        if (b43 != null) {
                            p1Var45.y0(b43, readInt57, 33, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.q0
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    ((v1) obj).w0(readInt58, readInt59);
                                }
                            }));
                        }
                        return true;
                    case 3052:
                        h b44 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt60 = parcel.readInt();
                        final int readInt61 = parcel.readInt();
                        p1 p1Var46 = (p1) this;
                        if (b44 != null) {
                            p1Var46.y0(b44, readInt60, 34, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.n1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    int i3 = r2;
                                    int i4 = readInt61;
                                    switch (i3) {
                                        case 0:
                                            ((v1) obj).A(i4);
                                            return;
                                        default:
                                            ((v1) obj).P(i4);
                                            return;
                                    }
                                }
                            }));
                        }
                        return true;
                    case 3053:
                        h b45 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt62 = parcel.readInt();
                        final int readInt63 = parcel.readInt();
                        p1 p1Var47 = (p1) this;
                        if (b45 != null) {
                            p1Var47.y0(b45, readInt62, 34, p1.B0(new com.amazon.aps.iva.t5.g() { // from class: com.amazon.aps.iva.b8.n1
                                @Override // com.amazon.aps.iva.t5.g
                                public final void a(Object obj) {
                                    int i3 = r2;
                                    int i4 = readInt63;
                                    switch (i3) {
                                        case 0:
                                            ((v1) obj).A(i4);
                                            return;
                                        default:
                                            ((v1) obj).P(i4);
                                            return;
                                    }
                                }
                            }));
                        }
                        return true;
                    case 3054:
                        h b46 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt64 = parcel.readInt();
                        z = parcel.readInt() != 0;
                        int readInt65 = parcel.readInt();
                        p1 p1Var48 = (p1) this;
                        if (b46 != null) {
                            p1Var48.y0(b46, readInt64, 34, p1.B0(new v(z, readInt65)));
                        }
                        return true;
                    case 3055:
                        h b47 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt66 = parcel.readInt();
                        int readInt67 = parcel.readInt();
                        Bundle bundle11 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        p1 p1Var49 = (p1) this;
                        if (b47 != null && bundle11 != null) {
                            try {
                                p1Var49.y0(b47, readInt66, 20, p1.C0(p1.u0(new com.amazon.aps.iva.g1.o((com.amazon.aps.iva.q5.b0) com.amazon.aps.iva.q5.b0.o.e(bundle11), 9), new i1(p1Var49, readInt67))));
                            } catch (RuntimeException e16) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e16);
                            }
                        }
                        return true;
                    case 3056:
                        h b48 = i.b(parcel, "androidx.media3.session.IMediaSession");
                        int readInt68 = parcel.readInt();
                        int readInt69 = parcel.readInt();
                        int readInt70 = parcel.readInt();
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        p1 p1Var50 = (p1) this;
                        if (b48 != null && readStrongBinder4 != null) {
                            try {
                                p1Var50.y0(b48, readInt68, 20, p1.C0(p1.u0(new com.amazon.aps.iva.g1.o(com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.q5.b0.o, com.amazon.aps.iva.q5.j.a(readStrongBinder4)), 8), new b1(readInt69, readInt70, p1Var50))));
                            } catch (RuntimeException e17) {
                                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e17);
                            }
                        }
                        return true;
                    default:
                        switch (i) {
                            case 4001:
                                h b49 = i.b(parcel, "androidx.media3.session.IMediaSession");
                                int readInt71 = parcel.readInt();
                                Bundle bundle12 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                                p1 p1Var51 = (p1) this;
                                if (b49 != null) {
                                    p1Var51.p0(b49, readInt71, 50000, p1.z0(new com.amazon.aps.iva.g1.q(bundle12 != null ? (l) l.j.e(bundle12) : null, 6)));
                                }
                                return true;
                            case 4002:
                                h b50 = i.b(parcel, "androidx.media3.session.IMediaSession");
                                int readInt72 = parcel.readInt();
                                String readString2 = parcel.readString();
                                p1 p1Var52 = (p1) this;
                                if (b50 != null) {
                                    if (TextUtils.isEmpty(readString2)) {
                                        com.amazon.aps.iva.t5.p.g();
                                    } else {
                                        p1Var52.p0(b50, readInt72, 50004, p1.z0(new com.amazon.aps.iva.a6.i0(readString2, 5)));
                                    }
                                }
                                return true;
                            case 4003:
                                ((p1) this).s0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                return true;
                            case 4004:
                                h b51 = i.b(parcel, "androidx.media3.session.IMediaSession");
                                int readInt73 = parcel.readInt();
                                String readString3 = parcel.readString();
                                Bundle bundle13 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                                p1 p1Var53 = (p1) this;
                                if (b51 != null) {
                                    if (TextUtils.isEmpty(readString3)) {
                                        com.amazon.aps.iva.t5.p.g();
                                    } else {
                                        p1Var53.p0(b51, readInt73, 50005, p1.z0(new com.amazon.aps.iva.n4.e(3, readString3, bundle13 != null ? (l) l.j.e(bundle13) : null)));
                                    }
                                }
                                return true;
                            case 4005:
                                ((p1) this).t0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                return true;
                            case 4006:
                                ((p1) this).F0(i.b(parcel, "androidx.media3.session.IMediaSession"), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                return true;
                            case 4007:
                                h b52 = i.b(parcel, "androidx.media3.session.IMediaSession");
                                int readInt74 = parcel.readInt();
                                String readString4 = parcel.readString();
                                p1 p1Var54 = (p1) this;
                                if (b52 != null) {
                                    if (TextUtils.isEmpty(readString4)) {
                                        com.amazon.aps.iva.t5.p.g();
                                    } else {
                                        p1Var54.p0(b52, readInt74, 50002, p1.z0(new com.amazon.aps.iva.g1.m(readString4)));
                                    }
                                }
                                return true;
                            default:
                                return super.onTransact(i, parcel, parcel2, i2);
                        }
                }
            }
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
