package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.ArrayNode;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.ObjectNode;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.SimpleTreeBuilder;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.parser.builder.ConsumerBuilderValueBuilder;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SimpleTreeType.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/parser/type/SimpleTreeType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "", "createObject", "Lcom/worldturner/medeia/parser/builder/ConsumerBuilderValueBuilder;", "createBuilder", "", "isComplete", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SimpleTreeType extends StructuredType {
    public static final SimpleTreeType INSTANCE = new SimpleTreeType();

    private SimpleTreeType() {
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType().getNonStructureToken()) {
            return AcceptKind.SINGLE;
        }
        return AcceptKind.STRUCTURE;
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new SimpleNode(jsonTokenData, 0, 0, 6, null);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return false;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj instanceof SimpleNode) {
            jsonTokenDataConsumer.consume(((SimpleNode) obj).getToken());
        } else if (obj instanceof ArrayNode) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_START_ARRAY());
            for (TreeNode treeNode : ((ArrayNode) obj).getNodes()) {
                INSTANCE.write(treeNode, jsonTokenDataConsumer);
            }
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_END_ARRAY());
        } else if (obj instanceof ObjectNode) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
            for (Map.Entry<String, TreeNode> entry : ((ObjectNode) obj).getNodes().entrySet()) {
                jsonTokenDataConsumer.consume(new JsonTokenData(JsonTokenType.FIELD_NAME, entry.getKey(), 0L, null, null, 28, null));
                INSTANCE.write(entry.getValue(), jsonTokenDataConsumer);
            }
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
        }
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public ConsumerBuilderValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new ConsumerBuilderValueBuilder(jsonTokenLocation.getLevel(), new SimpleTreeBuilder(jsonTokenLocation.getLevel()));
    }
}
