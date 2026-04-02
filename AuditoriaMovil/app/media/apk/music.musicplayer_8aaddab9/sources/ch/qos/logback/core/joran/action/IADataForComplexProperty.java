package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
/* loaded from: classes.dex */
public class IADataForComplexProperty {
    public final AggregationType aggregationType;
    public final String complexPropertyName;
    public boolean inError;
    private Object nestedComplexProperty;
    public final PropertySetter parentBean;

    public IADataForComplexProperty(PropertySetter propertySetter, AggregationType aggregationType, String str) {
        this.parentBean = propertySetter;
        this.aggregationType = aggregationType;
        this.complexPropertyName = str;
    }

    public AggregationType getAggregationType() {
        return this.aggregationType;
    }

    public String getComplexPropertyName() {
        return this.complexPropertyName;
    }

    public Object getNestedComplexProperty() {
        return this.nestedComplexProperty;
    }

    public void setNestedComplexProperty(Object obj) {
        this.nestedComplexProperty = obj;
    }
}
