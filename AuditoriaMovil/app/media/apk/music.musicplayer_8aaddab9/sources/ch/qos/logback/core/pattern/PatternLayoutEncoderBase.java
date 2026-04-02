package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import e.a.d.a.a;
/* loaded from: classes.dex */
public class PatternLayoutEncoderBase<E> extends LayoutWrappingEncoder<E> {
    public boolean outputPatternAsHeader = false;
    public String pattern;

    public String getPattern() {
        return this.pattern;
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public boolean isOutputPatternAsPresentationHeader() {
        return this.outputPatternAsHeader;
    }

    @Override // ch.qos.logback.core.encoder.LayoutWrappingEncoder
    public void setLayout(Layout<E> layout) {
        StringBuilder y = a.y("one cannot set the layout of ");
        y.append(getClass().getName());
        throw new UnsupportedOperationException(y.toString());
    }

    public void setOutputPatternAsHeader(boolean z) {
        this.outputPatternAsHeader = z;
    }

    public void setOutputPatternAsPresentationHeader(boolean z) {
        addWarn("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
        this.outputPatternAsHeader = z;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }
}
