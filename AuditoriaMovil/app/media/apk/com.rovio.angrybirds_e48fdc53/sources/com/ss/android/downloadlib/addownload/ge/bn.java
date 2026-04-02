package com.ss.android.downloadlib.addownload.ge;

import android.text.TextUtils;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class bn {
    private volatile boolean dr;
    private final ConcurrentHashMap<Long, DownloadController> g;
    private final ConcurrentHashMap<Long, DownloadModel> ge;
    private final ConcurrentHashMap<Long, DownloadEventConfig> o;
    private final ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static bn dr = new bn();
    }

    public static bn dr() {
        return dr.dr;
    }

    private bn() {
        this.dr = false;
        this.ge = new ConcurrentHashMap<>();
        this.o = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.q = new ConcurrentHashMap<>();
    }

    public void ge() {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.addownload.ge.bn.1
            @Override // java.lang.Runnable
            public void run() {
                if (!bn.this.dr) {
                    synchronized (bn.class) {
                        if (!bn.this.dr) {
                            bn.this.q.putAll(ll.dr().ge());
                            bn.this.dr = true;
                        }
                    }
                }
            }
        }, true);
    }

    public void dr(DownloadModel downloadModel) {
        if (downloadModel != null) {
            this.ge.put(Long.valueOf(downloadModel.getId()), downloadModel);
            if (downloadModel.getDeepLink() != null) {
                downloadModel.getDeepLink().setId(downloadModel.getId());
                downloadModel.getDeepLink().setPackageName(downloadModel.getPackageName());
            }
        }
    }

    public void dr(long j, DownloadEventConfig downloadEventConfig) {
        if (downloadEventConfig != null) {
            this.o.put(Long.valueOf(j), downloadEventConfig);
        }
    }

    public void dr(long j, DownloadController downloadController) {
        if (downloadController != null) {
            this.g.put(Long.valueOf(j), downloadController);
        }
    }

    public synchronized void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return;
        }
        this.q.put(Long.valueOf(geVar.ge()), geVar);
        ll.dr().dr(geVar);
    }

    public DownloadModel dr(long j) {
        return this.ge.get(Long.valueOf(j));
    }

    public DownloadEventConfig ge(long j) {
        return this.o.get(Long.valueOf(j));
    }

    public DownloadController o(long j) {
        return this.g.get(Long.valueOf(j));
    }

    public com.ss.android.downloadad.api.dr.ge g(long j) {
        return this.q.get(Long.valueOf(j));
    }

    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> o() {
        return this.q;
    }

    public com.ss.android.downloadad.api.dr.ge dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.dr.ge geVar : this.q.values()) {
            if (geVar != null && str.equals(geVar.q())) {
                return geVar;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.dr.ge ge(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.dr.ge geVar : this.q.values()) {
            if (geVar != null && str.equals(geVar.dr())) {
                return geVar;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.dr.ge dr(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        for (com.ss.android.downloadad.api.dr.ge geVar : this.q.values()) {
            if (geVar != null && geVar.i() == downloadInfo.getId()) {
                return geVar;
            }
        }
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                long dr2 = yk.dr(new JSONObject(downloadInfo.getExtra()), "extra");
                if (dr2 != 0) {
                    for (com.ss.android.downloadad.api.dr.ge geVar2 : this.q.values()) {
                        if (geVar2 != null && geVar2.ge() == dr2) {
                            return geVar2;
                        }
                    }
                    com.ss.android.downloadlib.q.o.dr().dr("getNativeModelByInfo");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (com.ss.android.downloadad.api.dr.ge geVar3 : this.q.values()) {
            if (geVar3 != null && TextUtils.equals(geVar3.dr(), downloadInfo.getUrl())) {
                return geVar3;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.dr.ge dr(int i) {
        for (com.ss.android.downloadad.api.dr.ge geVar : this.q.values()) {
            if (geVar != null && geVar.i() == i) {
                return geVar;
            }
        }
        return null;
    }

    public q q(long j) {
        q qVar = new q();
        qVar.dr = j;
        qVar.ge = dr(j);
        qVar.o = ge(j);
        if (qVar.o == null) {
            qVar.o = new com.ss.android.download.api.download.o();
        }
        qVar.g = o(j);
        if (qVar.g == null) {
            qVar.g = new com.ss.android.download.api.download.ge();
        }
        return qVar;
    }

    public void bn(long j) {
        this.ge.remove(Long.valueOf(j));
        this.o.remove(Long.valueOf(j));
        this.g.remove(Long.valueOf(j));
    }

    public Map<Long, com.ss.android.downloadad.api.dr.ge> dr(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return hashMap;
        }
        for (com.ss.android.downloadad.api.dr.ge geVar : this.q.values()) {
            if (geVar != null && TextUtils.equals(geVar.dr(), str)) {
                geVar.ge(str2);
                hashMap.put(Long.valueOf(geVar.ge()), geVar);
            }
        }
        return hashMap;
    }

    public void ge(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        for (DownloadModel downloadModel : this.ge.values()) {
            if ((downloadModel instanceof AdDownloadModel) && TextUtils.equals(downloadModel.getDownloadUrl(), str)) {
                ((AdDownloadModel) downloadModel).setPackageName(str2);
            }
        }
    }

    public synchronized void dr(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            long longValue = l.longValue();
            arrayList.add(String.valueOf(longValue));
            this.q.remove(Long.valueOf(longValue));
        }
        ll.dr().dr((List<String>) arrayList);
    }
}
