package com.ellation.crunchyroll.presentation.search.recent;

import com.amazon.aps.iva.q30.b;
import com.amazon.aps.iva.x50.t;
import com.google.gson.JsonDeserializer;
import kotlin.Metadata;
/* compiled from: RecentSearchDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/search/recent/RecentSearchDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/amazon/aps/iva/q30/b;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RecentSearchDeserializer implements JsonDeserializer<b> {

    /* compiled from: RecentSearchDeserializer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.MUSIC_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.CONCERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.q30.b deserialize(com.google.gson.JsonElement r5, java.lang.reflect.Type r6, com.google.gson.JsonDeserializationContext r7) {
        /*
            r4 = this;
            java.lang.String r0 = "json"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "typeOfT"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            java.lang.String r6 = "context"
            com.amazon.aps.iva.yb0.j.f(r7, r6)
            com.google.gson.JsonObject r6 = r5.getAsJsonObject()
            java.lang.String r0 = "panel"
            boolean r6 = r6.has(r0)
            r1 = 0
            if (r6 == 0) goto L31
            com.google.gson.JsonObject r6 = r5.getAsJsonObject()
            if (r6 == 0) goto L27
            com.google.gson.JsonObject r6 = r6.getAsJsonObject(r0)
            goto L28
        L27:
            r6 = r1
        L28:
            java.lang.Class<com.ellation.crunchyroll.model.Panel> r0 = com.ellation.crunchyroll.model.Panel.class
            java.lang.Object r6 = r7.deserialize(r6, r0)
            com.ellation.crunchyroll.model.Panel r6 = (com.ellation.crunchyroll.model.Panel) r6
            goto L32
        L31:
            r6 = r1
        L32:
            com.google.gson.JsonObject r0 = r5.getAsJsonObject()
            java.lang.String r2 = "music_asset"
            boolean r0 = r0.has(r2)
            if (r0 != 0) goto L3f
            goto L7f
        L3f:
            com.google.gson.JsonObject r0 = r5.getAsJsonObject()
            if (r0 == 0) goto L4a
            com.google.gson.JsonObject r0 = r0.getAsJsonObject(r2)
            goto L4b
        L4a:
            r0 = r1
        L4b:
            if (r0 == 0) goto L54
            java.lang.String r2 = "type"
            com.google.gson.JsonPrimitive r2 = r0.getAsJsonPrimitive(r2)
            goto L55
        L54:
            r2 = r1
        L55:
            java.lang.Class<com.amazon.aps.iva.x50.t> r3 = com.amazon.aps.iva.x50.t.class
            java.lang.Object r2 = r7.deserialize(r2, r3)
            com.amazon.aps.iva.x50.t r2 = (com.amazon.aps.iva.x50.t) r2
            if (r2 != 0) goto L61
            r2 = -1
            goto L69
        L61:
            int[] r3 = com.ellation.crunchyroll.presentation.search.recent.RecentSearchDeserializer.a.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
        L69:
            r3 = 1
            if (r2 == r3) goto L74
            r3 = 2
            if (r2 == r3) goto L71
            r2 = r1
            goto L76
        L71:
            java.lang.Class<com.ellation.crunchyroll.model.music.MusicConcert> r2 = com.ellation.crunchyroll.model.music.MusicConcert.class
            goto L76
        L74:
            java.lang.Class<com.ellation.crunchyroll.model.music.MusicVideo> r2 = com.ellation.crunchyroll.model.music.MusicVideo.class
        L76:
            if (r2 == 0) goto L7f
            java.lang.Object r0 = r7.deserialize(r0, r2)
            com.ellation.crunchyroll.model.music.MusicAsset r0 = (com.ellation.crunchyroll.model.music.MusicAsset) r0
            goto L80
        L7f:
            r0 = r1
        L80:
            com.google.gson.JsonObject r5 = r5.getAsJsonObject()
            java.lang.String r2 = "timestamp"
            if (r5 == 0) goto L8c
            com.google.gson.JsonPrimitive r1 = r5.getAsJsonPrimitive(r2)
        L8c:
            java.lang.Class r5 = java.lang.Long.TYPE
            java.lang.Object r5 = r7.deserialize(r1, r5)
            java.lang.Long r5 = (java.lang.Long) r5
            com.amazon.aps.iva.q30.b r7 = new com.amazon.aps.iva.q30.b
            com.amazon.aps.iva.yb0.j.e(r5, r2)
            long r1 = r5.longValue()
            r7.<init>(r6, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.search.recent.RecentSearchDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):java.lang.Object");
    }
}
