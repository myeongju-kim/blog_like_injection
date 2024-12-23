package com.example.demo.utils;

public class SqlEscapeUtil {
    private static final String DEFAULT_ESCAPE = "\\";
    private static final char[] WILDCARD_CHARACTERS = {'%', '_'};

    private SqlEscapeUtil() {
    }

    public static String escape(String param) {
        return convertEscapeString(param, DEFAULT_ESCAPE);
    }

    public static String escape(String param, String escape) {
        return convertEscapeString(param, escape);
    }

    private static String convertEscapeString(String param, String escape) {
        if (param == null || param.isEmpty()) {
            return param;
        }
        // escape 문자열이 있는 경우, 앞에 escape 문자를 하나 더 붙여줘서 문자열로 인식하도록 함
        String includeEscapeParam = param.replace(escape, escape + escape);
        // wildcard 문자열 escape
        StringBuilder escapeString = new StringBuilder();
        for (int i = 0; i < includeEscapeParam.length(); i++) {
            char ch = includeEscapeParam.charAt(i);
            if (WILDCARD_CHARACTERS[0] == ch || WILDCARD_CHARACTERS[1] == ch) {
                escapeString.append(escape);
            }
            escapeString.append(ch);
        }
        return escapeString.toString();
    }
}
