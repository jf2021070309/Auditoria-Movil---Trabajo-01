package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.y;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class s0<T> implements e1<T> {
    public static final int[] r = new int[0];
    public static final Unsafe s = o1.p();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final p0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final u0 m;
    public final f0 n;
    public final k1<?, ?> o;
    public final p<?> p;
    public final k0 q;

    public s0(int[] iArr, Object[] objArr, int i, int i2, p0 p0Var, boolean z, int[] iArr2, int i3, int i4, u0 u0Var, f0 f0Var, k1 k1Var, p pVar, k0 k0Var) {
        boolean z2;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = p0Var instanceof w;
        this.h = z;
        if (pVar != null && pVar.e(p0Var)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = u0Var;
        this.n = f0Var;
        this.o = k1Var;
        this.p = pVar;
        this.e = p0Var;
        this.q = k0Var;
    }

    public static void F(int i, Object obj, l lVar) throws IOException {
        if (obj instanceof String) {
            lVar.a.L(i, (String) obj);
            return;
        }
        lVar.b(i, (h) obj);
    }

    public static List<?> l(Object obj, long j) {
        return (List) o1.o(obj, j);
    }

    public static s0 p(n0 n0Var, u0 u0Var, f0 f0Var, k1 k1Var, p pVar, k0 k0Var) {
        if (n0Var instanceof c1) {
            return q((c1) n0Var, u0Var, f0Var, k1Var, pVar, k0Var);
        }
        i1 i1Var = (i1) n0Var;
        z0 z0Var = z0.PROTO2;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.amazon.aps.iva.v4.s0<T> q(com.amazon.aps.iva.v4.c1 r29, com.amazon.aps.iva.v4.u0 r30, com.amazon.aps.iva.v4.f0 r31, com.amazon.aps.iva.v4.k1<?, ?> r32, com.amazon.aps.iva.v4.p<?> r33, com.amazon.aps.iva.v4.k0 r34) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.q(com.amazon.aps.iva.v4.c1, com.amazon.aps.iva.v4.u0, com.amazon.aps.iva.v4.f0, com.amazon.aps.iva.v4.k1, com.amazon.aps.iva.v4.p, com.amazon.aps.iva.v4.k0):com.amazon.aps.iva.v4.s0");
    }

    public static long r(int i) {
        return i & 1048575;
    }

    public static <T> int s(T t, long j) {
        return ((Integer) o1.o(t, j)).intValue();
    }

    public static <T> long t(T t, long j) {
        return ((Long) o1.o(t, j)).longValue();
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
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        o1.t(t, j, (1 << (i2 >>> 20)) | o1.m(t, j));
    }

    public final void B(T t, int i, int i2) {
        o1.t(t, this.a[i2 + 2] & 1048575, i);
    }

    public final int C(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.Object r22, com.amazon.aps.iva.v4.l r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.D(java.lang.Object, com.amazon.aps.iva.v4.l):void");
    }

    public final void E(l lVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object f = f(i2);
            k0 k0Var = this.q;
            k0Var.forMapMetadata(f);
            j0 forMapData = k0Var.forMapData(obj);
            k kVar = lVar.a;
            kVar.getClass();
            Iterator it = forMapData.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kVar.M(i, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
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
    @Override // com.amazon.aps.iva.v4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r19, com.amazon.aps.iva.v4.l r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.a(java.lang.Object, com.amazon.aps.iva.v4.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x05ba A[Catch: all -> 0x05d9, TryCatch #5 {all -> 0x05d9, blocks: (B:18:0x0045, B:25:0x005b, B:147:0x05a2, B:153:0x05b5, B:155:0x05ba, B:156:0x05bf), top: B:180:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05e0 A[LOOP:1: B:169:0x05de->B:170:0x05e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05d5 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.v4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(T r20, com.amazon.aps.iva.v4.d1 r21, com.amazon.aps.iva.v4.o r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.b(java.lang.Object, com.amazon.aps.iva.v4.d1, com.amazon.aps.iva.v4.o):void");
    }

    public final boolean c(T t, T t2, int i) {
        if (j(t, i) == j(t2, i)) {
            return true;
        }
        return false;
    }

    public final void d(Object obj, int i, Object obj2, k1 k1Var) {
        y.c e;
        int i2 = this.a[i];
        Object o = o1.o(obj, C(i) & 1048575);
        if (o == null || (e = e(i)) == null) {
            return;
        }
        k0 k0Var = this.q;
        j0 forMutableMapData = k0Var.forMutableMapData(o);
        k0Var.forMapMetadata(f(i));
        for (Map.Entry entry : forMutableMapData.entrySet()) {
            if (!e.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    k1Var.m();
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final y.c e(int i) {
        return (y.c) this.b[com.amazon.aps.iva.e4.t0.c(i, 3, 2, 1)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
        if (java.lang.Float.floatToIntBits(com.amazon.aps.iva.v4.o1.l(r11, r7)) == java.lang.Float.floatToIntBits(com.amazon.aps.iva.v4.o1.l(r12, r7))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
        if (java.lang.Double.doubleToLongBits(com.amazon.aps.iva.v4.o1.k(r11, r7)) == java.lang.Double.doubleToLongBits(com.amazon.aps.iva.v4.o1.k(r12, r7))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (com.amazon.aps.iva.v4.f1.C(com.amazon.aps.iva.v4.o1.o(r11, r7), com.amazon.aps.iva.v4.o1.o(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (com.amazon.aps.iva.v4.f1.C(com.amazon.aps.iva.v4.o1.o(r11, r7), com.amazon.aps.iva.v4.o1.o(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (com.amazon.aps.iva.v4.o1.n(r11, r7) == com.amazon.aps.iva.v4.o1.n(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (com.amazon.aps.iva.v4.o1.n(r11, r7) == com.amazon.aps.iva.v4.o1.n(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (com.amazon.aps.iva.v4.f1.C(com.amazon.aps.iva.v4.o1.o(r11, r7), com.amazon.aps.iva.v4.o1.o(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (com.amazon.aps.iva.v4.f1.C(com.amazon.aps.iva.v4.o1.o(r11, r7), com.amazon.aps.iva.v4.o1.o(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
        if (com.amazon.aps.iva.v4.f1.C(com.amazon.aps.iva.v4.o1.o(r11, r7), com.amazon.aps.iva.v4.o1.o(r12, r7)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
        if (com.amazon.aps.iva.v4.o1.g(r11, r7) == com.amazon.aps.iva.v4.o1.g(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
        if (com.amazon.aps.iva.v4.o1.n(r11, r7) == com.amazon.aps.iva.v4.o1.n(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        if (com.amazon.aps.iva.v4.o1.m(r11, r7) == com.amazon.aps.iva.v4.o1.m(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
        if (com.amazon.aps.iva.v4.o1.n(r11, r7) == com.amazon.aps.iva.v4.o1.n(r12, r7)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0191, code lost:
        if (com.amazon.aps.iva.v4.o1.n(r11, r7) == com.amazon.aps.iva.v4.o1.n(r12, r7)) goto L88;
     */
    @Override // com.amazon.aps.iva.v4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object f(int i) {
        return this.b[(i / 3) * 2];
    }

    public final e1 g(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        e1 e1Var = (e1) objArr[i2];
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> a = a1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final int getSerializedSize(T t) {
        if (this.h) {
            return i(t);
        }
        return h(t);
    }

    public final int h(T t) {
        int i;
        int i2;
        int d;
        int r2;
        int i3;
        int t2;
        int v;
        int i4 = 1048575;
        int i5 = 1048575;
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
                    i = iArr[i6 + 2];
                    int i11 = i & i4;
                    i2 = 1 << (i >>> 20);
                    if (i11 != i5) {
                        i8 = unsafe.getInt(t, i11);
                        i5 = i11;
                    }
                } else {
                    if (z && i10 >= t.DOUBLE_LIST_PACKED.id() && i10 <= t.SINT64_LIST_PACKED.id()) {
                        i = iArr[i6 + 2] & i4;
                    } else {
                        i = 0;
                    }
                    i2 = 0;
                }
                long j = C & i4;
                switch (i10) {
                    case 0:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.d(i9);
                            i7 += d;
                            break;
                        }
                    case 1:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.h(i9);
                            i7 += d;
                            break;
                        }
                    case 2:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.l(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 3:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.w(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 4:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.j(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 5:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.g(i9);
                            i7 += d;
                            break;
                        }
                    case 6:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.f(i9);
                            i7 += d;
                            break;
                        }
                    case 7:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.b(i9);
                            i7 += d;
                            break;
                        }
                    case 8:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(t, j);
                            if (object instanceof h) {
                                r2 = k.c(i9, (h) object);
                            } else {
                                r2 = k.r(i9, (String) object);
                            }
                            i7 = r2 + i7;
                            break;
                        }
                    case 9:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = f1.o(i9, g(i6), unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 10:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.c(i9, (h) unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 11:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.u(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 12:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.e(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 13:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.n(i9);
                            i7 += d;
                            break;
                        }
                    case 14:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.o(i9);
                            i7 += d;
                            break;
                        }
                    case 15:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.p(i9, unsafe.getInt(t, j));
                            i7 += d;
                            break;
                        }
                    case 16:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.q(i9, unsafe.getLong(t, j));
                            i7 += d;
                            break;
                        }
                    case 17:
                        if ((i8 & i2) == 0) {
                            break;
                        } else {
                            d = k.i(i9, (p0) unsafe.getObject(t, j), g(i6));
                            i7 += d;
                            break;
                        }
                    case 18:
                        d = f1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 19:
                        d = f1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 20:
                        d = f1.m(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 21:
                        d = f1.x(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 22:
                        d = f1.k(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = f1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 24:
                        d = f1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 25:
                        d = f1.a(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 26:
                        d = f1.u(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 27:
                        d = f1.p(i9, (List) unsafe.getObject(t, j), g(i6));
                        i7 += d;
                        break;
                    case 28:
                        d = f1.c(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 29:
                        d = f1.v(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 30:
                        d = f1.d(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 31:
                        d = f1.f(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 32:
                        d = f1.h(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        d = f1.q(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 34:
                        d = f1.s(i9, (List) unsafe.getObject(t, j));
                        i7 += d;
                        break;
                    case 35:
                        i3 = f1.i((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i3 = f1.g((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i3 = f1.n((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i3 = f1.y((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i3 = f1.l((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i3 = f1.i((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i3 = f1.g((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i3 = f1.b((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i3 = f1.w((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i3 = f1.e((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i3 = f1.g((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i3 = f1.i((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i3 = f1.r((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i3 = f1.t((List) unsafe.getObject(t, j));
                        if (i3 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i3);
                            }
                            t2 = k.t(i9);
                            v = k.v(i3);
                            i7 = v + t2 + i3 + i7;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        d = f1.j(i9, (List) unsafe.getObject(t, j), g(i6));
                        i7 += d;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        d = this.q.getSerializedSize(i9, unsafe.getObject(t, j), f(i6));
                        i7 += d;
                        break;
                    case 51:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.d(i9);
                            i7 += d;
                            break;
                        }
                    case 52:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.h(i9);
                            i7 += d;
                            break;
                        }
                    case 53:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.l(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 54:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.w(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 55:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.j(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 56:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.g(i9);
                            i7 += d;
                            break;
                        }
                    case 57:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.f(i9);
                            i7 += d;
                            break;
                        }
                    case 58:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.b(i9);
                            i7 += d;
                            break;
                        }
                    case 59:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(t, j);
                            if (object2 instanceof h) {
                                r2 = k.c(i9, (h) object2);
                            } else {
                                r2 = k.r(i9, (String) object2);
                            }
                            i7 = r2 + i7;
                            break;
                        }
                    case 60:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = f1.o(i9, g(i6), unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 61:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.c(i9, (h) unsafe.getObject(t, j));
                            i7 += d;
                            break;
                        }
                    case 62:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.u(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 63:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.e(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 64:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.n(i9);
                            i7 += d;
                            break;
                        }
                    case 65:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.o(i9);
                            i7 += d;
                            break;
                        }
                    case 66:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.p(i9, s(t, j));
                            i7 += d;
                            break;
                        }
                    case 67:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.q(i9, t(t, j));
                            i7 += d;
                            break;
                        }
                    case 68:
                        if (!k(t, i9, i6)) {
                            break;
                        } else {
                            d = k.i(i9, (p0) unsafe.getObject(t, j), g(i6));
                            i7 += d;
                            break;
                        }
                }
                i6 += 3;
                i4 = 1048575;
            } else {
                k1<?, ?> k1Var = this.o;
                int h = k1Var.h(k1Var.g(t)) + i7;
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
    @Override // com.amazon.aps.iva.v4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode(T r11) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.s0.hashCode(java.lang.Object):int");
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
                if (i5 >= t.DOUBLE_LIST_PACKED.id() && i5 <= t.SINT64_LIST_PACKED.id()) {
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
                            d = k.d(i6);
                            i4 += d;
                            break;
                        }
                    case 1:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.h(i6);
                            i4 += d;
                            break;
                        }
                    case 2:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.l(i6, o1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 3:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.w(i6, o1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 4:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.j(i6, o1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 5:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.g(i6);
                            i4 += d;
                            break;
                        }
                    case 6:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.f(i6);
                            i4 += d;
                            break;
                        }
                    case 7:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.b(i6);
                            i4 += d;
                            break;
                        }
                    case 8:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            Object o = o1.o(t, j);
                            if (o instanceof h) {
                                r2 = k.c(i6, (h) o);
                            } else {
                                r2 = k.r(i6, (String) o);
                            }
                            i4 += r2;
                            break;
                        }
                    case 9:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = f1.o(i6, g(i3), o1.o(t, j));
                            i4 += d;
                            break;
                        }
                    case 10:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.c(i6, (h) o1.o(t, j));
                            i4 += d;
                            break;
                        }
                    case 11:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.u(i6, o1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 12:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.e(i6, o1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 13:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.n(i6);
                            i4 += d;
                            break;
                        }
                    case 14:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.o(i6);
                            i4 += d;
                            break;
                        }
                    case 15:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.p(i6, o1.m(t, j));
                            i4 += d;
                            break;
                        }
                    case 16:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.q(i6, o1.n(t, j));
                            i4 += d;
                            break;
                        }
                    case 17:
                        if (!j(t, i3)) {
                            break;
                        } else {
                            d = k.i(i6, (p0) o1.o(t, j), g(i3));
                            i4 += d;
                            break;
                        }
                    case 18:
                        d = f1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case 19:
                        d = f1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 20:
                        d = f1.m(i6, l(t, j));
                        i4 += d;
                        break;
                    case 21:
                        d = f1.x(i6, l(t, j));
                        i4 += d;
                        break;
                    case 22:
                        d = f1.k(i6, l(t, j));
                        i4 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = f1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case 24:
                        d = f1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 25:
                        d = f1.a(i6, l(t, j));
                        i4 += d;
                        break;
                    case 26:
                        d = f1.u(i6, l(t, j));
                        i4 += d;
                        break;
                    case 27:
                        d = f1.p(i6, l(t, j), g(i3));
                        i4 += d;
                        break;
                    case 28:
                        d = f1.c(i6, l(t, j));
                        i4 += d;
                        break;
                    case 29:
                        d = f1.v(i6, l(t, j));
                        i4 += d;
                        break;
                    case 30:
                        d = f1.d(i6, l(t, j));
                        i4 += d;
                        break;
                    case 31:
                        d = f1.f(i6, l(t, j));
                        i4 += d;
                        break;
                    case 32:
                        d = f1.h(i6, l(t, j));
                        i4 += d;
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        d = f1.q(i6, l(t, j));
                        i4 += d;
                        break;
                    case 34:
                        d = f1.s(i6, l(t, j));
                        i4 += d;
                        break;
                    case 35:
                        i2 = f1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i2 = f1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i2 = f1.n((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i2 = f1.y((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i2 = f1.l((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i2 = f1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i2 = f1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i2 = f1.b((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i2 = f1.w((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i2 = f1.e((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i2 = f1.g((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i2 = f1.i((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i2 = f1.r((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i2 = f1.t((List) unsafe.getObject(t, j));
                        if (i2 > 0) {
                            if (z) {
                                unsafe.putInt(t, i, i2);
                            }
                            t2 = k.t(i6);
                            v = k.v(i2);
                            i4 += v + t2 + i2;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        d = f1.j(i6, l(t, j), g(i3));
                        i4 += d;
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        d = this.q.getSerializedSize(i6, o1.o(t, j), f(i3));
                        i4 += d;
                        break;
                    case 51:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.d(i6);
                            i4 += d;
                            break;
                        }
                    case 52:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.h(i6);
                            i4 += d;
                            break;
                        }
                    case 53:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.l(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 54:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.w(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 55:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.j(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 56:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.g(i6);
                            i4 += d;
                            break;
                        }
                    case 57:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.f(i6);
                            i4 += d;
                            break;
                        }
                    case 58:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.b(i6);
                            i4 += d;
                            break;
                        }
                    case 59:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            Object o2 = o1.o(t, j);
                            if (o2 instanceof h) {
                                r2 = k.c(i6, (h) o2);
                            } else {
                                r2 = k.r(i6, (String) o2);
                            }
                            i4 += r2;
                            break;
                        }
                    case 60:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = f1.o(i6, g(i3), o1.o(t, j));
                            i4 += d;
                            break;
                        }
                    case 61:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.c(i6, (h) o1.o(t, j));
                            i4 += d;
                            break;
                        }
                    case 62:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.u(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 63:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.e(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 64:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.n(i6);
                            i4 += d;
                            break;
                        }
                    case 65:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.o(i6);
                            i4 += d;
                            break;
                        }
                    case 66:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.p(i6, s(t, j));
                            i4 += d;
                            break;
                        }
                    case 67:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.q(i6, t(t, j));
                            i4 += d;
                            break;
                        }
                    case 68:
                        if (!k(t, i6, i3)) {
                            break;
                        } else {
                            d = k.i(i6, (p0) o1.o(t, j), g(i3));
                            i4 += d;
                            break;
                        }
                }
                i3 += 3;
            } else {
                k1<?, ?> k1Var = this.o;
                return k1Var.h(k1Var.g(t)) + i4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.v4.e1
    public final boolean isInitialized(T t) {
        boolean z;
        boolean z2;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 < this.k) {
                int i4 = this.j[i2];
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int C = C(i4);
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i) {
                    if (i7 != 1048575) {
                        i3 = s.getInt(t, i7);
                    }
                    i = i7;
                }
                if ((268435456 & C) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i == 1048575) {
                        z2 = j(t, i4);
                    } else if ((i3 & i8) != 0) {
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
                                    Object o = o1.o(t, C & 1048575);
                                    k0 k0Var = this.q;
                                    if (!k0Var.forMapData(o).isEmpty()) {
                                        k0Var.forMapMetadata(f(i4));
                                        throw null;
                                    }
                                }
                            }
                        } else if (k(t, i5, i4) && !g(i4).isInitialized(o1.o(t, C & 1048575))) {
                            return false;
                        }
                    }
                    List list = (List) o1.o(t, C & 1048575);
                    if (!list.isEmpty()) {
                        e1 g = g(i4);
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
                    if (i == 1048575) {
                        z3 = j(t, i4);
                    } else if ((i8 & i3) == 0) {
                        z3 = false;
                    }
                    if (z3 && !g(i4).isInitialized(o1.o(t, C & 1048575))) {
                        return false;
                    }
                }
                i2++;
            } else if (this.f && !this.p.c(t).i()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final boolean j(T t, int i) {
        boolean equals;
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int C = C(i);
            long j2 = C & 1048575;
            switch ((C & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(o1.k(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(o1.l(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (o1.n(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (o1.n(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (o1.n(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return o1.g(t, j2);
                case 8:
                    Object o = o1.o(t, j2);
                    if (o instanceof String) {
                        equals = ((String) o).isEmpty();
                        break;
                    } else if (o instanceof h) {
                        equals = h.c.equals(o);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (o1.o(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = h.c.equals(o1.o(t, j2));
                    break;
                case 11:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (o1.n(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (o1.m(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (o1.n(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (o1.o(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((o1.m(t, j) & (1 << (i2 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean k(T t, int i, int i2) {
        if (o1.m(t, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final <K, V> void m(Object obj, int i, Object obj2, o oVar, d1 d1Var) throws IOException {
        long C = C(i) & 1048575;
        Object o = o1.o(obj, C);
        k0 k0Var = this.q;
        if (o == null) {
            o = k0Var.a();
            o1.v(obj, C, o);
        } else if (k0Var.isImmutable(o)) {
            j0 a = k0Var.a();
            k0Var.mergeFrom(a, o);
            o1.v(obj, C, a);
            o = a;
        }
        k0Var.forMutableMapData(o);
        k0Var.forMapMetadata(obj2);
        d1Var.c();
    }

    @Override // com.amazon.aps.iva.v4.e1
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
            Object o = o1.o(t, C);
            if (o != null) {
                o1.v(t, C, this.q.toImmutable(o));
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

    @Override // com.amazon.aps.iva.v4.e1
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
                            o1.c.m(t, j, o1.k(t2, j));
                            A(t, i);
                            break;
                        }
                    case 1:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.c.n(t, j, o1.l(t2, j));
                            A(t, i);
                            break;
                        }
                    case 2:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.u(t, j, o1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 3:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.u(t, j, o1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 4:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 5:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.u(t, j, o1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 6:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 7:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.c.k(t, j, o1.g(t2, j));
                            A(t, i);
                            break;
                        }
                    case 8:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.v(t, j, o1.o(t2, j));
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
                            o1.v(t, j, o1.o(t2, j));
                            A(t, i);
                            break;
                        }
                    case 11:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 12:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 13:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 14:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.u(t, j, o1.n(t2, j));
                            A(t, i);
                            break;
                        }
                    case 15:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.t(t, j, o1.m(t2, j));
                            A(t, i);
                            break;
                        }
                    case 16:
                        if (!j(t2, i)) {
                            break;
                        } else {
                            o1.u(t, j, o1.n(t2, j));
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
                        Class<?> cls = f1.a;
                        o1.v(t, j, this.q.mergeFrom(o1.o(t, j), o1.o(t2, j)));
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
                            o1.v(t, j, o1.o(t2, j));
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
                            o1.v(t, j, o1.o(t2, j));
                            B(t, i2, i);
                            break;
                        }
                    case 68:
                        o(t, t2, i);
                        break;
                }
                i += 3;
            } else {
                Class<?> cls2 = f1.a;
                k1<?, ?> k1Var = this.o;
                k1Var.o(t, k1Var.k(k1Var.g(t), k1Var.g(t2)));
                if (this.f) {
                    f1.B(this.p, t, t2);
                    return;
                }
                return;
            }
        }
    }

    public final void n(T t, T t2, int i) {
        long C = C(i) & 1048575;
        if (!j(t2, i)) {
            return;
        }
        Object o = o1.o(t, C);
        Object o2 = o1.o(t2, C);
        if (o != null && o2 != null) {
            o1.v(t, C, y.b(o, o2));
            A(t, i);
        } else if (o2 != null) {
            o1.v(t, C, o2);
            A(t, i);
        }
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final T newInstance() {
        return (T) this.m.a(this.e);
    }

    public final void o(T t, T t2, int i) {
        Object obj;
        int C = C(i);
        int i2 = this.a[i];
        long j = C & 1048575;
        if (!k(t2, i2, i)) {
            return;
        }
        if (k(t, i2, i)) {
            obj = o1.o(t, j);
        } else {
            obj = null;
        }
        Object o = o1.o(t2, j);
        if (obj != null && o != null) {
            o1.v(t, j, y.b(obj, o));
            B(t, i2, i);
        } else if (o != null) {
            o1.v(t, j, o);
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

    public final <E> void v(Object obj, long j, d1 d1Var, e1<E> e1Var, o oVar) throws IOException {
        d1Var.a(this.n.c(obj, j), e1Var, oVar);
    }

    public final <E> void w(Object obj, int i, d1 d1Var, e1<E> e1Var, o oVar) throws IOException {
        d1Var.b(this.n.c(obj, i & 1048575), e1Var, oVar);
    }

    public final void x(Object obj, int i, d1 d1Var) throws IOException {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o1.v(obj, i & 1048575, d1Var.readStringRequireUtf8());
        } else if (this.g) {
            o1.v(obj, i & 1048575, d1Var.readString());
        } else {
            o1.v(obj, i & 1048575, d1Var.readBytes());
        }
    }

    public final void y(Object obj, int i, d1 d1Var) throws IOException {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        f0 f0Var = this.n;
        if (z) {
            d1Var.readStringListRequireUtf8(f0Var.c(obj, i & 1048575));
        } else {
            d1Var.readStringList(f0Var.c(obj, i & 1048575));
        }
    }
}
