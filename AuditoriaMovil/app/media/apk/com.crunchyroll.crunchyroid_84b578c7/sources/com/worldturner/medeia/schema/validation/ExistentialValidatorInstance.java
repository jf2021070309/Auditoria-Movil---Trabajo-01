package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ExistentialValidator.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u00020\u0001`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ExistentialValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "finalStep", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "processValidators", "validate", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "instances", "Ljava/util/ArrayList;", "results", "Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "operation", "Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "getOperation", "()Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "", "startLevel", "I", "getStartLevel", "()I", "", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validations", "<init>", "(Lcom/worldturner/medeia/schema/validation/ExistentialOperation;ILjava/util/List;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ExistentialValidatorInstance implements SchemaValidatorInstance {
    private final ArrayList<SchemaValidatorInstance> instances;
    private final ExistentialOperation operation;
    private final ArrayList<ValidationResult> results;
    private final int startLevel;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExistentialOperation.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ExistentialOperation.ALL_OF.ordinal()] = 1;
            iArr[ExistentialOperation.ANY_OF.ordinal()] = 2;
            iArr[ExistentialOperation.ONE_OF.ordinal()] = 3;
        }
    }

    public ExistentialValidatorInstance(ExistentialOperation existentialOperation, int i, List<? extends SchemaValidator> list) {
        j.g(existentialOperation, "operation");
        j.g(list, "validations");
        this.operation = existentialOperation;
        this.startLevel = i;
        ArrayList<SchemaValidatorInstance> arrayList = new ArrayList<>(list.size());
        for (SchemaValidator schemaValidator : list) {
            arrayList.add(schemaValidator.createInstance(this.startLevel));
        }
        this.instances = arrayList;
        this.results = new ArrayList<>(arrayList.size());
    }

    private final ValidationResult finalStep(JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult failedValidationResult;
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.operation.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ArrayList<ValidationResult> arrayList = this.results;
                    if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (ValidationResult validationResult : arrayList) {
                            if (validationResult.getValid() && (i = i + 1) < 0) {
                                f1.R();
                                throw null;
                            }
                        }
                    }
                    if (i == 1) {
                        return OkValidationResult.INSTANCE;
                    }
                    StringBuilder sb = new StringBuilder();
                    ArrayList<ValidationResult> arrayList2 = this.results;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        for (ValidationResult validationResult2 : arrayList2) {
                            if (validationResult2.getValid() && (i3 = i3 + 1) < 0) {
                                f1.R();
                                throw null;
                            }
                        }
                    }
                    return new FailedValidationResult("oneOf", (String) null, e.f(sb, i3, " of the oneOf validations succceeded"), jsonTokenLocation, u.j0(this.results, FailedValidationResult.class), 2, (e) null);
                }
                throw new h();
            }
            ArrayList<ValidationResult> arrayList3 = this.results;
            if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                Iterator<T> it = arrayList3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ValidationResult) it.next()).getValid()) {
                            i3 = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (i3 != 0) {
                return OkValidationResult.INSTANCE;
            }
            failedValidationResult = new FailedValidationResult("anyOf", (String) null, "None of the anyOf validations succeeded", jsonTokenLocation, u.j0(this.results, FailedValidationResult.class), 2, (e) null);
        } else {
            ArrayList<ValidationResult> arrayList4 = this.results;
            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                for (ValidationResult validationResult3 : arrayList4) {
                    if (!validationResult3.getValid()) {
                        break;
                    }
                }
            }
            i3 = 1;
            if (i3 != 0) {
                return OkValidationResult.INSTANCE;
            }
            failedValidationResult = new FailedValidationResult("allOf", (String) null, "Some of the allOf validations failed", jsonTokenLocation, u.j0(this.results, FailedValidationResult.class), 2, (e) null);
        }
        return failedValidationResult;
    }

    private final void processValidators(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        int size = this.instances.size();
        int i = 0;
        while (i < size) {
            SchemaValidatorInstance schemaValidatorInstance = this.instances.get(i);
            j.b(schemaValidatorInstance, "instances[i]");
            ValidationResult validate = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation);
            if (validate != null) {
                this.results.add(validate);
                this.instances.remove(i);
                size--;
            } else {
                i++;
            }
        }
    }

    public final ExistentialOperation getOperation() {
        return this.operation;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        processValidators(jsonTokenData, jsonTokenLocation);
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType().getLastToken()) {
            return finalStep(jsonTokenLocation);
        }
        return null;
    }
}
