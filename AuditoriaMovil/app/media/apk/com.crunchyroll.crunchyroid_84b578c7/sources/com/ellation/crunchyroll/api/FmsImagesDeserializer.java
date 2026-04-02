package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.FmsImage;
import com.ellation.crunchyroll.model.FmsImages;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: FmsImagesDeserializer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/api/FmsImagesDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/ellation/crunchyroll/model/FmsImages;", "staticEndpoint", "", "(Ljava/lang/String;)V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FmsImagesDeserializer implements JsonDeserializer<FmsImages> {
    public static final int $stable = 0;
    private final String staticEndpoint;

    public FmsImagesDeserializer(String str) {
        j.f(str, "staticEndpoint");
        this.staticEndpoint = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.JsonDeserializer
    public FmsImages deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        ArrayList arrayList;
        FmsImage fmsImage;
        FmsImage fmsImage2;
        FmsImage fmsImage3;
        Object obj;
        Object obj2;
        Object obj3;
        Set<Map.Entry<String, JsonElement>> entrySet;
        j.f(jsonElement, "json");
        j.f(type, "typeOfT");
        j.f(jsonDeserializationContext, "context");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        FmsImage fmsImage4 = null;
        if (asJsonObject == null || (entrySet = asJsonObject.entrySet()) == null) {
            arrayList = null;
        } else {
            Set<Map.Entry<String, JsonElement>> set = entrySet;
            arrayList = new ArrayList(r.Y(set));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String asString = ((JsonElement) entry.getValue()).getAsString();
                j.e(str, "type");
                arrayList.add(new FmsImage(str, this.staticEndpoint + "/fms/" + str + "/" + asString));
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (j.a(((FmsImage) obj3).getType(), "desktop_large")) {
                    break;
                }
            }
            fmsImage = (FmsImage) obj3;
        } else {
            fmsImage = null;
        }
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (j.a(((FmsImage) obj2).getType(), "desktop_small")) {
                    break;
                }
            }
            fmsImage2 = (FmsImage) obj2;
        } else {
            fmsImage2 = null;
        }
        if (arrayList != null) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (j.a(((FmsImage) obj).getType(), "mobile_large")) {
                    break;
                }
            }
            fmsImage3 = (FmsImage) obj;
        } else {
            fmsImage3 = null;
        }
        if (arrayList != null) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (j.a(((FmsImage) next).getType(), "mobile_small")) {
                    fmsImage4 = next;
                    break;
                }
            }
            fmsImage4 = fmsImage4;
        }
        return new FmsImages(fmsImage, fmsImage2, fmsImage3, fmsImage4);
    }
}
