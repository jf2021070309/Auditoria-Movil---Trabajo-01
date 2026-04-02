package com.kwad.framework.filedownloader.download;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ConnectTask {
    final int aco;
    final com.kwad.framework.filedownloader.d.b acp;
    private com.kwad.framework.filedownloader.download.a acq;
    private String acr;
    private Map<String, List<String>> acs;
    private List<String> act;
    final String url;

    /* loaded from: classes.dex */
    class Reconnect extends Throwable {
        private static final long serialVersionUID = 2940866805654257562L;

        Reconnect() {
        }
    }

    /* loaded from: classes.dex */
    static class a {
        private com.kwad.framework.filedownloader.d.b acp;
        private String acr;
        private Integer acu;
        private com.kwad.framework.filedownloader.download.a acv;
        private String url;

        public final a a(com.kwad.framework.filedownloader.d.b bVar) {
            this.acp = bVar;
            return this;
        }

        public final a a(com.kwad.framework.filedownloader.download.a aVar) {
            this.acv = aVar;
            return this;
        }

        public final a bb(String str) {
            this.url = str;
            return this;
        }

        public final a bc(String str) {
            this.acr = str;
            return this;
        }

        public final a bn(int i) {
            this.acu = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ConnectTask ur() {
            com.kwad.framework.filedownloader.download.a aVar;
            Integer num = this.acu;
            if (num == null || (aVar = this.acv) == null || this.url == null) {
                throw new IllegalArgumentException();
            }
            return new ConnectTask(aVar, num.intValue(), this.url, this.acr, this.acp, (byte) 0);
        }
    }

    private ConnectTask(com.kwad.framework.filedownloader.download.a aVar, int i, String str, String str2, com.kwad.framework.filedownloader.d.b bVar) {
        this.aco = i;
        this.url = str;
        this.acr = str2;
        this.acp = bVar;
        this.acq = aVar;
    }

    /* synthetic */ ConnectTask(com.kwad.framework.filedownloader.download.a aVar, int i, String str, String str2, com.kwad.framework.filedownloader.d.b bVar, byte b) {
        this(aVar, i, str, str2, bVar);
    }

    private void a(com.kwad.framework.filedownloader.a.b bVar) {
        HashMap<String, List<String>> vo;
        com.kwad.framework.filedownloader.d.b bVar2 = this.acp;
        if (bVar2 == null || (vo = bVar2.vo()) == null) {
            return;
        }
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.e(this, "%d add outside header: %s", Integer.valueOf(this.aco), vo);
        }
        for (Map.Entry<String, List<String>> entry : vo.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                for (String str : value) {
                    bVar.addHeader(key, str);
                }
            }
        }
    }

    private void b(com.kwad.framework.filedownloader.a.b bVar) {
        if (!TextUtils.isEmpty(this.acr)) {
            bVar.addHeader("If-Match", this.acr);
        }
        bVar.addHeader("Range", this.acq.acy == 0 ? com.kwad.framework.filedownloader.f.f.b("bytes=%d-", Long.valueOf(this.acq.acx)) : com.kwad.framework.filedownloader.f.f.b("bytes=%d-%d", Long.valueOf(this.acq.acx), Long.valueOf(this.acq.acy)));
    }

    private void c(com.kwad.framework.filedownloader.a.b bVar) {
        com.kwad.framework.filedownloader.d.b bVar2 = this.acp;
        if (bVar2 == null || bVar2.vo().get("User-Agent") == null) {
            bVar.addHeader("User-Agent", com.kwad.framework.filedownloader.f.f.vX());
        }
    }

    public final Map<String, List<String>> getRequestHeader() {
        return this.acs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.kwad.framework.filedownloader.a.b un() {
        com.kwad.framework.filedownloader.a.b bd = b.us().bd(this.url);
        a(bd);
        b(bd);
        c(bd);
        this.acs = bd.uh();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "%s request header %s", Integer.valueOf(this.aco), this.acs);
        }
        bd.execute();
        ArrayList arrayList = new ArrayList();
        this.act = arrayList;
        return com.kwad.framework.filedownloader.a.d.a(this.acs, bd, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uo() {
        return this.acq.acx > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String up() {
        List<String> list = this.act;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.act;
        return list2.get(list2.size() - 1);
    }

    public final com.kwad.framework.filedownloader.download.a uq() {
        return this.acq;
    }
}
