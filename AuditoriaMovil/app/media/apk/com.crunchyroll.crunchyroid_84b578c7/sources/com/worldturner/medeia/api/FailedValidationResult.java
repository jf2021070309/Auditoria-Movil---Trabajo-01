package com.worldturner.medeia.api;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.oe0.i;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenLocation;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ValidationResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0002\u0010\nB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006!"}, d2 = {"Lcom/worldturner/medeia/api/FailedValidationResult;", "Lcom/worldturner/medeia/api/ValidationResult;", "rule", "", "property", "message", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "details", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/worldturner/medeia/parser/JsonTokenLocation;Ljava/util/Collection;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V", "getDetails", "()Ljava/util/Collection;", "getLocation", "()Ljava/lang/String;", "getMessage", "getProperty", "getRule", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "outputHeading", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class FailedValidationResult extends ValidationResult {
    private final Collection<FailedValidationResult> details;
    private final String location;
    private final String message;
    private final String property;
    private final String rule;

    public /* synthetic */ FailedValidationResult(String str, String str2, String str3, String str4, Collection collection, int i, e eVar) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? b0.b : collection);
    }

    public static /* synthetic */ FailedValidationResult copy$default(FailedValidationResult failedValidationResult, String str, String str2, String str3, String str4, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = failedValidationResult.rule;
        }
        if ((i & 2) != 0) {
            str2 = failedValidationResult.property;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = failedValidationResult.message;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = failedValidationResult.location;
        }
        String str7 = str4;
        Collection<FailedValidationResult> collection2 = collection;
        if ((i & 16) != 0) {
            collection2 = failedValidationResult.details;
        }
        return failedValidationResult.copy(str, str5, str6, str7, collection2);
    }

    public final String component1() {
        return this.rule;
    }

    public final String component2() {
        return this.property;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.location;
    }

    public final Collection<FailedValidationResult> component5() {
        return this.details;
    }

    public final FailedValidationResult copy(String str, String str2, String str3, String str4, Collection<FailedValidationResult> collection) {
        j.g(str, "rule");
        j.g(str3, "message");
        j.g(str4, FirebaseAnalytics.Param.LOCATION);
        j.g(collection, "details");
        return new FailedValidationResult(str, str2, str3, str4, collection);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FailedValidationResult) {
                FailedValidationResult failedValidationResult = (FailedValidationResult) obj;
                if (!j.a(this.rule, failedValidationResult.rule) || !j.a(this.property, failedValidationResult.property) || !j.a(this.message, failedValidationResult.message) || !j.a(this.location, failedValidationResult.location) || !j.a(this.details, failedValidationResult.details)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Collection<FailedValidationResult> getDetails() {
        return this.details;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getRule() {
        return this.rule;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.rule;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.property;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.message;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.location;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Collection<FailedValidationResult> collection = this.details;
        if (collection != null) {
            i5 = collection.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return toString(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedValidationResult(String str, String str2, String str3, String str4, Collection<FailedValidationResult> collection) {
        super(false, null);
        j.g(str, "rule");
        j.g(str3, "message");
        j.g(str4, FirebaseAnalytics.Param.LOCATION);
        j.g(collection, "details");
        this.rule = str;
        this.property = str2;
        this.message = str3;
        this.location = str4;
        this.details = collection;
    }

    public final String toString(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Validation Failure\n------------------\n");
        }
        sb.append("Rule:     ");
        sb.append(this.rule);
        sb.append('\n');
        if (this.property != null) {
            sb.append("Property: " + this.property + '\n');
        }
        sb.append("Message:  ");
        sb.append(this.message);
        sb.append("\nLocation: ");
        sb.append(this.location);
        sb.append('\n');
        if (!this.details.isEmpty()) {
            sb.append("Details:\n");
            for (FailedValidationResult failedValidationResult : this.details) {
                sb.append(i.S(failedValidationResult.toString(false), "    "));
                sb.append("-----\n");
            }
        }
        String sb2 = sb.toString();
        j.b(sb2, "b.toString()");
        return sb2;
    }

    public /* synthetic */ FailedValidationResult(String str, String str2, String str3, JsonTokenLocation jsonTokenLocation, Collection collection, int i, e eVar) {
        this(str, (i & 2) != 0 ? null : str2, str3, jsonTokenLocation, (i & 16) != 0 ? b0.b : collection);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FailedValidationResult(String str, String str2, String str3, JsonTokenLocation jsonTokenLocation, Collection<FailedValidationResult> collection) {
        this(str, str2, str3, jsonTokenLocation.toString(), collection);
        j.g(str, "rule");
        j.g(str3, "message");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        j.g(collection, "details");
    }
}
