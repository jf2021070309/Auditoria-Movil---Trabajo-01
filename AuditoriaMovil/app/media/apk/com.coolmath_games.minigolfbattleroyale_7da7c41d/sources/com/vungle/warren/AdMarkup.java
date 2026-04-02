package com.vungle.warren;

import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class AdMarkup implements Serializable {
    private final String eventId;
    private final String[] impression;
    private final int version;

    private AdMarkup(String str, String[] strArr, int i) {
        this.eventId = str;
        this.impression = strArr;
        this.version = i;
    }

    public String getEventId() {
        return this.eventId;
    }

    public String[] getImpression() {
        return this.impression;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "AdMarkup{eventId='" + this.eventId + "', impression=" + Arrays.toString(this.impression) + ", version=" + this.version + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.eventId;
        String str2 = ((AdMarkup) obj).eventId;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.eventId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.vungle.warren.AdMarkup fromString(java.lang.String r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder     // Catch: com.google.gson.JsonSyntaxException -> L69
            r1.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L69
            com.google.gson.Gson r1 = r1.create()     // Catch: com.google.gson.JsonSyntaxException -> L69
            java.lang.Class<com.google.gson.JsonObject> r2 = com.google.gson.JsonObject.class
            java.lang.Object r5 = r1.fromJson(r5, r2)     // Catch: com.google.gson.JsonSyntaxException -> L69
            com.google.gson.JsonObject r5 = (com.google.gson.JsonObject) r5     // Catch: com.google.gson.JsonSyntaxException -> L69
            if (r5 != 0) goto L18
            return r0
        L18:
            java.lang.String r1 = "impression"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r5, r1)
            if (r2 == 0) goto L4b
            com.google.gson.JsonArray r1 = r5.getAsJsonArray(r1)
            boolean r2 = r1.isJsonArray()
            if (r2 == 0) goto L4b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.gson.JsonArray r1 = r1.getAsJsonArray()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
            java.lang.String r3 = r3.getAsString()
            r2.add(r3)
            goto L37
        L4b:
            r2 = r0
        L4c:
            com.vungle.warren.AdMarkup r1 = new com.vungle.warren.AdMarkup
            java.lang.String r3 = "event_id"
            java.lang.String r3 = com.vungle.warren.model.JsonUtil.getAsString(r5, r3, r0)
            r4 = 0
            if (r2 == 0) goto L5f
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L5f:
            java.lang.String r2 = "version"
            int r5 = com.vungle.warren.model.JsonUtil.getAsInt(r5, r2, r4)
            r1.<init>(r3, r0, r5)
            return r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdMarkup.fromString(java.lang.String):com.vungle.warren.AdMarkup");
    }
}
