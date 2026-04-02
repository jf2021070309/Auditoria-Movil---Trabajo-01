package com.kwad.library.solder.lib.a;

import android.text.TextUtils;
import com.kwad.library.solder.lib.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class e<P extends a> {
    protected String afA;
    protected d afQ;
    protected int agh;
    protected String agj;
    protected String agk;
    protected boolean agl;
    protected P agm;
    protected com.kwad.library.solder.lib.ext.b agn;
    protected Throwable ago;
    protected String agp;
    protected boolean agq;
    protected long agr;
    protected String ags;
    protected List<com.kwad.library.solder.lib.c.a> agt;
    protected com.kwad.library.solder.lib.c.b agu;
    protected String mDownloadUrl;
    protected String mVersion;
    protected int mState = -1;
    protected int agg = 0;
    private final byte[] agd = new byte[0];
    protected StringBuffer agi = new StringBuffer(String.valueOf(-1));

    public e(com.kwad.library.solder.lib.c.b bVar) {
        this.agu = bVar;
        this.afA = bVar.agJ;
        this.mVersion = bVar.version;
        this.ags = bVar.agM;
        this.agq = bVar.agq;
        this.agp = bVar.agp;
        this.agr = bVar.agL;
        this.mDownloadUrl = bVar.agK;
    }

    private List<com.kwad.library.solder.lib.c.a> c(String str, String str2, String str3) {
        String[] list;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(this.afQ.wf().bB(str));
            if (file.exists() && (list = file.list()) != null && list.length != 0) {
                for (String str4 : list) {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str2) || !str2.equals(str4) || !this.afQ.wf().b(str, str4, str3)) {
                        this.afQ.wf().u(str, str4);
                    } else {
                        com.kwad.library.solder.lib.c.a aVar = new com.kwad.library.solder.lib.c.a();
                        aVar.agJ = str;
                        aVar.version = str4;
                        aVar.qF = true;
                        arrayList.add(aVar);
                    }
                }
                Collections.sort(arrayList);
            }
        }
        return arrayList;
    }

    public final e a(d dVar) {
        this.afQ = dVar;
        return this;
    }

    public final void a(com.kwad.library.solder.lib.ext.b bVar) {
        this.agn = bVar;
    }

    public final void bE(String str) {
        this.mVersion = str;
    }

    public final e bH(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.agi;
            stringBuffer.append(" --> ");
            stringBuffer.append(str);
        }
        return this;
    }

    public final e bI(int i) {
        synchronized (this.agd) {
            this.mState = i;
        }
        return bH(String.valueOf(i));
    }

    public final void bI(String str) {
        this.agj = str;
    }

    public final void bJ(int i) {
        if (i > 0) {
            this.agh = i;
        }
    }

    public final void bJ(String str) {
        this.agk = str;
    }

    public abstract P bK(String str);

    public final void c(P p) {
        this.agm = p;
    }

    public final void cancel() {
        synchronized (this.agd) {
            bI(0);
        }
    }

    public final String getDownloadUrl() {
        return this.mDownloadUrl;
    }

    public final int getState() {
        int i;
        synchronized (this.agd) {
            i = this.mState;
        }
        return i;
    }

    public final String getVersion() {
        return this.mVersion;
    }

    public final boolean isCanceled() {
        return this.mState == 0;
    }

    public final e j(Throwable th) {
        this.ago = th;
        return bH(th.getLocalizedMessage());
    }

    public String toString() {
        return "PluginRequest{mId='" + this.afA + "'}";
    }

    public final String wA() {
        return this.ags;
    }

    public final com.kwad.library.solder.lib.c.b wB() {
        return this.agu;
    }

    public final List<com.kwad.library.solder.lib.c.a> wC() {
        String wt = wt();
        if (!TextUtils.isEmpty(wt) && this.agt == null) {
            this.agt = c(wt, getVersion(), wA());
        }
        return this.agt;
    }

    public final d wp() {
        return this.afQ;
    }

    public final String wq() {
        return this.agi.toString();
    }

    public final Throwable wr() {
        return this.ago;
    }

    public final boolean ws() {
        bI(-1);
        this.agt = null;
        int i = this.agg + 1;
        this.agg = i;
        return i <= this.agh;
    }

    public final String wt() {
        return this.afA;
    }

    public final boolean wu() {
        return this.agl;
    }

    public final int wv() {
        return this.agg;
    }

    public final String ww() {
        return !TextUtils.isEmpty(this.agj) ? this.agj : this.agk;
    }

    public final com.kwad.library.solder.lib.ext.b wx() {
        return this.agn;
    }

    public final boolean wy() {
        return this.agq;
    }

    public final String wz() {
        return this.agp;
    }
}
