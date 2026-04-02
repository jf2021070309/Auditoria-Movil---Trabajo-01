package com.kwad.framework.filedownloader.download;

import android.os.Process;
import com.kwad.framework.filedownloader.download.ConnectTask;
import com.kwad.framework.filedownloader.download.e;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import java.io.IOException;
import java.net.SocketException;
/* loaded from: classes.dex */
public final class c implements Runnable {
    private final String Tv;
    private final boolean acL;
    private final int aco;
    private final ConnectTask adk;
    private final f adl;
    private e adm;
    final int adn;
    private volatile boolean kW;

    /* loaded from: classes.dex */
    public static class a {
        private String Tv;
        private Boolean adi;
        private f adl;
        private final ConnectTask.a ado = new ConnectTask.a();
        private Integer adp;

        public final a a(f fVar) {
            this.adl = fVar;
            return this;
        }

        public final a aW(boolean z) {
            this.adi = Boolean.valueOf(z);
            return this;
        }

        public final a b(com.kwad.framework.filedownloader.download.a aVar) {
            this.ado.a(aVar);
            return this;
        }

        public final a be(String str) {
            this.ado.bb(str);
            return this;
        }

        public final a bf(String str) {
            this.ado.bc(str);
            return this;
        }

        public final a bg(String str) {
            this.Tv = str;
            return this;
        }

        public final a bo(int i) {
            this.ado.bn(i);
            return this;
        }

        public final a c(com.kwad.framework.filedownloader.d.b bVar) {
            this.ado.a(bVar);
            return this;
        }

        public final a d(Integer num) {
            this.adp = num;
            return this;
        }

        public final c uJ() {
            if (this.adl == null || this.Tv == null || this.adi == null || this.adp == null) {
                throw new IllegalArgumentException(com.kwad.framework.filedownloader.f.f.b("%s %s %B", this.adl, this.Tv, this.adi));
            }
            ConnectTask ur = this.ado.ur();
            return new c(ur.aco, this.adp.intValue(), ur, this.adl, this.adi.booleanValue(), this.Tv, (byte) 0);
        }
    }

    private c(int i, int i2, ConnectTask connectTask, f fVar, boolean z, String str) {
        this.aco = i;
        this.adn = i2;
        this.kW = false;
        this.adl = fVar;
        this.Tv = str;
        this.adk = connectTask;
        this.acL = z;
    }

    /* synthetic */ c(int i, int i2, ConnectTask connectTask, f fVar, boolean z, String str, byte b) {
        this(i, i2, connectTask, fVar, z, str);
    }

    public final void pause() {
        this.kW = true;
        e eVar = this.adm;
        if (eVar != null) {
            eVar.pause();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Exception e;
        Process.setThreadPriority(10);
        long j = this.adk.uq().acx;
        com.kwad.framework.filedownloader.a.b bVar = null;
        boolean z2 = false;
        while (!this.kW) {
            try {
                try {
                    bVar = this.adk.un();
                    int responseCode = bVar.getResponseCode();
                    if (com.kwad.framework.filedownloader.f.d.aeU) {
                        com.kwad.framework.filedownloader.f.d.c(this, "the connection[%d] for %d, is connected %s with requestHttpCode[%d]", Integer.valueOf(this.adn), Integer.valueOf(this.aco), this.adk.uq(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(com.kwad.framework.filedownloader.f.f.b("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.adk.getRequestHeader(), bVar.ui(), Integer.valueOf(responseCode), Integer.valueOf(this.aco), Integer.valueOf(this.adn)));
                        break;
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    e.a aVar = new e.a();
                    if (this.kW) {
                        if (bVar != null) {
                            bVar.uj();
                            return;
                        }
                        return;
                    }
                    e uW = aVar.br(this.aco).bq(this.adn).b(this.adl).a(this).aY(this.acL).d(bVar).c(this.adk.uq()).bh(this.Tv).uW();
                    this.adm = uW;
                    uW.run();
                    if (this.kW) {
                        this.adm.pause();
                    }
                    if (bVar != null) {
                        return;
                    }
                    return;
                } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e3) {
                    e = e3;
                    z = true;
                    try {
                        if (!this.adl.a(e)) {
                            this.adl.b(e);
                            if (bVar != null) {
                                bVar.uj();
                                return;
                            }
                            return;
                        }
                        if (z) {
                            e eVar = this.adm;
                            if (eVar == null) {
                                com.kwad.framework.filedownloader.f.d.d(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e);
                                this.adl.b(e);
                                if (bVar != null) {
                                    bVar.uj();
                                    return;
                                }
                                return;
                            }
                            this.adl.a(e, eVar.acx - j);
                        } else {
                            this.adl.a(e, 0L);
                        }
                        if (bVar != null) {
                            bVar.uj();
                        }
                        z2 = z;
                    } finally {
                        if (bVar != null) {
                            bVar.uj();
                        }
                    }
                }
            } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e4) {
                z = z2;
                e = e4;
            }
        }
        if (bVar != null) {
            bVar.uj();
        }
    }

    public final void tP() {
        pause();
    }
}
