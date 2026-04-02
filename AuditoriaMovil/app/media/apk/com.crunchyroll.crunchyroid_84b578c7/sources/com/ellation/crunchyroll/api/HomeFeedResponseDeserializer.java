package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.model.GameHomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HomeFeedResponseDeserializer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/HomeFeedResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemRaw;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "deserialize", "Lkotlin/Function0;", "", "isBentoEnabled", "Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HomeFeedResponseDeserializer implements JsonDeserializer<ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> {
    public static final int $stable = 0;
    private final a<Boolean> isBentoEnabled;

    public HomeFeedResponseDeserializer(a<Boolean> aVar) {
        j.f(aVar, "isBentoEnabled");
        this.isBentoEnabled = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public ContentApiResponse<HomeFeedItemRaw, EmptyMeta> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray<JsonElement> asJsonArray;
        Object obj;
        j.f(jsonElement, "json");
        j.f(type, "typeOfT");
        j.f(jsonDeserializationContext, "context");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        ArrayList arrayList = null;
        JsonElement jsonElement2 = asJsonObject != null ? asJsonObject.get("data") : null;
        int i = 0;
        if (jsonElement2 != null && (asJsonArray = jsonElement2.getAsJsonArray()) != null) {
            ArrayList arrayList2 = new ArrayList(r.Y(asJsonArray));
            for (JsonElement jsonElement3 : asJsonArray) {
                JsonObject asJsonObject2 = jsonElement3.getAsJsonObject();
                if (((HomeFeedItemResourceType) jsonDeserializationContext.deserialize(asJsonObject2.getAsJsonPrimitive("resource_type"), HomeFeedItemResourceType.class)) == HomeFeedItemResourceType.GAMES_COLLECTION) {
                    if (this.isBentoEnabled.invoke().booleanValue()) {
                        obj = (GameHomeFeedItemRaw) jsonDeserializationContext.deserialize(asJsonObject2, GameHomeFeedItemRaw.class);
                    } else {
                        i++;
                        obj = null;
                    }
                } else {
                    obj = (HomeFeedItemRaw) jsonDeserializationContext.deserialize(asJsonObject2, HomeFeedItemRaw.class);
                }
                arrayList2.add(obj);
            }
            arrayList = arrayList2;
        }
        List r0 = arrayList != null ? x.r0(arrayList) : z.b;
        EmptyMeta emptyMeta = (EmptyMeta) jsonDeserializationContext.deserialize(asJsonObject.getAsJsonObject("meta"), EmptyMeta.class);
        Integer valueOf = Integer.valueOf(((Integer) jsonDeserializationContext.deserialize(asJsonObject.getAsJsonPrimitive("total"), Integer.TYPE)).intValue() - i);
        if (emptyMeta == null) {
            emptyMeta = EmptyMeta.INSTANCE;
        }
        return new ContentApiResponse<>(r0, valueOf, emptyMeta);
    }
}
