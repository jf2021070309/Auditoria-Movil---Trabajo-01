package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicConcert;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.model.search.SearchItemsContainer;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import com.ellation.crunchyroll.model.search.SearchResponse;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SearchResponseDeserializer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/SearchResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/ellation/crunchyroll/model/search/SearchResponse;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "readContainerItems", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/gson/JsonObject;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchResponseDeserializer implements JsonDeserializer<SearchResponse> {
    public static final int $stable = 0;

    /* compiled from: SearchResponseDeserializer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchItemsContainerType.values().length];
            try {
                iArr[SearchItemsContainerType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[t.values().length];
            try {
                iArr2[t.MUSIC_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[t.CONCERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final <T> List<T> readContainerItems(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        int i;
        Type type;
        JsonArray asJsonArray = jsonObject.getAsJsonArray(FirebaseAnalytics.Param.ITEMS);
        j.e(asJsonArray, "getAsJsonArray(\"items\")");
        ArrayList arrayList = new ArrayList(r.Y(asJsonArray));
        for (JsonElement jsonElement : asJsonArray) {
            t tVar = (t) jsonDeserializationContext.deserialize(jsonElement.getAsJsonObject().getAsJsonPrimitive("type"), t.class);
            if (tVar == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$1[tVar.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    type = Panel.class;
                } else {
                    type = MusicConcert.class;
                }
            } else {
                type = MusicVideo.class;
            }
            arrayList.add(jsonDeserializationContext.deserialize(jsonElement, type));
        }
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SearchResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        j.f(jsonElement, "json");
        j.f(type, "typeOfT");
        j.f(jsonDeserializationContext, "context");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Integer num = (Integer) jsonDeserializationContext.deserialize(asJsonObject != null ? asJsonObject.getAsJsonPrimitive("total") : null, Integer.TYPE);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JsonArray<JsonElement> asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("data");
        j.e(asJsonArray, "json.asJsonObject.getAsJsonArray(\"data\")");
        ArrayList arrayList3 = new ArrayList(r.Y(asJsonArray));
        for (JsonElement jsonElement2 : asJsonArray) {
            arrayList3.add(jsonElement2.getAsJsonObject());
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            JsonObject jsonObject = (JsonObject) it.next();
            SearchItemsContainerType searchItemsContainerType = (SearchItemsContainerType) jsonDeserializationContext.deserialize(jsonObject.getAsJsonPrimitive("type"), SearchItemsContainerType.class);
            Integer num2 = (Integer) jsonDeserializationContext.deserialize(jsonObject.getAsJsonPrimitive("count"), Integer.TYPE);
            if ((searchItemsContainerType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[searchItemsContainerType.ordinal()]) == 1) {
                j.e(num2, "totalResults");
                arrayList2.add(new SearchItemsContainer(searchItemsContainerType, num2.intValue(), readContainerItems(jsonObject, jsonDeserializationContext)));
            } else {
                j.e(num2, "totalResults");
                arrayList.add(new SearchItemsContainer(searchItemsContainerType, num2.intValue(), readContainerItems(jsonObject, jsonDeserializationContext)));
            }
        }
        j.e(num, "total");
        return new SearchResponse(num.intValue(), arrayList, arrayList2);
    }
}
