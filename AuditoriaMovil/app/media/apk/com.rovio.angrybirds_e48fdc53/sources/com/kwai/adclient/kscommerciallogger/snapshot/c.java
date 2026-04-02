package com.kwai.adclient.kscommerciallogger.snapshot;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c {
    private final String aNP;
    private final LinkedList<d> aNQ;
    private int aNR;
    private final int aNS;
    private long aNT;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        this(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, int i) {
        this.aNP = str == null ? "" : str;
        this.aNQ = new LinkedList<>();
        this.aNS = Math.min(i, 30);
        this.aNT = System.currentTimeMillis();
    }

    public final synchronized long Li() {
        return this.aNT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.aNP.equals(((c) obj).aNP);
    }

    public synchronized d gc(String str) {
        d dVar;
        if (this.aNQ.size() >= this.aNS) {
            this.aNQ.removeFirst();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        int i = this.aNR;
        this.aNR = i + 1;
        sb.append(i);
        dVar = new d(sb.toString());
        this.aNQ.addLast(dVar);
        this.aNT = System.currentTimeMillis();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized JSONObject gd(String str) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<d> it = this.aNQ.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().Lh());
            }
            jSONObject.put("session_id", str);
            jSONObject.put("segment_name", this.aNP);
            jSONObject.put("spans", jSONArray);
            this.aNT = System.currentTimeMillis();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getName() {
        return this.aNP;
    }

    public int hashCode() {
        return Objects.hash(this.aNP);
    }
}
