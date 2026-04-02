package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.parser.JsonTokenLocation;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"fail", "Lcom/worldturner/medeia/api/FailedValidationResult;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "message", "", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ConstValidatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FailedValidationResult fail(JsonTokenLocation jsonTokenLocation, String str) {
        return new FailedValidationResult("const", (String) null, str, jsonTokenLocation, (Collection) null, 18, (e) null);
    }
}
