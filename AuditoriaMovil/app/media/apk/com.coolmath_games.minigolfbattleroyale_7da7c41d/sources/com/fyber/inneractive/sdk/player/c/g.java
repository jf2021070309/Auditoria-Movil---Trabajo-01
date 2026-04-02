package com.fyber.inneractive.sdk.player.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.c.g.c;
import com.fyber.inneractive.sdk.player.c.g.d;
import com.fyber.inneractive.sdk.player.c.i.g;
import com.fyber.inneractive.sdk.player.c.q;
import java.io.IOException;
/* loaded from: classes.dex */
final class g implements Handler.Callback, c.a, d.a, g.a {
    private c A;
    private long B;
    private a C;
    private a D;
    private a E;
    private q F;
    final Handler a;
    boolean b;
    int c;
    private final n[] d;
    private final o[] e;
    private final com.fyber.inneractive.sdk.player.c.i.g f;
    private final k g;
    private final com.fyber.inneractive.sdk.player.c.k.q h;
    private final HandlerThread i;
    private final Handler j;
    private final e k;
    private final q.b l;
    private final q.a m;
    private b n;
    private m o;
    private n p;
    private com.fyber.inneractive.sdk.player.c.k.g q;
    private com.fyber.inneractive.sdk.player.c.g.d r;
    private n[] s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w = 1;
    private int x;
    private long y;
    private int z;

    @Override // com.fyber.inneractive.sdk.player.c.g.f.a
    public final /* synthetic */ void a(com.fyber.inneractive.sdk.player.c.g.c cVar) {
        this.a.obtainMessage(9, cVar).sendToTarget();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public volatile long c;
        public volatile long d;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
            this.c = j;
            this.d = j;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final q a;
        public final Object b;
        public final b c;
        public final int d;

        public d(q qVar, Object obj, b bVar, int i) {
            this.a = qVar;
            this.b = obj;
            this.c = bVar;
            this.d = i;
        }
    }

    public g(n[] nVarArr, com.fyber.inneractive.sdk.player.c.i.g gVar, k kVar, boolean z, Handler handler, b bVar, e eVar) {
        this.d = nVarArr;
        this.f = gVar;
        this.g = kVar;
        this.t = z;
        this.j = handler;
        this.n = bVar;
        this.k = eVar;
        this.e = new o[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].a(i);
            this.e[i] = nVarArr[i].b();
        }
        this.h = new com.fyber.inneractive.sdk.player.c.k.q();
        this.s = new n[0];
        this.l = new q.b();
        this.m = new q.a();
        gVar.a = this;
        this.o = m.a;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.i = handlerThread;
        handlerThread.start();
        this.a = new Handler(this.i.getLooper(), this);
    }

    public final void a(q qVar, int i, long j) {
        this.a.obtainMessage(3, new c(qVar, i, j)).sendToTarget();
    }

    public final synchronized void a() {
        if (this.b) {
            return;
        }
        this.a.sendEmptyMessage(6);
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.i.quit();
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d.a
    public final void a(q qVar) {
        this.a.obtainMessage(7, Pair.create(qVar, null)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fyber.inneractive.sdk.player.c.g.c.a
    public final void a(com.fyber.inneractive.sdk.player.c.g.c cVar) {
        this.a.obtainMessage(8, cVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x020a A[Catch: IOException -> 0x0808, d -> 0x080d, RuntimeException -> 0x088b, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020d A[Catch: IOException -> 0x0808, d -> 0x080d, RuntimeException -> 0x088b, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211 A[Catch: IOException -> 0x0808, d -> 0x080d, RuntimeException -> 0x088b, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0567 A[Catch: IOException -> 0x0808, d -> 0x080d, RuntimeException -> 0x088b, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0586 A[Catch: IOException -> 0x0808, d -> 0x080d, RuntimeException -> 0x088b, LOOP:6: B:287:0x0586->B:291:0x0598, LOOP_START, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06e2 A[Catch: IOException -> 0x087f, d -> 0x0885, RuntimeException -> 0x088b, TryCatch #4 {RuntimeException -> 0x088b, blocks: (B:3:0x0005, B:8:0x0018, B:15:0x0039, B:22:0x0047, B:25:0x004a, B:28:0x0054, B:32:0x0058, B:33:0x0059, B:35:0x005d, B:37:0x0062, B:40:0x0068, B:42:0x006e, B:45:0x0073, B:47:0x0078, B:51:0x0081, B:53:0x00ab, B:54:0x00b2, B:55:0x00b9, B:57:0x00be, B:61:0x00cb, B:63:0x00d5, B:64:0x00d7, B:66:0x00db, B:68:0x00e1, B:71:0x00e7, B:72:0x00ee, B:73:0x00f2, B:74:0x00f9, B:76:0x00fd, B:77:0x0102, B:78:0x0105, B:85:0x0140, B:79:0x0114, B:81:0x011a, B:82:0x0120, B:84:0x012a, B:87:0x014c, B:89:0x0154, B:92:0x015b, B:94:0x015f, B:96:0x0167, B:99:0x016e, B:101:0x0181, B:102:0x018f, B:104:0x0193, B:106:0x01a3, B:108:0x01a7, B:110:0x01b6, B:111:0x01bb, B:119:0x0206, B:121:0x020a, B:124:0x0211, B:126:0x021c, B:128:0x0226, B:129:0x022b, B:130:0x0257, B:132:0x025b, B:136:0x0268, B:137:0x026b, B:138:0x0278, B:140:0x0289, B:144:0x029c, B:148:0x02a6, B:150:0x02ac, B:151:0x02bf, B:153:0x02c3, B:155:0x02d6, B:159:0x02e9, B:161:0x02f5, B:165:0x02ff, B:167:0x0304, B:168:0x0318, B:169:0x031f, B:122:0x020d, B:112:0x01d3, B:114:0x01db, B:116:0x01e3, B:117:0x01e9, B:171:0x0323, B:172:0x032e, B:179:0x0339, B:180:0x033a, B:182:0x033e, B:184:0x0346, B:186:0x0353, B:185:0x034d, B:188:0x035f, B:190:0x0367, B:191:0x0370, B:193:0x0376, B:194:0x0396, B:198:0x039f, B:204:0x03c2, B:208:0x03d0, B:209:0x03d7, B:217:0x03e7, B:221:0x03f5, B:224:0x03ff, B:228:0x040e, B:229:0x0418, B:230:0x0419, B:232:0x0421, B:234:0x0425, B:247:0x045f, B:249:0x0467, B:251:0x046b, B:258:0x04e2, B:260:0x04e6, B:263:0x0505, B:265:0x0515, B:269:0x052a, B:271:0x0551, B:272:0x0555, B:274:0x0563, B:276:0x0567, B:279:0x0570, B:281:0x0574, B:283:0x057a, B:285:0x0582, B:287:0x0586, B:289:0x058c, B:291:0x0598, B:292:0x05c3, B:295:0x05ca, B:297:0x05cf, B:299:0x05db, B:301:0x05e1, B:303:0x05e7, B:304:0x05ea, B:306:0x05ee, B:308:0x05f3, B:311:0x0605, B:314:0x060d, B:315:0x0610, B:317:0x0616, B:319:0x061e, B:324:0x063a, B:326:0x063f, B:329:0x064d, B:331:0x0653, B:333:0x0663, B:335:0x0669, B:337:0x0672, B:338:0x067b, B:339:0x0683, B:340:0x068b, B:341:0x068e, B:343:0x0695, B:345:0x069b, B:347:0x06a6, B:349:0x06bc, B:351:0x06c7, B:355:0x06d0, B:357:0x06d6, B:363:0x06e2, B:368:0x06ec, B:370:0x06f4, B:371:0x06f7, B:373:0x06fb, B:375:0x0709, B:376:0x071c, B:380:0x0731, B:382:0x0739, B:384:0x073f, B:417:0x07ca, B:419:0x07cf, B:421:0x07d5, B:422:0x07dd, B:424:0x07e1, B:428:0x07eb, B:433:0x0802, B:426:0x07e6, B:429:0x07f1, B:431:0x07f6, B:432:0x07fc, B:385:0x0748, B:387:0x074d, B:390:0x0754, B:392:0x075c, B:396:0x076f, B:406:0x07a2, B:408:0x07aa, B:399:0x0777, B:400:0x0786, B:393:0x0761, B:404:0x079c, B:409:0x07ae, B:411:0x07b3, B:416:0x07bf, B:414:0x07b9, B:284:0x057e, B:262:0x04ee, B:252:0x0477, B:255:0x0496, B:257:0x04cf, B:235:0x042a, B:237:0x0434, B:239:0x043c, B:242:0x044d, B:244:0x0451, B:246:0x045a, B:439:0x0812, B:443:0x0819, B:445:0x0820, B:446:0x082a, B:448:0x082f, B:449:0x0839, B:451:0x083e, B:454:0x0845, B:458:0x0851, B:460:0x0858, B:461:0x085b, B:463:0x0862, B:464:0x0869), top: B:492:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0798  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r37) {
        /*
            Method dump skipped, instructions count: 2298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.g.handleMessage(android.os.Message):boolean");
    }

    private void a(int i) {
        if (this.w != i) {
            this.w = i;
            this.j.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private void a(boolean z) {
        if (this.v != z) {
            this.v = z;
            this.j.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private void b() throws com.fyber.inneractive.sdk.player.c.d {
        this.u = false;
        com.fyber.inneractive.sdk.player.c.k.q qVar = this.h;
        if (!qVar.a) {
            qVar.b = SystemClock.elapsedRealtime();
            qVar.a = true;
        }
        for (n nVar : this.s) {
            nVar.e();
        }
    }

    private void c() throws com.fyber.inneractive.sdk.player.c.d {
        this.h.a();
        for (n nVar : this.s) {
            a(nVar);
        }
    }

    private void d() throws com.fyber.inneractive.sdk.player.c.d {
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        long g = aVar.a.g();
        if (g != -9223372036854775807L) {
            a(g);
        } else {
            n nVar = this.p;
            if (nVar != null && !nVar.r()) {
                long v = this.q.v();
                this.B = v;
                this.h.a(v);
            } else {
                this.B = this.h.v();
            }
            g = this.B - this.E.a();
        }
        this.n.c = g;
        this.y = SystemClock.elapsedRealtime() * 1000;
        long h = this.s.length == 0 ? Long.MIN_VALUE : this.E.a.h();
        b bVar = this.n;
        if (h == Long.MIN_VALUE) {
            h = this.F.a(this.E.f, this.m, false).d;
        }
        bVar.d = h;
    }

    private void a(long j, long j2) {
        this.a.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.a.sendEmptyMessage(2);
        } else {
            this.a.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private long a(int i, long j) throws com.fyber.inneractive.sdk.player.c.d {
        a aVar;
        c();
        this.u = false;
        a(2);
        a aVar2 = this.E;
        if (aVar2 == null) {
            a aVar3 = this.C;
            if (aVar3 != null) {
                aVar3.d();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f == i && aVar2.i) {
                    aVar = aVar2;
                } else {
                    aVar2.d();
                }
                aVar2 = aVar2.k;
            }
        }
        a aVar4 = this.E;
        if (aVar4 != aVar || aVar4 != this.D) {
            for (n nVar : this.s) {
                nVar.l();
            }
            this.s = new n[0];
            this.q = null;
            this.p = null;
            this.E = null;
        }
        if (aVar != null) {
            aVar.k = null;
            this.C = aVar;
            this.D = aVar;
            b(aVar);
            if (this.E.j) {
                j = this.E.a.a(j);
            }
            a(j);
            g();
        } else {
            this.C = null;
            this.D = null;
            this.E = null;
            a(j);
        }
        this.a.sendEmptyMessage(2);
        return j;
    }

    private void a(long j) throws com.fyber.inneractive.sdk.player.c.d {
        a aVar = this.E;
        long a2 = j + (aVar == null ? 60000000L : aVar.a());
        this.B = a2;
        this.h.a(a2);
        for (n nVar : this.s) {
            nVar.a(this.B);
        }
    }

    private void e() {
        b(true);
        this.g.b();
        a(1);
    }

    private void b(boolean z) {
        n[] nVarArr;
        this.a.removeMessages(2);
        this.u = false;
        this.h.a();
        this.q = null;
        this.p = null;
        this.B = 60000000L;
        for (n nVar : this.s) {
            try {
                a(nVar);
                nVar.l();
            } catch (com.fyber.inneractive.sdk.player.c.d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.s = new n[0];
        a aVar = this.E;
        if (aVar == null) {
            aVar = this.C;
        }
        a(aVar);
        this.C = null;
        this.D = null;
        this.E = null;
        a(false);
        if (z) {
            com.fyber.inneractive.sdk.player.c.g.d dVar = this.r;
            if (dVar != null) {
                dVar.a();
                this.r = null;
            }
            this.F = null;
        }
    }

    private static void a(n nVar) throws com.fyber.inneractive.sdk.player.c.d {
        if (nVar.d() == 2) {
            nVar.k();
        }
    }

    private boolean b(long j) {
        if (j == -9223372036854775807L || this.n.c < j) {
            return true;
        }
        return this.E.k != null && this.E.k.i;
    }

    private void f() throws IOException {
        a aVar = this.C;
        if (aVar == null || aVar.i) {
            return;
        }
        a aVar2 = this.D;
        if (aVar2 == null || aVar2.k == this.C) {
            for (n nVar : this.s) {
                if (!nVar.g()) {
                    return;
                }
            }
            this.C.a.c();
        }
    }

    private void a(Object obj, int i) {
        this.n = new b(0, 0L);
        b(obj, i);
        this.n = new b(0, -9223372036854775807L);
        a(4);
        b(false);
    }

    private void b(Object obj, int i) {
        this.j.obtainMessage(6, new d(this.F, obj, this.n, i)).sendToTarget();
    }

    private int a(int i, q qVar, q qVar2) {
        int i2 = -1;
        while (i2 == -1 && i < qVar.c() - 1) {
            i++;
            i2 = qVar2.a(qVar.a(i, this.m, true).b);
        }
        return i2;
    }

    private Pair<Integer, Long> a(c cVar) {
        q qVar = cVar.a;
        if (qVar.a()) {
            qVar = this.F;
        }
        try {
            Pair<Integer, Long> b2 = b(qVar, cVar.b, cVar.c);
            q qVar2 = this.F;
            if (qVar2 == qVar) {
                return b2;
            }
            int a2 = qVar2.a(qVar.a(((Integer) b2.first).intValue(), this.m, true).b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), b2.second);
            }
            int a3 = a(((Integer) b2.first).intValue(), qVar, this.F);
            if (a3 != -1) {
                return b(this.F.a(a3, this.m, false).c);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new j(this.F, cVar.b, cVar.c);
        }
    }

    private Pair<Integer, Long> b(int i) {
        return b(this.F, i, -9223372036854775807L);
    }

    private Pair<Integer, Long> b(q qVar, int i, long j) {
        return a(qVar, i, j, 0L);
    }

    private Pair<Integer, Long> a(q qVar, int i, long j, long j2) {
        com.fyber.inneractive.sdk.player.c.k.a.a(i, qVar.b());
        qVar.a(i, this.l, j2);
        if (j == -9223372036854775807L) {
            j = this.l.h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = this.l.f;
        long j3 = this.l.j + j;
        long j4 = qVar.a(i2, this.m, false).d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.l.g) {
            j3 -= j4;
            i2++;
            j4 = qVar.a(i2, this.m, false).d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    private void g() {
        long f = !this.C.i ? 0L : this.C.a.f();
        if (f == Long.MIN_VALUE) {
            a(false);
            return;
        }
        boolean a2 = this.g.a(f - (this.B - this.C.a()));
        a(a2);
        if (a2) {
            this.C.l = false;
            this.C.a.e();
            return;
        }
        this.C.l = true;
    }

    private static void a(a aVar) {
        while (aVar != null) {
            aVar.d();
            aVar = aVar.k;
        }
    }

    private void b(a aVar) throws com.fyber.inneractive.sdk.player.c.d {
        if (this.E == aVar) {
            return;
        }
        boolean[] zArr = new boolean[this.d.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            n[] nVarArr = this.d;
            if (i < nVarArr.length) {
                n nVar = nVarArr[i];
                zArr[i] = nVar.d() != 0;
                com.fyber.inneractive.sdk.player.c.i.e eVar = aVar.m.b.b[i];
                if (eVar != null) {
                    i2++;
                }
                if (zArr[i] && (eVar == null || (nVar.i() && nVar.f() == this.E.c[i]))) {
                    if (nVar == this.p) {
                        this.h.a(this.q);
                        this.q = null;
                        this.p = null;
                    }
                    a(nVar);
                    nVar.l();
                }
                i++;
            } else {
                this.E = aVar;
                this.j.obtainMessage(3, aVar.m).sendToTarget();
                a(zArr, i2);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i) throws com.fyber.inneractive.sdk.player.c.d {
        this.s = new n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            n[] nVarArr = this.d;
            if (i2 >= nVarArr.length) {
                return;
            }
            n nVar = nVarArr[i2];
            com.fyber.inneractive.sdk.player.c.i.e eVar = this.E.m.b.b[i2];
            if (eVar != null) {
                int i4 = i3 + 1;
                this.s[i3] = nVar;
                if (nVar.d() == 0) {
                    p pVar = this.E.m.d[i2];
                    boolean z = this.t && this.w == 3;
                    boolean z2 = !zArr[i2] && z;
                    int b2 = eVar.b();
                    h[] hVarArr = new h[b2];
                    for (int i5 = 0; i5 < b2; i5++) {
                        hVarArr[i5] = eVar.a(i5);
                    }
                    nVar.a(pVar, hVarArr, this.E.c[i2], this.B, z2, this.E.a());
                    com.fyber.inneractive.sdk.player.c.k.g c2 = nVar.c();
                    if (c2 != null) {
                        if (this.q != null) {
                            throw com.fyber.inneractive.sdk.player.c.d.a(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.q = c2;
                        this.p = nVar;
                        c2.a(this.o);
                    }
                    if (z) {
                        nVar.e();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.fyber.inneractive.sdk.player.c.g.c a;
        public final Object b;
        public final com.fyber.inneractive.sdk.player.c.g.e[] c;
        public final boolean[] d;
        public final long e;
        public int f;
        public long g;
        public boolean h;
        public boolean i;
        public boolean j;
        public a k;
        public boolean l;
        public com.fyber.inneractive.sdk.player.c.i.h m;
        private final n[] n;
        private final o[] o;
        private final com.fyber.inneractive.sdk.player.c.i.g p;
        private final k q;
        private final com.fyber.inneractive.sdk.player.c.g.d r;
        private com.fyber.inneractive.sdk.player.c.i.h s;

        public a(n[] nVarArr, o[] oVarArr, long j, com.fyber.inneractive.sdk.player.c.i.g gVar, k kVar, com.fyber.inneractive.sdk.player.c.g.d dVar, Object obj, int i, boolean z, long j2) {
            this.n = nVarArr;
            this.o = oVarArr;
            this.e = j;
            this.p = gVar;
            this.q = kVar;
            this.r = dVar;
            this.b = com.fyber.inneractive.sdk.player.c.k.a.a(obj);
            this.f = i;
            this.h = z;
            this.g = j2;
            this.c = new com.fyber.inneractive.sdk.player.c.g.e[nVarArr.length];
            this.d = new boolean[nVarArr.length];
            this.a = dVar.a(i, kVar.d());
        }

        public final long a() {
            return this.e - this.g;
        }

        public final void a(int i, boolean z) {
            this.f = i;
            this.h = z;
        }

        public final boolean b() {
            if (this.i) {
                return !this.j || this.a.h() == Long.MIN_VALUE;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c() throws com.fyber.inneractive.sdk.player.c.d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.c.i.g r0 = r6.p
                com.fyber.inneractive.sdk.player.c.o[] r1 = r6.o
                com.fyber.inneractive.sdk.player.c.g.c r2 = r6.a
                com.fyber.inneractive.sdk.player.c.g.i r2 = r2.d()
                com.fyber.inneractive.sdk.player.c.i.h r0 = r0.a(r1, r2)
                com.fyber.inneractive.sdk.player.c.i.h r1 = r6.s
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L16
            L14:
                r1 = r3
                goto L28
            L16:
                r4 = r3
            L17:
                com.fyber.inneractive.sdk.player.c.i.f r5 = r0.b
                int r5 = r5.a
                if (r4 >= r5) goto L27
                boolean r5 = r0.a(r1, r4)
                if (r5 != 0) goto L24
                goto L14
            L24:
                int r4 = r4 + 1
                goto L17
            L27:
                r1 = r2
            L28:
                if (r1 == 0) goto L2b
                return r3
            L2b:
                r6.m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.g.a.c():boolean");
        }

        public final long a(long j) {
            return a(j, false, new boolean[this.n.length]);
        }

        public final long a(long j, boolean z, boolean[] zArr) {
            com.fyber.inneractive.sdk.player.c.i.f fVar = this.m.b;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= fVar.a) {
                    break;
                }
                boolean[] zArr2 = this.d;
                if (z || !this.m.a(this.s, i)) {
                    z2 = false;
                }
                zArr2[i] = z2;
                i++;
            }
            long a = this.a.a(fVar.a(), this.d, this.c, zArr, j);
            this.s = this.m;
            this.j = false;
            int i2 = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.c.g.e[] eVarArr = this.c;
                if (i2 < eVarArr.length) {
                    if (eVarArr[i2] != null) {
                        com.fyber.inneractive.sdk.player.c.k.a.b(fVar.b[i2] != null);
                        this.j = true;
                    } else {
                        com.fyber.inneractive.sdk.player.c.k.a.b(fVar.b[i2] == null);
                    }
                    i2++;
                } else {
                    this.q.a(this.n, fVar);
                    return a;
                }
            }
        }

        public final void d() {
            try {
                this.r.a(this.a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        public final q a;
        public final int b;
        public final long c;

        public c(q qVar, int i, long j) {
            this.a = qVar;
            this.b = i;
            this.c = j;
        }
    }
}
