package com.ss.android.downloadlib.addownload.ge;

import android.content.SharedPreferences;
import com.ss.android.downloadlib.addownload.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ll {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static ll dr = new ll();
    }

    public static ll dr() {
        return dr.dr;
    }

    private ll() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences o() {
        return wb.getContext().getSharedPreferences("sp_ad_download_event", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> ge() {
        ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String, ?> all = o().getAll();
        if (all == null) {
            return concurrentHashMap;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    long longValue = Long.valueOf(entry.getKey()).longValue();
                    com.ss.android.downloadad.api.dr.ge ge = com.ss.android.downloadad.api.dr.ge.ge(new JSONObject(String.valueOf(entry.getValue())));
                    if (longValue > 0 && ge != null) {
                        concurrentHashMap.put(Long.valueOf(longValue), ge);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return concurrentHashMap;
    }

    public void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(geVar);
        dr((Collection<com.ss.android.downloadad.api.dr.ge>) arrayList);
    }

    public synchronized void dr(final Collection<com.ss.android.downloadad.api.dr.ge> collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.addownload.ge.ll.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SharedPreferences.Editor edit = ll.this.o().edit();
                        for (com.ss.android.downloadad.api.dr.ge geVar : collection) {
                            if (geVar != null && geVar.ge() != 0) {
                                edit.putString(String.valueOf(geVar.ge()), geVar.vv().toString());
                            }
                        }
                        edit.apply();
                    }
                }, true);
            }
        }
    }

    public void dr(final List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.addownload.ge.ll.2
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor edit = ll.this.o().edit();
                for (String str : list) {
                    edit.remove(str);
                }
                edit.apply();
            }
        }, true);
    }
}
