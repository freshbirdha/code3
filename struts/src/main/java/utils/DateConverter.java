package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {
    private final DateFormat[] dateFormats = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("MM/dd/yy"),
            new SimpleDateFormat("yyMMdd"),
            new SimpleDateFormat("yyyy.MM.dd")
    };
    
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        String dateStr = values[0];
        for(int i = 0; i < dateFormats.length; i++) {
            try {
                return dateFormats[i].parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String convertToString(Map context, Object object) {
        Date date = (Date)object;
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}