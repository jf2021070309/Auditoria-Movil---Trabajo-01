package com.kwad.framework.filedownloader.download;

import com.kuaishou.weapon.p0.g;
import com.kwad.framework.filedownloader.download.c;
import com.kwad.framework.filedownloader.download.e;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.framework.filedownloader.exception.FileDownloadHttpException;
import com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.kwad.framework.filedownloader.y;
import com.kwad.sdk.crash.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class DownloadLaunchRunnable implements f, Runnable {
    private static final ThreadPoolExecutor acT = com.kwad.framework.filedownloader.f.b.bm("ConnectionBlock");
    private final com.kwad.framework.filedownloader.b.a acD;
    private final d acG;
    private final int acH;
    private final com.kwad.framework.filedownloader.d.c acI;
    private final com.kwad.framework.filedownloader.d.b acJ;
    private final boolean acK;
    private final boolean acL;
    private final y acM;
    private boolean acN;
    int acO;
    private final boolean acP;
    private final ArrayList<c> acQ;
    private e acR;
    private boolean acS;
    private boolean acU;
    private boolean acV;
    private boolean acW;
    private final AtomicBoolean acX;
    private volatile boolean acY;
    private volatile Exception acZ;
    private String ada;
    private long adb;
    private long adc;
    private long add;
    private long ade;
    private volatile boolean kW;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class DiscardSafely extends Throwable {
        private static final long serialVersionUID = 4243896780616180062L;

        DiscardSafely() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class RetryDirectly extends Throwable {
        private static final long serialVersionUID = -4127585119566978768L;

        RetryDirectly() {
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        private com.kwad.framework.filedownloader.d.c acI;
        private y acM;
        private com.kwad.framework.filedownloader.d.b acp;
        private Integer adf;
        private Integer adg;
        private Boolean adh;
        private Boolean adi;
        private Integer adj;

        public final a a(y yVar) {
            this.acM = yVar;
            return this;
        }

        public final a a(Boolean bool) {
            this.adh = bool;
            return this;
        }

        public final a a(Integer num) {
            this.adf = num;
            return this;
        }

        public final a b(com.kwad.framework.filedownloader.d.b bVar) {
            this.acp = bVar;
            return this;
        }

        public final a b(Boolean bool) {
            this.adi = bool;
            return this;
        }

        public final a b(Integer num) {
            this.adg = num;
            return this;
        }

        public final a c(Integer num) {
            this.adj = num;
            return this;
        }

        public final a e(com.kwad.framework.filedownloader.d.c cVar) {
            this.acI = cVar;
            return this;
        }

        public final DownloadLaunchRunnable uI() {
            if (this.acI == null || this.acM == null || this.adf == null || this.adg == null || this.adh == null || this.adi == null || this.adj == null) {
                throw new IllegalArgumentException();
            }
            return new DownloadLaunchRunnable(this.acI, this.acp, this.acM, this.adf.intValue(), this.adg.intValue(), this.adh.booleanValue(), this.adi.booleanValue(), this.adj.intValue(), (byte) 0);
        }
    }

    private DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c cVar, com.kwad.framework.filedownloader.d.b bVar, y yVar, int i, int i2, boolean z, boolean z2, int i3) {
        this.acH = 5;
        this.acQ = new ArrayList<>(5);
        this.adb = 0L;
        this.adc = 0L;
        this.add = 0L;
        this.ade = 0L;
        this.acX = new AtomicBoolean(true);
        this.kW = false;
        this.acN = false;
        this.acI = cVar;
        this.acJ = bVar;
        this.acK = z;
        this.acL = z2;
        this.acD = b.us().uu();
        this.acP = b.us().uw();
        this.acM = yVar;
        this.acO = i3;
        this.acG = new d(cVar, i3, i, i2);
    }

    /* synthetic */ DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c cVar, com.kwad.framework.filedownloader.d.b bVar, y yVar, int i, int i2, boolean z, boolean z2, int i3, byte b) {
        this(cVar, bVar, yVar, i, i2, z, z2, i3);
    }

    private void a(int i, List<com.kwad.framework.filedownloader.d.a> list) {
        if (i <= 1 || list.size() != i) {
            throw new IllegalArgumentException();
        }
        b(list, this.acI.getTotal());
    }

    private void a(long j, String str) {
        com.kwad.framework.filedownloader.e.a aVar = null;
        if (j != -1) {
            try {
                aVar = com.kwad.framework.filedownloader.f.f.bw(this.acI.uH());
                long length = new File(str).length();
                long j2 = j - length;
                long availableBytes = h.getAvailableBytes(str);
                if (availableBytes < j2) {
                    throw new FileDownloadOutOfSpaceException(availableBytes, j2, length);
                }
                if (!com.kwad.framework.filedownloader.f.e.vR().afa) {
                    aVar.setLength(j);
                }
            } finally {
                if (0 != 0) {
                    aVar.close();
                }
            }
        }
    }

    private void a(com.kwad.framework.filedownloader.download.a aVar, com.kwad.framework.filedownloader.a.b bVar) {
        if (!this.acV) {
            this.acI.L(0L);
            aVar = new com.kwad.framework.filedownloader.download.a(0L, 0L, aVar.acy, aVar.contentLength);
        }
        e.a aVar2 = new e.a();
        aVar2.b(this).br(this.acI.getId()).bq(-1).aY(this.acL).d(bVar).c(aVar).bh(this.acI.uH());
        this.acI.by(1);
        this.acD.q(this.acI.getId(), 1);
        this.acR = aVar2.uW();
        if (!this.kW) {
            this.acR.run();
            return;
        }
        this.acI.d((byte) -2);
        this.acR.pause();
    }

    private void a(Map<String, List<String>> map, ConnectTask connectTask, com.kwad.framework.filedownloader.a.b bVar) {
        int id = this.acI.getId();
        int responseCode = bVar.getResponseCode();
        this.acV = responseCode == 206 || responseCode == 1;
        boolean z = responseCode == 200 || responseCode == 201 || responseCode == 0;
        String vq = this.acI.vq();
        String a2 = com.kwad.framework.filedownloader.f.f.a(id, bVar);
        if (!(responseCode == 412 || !(vq == null || vq.equals(a2) || (!z && !this.acV)) || ((responseCode == 201 && connectTask.uo()) || (responseCode == 416 && this.acI.vp() > 0)))) {
            this.ada = connectTask.up();
            if (!this.acV && !z) {
                throw new FileDownloadHttpException(responseCode, map, bVar.ui());
            }
            long b = com.kwad.framework.filedownloader.f.f.b(id, bVar);
            String a3 = this.acI.sW() ? com.kwad.framework.filedownloader.f.f.a(bVar, this.acI.getUrl()) : null;
            boolean z2 = b == -1;
            this.acW = z2;
            this.acG.a(this.acU && this.acV, !z2 ? this.acI.vp() + b : b, a2, a3);
            return;
        }
        if (this.acU) {
            com.kwad.framework.filedownloader.f.d.d(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response requestHttpCode is %d", Integer.valueOf(id), vq, a2, Integer.valueOf(responseCode));
        }
        this.acD.bh(this.acI.getId());
        com.kwad.framework.filedownloader.f.f.s(this.acI.getTargetFilePath(), this.acI.uH());
        this.acU = false;
        if (vq != 0 && vq.equals(a2)) {
            com.kwad.framework.filedownloader.f.d.d(this, "the old etag[%s] is the same to the new etag[%s], but the response status requestHttpCode is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", vq, a2, Integer.valueOf(responseCode), Integer.valueOf(id));
            a2 = null;
        }
        this.acI.L(0L);
        this.acI.N(0L);
        this.acI.bj(a2);
        this.acI.vt();
        this.acD.a(id, this.acI.vq(), this.acI.vp(), this.acI.getTotal(), this.acI.vs());
        throw new RetryDirectly();
    }

    private void b(long j, int i) {
        long j2 = j / i;
        int id = this.acI.getId();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j3 = 0;
        while (i2 < i) {
            long j4 = i2 == i + (-1) ? 0L : (j3 + j2) - 1;
            com.kwad.framework.filedownloader.d.a aVar = new com.kwad.framework.filedownloader.d.a();
            aVar.setId(id);
            aVar.setIndex(i2);
            aVar.setStartOffset(j3);
            aVar.J(j3);
            aVar.K(j4);
            arrayList.add(aVar);
            this.acD.a(aVar);
            j3 += j2;
            i2++;
        }
        this.acI.by(i);
        this.acD.q(id, i);
        b(arrayList, j);
    }

    private void b(List<com.kwad.framework.filedownloader.d.a> list, long j) {
        int id = this.acI.getId();
        String vq = this.acI.vq();
        String str = this.ada;
        if (str == null) {
            str = this.acI.getUrl();
        }
        String uH = this.acI.uH();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(id), Long.valueOf(j));
        }
        boolean z = this.acU;
        long j2 = 0;
        long j3 = 0;
        for (com.kwad.framework.filedownloader.d.a aVar : list) {
            long vl = aVar.vm() == j2 ? j - aVar.vl() : (aVar.vm() - aVar.vl()) + 1;
            j3 += aVar.vl() - aVar.getStartOffset();
            if (vl != j2) {
                c uJ = new c.a().bo(id).d(Integer.valueOf(aVar.getIndex())).a(this).be(str).bf(z ? vq : null).c(this.acJ).aW(this.acL).b(new com.kwad.framework.filedownloader.download.a(aVar.getStartOffset(), aVar.vl(), aVar.vm(), vl)).bg(uH).uJ();
                if (com.kwad.framework.filedownloader.f.d.aeU) {
                    com.kwad.framework.filedownloader.f.d.c(this, "enable multiple connection: %s", aVar);
                }
                this.acQ.add(uJ);
            } else if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.getId()), Integer.valueOf(aVar.getIndex()));
            }
            j2 = 0;
        }
        if (j3 != this.acI.vp()) {
            com.kwad.framework.filedownloader.f.d.d(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.acI.vp()), Long.valueOf(j3));
            this.acI.L(j3);
        }
        ArrayList arrayList = new ArrayList(this.acQ.size());
        Iterator<c> it = this.acQ.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (this.kW) {
                next.pause();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.kW) {
            this.acI.d((byte) -2);
            return;
        }
        List<Future> invokeAll = acT.invokeAll(arrayList);
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            for (Future future : invokeAll) {
                com.kwad.framework.filedownloader.f.d.c(this, "finish sub-task for [%d] %B %B", Integer.valueOf(id), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.kwad.framework.filedownloader.download.a n(java.util.List<com.kwad.framework.filedownloader.d.a> r21) {
        /*
            r20 = this;
            r0 = r20
            com.kwad.framework.filedownloader.d.c r1 = r0.acI
            int r1 = r1.vs()
            com.kwad.framework.filedownloader.d.c r2 = r0.acI
            java.lang.String r2 = r2.uH()
            com.kwad.framework.filedownloader.d.c r3 = r0.acI
            java.lang.String r3 = r3.getTargetFilePath()
            r4 = 0
            r5 = 1
            if (r1 <= r5) goto L1a
            r6 = r5
            goto L1b
        L1a:
            r6 = r4
        L1b:
            r7 = 0
            if (r6 == 0) goto L23
            boolean r9 = r0.acP
            if (r9 == 0) goto L54
        L23:
            com.kwad.framework.filedownloader.d.c r9 = r0.acI
            int r9 = r9.getId()
            com.kwad.framework.filedownloader.d.c r10 = r0.acI
            boolean r9 = com.kwad.framework.filedownloader.f.f.b(r9, r10)
            if (r9 == 0) goto L54
            boolean r9 = r0.acP
            if (r9 != 0) goto L40
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            long r9 = r1.length()
        L3e:
            r14 = r9
            goto L55
        L40:
            if (r6 == 0) goto L4d
            int r6 = r21.size()
            if (r1 != r6) goto L54
            long r9 = com.kwad.framework.filedownloader.d.a.o(r21)
            goto L3e
        L4d:
            com.kwad.framework.filedownloader.d.c r1 = r0.acI
            long r9 = r1.vp()
            goto L3e
        L54:
            r14 = r7
        L55:
            com.kwad.framework.filedownloader.d.c r1 = r0.acI
            r1.L(r14)
            int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r1 <= 0) goto L5f
            r4 = r5
        L5f:
            r0.acU = r4
            if (r4 != 0) goto L71
            com.kwad.framework.filedownloader.b.a r1 = r0.acD
            com.kwad.framework.filedownloader.d.c r4 = r0.acI
            int r4 = r4.getId()
            r1.bh(r4)
            com.kwad.framework.filedownloader.f.f.s(r3, r2)
        L71:
            com.kwad.framework.filedownloader.download.a r1 = new com.kwad.framework.filedownloader.download.a
            r12 = 0
            r16 = 0
            com.kwad.framework.filedownloader.d.c r2 = r0.acI
            long r2 = r2.getTotal()
            long r18 = r2 - r14
            r11 = r1
            r11.<init>(r12, r14, r16, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.n(java.util.List):com.kwad.framework.filedownloader.download.a");
    }

    private boolean uD() {
        return (!this.acU || this.acI.vs() > 1) && this.acV && this.acP && !this.acW;
    }

    private void uF() {
        if (this.acL && !com.kwad.framework.filedownloader.f.f.bu(g.b)) {
            throw new FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.acI.getId()), g.b));
        }
        if (this.acL && com.kwad.framework.filedownloader.f.f.vW()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    private void uG() {
        int id = this.acI.getId();
        if (this.acI.sW()) {
            String targetFilePath = this.acI.getTargetFilePath();
            int r = com.kwad.framework.filedownloader.f.f.r(this.acI.getUrl(), targetFilePath);
            if (com.kwad.framework.filedownloader.f.c.a(id, targetFilePath, this.acK, false)) {
                this.acD.bi(id);
                this.acD.bh(id);
                throw new DiscardSafely();
            }
            com.kwad.framework.filedownloader.d.c bf = this.acD.bf(r);
            if (bf != null) {
                if (com.kwad.framework.filedownloader.f.c.a(id, bf, this.acM, false)) {
                    this.acD.bi(id);
                    this.acD.bh(id);
                    throw new DiscardSafely();
                }
                List<com.kwad.framework.filedownloader.d.a> bg = this.acD.bg(r);
                this.acD.bi(r);
                this.acD.bh(r);
                com.kwad.framework.filedownloader.f.f.by(this.acI.getTargetFilePath());
                if (com.kwad.framework.filedownloader.f.f.b(r, bf)) {
                    this.acI.L(bf.vp());
                    this.acI.N(bf.getTotal());
                    this.acI.bj(bf.vq());
                    this.acI.by(bf.vs());
                    this.acD.b(this.acI);
                    if (bg != null) {
                        for (com.kwad.framework.filedownloader.d.a aVar : bg) {
                            aVar.setId(id);
                            this.acD.a(aVar);
                        }
                    }
                    throw new RetryDirectly();
                }
            }
            if (com.kwad.framework.filedownloader.f.c.a(id, this.acI.vp(), this.acI.uH(), targetFilePath, this.acM)) {
                this.acD.bi(id);
                this.acD.bh(id);
                throw new DiscardSafely();
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(c cVar, long j, long j2) {
        if (this.kW) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.acI.getId()));
                return;
            }
            return;
        }
        int i = cVar == null ? -1 : cVar.adn;
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.acI.getTotal()));
        }
        if (!this.acS) {
            synchronized (this.acQ) {
                this.acQ.remove(cVar);
            }
        } else if (j == 0 || j2 == this.acI.getTotal()) {
        } else {
            com.kwad.framework.filedownloader.f.d.a(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.acI.getTotal()), Integer.valueOf(this.acI.getId()));
        }
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(Exception exc, long j) {
        if (this.kW) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.acI.getId()));
                return;
            }
            return;
        }
        int i = this.acO;
        int i2 = i - 1;
        this.acO = i2;
        if (i < 0) {
            com.kwad.framework.filedownloader.f.d.a(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i2), Integer.valueOf(this.acI.getId()));
        }
        this.acG.a(exc, this.acO, j);
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final boolean a(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.acS && code == 416 && !this.acN) {
                com.kwad.framework.filedownloader.f.f.s(this.acI.getTargetFilePath(), this.acI.uH());
                this.acN = true;
                return true;
            }
        }
        return this.acO > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void b(Exception exc) {
        this.acY = true;
        this.acZ = exc;
        if (this.kW) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.acI.getId()));
                return;
            }
            return;
        }
        Iterator it = ((ArrayList) this.acQ.clone()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.tP();
            }
        }
    }

    public final int getId() {
        return this.acI.getId();
    }

    public final boolean isAlive() {
        return this.acX.get() || this.acG.isAlive();
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void onProgress(long j) {
        if (this.kW) {
            return;
        }
        this.acG.onProgress(j);
    }

    public final void pause() {
        this.kW = true;
        e eVar = this.acR;
        if (eVar != null) {
            eVar.pause();
        }
        Iterator it = ((ArrayList) this.acQ.clone()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.pause();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e7, code lost:
        if (r9 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
        r9.uj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0201, code lost:
        throw new java.lang.IllegalAccessException(com.kwad.framework.filedownloader.f.f.b("invalid connection count %d, the connection count must be larger than 0", r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (com.kwad.framework.filedownloader.f.d.aeU == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        com.kwad.framework.filedownloader.f.d.c(r19, "High concurrent cause, start runnable but already paused %d", java.lang.Integer.valueOf(r19.acI.getId()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r19.acG.uK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if (r19.kW == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r19.acY == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r19.acG.uP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
        if (r19.kW == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
        r19.acI.d((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
        r9.uj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
        r19.acG.uK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
        if (r19.kW == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
        if (r19.acY == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
        r19.acG.uP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
        uG();
        r14 = r19.acI.getTotal();
        a(r14, r19.acI.uH());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
        if (uD() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
        if (r19.acU == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
        r10 = r19.acI.vs();
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
        r17 = r14;
        r10 = com.kwad.framework.filedownloader.download.b.us().a(r19.acI.getId(), r19.acI.getUrl(), r19.acI.getPath(), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018d, code lost:
        r17 = r14;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
        if (r10 <= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
        if (r19.kW == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
        r19.acI.d((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019b, code lost:
        if (r9 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
        r9.uj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a0, code lost:
        r19.acG.uK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
        if (r19.kW == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
        if (r19.acY == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
        r19.acG.uP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b9, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
        if (r10 != 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01be, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
        r19.acS = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
        if (r11 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c5, code lost:
        a(r8.uq(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
        if (r9 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r9.uj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
        r19.acG.uN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01db, code lost:
        if (r19.acU == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
        a(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
        b(r17, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e6, code lost:
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0262 A[Catch: all -> 0x021d, TryCatch #26 {all -> 0x021d, blocks: (B:46:0x00cf, B:95:0x01d4, B:97:0x01dd, B:98:0x01e1, B:131:0x0220, B:160:0x025c, B:162:0x0262, B:165:0x026a), top: B:209:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0275 A[Catch: all -> 0x0295, TryCatch #24 {all -> 0x0295, blocks: (B:3:0x0005, B:6:0x0014, B:8:0x001c, B:10:0x0020, B:11:0x0032, B:25:0x0090, B:27:0x0094, B:28:0x0099, B:30:0x009d, B:32:0x00a1, B:43:0x00ca, B:51:0x0129, B:74:0x019d, B:101:0x01e9, B:169:0x0275, B:170:0x0278, B:133:0x0228, B:135:0x022f, B:167:0x026f), top: B:208:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x026a A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.run():void");
    }

    public final void uC() {
        if (this.acI.vs() > 1) {
            List<com.kwad.framework.filedownloader.d.a> bg = this.acD.bg(this.acI.getId());
            if (this.acI.vs() == bg.size()) {
                this.acI.L(com.kwad.framework.filedownloader.d.a.o(bg));
            } else {
                this.acI.L(0L);
                this.acD.bh(this.acI.getId());
            }
        }
        this.acG.uL();
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void uE() {
        this.acD.c(this.acI.getId(), this.acI.vp());
    }

    public final String uH() {
        return this.acI.uH();
    }
}
