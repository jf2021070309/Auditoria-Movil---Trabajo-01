package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.model.SimpleType;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.io.Serializable;
import java.net.URI;
import java.util.Collection;
import java.util.EnumSet;
import kotlin.Metadata;
/* compiled from: TypeValidator.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/worldturner/medeia/schema/validation/TypeValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "validate", "Ljava/util/EnumSet;", "Lcom/worldturner/medeia/schema/model/SimpleType;", "type", "Ljava/util/EnumSet;", "getType", "()Ljava/util/EnumSet;", "<init>", "(Ljava/util/EnumSet;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class TypeValidator implements SchemaValidator, SchemaValidatorInstance {
    public static final Companion Companion = new Companion(null);
    private final EnumSet<SimpleType> type;

    /* compiled from: TypeValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/TypeValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/TypeValidator;", "type", "Ljava/util/EnumSet;", "Lcom/worldturner/medeia/schema/model/SimpleType;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final TypeValidator create(EnumSet<SimpleType> enumSet) {
            if (enumSet != null) {
                return new TypeValidator(enumSet);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 1;
            iArr[JsonTokenType.VALUE_TEXT.ordinal()] = 2;
            iArr[JsonTokenType.VALUE_NULL.ordinal()] = 3;
            iArr[JsonTokenType.VALUE_NUMBER.ordinal()] = 4;
            iArr[JsonTokenType.VALUE_BOOLEAN_TRUE.ordinal()] = 5;
            iArr[JsonTokenType.VALUE_BOOLEAN_FALSE.ordinal()] = 6;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 7;
        }
    }

    public TypeValidator(EnumSet<SimpleType> enumSet) {
        j.g(enumSet, "type");
        this.type = enumSet;
    }

    public final EnumSet<SimpleType> getType() {
        return this.type;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        Object obj;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        EnumSet<SimpleType> enumSet = this.type;
        boolean z = false;
        switch (WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()]) {
            case 1:
                z = enumSet.contains(SimpleType.ARRAY);
                break;
            case 2:
                z = enumSet.contains(SimpleType.STRING);
                break;
            case 3:
                z = enumSet.contains(SimpleType.NULL);
                break;
            case 4:
                if (enumSet.contains(SimpleType.NUMBER) || (enumSet.contains(SimpleType.INTEGER) && jsonTokenData.isInteger())) {
                    z = true;
                    break;
                }
                break;
            case 5:
            case 6:
                z = enumSet.contains(SimpleType.BOOLEAN);
                break;
            case 7:
                z = enumSet.contains(SimpleType.OBJECT);
                break;
        }
        if (z) {
            return OkValidationResult.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("Type mismatch, data has ");
        sb.append(TypeValidatorKt.getSchemaType(jsonTokenData));
        sb.append(" and schema has ");
        if (this.type.size() == 1) {
            obj = (Serializable) x.s0(this.type);
        } else {
            obj = this.type;
        }
        sb.append(obj);
        return new FailedValidationResult("type", (String) null, sb.toString(), jsonTokenLocation, (Collection) null, 18, (e) null);
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
