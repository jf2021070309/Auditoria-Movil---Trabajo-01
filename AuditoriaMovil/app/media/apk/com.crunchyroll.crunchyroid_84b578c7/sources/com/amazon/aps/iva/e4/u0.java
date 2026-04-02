package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.i;
import com.amazon.aps.iva.e4.j0;
import com.amazon.aps.iva.e4.l;
import com.amazon.aps.iva.e4.z;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class u0<T> implements g1<T> {
    public static final int[] r = new int[0];
    public static final Unsafe s = r1.o();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final q0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final w0 m;
    public final g0 n;
    public final n1<?, ?> o;
    public final q<?> p;
    public final l0 q;

    public u0(int[] iArr, Object[] objArr, int i, int i2, q0 q0Var, boolean z, int[] iArr2, int i3, int i4, w0 w0Var, g0 g0Var, n1 n1Var, q qVar, l0 l0Var) {
        boolean z2;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = q0Var instanceof x;
        this.h = z;
        if (qVar != null && qVar.e(q0Var)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = w0Var;
        this.n = g0Var;
        this.o = n1Var;
        this.p = qVar;
        this.e = q0Var;
        this.q = l0Var;
    }

    public static void F(int i, Object obj, m mVar) throws IOException {
        if (obj instanceof String) {
            mVar.a.O(i, (String) obj);
            return;
        }
        mVar.b(i, (i) obj);
    }

    public static List<?> l(Object obj, long j) {
        return (List) r1.n(obj, j);
    }

    public static u0 p(o0 o0Var, w0 w0Var, g0 g0Var, n1 n1Var, q qVar, l0 l0Var) {
        if (o0Var instanceof e1) {
            return q((e1) o0Var, w0Var, g0Var, n1Var, qVar, l0Var);
        }
        k1 k1Var = (k1) o0Var;
        b1 b1Var = b1.PROTO2;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.amazon.aps.iva.e4.u0<T> q(com.amazon.aps.iva.e4.e1 r30, com.amazon.aps.iva.e4.w0 r31, com.amazon.aps.iva.e4.g0 r32, com.amazon.aps.iva.e4.n1<?, ?> r33, com.amazon.aps.iva.e4.q<?> r34, com.amazon.aps.iva.e4.l0 r35) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.q(com.amazon.aps.iva.e4.e1, com.amazon.aps.iva.e4.w0, com.amazon.aps.iva.e4.g0, com.amazon.aps.iva.e4.n1, com.amazon.aps.iva.e4.q, com.amazon.aps.iva.e4.l0):com.amazon.aps.iva.e4.u0");
    }

    public static long r(int i) {
        return i & 1048575;
    }

    public static <T> int s(T t, long j) {
        return ((Integer) r1.n(t, j)).intValue();
    }

    public static <T> long t(T t, long j) {
        return ((Long) r1.n(t, j)).longValue();
    }

    public static Field z(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder c = com.amazon.aps.iva.k.q.c("Field ", str, " for ");
            com.amazon.aps.iva.b8.i.d(cls, c, " not found. Known fields are ");
            c.append(Arrays.toString(declaredFields));
            throw new RuntimeException(c.toString());
        }
    }

    public final void A(T t, int i) {
        if (this.h) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        r1.s(t, j, r1.l(t, j) | (1 << (i2 >>> 20)));
    }

    public final void B(T t, int i, int i2) {
        r1.s(t, this.a[i2 + 2] & 1048575, i);
    }

    public final int C(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.Object r21, com.amazon.aps.iva.e4.m r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.D(java.lang.Object, com.amazon.aps.iva.e4.m):void");
    }

    public final void E(m mVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object f = f(i2);
            l0 l0Var = this.q;
            j0.a<?, ?> forMapMetadata = l0Var.forMapMetadata(f);
            k0 forMapData = l0Var.forMapData(obj);
            l lVar = mVar.a;
            lVar.getClass();
            for (Map.Entry entry : forMapData.entrySet()) {
                lVar.Q(i, 2);
                lVar.S(j0.a(forMapMetadata, entry.getKey(), entry.getValue()));
                j0.b(lVar, forMapMetadata, entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x05bd A[Catch: all -> 0x05dd, TryCatch #6 {all -> 0x05dd, blocks: (B:18:0x0046, B:25:0x005c, B:147:0x05a4, B:153:0x05b8, B:155:0x05bd, B:156:0x05c2), top: B:182:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05e4 A[LOOP:1: B:169:0x05e2->B:170:0x05e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05d9 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.e4.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r20, com.amazon.aps.iva.e4.f1 r21, com.amazon.aps.iva.e4.p r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.a(java.lang.Object, com.amazon.aps.iva.e4.f1, com.amazon.aps.iva.e4.p):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    @Override // com.amazon.aps.iva.e4.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r19, com.amazon.aps.iva.e4.m r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.b(java.lang.Object, com.amazon.aps.iva.e4.m):void");
    }

    public final boolean c(T t, T t2, int i) {
        if (j(t, i) == j(t2, i)) {
            return true;
        }
        return false;
    }

    public final <UT, UB> UB d(Object obj, int i, UB ub, n1<UT, UB> n1Var) {
        int i2 = this.a[i];
        Object n = r1.n(obj, C(i) & 1048575);
        if (n == null) {
            return ub;
        }
        z.b e = e(i);
        if (e == null) {
            return ub;
        }
        l0 l0Var = this.q;
        k0 forMutableMapData = l0Var.forMutableMapData(n);
        j0.a<?, ?> forMapMetadata = l0Var.forMapMetadata(f(i));
        Iterator it = forMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!e.a()) {
                if (ub == null) {
                    ub = (UB) n1Var.m();
                }
                int a = j0.a(forMapMetadata, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a];
                Logger logger = l.b;
                l.b bVar = new l.b(bArr, a);
                try {
                    j0.b(bVar, forMapMetadata, entry.getKey(), entry.getValue());
                    if (bVar.e - bVar.f == 0) {
                        n1Var.d(ub, i2, new i.e(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    public final z.b e(int i) {
        return (z.b) this.b[t0.c(i, 3, 2, 1)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
        if (java.lang.Float.floatToIntBits(com.amazon.aps.iva.e4.r1.k(r11, r7)) == java.lang.Float.floatToIntBits(com.amazon.aps.iva.e4.r1.k(r12, r7))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
        if (java.lang.Double.doubleToLongBits(com.amazon.aps.iva.e4.r1.j(r11, r7)) == java.lang.Double.doubleToLongBits(com.amazon.aps.iva.e4.r1.j(r12, r7))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (com.amazon.aps.iva.e4.h1.C(com.amazon.aps.iva.e4.r1.n(r11, r7), com.amazon.aps.iva.e4.r1.n(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (com.amazon.aps.iva.e4.h1.C(com.amazon.aps.iva.e4.r1.n(r11, r7), com.amazon.aps.iva.e4.r1.n(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (com.amazon.aps.iva.e4.r1.m(r11, r7) == com.amazon.aps.iva.e4.r1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (com.amazon.aps.iva.e4.r1.m(r11, r7) == com.amazon.aps.iva.e4.r1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (com.amazon.aps.iva.e4.h1.C(com.amazon.aps.iva.e4.r1.n(r11, r7), com.amazon.aps.iva.e4.r1.n(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (com.amazon.aps.iva.e4.h1.C(com.amazon.aps.iva.e4.r1.n(r11, r7), com.amazon.aps.iva.e4.r1.n(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
        if (com.amazon.aps.iva.e4.h1.C(com.amazon.aps.iva.e4.r1.n(r11, r7), com.amazon.aps.iva.e4.r1.n(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
        if (com.amazon.aps.iva.e4.r1.f(r11, r7) == com.amazon.aps.iva.e4.r1.f(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
        if (com.amazon.aps.iva.e4.r1.m(r11, r7) == com.amazon.aps.iva.e4.r1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        if (com.amazon.aps.iva.e4.r1.l(r11, r7) == com.amazon.aps.iva.e4.r1.l(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
        if (com.amazon.aps.iva.e4.r1.m(r11, r7) == com.amazon.aps.iva.e4.r1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0191, code lost:
        if (com.amazon.aps.iva.e4.r1.m(r11, r7) == com.amazon.aps.iva.e4.r1.m(r12, r7)) goto L88;
     */
    @Override // com.amazon.aps.iva.e4.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object f(int i) {
        return this.b[(i / 3) * 2];
    }

    public final g1 g(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        g1 g1Var = (g1) objArr[i2];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> a = c1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final int getSerializedSize(T t) {
        if (this.h) {
            return i(t);
        }
        return h(t);
    }

    public final int h(T t) {
        int i;
        int i2;
        int i3;
        int d;
        int r2;
        int i4;
        int t2;
        int v;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 < iArr.length) {
                int C = C(i6);
                int i9 = iArr[i6];
                int i10 = (267386880 & C) >>> 20;
                boolean z = this.i;
                Unsafe unsafe = s;
                if (i10 <= 17) {
                    i2 = iArr[i6 + 2];
                    int i11 = i2 & 1048575;
                    i3 = 1 << (i2 >>> 20);
                    i = i6;
                    if (i11 != i5) {
                        i8 = unsafe.getInt(t, i11);
                        i5 = i11;
                    }
                } else {
                    i = i6;
                    if (z && i10 >= u.DOUBLE_LIST_PACKED.id() && i10 <= u.SINT64_LIST_PACKED.id()) {
                        i2 = iArr[i + 2] & 1048575;
                    } else {
                        i2 = 0;
                    }
                    i3 = 0;
                }
                long j = C & 1048575;
                int i12 = i;
                switch (i10) {
                    case 0:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.d(i9);
                            i7 += d;
                            break;
                        }
                    case 1:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.h(i9);
                            i7 += d;
                            break;
                        }
                    case 2:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.l(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 3:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.w(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 4:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.j(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 5:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.g(i9);
                            i7 += d;
                            break;
                        }
                    case 6:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.f(i9);
                            i7 += d;
                            break;
                        }
                    case 7:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.b(i9);
                            i7 += d;
                            break;
                        }
                    case 8:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(t, j);
                            if (object instanceof i) {
                                r2 = l.c(i9, (i) object);
                            } else {
                                r2 = l.r(i9, (String) object);
                            }
                            i7 = r2 + i7;
                            break;
                        }
                    case 9:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = h1.o(i9, g(i12), unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 10:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.c(i9, (i) unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 11:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.u(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 12:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.e(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 13:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.n(i9);
                            i7 += d;
                            break;
                        }
                    case 14:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.o(i9);
                            i7 += d;
                            break;
                        }
                    case 15:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.p(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 16:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.q(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 17:
                        if ((i8 & i3) == 0) {
                            break;
                        } else {
                            d = l.i(i9, (q0) unsafe.getObject(t, j), g(i12));
                            i7 += d;
                            break;
                        }
                    case 18:
                        d = h1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 19:
                        d = h1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 20:
                        d = h1.m(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 21:
                        d = h1.x(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 22:
                        d = h1.k(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = h1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 24:
                        d = h1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 25:
                        d = h1.a(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 26:
                        d = h1.u(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 27:
                        d = h1.p(i9, (List) unsafe.getObject(t, j), g(i12));
                        i7 += d;
                        break;
                    case 28:
                        d = h1.c(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 29:
                        d = h1.v(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 30:
                        d = h1.d(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 31:
                        d = h1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 32:
                        d = h1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        d = h1.q(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 34:
                        d = h1.s(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 35:
                        i4 = h1.i((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i4 = h1.g((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i4 = h1.n((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i4 = h1.y((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i4 = h1.l((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i4 = h1.i((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i4 = h1.g((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i4 = h1.b((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i4 = h1.w((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i4 = h1.e((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i4 = h1.g((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i4 = h1.i((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i4 = h1.r((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i4 = h1.t((List) unsafe.getObject(t, j));
                        if (i4 > 0) {
                            if (z) {
                                unsafe.putInt(t, i2, i4);
                            }
                            t2 = l.t(i9);
                            v = l.v(i4);
                            i7 = v + t2 + i4 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        d = h1.j(i9, (List) unsafe.getObject(t, j), g(i12));
                        i7 += d;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        d = this.q.getSerializedSize(i9, unsafe.getObject(t, j), f(i12));
                        i7 += d;
                        break;
                    case 51:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.d(i9);
                            i7 += d;
                            break;
                        }
                    case 52:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.h(i9);
                            i7 += d;
                            break;
                        }
                    case 53:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.l(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 54:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.w(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 55:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.j(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 56:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.g(i9);
                            i7 += d;
                            break;
                        }
                    case 57:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.f(i9);
                            i7 += d;
                            break;
                        }
                    case 58:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.b(i9);
                            i7 += d;
                            break;
                        }
                    case 59:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(t, j);
                            if (object2 instanceof i) {
                                r2 = l.c(i9, (i) object2);
                            } else {
                                r2 = l.r(i9, (String) object2);
                            }
                            i7 = r2 + i7;
                            break;
                        }
                    case 60:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = h1.o(i9, g(i12), unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 61:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.c(i9, (i) unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 62:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.u(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 63:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.e(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 64:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.n(i9);
                            i7 += d;
                            break;
                        }
                    case 65:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.o(i9);
                            i7 += d;
                            break;
                        }
                    case 66:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.p(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 67:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.q(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 68:
                        if (!k(t, i9, i12)) {
                            break;
                        } else {
                            d = l.i(i9, (q0) unsafe.getObject(t, j), g(i12));
                            i7 += d;
                            break;
                        }
                }
                i6 = i12 + 3;
            } else {
                n1<?, ?> n1Var = this.o;
                int h = n1Var.h(n1Var.g(t)) + i7;
                if (this.f) {
                    return h + this.p.c(t).g();
                }
                return h;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f2, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r8 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f6, code lost:
        r4 = r8;
     */
    @Override // com.amazon.aps.iva.e4.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode(T r11) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.u0.hashCode(java.lang.Object):int");
    }

    public final int i(T t) {
        int i;
        int d;
        int r2;
        int i2;
        int t2;
        int v;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 < iArr.length) {
                int C = C(i3);
                int i5 = (267386880 & C) >>> 20;
                int i6 = iArr[i3];
                long j = C & 1048575;
                if (i5 >= u.DOUBLE_LIST_PACKED.id() && i5 <= u.SINT64_LIST_PACKED.id()) {
                    i = iArr[i3 + 2] & 1048575;
                } else {
                    i = 0;
                }
                boolean z = this.i;
                Unsafe unsafe = s;
                switch (i5) {
                    case 0:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.d(i6);
                            i4 += d;
                            break;
                        }
                    case 1:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.h(i6);
                            i4 += d;
                            break;
                        }
                    case 2:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.l(i6, r1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 3:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.w(i6, r1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 4:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.j(i6, r1.l(t, j));
                            i4 += d;
                            break;
                        }
                    case 5:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.g(i6);
                            i4 += d;
                            break;
                        }
                    case 6:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.f(i6);
                            i4 += d;
                            break;
                        }
                    case 7:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.b(i6);
                            i4 += d;
                            break;
                        }
                    case 8:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            Object n = r1.n(t, j);
                            if (n instanceof i) {
                                r2 = l.c(i6, (i) n);
                            } else {
                                r2 = l.r(i6, (String) n);
                            }
                            i4 += r2;
                            break;
                        }
                    case 9:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = h1.o(i6, g(i3), r1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 10:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.c(i6, (i) r1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 11:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.u(i6, r1.l(t, j));
                            i4 += d;
                            break;
                        }
                    case 12:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.e(i6, r1.l(t, j));
                            i4 += d;
                            break;
                        }
                    case 13:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.n(i6);
                            i4 += d;
                            break;
                        }
                    case 14:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.o(i6);
                            i4 += d;
                            break;
                        }
                    case 15:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.p(i6, r1.l(t, j));
                            i4 += d;
                            break;
                        }
                    case 16:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.q(i6, r1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 17:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = l.i(i6, (q0) r1.n(t, j), g(i3));
                            i4 += d;
                            break;
                        }
                    case 18:
                        d = h1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case 19:
                        d = h1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 20:
                        d = h1.m(i6, l(t, j));
                        i4 += d;
                        break;
                    case 21:
                        d = h1.x(i6, l(t, j));
                        i4 += d;
                        break;
                    case 22:
                        d = h1.k(i6, l(t, j));
                        i4 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = h1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case 24:
                        d = h1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 25:
                        d = h1.a(i6, l(t, j));
                        i4 += d;
                        break;
                    case 26:
                        d = h1.u(i6, l(t, j));
                        i4 += d;
                        break;
                    case 27:
                        d = h1.p(i6, l(t, j), g(i3));
                        i4 += d;
                        break;
                    case 28:
                        d = h1.c(i6, l(t, j));
                        i4 += d;
                        break;
                    case 29:
                        d = h1.v(i6, l(t, j));
                        i4 += d;
                        break;
                    case 30:
                        d = h1.d(i6, l(t, j));
                        i4 += d;
                        break;
                    case 31:
                        d = h1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 32:
                        d = h1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        d = h1.q(i6, l(t, j));
                        i4 += d;
                        break;
                    case 34:
                        d = h1.s(i6, l(t, j));
                        i4 += d;
                        break;
                    case 35:
                        i2 = h1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i2 = h1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i2 = h1.n((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i2 = h1.y((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i2 = h1.l((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i2 = h1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i2 = h1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i2 = h1.b((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i2 = h1.w((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i2 = h1.e((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i2 = h1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i2 = h1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i2 = h1.r((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i2 = h1.t((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = l.t(i6);
                            v = l.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        d = h1.j(i6, l(t, j), g(i3));
                        i4 += d;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        d = this.q.getSerializedSize(i6, r1.n(t, j), f(i3));
                        i4 += d;
                        break;
                    case 51:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.d(i6);
                            i4 += d;
                            break;
                        }
                    case 52:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.h(i6);
                            i4 += d;
                            break;
                        }
                    case 53:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.l(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 54:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.w(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 55:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.j(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 56:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.g(i6);
                            i4 += d;
                            break;
                        }
                    case 57:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.f(i6);
                            i4 += d;
                            break;
                        }
                    case 58:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.b(i6);
                            i4 += d;
                            break;
                        }
                    case 59:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            Object n2 = r1.n(t, j);
                            if (n2 instanceof i) {
                                r2 = l.c(i6, (i) n2);
                            } else {
                                r2 = l.r(i6, (String) n2);
                            }
                            i4 += r2;
                            break;
                        }
                    case 60:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = h1.o(i6, g(i3), r1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 61:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.c(i6, (i) r1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 62:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.u(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 63:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.e(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 64:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.n(i6);
                            i4 += d;
                            break;
                        }
                    case 65:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.o(i6);
                            i4 += d;
                            break;
                        }
                    case 66:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.p(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 67:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.q(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 68:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = l.i(i6, (q0) r1.n(t, j), g(i3));
                            i4 += d;
                            break;
                        }
                }
                i3 += 3;
            } else {
                n1<?, ?> n1Var = this.o;
                return n1Var.h(n1Var.g(t)) + i4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.amazon.aps.iva.e4.g1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.amazon.aps.iva.e4.g1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.amazon.aps.iva.e4.g1] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.amazon.aps.iva.e4.g1] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // com.amazon.aps.iva.e4.g1
    public final boolean isInitialized(T t) {
        int i;
        boolean z;
        boolean z2;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < this.k) {
                int i5 = this.j[i3];
                int[] iArr = this.a;
                int i6 = iArr[i5];
                int C = C(i5);
                boolean z4 = this.h;
                if (!z4) {
                    int i7 = iArr[i5 + 2];
                    int i8 = i7 & 1048575;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = s.getInt(t, i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if ((268435456 & C) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (z4) {
                        z2 = j(t, i5);
                    } else if ((i4 & i) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                int i9 = (267386880 & C) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 != 50) {
                                    continue;
                                } else {
                                    Object n = r1.n(t, C & 1048575);
                                    l0 l0Var = this.q;
                                    k0 forMapData = l0Var.forMapData(n);
                                    if (!forMapData.isEmpty() && l0Var.forMapMetadata(f(i5)).c.getJavaType() == v1.MESSAGE) {
                                        Iterator it = forMapData.values().iterator();
                                        g1<T> g1Var = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (g1Var == null) {
                                                g1Var = c1.c.a(next.getClass());
                                            }
                                            boolean isInitialized = g1Var.isInitialized(next);
                                            g1Var = g1Var;
                                            if (!isInitialized) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        return false;
                                    }
                                }
                            }
                        } else if (k(t, i6, i5) && !g(i5).isInitialized(r1.n(t, C & 1048575))) {
                            return false;
                        }
                    }
                    List list = (List) r1.n(t, C & 1048575);
                    if (!list.isEmpty()) {
                        ?? g = g(i5);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!g.isInitialized(list.get(i10))) {
                                z3 = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else {
                    if (z4) {
                        z3 = j(t, i5);
                    } else if ((i & i4) == 0) {
                        z3 = false;
                    }
                    if (z3 && !g(i5).isInitialized(r1.n(t, C & 1048575))) {
                        return false;
                    }
                }
                i3++;
            } else if (this.f && !this.p.c(t).i()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final boolean j(T t, int i) {
        int i2;
        boolean equals;
        if (this.h) {
            int C = C(i);
            long j = C & 1048575;
            switch ((C & 267386880) >>> 20) {
                case 0:
                    if (r1.j(t, j) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (r1.k(t, j) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (r1.m(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (r1.m(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (r1.m(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return r1.f(t, j);
                case 8:
                    Object n = r1.n(t, j);
                    if (n instanceof String) {
                        equals = ((String) n).isEmpty();
                        break;
                    } else if (n instanceof i) {
                        equals = i.c.equals(n);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (r1.n(t, j) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = i.c.equals(r1.n(t, j));
                    break;
                case 11:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (r1.m(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (r1.l(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (r1.m(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (r1.n(t, j) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((r1.l(t, i2 & 1048575) & (1 << (this.a[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean k(T t, int i, int i2) {
        if (r1.l(t, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final <K, V> void m(Object obj, int i, Object obj2, p pVar, f1 f1Var) throws IOException {
        long C = C(i) & 1048575;
        Object n = r1.n(obj, C);
        l0 l0Var = this.q;
        if (n == null) {
            n = l0Var.a();
            r1.u(obj, C, n);
        } else if (l0Var.isImmutable(n)) {
            k0 a = l0Var.a();
            l0Var.mergeFrom(a, n);
            r1.u(obj, C, a);
            n = a;
        }
        f1Var.b(l0Var.forMutableMapData(n), l0Var.forMapMetadata(obj2), pVar);
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void makeImmutable(T t) {
        int[] iArr;
        int i;
        int i2 = this.k;
        while (true) {
            iArr = this.j;
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long C = C(iArr[i2]) & 1048575;
            Object n = r1.n(t, C);
            if (n != null) {
                r1.u(t, C, this.q.toImmutable(n));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.n.a(t, iArr[i]);
            i++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void mergeFrom(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int C = C(i);
                long j = 1048575 & C;
                int i2 = iArr[i];
                switch ((C & 267386880) >>> 20) {
                    case 0:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.d.m(t, j, r1.j(t2, j));
                            A(t, i);
                            break;
                        }
                    case 1:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.d.n(t, j, r1.k(t2, j));
                            A(t, i);
                            break;
                        }
                    case 2:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.t(t, j, r1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 3:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.t(t, j, r1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 4:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 5:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.t(t, j, r1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 6:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 7:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.d.k(t, j, r1.f(t2, j));
                            A(t, i);
                            break;
                        }
                    case 8:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.u(t, j, r1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 9:
                        n(t, t2, i);
                        break;
                    case 10:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.u(t, j, r1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 11:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 12:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 13:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 14:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.t(t, j, r1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 15:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.s(t, j, r1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 16:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            r1.t(t, j, r1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 17:
                        n(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(t, t2, j);
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        Class<?> cls = h1.a;
                        r1.u(t, j, this.q.mergeFrom(r1.n(t, j), r1.n(t2, j)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!k(t2, i2, i)) {
                            break;
                        } else {
                            r1.u(t, j, r1.n(t2, j));
                            B(t, i2, i);
                            break;
                        }
                    case 60:
                        o(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!k(t2, i2, i)) {
                            break;
                        } else {
                            r1.u(t, j, r1.n(t2, j));
                            B(t, i2, i);
                            break;
                        }
                    case 68:
                        o(t, t2, i);
                        break;
                }
                i += 3;
            } else if (!this.h) {
                Class<?> cls2 = h1.a;
                n1<?, ?> n1Var = this.o;
                n1Var.o(t, n1Var.k(n1Var.g(t), n1Var.g(t2)));
                if (this.f) {
                    h1.B(this.p, t, t2);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public final void n(T t, T t2, int i) {
        long C = C(i) & 1048575;
        if (!j(t2, i)) {
            return;
        }
        Object n = r1.n(t, C);
        Object n2 = r1.n(t2, C);
        if (n != null && n2 != null) {
            r1.u(t, C, z.b(n, n2));
            A(t, i);
        } else if (n2 != null) {
            r1.u(t, C, n2);
            A(t, i);
        }
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final T newInstance() {
        return (T) this.m.a(this.e);
    }

    public final void o(T t, T t2, int i) {
        int C = C(i);
        int i2 = this.a[i];
        long j = C & 1048575;
        if (!k(t2, i2, i)) {
            return;
        }
        Object n = r1.n(t, j);
        Object n2 = r1.n(t2, j);
        if (n != null && n2 != null) {
            r1.u(t, j, z.b(n, n2));
            B(t, i2, i);
        } else if (n2 != null) {
            r1.u(t, j, n2);
            B(t, i2, i);
        }
    }

    public final int u(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final <E> void v(Object obj, long j, f1 f1Var, g1<E> g1Var, p pVar) throws IOException {
        f1Var.e(this.n.c(obj, j), g1Var, pVar);
    }

    public final <E> void w(Object obj, int i, f1 f1Var, g1<E> g1Var, p pVar) throws IOException {
        f1Var.d(this.n.c(obj, i & 1048575), g1Var, pVar);
    }

    public final void x(Object obj, int i, f1 f1Var) throws IOException {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r1.u(obj, i & 1048575, f1Var.readStringRequireUtf8());
        } else if (this.g) {
            r1.u(obj, i & 1048575, f1Var.readString());
        } else {
            r1.u(obj, i & 1048575, f1Var.readBytes());
        }
    }

    public final void y(Object obj, int i, f1 f1Var) throws IOException {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        g0 g0Var = this.n;
        if (z) {
            f1Var.readStringListRequireUtf8(g0Var.c(obj, i & 1048575));
        } else {
            f1Var.readStringList(g0Var.c(obj, i & 1048575));
        }
    }
}
