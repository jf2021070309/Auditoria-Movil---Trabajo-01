package com.ss.android.downloadlib.addownload;

import android.os.Handler;
import com.ss.android.downloadlib.addownload.q;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.IFetchHttpHeadInfoListener;
import com.ss.android.socialbase.downloader.network.connectionpool.DownloadPreconnecter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g {
    private Handler dr;
    private com.ss.android.downloadlib.addownload.ge.q ge;
    private AtomicBoolean o = new AtomicBoolean(false);
    private AtomicBoolean g = new AtomicBoolean(false);

    static /* synthetic */ long o() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Handler handler) {
        this.dr = handler;
    }

    public void dr(com.ss.android.downloadlib.addownload.ge.q qVar) {
        this.ge = qVar;
    }

    public boolean dr() {
        return this.g.get();
    }

    public void dr(boolean z) {
        this.g.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(final int i, final long j, long j2, final q.dr drVar) {
        com.ss.android.downloadad.api.dr.ge geVar;
        this.g.set(false);
        if (drVar == null) {
            return;
        }
        if (!com.ss.android.downloadlib.rb.q.bn(i) || !com.ss.android.downloadlib.rb.q.q(i)) {
            drVar.dr();
            return;
        }
        long o = com.ss.android.downloadlib.rb.q.o(i);
        this.o.set(false);
        final String downloadUrl = this.ge.ge.getDownloadUrl();
        com.ss.android.downloadad.api.dr.ge ge = com.ss.android.downloadlib.addownload.ge.bn.dr().ge(downloadUrl);
        if (ge != null) {
            geVar = ge;
        } else {
            com.ss.android.downloadad.api.dr.ge geVar2 = new com.ss.android.downloadad.api.dr.ge(this.ge.ge, this.ge.o, this.ge.g, 0);
            com.ss.android.downloadlib.addownload.ge.bn.dr().dr(geVar2);
            geVar = geVar2;
        }
        geVar.q(false);
        if (wb.yk() != null) {
            wb.yk().dr(geVar.ge());
        }
        com.ss.android.downloadlib.addownload.o.g.dr().dr(geVar.dr());
        boolean g = com.ss.android.downloadlib.rb.q.g(i);
        if (j2 > 0) {
            dr(i, downloadUrl, j2, geVar, j, drVar);
        } else if (g) {
            final com.ss.android.downloadad.api.dr.ge geVar3 = geVar;
            dr(downloadUrl, geVar, new q.ge() { // from class: com.ss.android.downloadlib.addownload.g.1
                @Override // com.ss.android.downloadlib.addownload.q.ge
                public void dr(long j3) {
                    g.this.dr(i, downloadUrl, j3, geVar3, j, drVar);
                }
            });
        } else {
            o = 0;
        }
        this.dr.postDelayed(new Runnable() { // from class: com.ss.android.downloadlib.addownload.g.2
            @Override // java.lang.Runnable
            public void run() {
                if (!g.this.o.get()) {
                    g.this.o.set(true);
                    drVar.dr();
                }
            }
        }, o);
    }

    private void dr(String str, com.ss.android.downloadad.api.dr.ge geVar, final q.ge geVar2) {
        if (geVar2 == null) {
            return;
        }
        DownloadPreconnecter.asyncFetchHttpHeadInfo(str, new IFetchHttpHeadInfoListener() { // from class: com.ss.android.downloadlib.addownload.g.3
            @Override // com.ss.android.socialbase.downloader.network.IFetchHttpHeadInfoListener
            public void onFetchFinished(Map<String, String> map) {
                if (!g.this.o.get()) {
                    g.this.o.set(true);
                    long dr = g.this.dr(map);
                    if (dr > 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("apk_size", Long.valueOf(dr));
                            jSONObject.putOpt("available_space", Long.valueOf(g.o()));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    geVar2.dr(dr);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long dr(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return 0L;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if ("content-length".equalsIgnoreCase(entry.getKey())) {
                    return Long.parseLong(value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(int i, String str, long j, final com.ss.android.downloadad.api.dr.ge geVar, long j2, final q.dr drVar) {
        this.o.set(true);
        boolean z = false;
        if (j > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("apk_size", Long.valueOf(j));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            long longValue = (Double.valueOf((com.ss.android.downloadlib.rb.q.dr(i) + 1.0d) * j).longValue() + com.ss.android.downloadlib.rb.q.ge(i)) - j2;
            long g = g();
            if (g < longValue) {
                dr(geVar, jSONObject, longValue, g);
                dr(geVar);
                long g2 = g();
                if (g2 < longValue) {
                    geVar.g(true);
                    final String dr = geVar.dr();
                    com.ss.android.downloadlib.addownload.o.g.dr().dr(dr, new com.ss.android.downloadlib.addownload.o.q() { // from class: com.ss.android.downloadlib.addownload.g.4
                    });
                    z = dr(i, geVar, str, longValue);
                    if (z) {
                        geVar.q(true);
                    }
                } else {
                    ge(geVar, jSONObject, g, g2);
                }
            }
        }
        if (!z) {
            this.dr.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.g.5
                @Override // java.lang.Runnable
                public void run() {
                    drVar.dr();
                }
            });
        }
    }

    private boolean dr(int i, com.ss.android.downloadad.api.dr.ge geVar, String str, long j) {
        if (com.ss.android.downloadlib.rb.q.bn(i)) {
            if (wb.yk() != null) {
                return wb.yk().dr(i, str, true, j);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("show_dialog_result", 3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("cleanspace_window_show", jSONObject, geVar);
            return false;
        }
        return false;
    }

    public static boolean dr(final DownloadInfo downloadInfo, long j) {
        int id = downloadInfo.getId();
        boolean z = false;
        if (com.ss.android.downloadlib.rb.q.bn(id)) {
            if (wb.yk() != null && (z = wb.yk().dr(id, downloadInfo.getUrl(), false, j))) {
                com.ss.android.downloadlib.addownload.o.g.dr().dr(downloadInfo.getUrl(), new com.ss.android.downloadlib.addownload.o.q() { // from class: com.ss.android.downloadlib.addownload.g.6
                });
            }
            return z;
        }
        return false;
    }

    public static JSONObject dr(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("clean_space_install_params", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static void dr(int i) {
        if (com.ss.android.downloadlib.rb.q.bn(i) && wb.yk() != null && wb.yk().ge()) {
            wb.yk().o();
        }
    }

    public static long ge() {
        if (wb.yk() != null) {
            return wb.yk().dr();
        }
        return 0L;
    }

    private static void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        long g = g();
        if (wb.yk() != null) {
            wb.yk().q();
        }
        com.ss.android.downloadlib.addownload.o.o.dr();
        com.ss.android.downloadlib.addownload.o.o.ge();
        if (com.ss.android.downloadlib.rb.q.rb(geVar.i())) {
            com.ss.android.downloadlib.addownload.o.o.dr(wb.getContext());
        }
        long g2 = g();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(g2 - g));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("clean_quite_finish", jSONObject, geVar);
    }

    private static long g() {
        return com.ss.android.downloadlib.rb.yk.dr(0L);
    }

    private void dr(com.ss.android.downloadad.api.dr.ge geVar, JSONObject jSONObject, long j, long j2) {
        try {
            jSONObject.putOpt("available_space", Long.valueOf(j2));
            jSONObject.putOpt("apk_download_need_size", Long.valueOf(j));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("clean_space_no_enough_for_download", jSONObject, geVar);
    }

    private void ge(com.ss.android.downloadad.api.dr.ge geVar, JSONObject jSONObject, long j, long j2) {
        geVar.yk("1");
        com.ss.android.downloadlib.addownload.ge.ll.dr().dr(geVar);
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(j2 - j));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("cleanspace_download_after_quite_clean", jSONObject, geVar);
    }
}
