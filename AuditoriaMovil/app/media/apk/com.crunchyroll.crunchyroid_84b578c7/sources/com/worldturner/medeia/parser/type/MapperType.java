package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.ic0.n;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import kotlin.Metadata;
/* compiled from: MapperType.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u0017"}, d2 = {"Lcom/worldturner/medeia/parser/type/MapperType;", "", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "createBuilder", "", "isComplete", "createObject", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "", "toString", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public abstract class MapperType {
    public abstract AcceptKind accepts(JsonTokenData jsonTokenData);

    public abstract ValueBuilder<? extends StructuredType> createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation);

    public abstract Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation);

    public abstract boolean isComplete(JsonTokenData jsonTokenData);

    public String toString() {
        String k = e0.a(getClass()).k();
        if (k == null) {
            k = e0.a(getClass()).j();
        }
        if (k == null) {
            d a = e0.a(getClass());
            j.f(a, "<this>");
            return ((n) a).c.getName();
        }
        return k;
    }

    public abstract void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer);
}
