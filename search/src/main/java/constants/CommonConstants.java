package constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonConstants {

    public static List<String> DOCFILES = new ArrayList<String>(Arrays.asList(
            "doc", "docx", "xls", "xlsx", "pdf", "txt"
    ));
    public static List<String> EXCLUDE_FILE_PATHS = new ArrayList<String>(Arrays.asList(
            "node_modules"
    ));
    public static boolean IS_OPEN_CONTEXT = true;
    public static String INDEX_FILE_PATH = "index";
    public static String TOTAL_FILE_NUM;
    public static String FULL_SEARCH = "F";
    public static String INPUT_FILE_PATH = "test-data";
}