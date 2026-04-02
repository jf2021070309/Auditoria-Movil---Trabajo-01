package com.worldturner.medeia.schema.validation.stream;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import kotlin.Metadata;
/* compiled from: SchemaValidatingJsonConsumer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "validate", "Lcom/worldturner/medeia/api/ValidationResult;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public interface SchemaValidatorInstance {
    ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation);
}
