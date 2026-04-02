package com.worldturner.medeia.api;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ValidationOptions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001J\u001a\u0010'\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u00060"}, d2 = {"Lcom/worldturner/medeia/api/ValidationOptions;", "", "()V", "validateSchema", "", "uniqueItemsValidationMethod", "Lcom/worldturner/medeia/api/UniqueItemsValidationMethod;", "optimizeExistentialValidators", "validateFormat", "validateContent", "supportRefsToAnywhere", "customFormats", "", "", "Lcom/worldturner/medeia/api/FormatValidation;", "(ZLcom/worldturner/medeia/api/UniqueItemsValidationMethod;ZZZZLjava/util/Map;)V", "getCustomFormats", "()Ljava/util/Map;", "getOptimizeExistentialValidators", "()Z", "getSupportRefsToAnywhere", "getUniqueItemsValidationMethod", "()Lcom/worldturner/medeia/api/UniqueItemsValidationMethod;", "getValidateContent", "getValidateFormat", "getValidateSchema", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "withCustomFormats", "withOptimizeExistentialValidators", "value", "withSupportRefsToAnywhere", "withUniqueItemsValidationMethod", "withValidateContent", "withValidateFormat", "withValidateSchema", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ValidationOptions {
    public static final Companion Companion = new Companion(null);
    public static final ValidationOptions DEFAULT = new ValidationOptions();
    private final Map<String, FormatValidation> customFormats;
    private final boolean optimizeExistentialValidators;
    private final boolean supportRefsToAnywhere;
    private final UniqueItemsValidationMethod uniqueItemsValidationMethod;
    private final boolean validateContent;
    private final boolean validateFormat;
    private final boolean validateSchema;

    /* compiled from: ValidationOptions.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/worldturner/medeia/api/ValidationOptions$Companion;", "", "()V", "DEFAULT", "Lcom/worldturner/medeia/api/ValidationOptions;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationOptions(boolean z, UniqueItemsValidationMethod uniqueItemsValidationMethod, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, ? extends FormatValidation> map) {
        j.g(uniqueItemsValidationMethod, "uniqueItemsValidationMethod");
        j.g(map, "customFormats");
        this.validateSchema = z;
        this.uniqueItemsValidationMethod = uniqueItemsValidationMethod;
        this.optimizeExistentialValidators = z2;
        this.validateFormat = z3;
        this.validateContent = z4;
        this.supportRefsToAnywhere = z5;
        this.customFormats = map;
    }

    public static /* synthetic */ ValidationOptions copy$default(ValidationOptions validationOptions, boolean z, UniqueItemsValidationMethod uniqueItemsValidationMethod, boolean z2, boolean z3, boolean z4, boolean z5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validationOptions.validateSchema;
        }
        if ((i & 2) != 0) {
            uniqueItemsValidationMethod = validationOptions.uniqueItemsValidationMethod;
        }
        UniqueItemsValidationMethod uniqueItemsValidationMethod2 = uniqueItemsValidationMethod;
        if ((i & 4) != 0) {
            z2 = validationOptions.optimizeExistentialValidators;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = validationOptions.validateFormat;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = validationOptions.validateContent;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            z5 = validationOptions.supportRefsToAnywhere;
        }
        boolean z9 = z5;
        Map<String, FormatValidation> map2 = map;
        if ((i & 64) != 0) {
            map2 = validationOptions.customFormats;
        }
        return validationOptions.copy(z, uniqueItemsValidationMethod2, z6, z7, z8, z9, map2);
    }

    public final boolean component1() {
        return this.validateSchema;
    }

    public final UniqueItemsValidationMethod component2() {
        return this.uniqueItemsValidationMethod;
    }

    public final boolean component3() {
        return this.optimizeExistentialValidators;
    }

    public final boolean component4() {
        return this.validateFormat;
    }

    public final boolean component5() {
        return this.validateContent;
    }

    public final boolean component6() {
        return this.supportRefsToAnywhere;
    }

    public final Map<String, FormatValidation> component7() {
        return this.customFormats;
    }

    public final ValidationOptions copy(boolean z, UniqueItemsValidationMethod uniqueItemsValidationMethod, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, ? extends FormatValidation> map) {
        j.g(uniqueItemsValidationMethod, "uniqueItemsValidationMethod");
        j.g(map, "customFormats");
        return new ValidationOptions(z, uniqueItemsValidationMethod, z2, z3, z4, z5, map);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this != obj) {
            if (obj instanceof ValidationOptions) {
                ValidationOptions validationOptions = (ValidationOptions) obj;
                if (this.validateSchema == validationOptions.validateSchema) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && j.a(this.uniqueItemsValidationMethod, validationOptions.uniqueItemsValidationMethod)) {
                    if (this.optimizeExistentialValidators == validationOptions.optimizeExistentialValidators) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.validateFormat == validationOptions.validateFormat) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (this.validateContent == validationOptions.validateContent) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (this.supportRefsToAnywhere == validationOptions.supportRefsToAnywhere) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5 || !j.a(this.customFormats, validationOptions.customFormats)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, FormatValidation> getCustomFormats() {
        return this.customFormats;
    }

    public final boolean getOptimizeExistentialValidators() {
        return this.optimizeExistentialValidators;
    }

    public final boolean getSupportRefsToAnywhere() {
        return this.supportRefsToAnywhere;
    }

    public final UniqueItemsValidationMethod getUniqueItemsValidationMethod() {
        return this.uniqueItemsValidationMethod;
    }

    public final boolean getValidateContent() {
        return this.validateContent;
    }

    public final boolean getValidateFormat() {
        return this.validateFormat;
    }

    public final boolean getValidateSchema() {
        return this.validateSchema;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    public int hashCode() {
        int i;
        boolean z = this.validateSchema;
        int i2 = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i3 = r0 * 31;
        UniqueItemsValidationMethod uniqueItemsValidationMethod = this.uniqueItemsValidationMethod;
        int i4 = 0;
        if (uniqueItemsValidationMethod != null) {
            i = uniqueItemsValidationMethod.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        ?? r2 = this.optimizeExistentialValidators;
        int i6 = r2;
        if (r2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r22 = this.validateFormat;
        int i8 = r22;
        if (r22 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r23 = this.validateContent;
        int i10 = r23;
        if (r23 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z2 = this.supportRefsToAnywhere;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i12 = (i11 + i2) * 31;
        Map<String, FormatValidation> map = this.customFormats;
        if (map != null) {
            i4 = map.hashCode();
        }
        return i12 + i4;
    }

    public String toString() {
        return "ValidationOptions(validateSchema=" + this.validateSchema + ", uniqueItemsValidationMethod=" + this.uniqueItemsValidationMethod + ", optimizeExistentialValidators=" + this.optimizeExistentialValidators + ", validateFormat=" + this.validateFormat + ", validateContent=" + this.validateContent + ", supportRefsToAnywhere=" + this.supportRefsToAnywhere + ", customFormats=" + this.customFormats + ")";
    }

    public final ValidationOptions withCustomFormats(Map<String, ? extends FormatValidation> map) {
        j.g(map, "customFormats");
        return copy$default(this, false, null, false, false, false, false, map, 63, null);
    }

    public final ValidationOptions withOptimizeExistentialValidators(boolean z) {
        return copy$default(this, false, null, z, false, false, false, null, 123, null);
    }

    public final ValidationOptions withSupportRefsToAnywhere(boolean z) {
        return copy$default(this, false, null, false, false, false, z, null, 95, null);
    }

    public final ValidationOptions withUniqueItemsValidationMethod(UniqueItemsValidationMethod uniqueItemsValidationMethod) {
        j.g(uniqueItemsValidationMethod, "value");
        return copy$default(this, false, uniqueItemsValidationMethod, false, false, false, false, null, 125, null);
    }

    public final ValidationOptions withValidateContent(boolean z) {
        return copy$default(this, false, null, false, false, z, false, null, 111, null);
    }

    public final ValidationOptions withValidateFormat(boolean z) {
        return copy$default(this, false, null, false, z, false, false, null, 119, null);
    }

    public final ValidationOptions withValidateSchema(boolean z) {
        return copy$default(this, z, null, false, false, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    public /* synthetic */ ValidationOptions(boolean z, UniqueItemsValidationMethod uniqueItemsValidationMethod, boolean z2, boolean z3, boolean z4, boolean z5, Map map, int i, e eVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? UniqueItemsValidationMethod.DIGEST_MD5 : uniqueItemsValidationMethod, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? a0.b : map);
    }

    public ValidationOptions() {
        this(true, null, false, false, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
