package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    public List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    public final int MAX_ERROR_COUNT = 4;
    public int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void checkRange() {
        StringBuilder y;
        String str;
        int i2;
        int i3 = this.depthStart;
        if (i3 < 0 || (i2 = this.depthEnd) < 0) {
            y = a.y("Invalid depthStart/depthEnd range [");
            y.append(this.depthStart);
            y.append(", ");
            y.append(this.depthEnd);
            str = "] (negative values are not allowed)";
        } else if (i3 < i2) {
            return;
        } else {
            y = a.y("Invalid depthEnd range [");
            y.append(this.depthStart);
            y.append(", ");
            y.append(this.depthEnd);
            str = "] (start greater or equal to end)";
        }
        y.append(str);
        addError(y.toString());
    }

    private boolean isRange(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb = new StringBuilder();
        if (this.evaluatorList != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.evaluatorList.size()) {
                    break;
                }
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i2);
                try {
                } catch (EvaluationException e2) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        StringBuilder y = a.y("Exception thrown for evaluator named [");
                        y.append(eventEvaluator.getName());
                        y.append("]");
                        addError(y.toString(), e2);
                    } else if (this.errorCount == 4) {
                        StringBuilder y2 = a.y("Exception thrown for evaluator named [");
                        y2.append(eventEvaluator.getName());
                        y2.append("].");
                        ErrorStatus errorStatus = new ErrorStatus(y2.toString(), this, e2);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (eventEvaluator.evaluate(iLoggingEvent)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return "";
            }
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i3 = this.depthStart;
            if (length > i3) {
                int i4 = this.depthEnd;
                if (i4 >= callerData.length) {
                    i4 = callerData.length;
                }
                while (i3 < i4) {
                    sb.append(getCallerLinePrefix());
                    sb.append(i3);
                    sb.append("\t at ");
                    sb.append(callerData[i3]);
                    sb.append(CoreConstants.LINE_SEPARATOR);
                    i3++;
                }
                return sb.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    public String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    public String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (isRange(firstOption)) {
                String[] splitRange = splitRange(firstOption);
                if (splitRange.length == 2) {
                    this.depthStart = Integer.parseInt(splitRange[0]);
                    this.depthEnd = Integer.parseInt(splitRange[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.depthEnd = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e2) {
            addError("Failed to parse depth option [" + firstOption + "]", e2);
        }
        List<String> optionList = getOptionList();
        if (optionList == null || optionList.size() <= 1) {
            return;
        }
        int size = optionList.size();
        for (int i2 = 1; i2 < size; i2++) {
            String str = optionList.get(i2);
            Context context = getContext();
            if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                addEvaluator(eventEvaluator);
            }
        }
    }
}
