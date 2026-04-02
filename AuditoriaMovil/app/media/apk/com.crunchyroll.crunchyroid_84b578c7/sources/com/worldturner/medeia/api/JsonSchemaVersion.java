package com.worldturner.medeia.api;

import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.schema.parser.JsonSchemaDraft04Type;
import com.worldturner.medeia.schema.parser.JsonSchemaDraft07Type;
import kotlin.Metadata;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DRAFT06 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/worldturner/medeia/api/JsonSchemaVersion;", "", "mapperType", "Lcom/worldturner/medeia/parser/type/MapperType;", "(Ljava/lang/String;ILcom/worldturner/medeia/parser/type/MapperType;)V", "getMapperType$medeia_validator_core", "()Lcom/worldturner/medeia/parser/type/MapperType;", "DRAFT04", "DRAFT06", "DRAFT07", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class JsonSchemaVersion {
    private static final /* synthetic */ JsonSchemaVersion[] $VALUES;
    public static final JsonSchemaVersion DRAFT04;
    public static final JsonSchemaVersion DRAFT06;
    public static final JsonSchemaVersion DRAFT07;
    private final MapperType mapperType;

    static {
        JsonSchemaVersion jsonSchemaVersion = new JsonSchemaVersion("DRAFT04", 0, JsonSchemaDraft04Type.INSTANCE);
        DRAFT04 = jsonSchemaVersion;
        JsonSchemaDraft07Type jsonSchemaDraft07Type = JsonSchemaDraft07Type.INSTANCE;
        JsonSchemaVersion jsonSchemaVersion2 = new JsonSchemaVersion("DRAFT06", 1, jsonSchemaDraft07Type);
        DRAFT06 = jsonSchemaVersion2;
        JsonSchemaVersion jsonSchemaVersion3 = new JsonSchemaVersion("DRAFT07", 2, jsonSchemaDraft07Type);
        DRAFT07 = jsonSchemaVersion3;
        $VALUES = new JsonSchemaVersion[]{jsonSchemaVersion, jsonSchemaVersion2, jsonSchemaVersion3};
    }

    private JsonSchemaVersion(String str, int i, MapperType mapperType) {
        this.mapperType = mapperType;
    }

    public static JsonSchemaVersion valueOf(String str) {
        return (JsonSchemaVersion) Enum.valueOf(JsonSchemaVersion.class, str);
    }

    public static JsonSchemaVersion[] values() {
        return (JsonSchemaVersion[]) $VALUES.clone();
    }

    public final MapperType getMapperType$medeia_validator_core() {
        return this.mapperType;
    }
}
