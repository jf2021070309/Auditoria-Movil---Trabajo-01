package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.SimpleTreeBuilder;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayUniqueItemsValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "(I)V", "getStartLevel", "()I", "treeBuilder", "Lcom/worldturner/medeia/parser/SimpleTreeBuilder;", "uniqueItems", "", "Lcom/worldturner/medeia/parser/TreeNode;", "validate", "Lcom/worldturner/medeia/api/ValidationResult;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ArrayUniqueItemsValidatorInstance implements SchemaValidatorInstance {
    private final int startLevel;
    private final SimpleTreeBuilder treeBuilder;
    private final Set<TreeNode> uniqueItems = new LinkedHashSet();

    public ArrayUniqueItemsValidatorInstance(int i) {
        this.startLevel = i;
        this.treeBuilder = new SimpleTreeBuilder(i + 1);
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
            this.treeBuilder.consume(jsonTokenData, jsonTokenLocation);
            TreeNode takeResult = this.treeBuilder.takeResult();
            if (takeResult != null) {
                if (this.uniqueItems.contains(takeResult)) {
                    return new FailedValidationResult("uniqueItems", (String) null, "Duplicate item", jsonTokenLocation, (Collection) null, 18, (e) null);
                }
                this.uniqueItems.add(takeResult);
            }
        }
        if (jsonTokenData.getType() == JsonTokenType.END_ARRAY && jsonTokenLocation.getLevel() == this.startLevel) {
            return OkValidationResult.INSTANCE;
        }
        return null;
    }
}
