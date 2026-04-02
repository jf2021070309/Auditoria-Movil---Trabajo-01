package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayUniqueItemsDigestValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "validate", "", "Lcom/worldturner/medeia/schema/validation/HashResult;", "uniqueItemHashes", "Ljava/util/Set;", "Lcom/worldturner/medeia/schema/validation/DigestBuilder;", "digestBuilder", "Lcom/worldturner/medeia/schema/validation/DigestBuilder;", "", "startLevel", "I", "getStartLevel", "()I", "Lkotlin/Function0;", "Ljava/security/MessageDigest;", "Lcom/worldturner/medeia/schema/validation/MessageDigestFactory;", "factory", "<init>", "(ILcom/amazon/aps/iva/xb0/a;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayUniqueItemsDigestValidatorInstance implements SchemaValidatorInstance {
    private final DigestBuilder digestBuilder;
    private final int startLevel;
    private final Set<HashResult> uniqueItemHashes;

    public ArrayUniqueItemsDigestValidatorInstance(int i, a<? extends MessageDigest> aVar) {
        j.g(aVar, "factory");
        this.startLevel = i;
        this.uniqueItemHashes = new LinkedHashSet();
        this.digestBuilder = new DigestBuilder(i + 1, aVar);
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType() != JsonTokenType.START_ARRAY) {
            return OkValidationResult.INSTANCE;
        }
        if (jsonTokenLocation.getLevel() > this.startLevel) {
            this.digestBuilder.consume(jsonTokenData, jsonTokenLocation);
            HashResult takeResult = this.digestBuilder.takeResult();
            if (takeResult != null) {
                if (this.uniqueItemHashes.contains(takeResult)) {
                    return new FailedValidationResult("uniqueItems", (String) null, "Duplicate item based on hash", jsonTokenLocation, (Collection) null, 18, (e) null);
                }
                this.uniqueItemHashes.add(takeResult);
            }
        }
        if (jsonTokenData.getType() == JsonTokenType.END_ARRAY && jsonTokenLocation.getLevel() == this.startLevel) {
            return OkValidationResult.INSTANCE;
        }
        return null;
    }
}
