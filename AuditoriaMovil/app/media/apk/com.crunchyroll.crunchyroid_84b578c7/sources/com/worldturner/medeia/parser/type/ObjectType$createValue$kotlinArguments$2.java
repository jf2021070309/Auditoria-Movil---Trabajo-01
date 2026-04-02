package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "entry", "Lcom/amazon/aps/iva/kb0/j;", "invoke", "(Ljava/util/Map$Entry;)Lcom/amazon/aps/iva/kb0/j;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectType$createValue$kotlinArguments$2 extends l implements com.amazon.aps.iva.xb0.l<Map.Entry<? extends String, ? extends Object>, j<? extends String, ? extends Object>> {
    final /* synthetic */ ObjectType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectType$createValue$kotlinArguments$2(ObjectType objectType) {
        super(1);
        this.this$0 = objectType;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ j<? extends String, ? extends Object> invoke(Map.Entry<? extends String, ? extends Object> entry) {
        return invoke2((Map.Entry<String, ? extends Object>) entry);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final j<String, Object> invoke2(Map.Entry<String, ? extends Object> entry) {
        String kotlinPropertyName;
        com.amazon.aps.iva.yb0.j.g(entry, "entry");
        PropertyType propertyType = this.this$0.getPropertyTypeMap().get(entry.getKey());
        if (propertyType == null || (kotlinPropertyName = propertyType.getKotlinPropertyName()) == null) {
            return null;
        }
        return new j<>(kotlinPropertyName, entry.getValue());
    }
}
